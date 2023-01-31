package fundamental.ipv6;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * ipv6 address formatter.
 * Created by sofical on 2020/6/24.
 */
public class Ipv6FormatUtils {
    /**
     * 将任意一个ipv6地址转换成扩展格式.
     * @param sourceIp 源IP.
     * @return 扩展格式ipv6地址.
     */
    public static String formatToExtend(String sourceIp) {
        String[] columnArr = sourceIp.split("::");
        String behindPart = "";
        Integer behindColumnCount = 0;
        if (columnArr.length > 1) {
            behindPart = columnArr[1];
            String[] behindPartArr = behindPart.split(":");
            behindColumnCount = behindPartArr.length;
            if (behindPart.startsWith("/")) {
                behindPart = ":0000" + behindPart;
            } else {
                behindPart = ":" + behindPart;
            }
        }

        String prePart = columnArr[0] + ":0000:0000:0000:0000:0000:0000:0000:0000";
        String[] prePartArr = prePart.split(":");
        int i = 0;
        String preIp = "";
        for (String preColumn : prePartArr) {
            if (i < (8 - behindColumnCount)) {
                preColumn = "0000" + preColumn;
                preColumn = preColumn.substring(preColumn.length() -4);
                preIp += ("".equals(preIp) ? "" : ":") + preColumn;
            }
            i++;
        }

        return preIp + behindPart;
    }

    /**
     * 将任意一个ipv6地址转换为8位简写地址（姑且称为标准地址）.
     * @param sourceIp 源IP.
     * @return 8位简写ipv6地址.
     */
    public static String formatToStandard(String sourceIp) {
        String ipExtend = formatToExtend(sourceIp);
        // 省略前导0
        String[] array = ipExtend.split(":");
        List<String> tempList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            String res = array[i].replaceAll("^0+", "");
            if (res.equals("")){
                tempList.add("0");
            } else if (res.startsWith("/")) {
                tempList.add("0" + res);
            } else {
                tempList.add(res);
            }
        }
        return String.join(":", tempList);
    }

    /**
     * 将任意一个ipv6地址转成压缩地址.
     * @param sourceIp 源IP.
     * @return 压缩ipv6地址.
     */
    public static String formatToCompress(String sourceIp) {
        String ipStandard = formatToStandard(sourceIp);

        String mask = ipStandard.substring(ipStandard.lastIndexOf("/") + 1);
        String ip = ipStandard.substring(0, ipStandard.lastIndexOf("/"));

        // 压缩最长的一组 :0
        String[] array = ip.split(":");

        // 记录每组的连续0位置
        int[] cArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if ("0".equals(array[i])) {
                if (i > 0 && cArray[i - 1] > 0) {
                    cArray[i] = cArray[i - 1] + 1;
                } else {
                    cArray[i] = 1;
                }
            }
        }
        // 获取最长连续0的开始结束位置
        int endIdx = 0;
        int maxN = 0;
        for (int i = 0; i < cArray.length; i++) {
            if (cArray[i] > maxN) {
                endIdx = i;
                maxN = cArray[i];
            }
        }
        // 压缩最长连续0
        StringBuilder ipStr = new StringBuilder();
        int startIdx = endIdx - maxN + 1;
        for (int i = 0; i < array.length; i++) {
            if (startIdx == endIdx) {
                if (ipStr.length() > 0) {
                    ipStr.append(":");
                }
                ipStr.append(array[i]);
            } else {
                if (i < startIdx || i > endIdx) {
                    if (ipStr.length() > 0) {
                        ipStr.append(":");
                    }
                    ipStr.append(array[i]);
                } else if (i == startIdx) {
                    ipStr.append(":");
                } else if (i == endIdx) {
                    ipStr.append(":");
                }
            }
        }

        return ipStr.toString().replace(":::", "::") + "/" + mask;
    }

    /**
     * 备分代码：
     *
     */

    private static String loopReplace(String source, String search, String replace) {
        source = source.replaceAll(search, replace);
        if (source.indexOf(search) > -1) {
            source = loopReplace(source, search, replace);
        }
        return source;
    }


    public static void main(String[] args) {
        String testIp = "15ba:db5::/64";
        //String testIp = "2409::7c00:bd5f:14b3:376e:e97d";
        String ipExtend = formatToExtend(testIp);
        System.out.println(ipExtend);

        String standardIp = formatToStandard(ipExtend);
        System.out.println(standardIp);
        System.out.println(formatToCompress(ipExtend));

        standardIp = "15ba:db5:0:0:0:df:0:0/64";

        //standardIp = "2001:0000:1010:CD30:1111:0000:1101:0000/64";

        String compressIp = formatToCompress(standardIp);
        System.out.println(compressIp);
    }
}

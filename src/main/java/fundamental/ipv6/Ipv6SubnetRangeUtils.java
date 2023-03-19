package fundamental.ipv6;

/**
 * IPV6子网计算工具.
 * Created by sofical on 2020/6/24.
 */
public class Ipv6SubnetRangeUtils {
    /**
     * 子网范围计算.
     * @param sourceIp ip + "/" + 子网位数.
     * @return String[] {起启IP, 结束IP}
     */
    public static String[] computeRange(String sourceIp) {
        //兼容windows表示格式
        sourceIp = sourceIp.replace("%", "/");
        sourceIp = Ipv6FormatUtils.formatToExtend(sourceIp);
        String ipArr[] = sourceIp.split("/");

        //IP部分(扩展格式).
        String ipPart = ipArr[0];
        Integer maskNumber = Integer.valueOf(ipArr[1]);

        //获取主机号
        String hostHex = "";
        String[] columnArr = ipPart.split(":");
        for (String ipColumn : columnArr) {
            String colHex = Ipv6Helper.c16To2(ipColumn);
            hostHex += colHex;
        }

        // 获取网络号部分
        String netPart = hostHex.substring(0, maskNumber);

        //获得起始ip和结束ip
        String startIp = netPart;
        String endIp = netPart;
        for (int j = netPart.length(); j < 128; j++) {
            startIp += 0;
            endIp += 1;
        }

        //hex to 16
        String startIpC16 = "";
        String endIpC16 = "";
        for (int m = 0; m < 128; m = m + 16) {
            String hexColStart = startIp.substring(m, m + 16);
            String c16ColStart = Ipv6Helper.c2To16(hexColStart);
            startIpC16 += ("".equals(startIpC16) ? "" : ":") + c16ColStart;

            String hexColEnd = endIp.substring(m, m + 16);
            String c16ColEnd = Ipv6Helper.c2To16(hexColEnd);
            endIpC16 += ("".equals(endIpC16) ? "" : ":") + c16ColEnd;
        }

        return new String[] {startIpC16, endIpC16};
    }

    private static Long getSubNetLen(Integer maskNumber) {
        Double length = Math.pow(2D, (128D - maskNumber));
        return length.longValue();
    }

    /**
     * 通过起始和终止IP计算子网值.
     * @param startIp 起始IP.
     * @param endIp 终止IP.
     * @return 子网值.
     */
    public static Integer getSubnetFromRange(String startIp, String endIp) {
        //先将IP转为扩展模式
        startIp = Ipv6FormatUtils.formatToExtend(startIp);
        endIp = Ipv6FormatUtils.formatToExtend(endIp);


        //计算差异位
        String[] startIpArr = startIp.split(":");
        String[] endIpArr = endIp.split(":");
        int i;
        for (i = 0; i < 8; i++) {
            if (!startIpArr[i].equals(endIpArr[i])) {
                break;
            }
        }

        //基础值
        Integer baseArr[] = new Integer[] {0, 16, 32, 48, 64, 80, 96, 112};
        Integer base = baseArr[i];


        //计算差异段网位
        String binStart = Ipv6Helper.c16To2(startIpArr[i]);
        String binEnd = Ipv6Helper.c16To2(endIpArr[i]);
        int m;
        for (m = 0; m < 16; m++) {
            String charStart = binStart.substring(m, m+1);
            String charEnd = binEnd.substring(m, m+1);
            if (!charStart.equals(charEnd)) {
                break;
            }
        }

        return base + m;
    }

    public static void main(String[] args) {
        /*String test = "fe80::/51";
        String[] range = computeRange(test);
        System.out.print("start ip: ");
        System.out.println(range[0]);
        System.out.print("end ip: ");
        System.out.println(range[1]);
        Integer subnet = getSubnetFromRange(range[0], range[1]);
        System.out.print("subnet: ");
        System.out.println(subnet);*/
        String fix = "2409:8c5e:5000:61::9/13";
        String[] range = computeRange(fix);
        System.out.print("start ip: ");
        System.out.println(range[0]);
        System.out.print("end ip: ");
        System.out.println(range[1]);
    }
}

package fundamental.ipv6;

import java.util.regex.Pattern;

/**
 * IPV6其他方法工具.
 * Created by sofical on 2022/12/24.
 */
public class Ipv6Utils {
    private static final Pattern IPV6_STD_PATTERN = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}[/][0-9]{1,3}$");

    /**
     * 是否为IPV6地址
     * @param val 需要判断的地址内容.
     * @return
     */
    public static Boolean isIpv6(String val) {
        val = val.trim();
        if("".equals(val)) {
            return false;
        }

        String ipFull = "";
        try {
            ipFull = Ipv6FormatUtils.formatToExtend(val);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        if ("".equals(ipFull)) {
            return false;
        }

        return IPV6_STD_PATTERN.matcher(ipFull).find();
    }

    public static void main(String[] args) {
        String ip = "2001:0000:1010:CD30:1111:0000:1101:0000/64";
        System.out.println(isIpv6(ip));

        ip = "15ba:db5::/64";
        System.out.print(isIpv6(ip));
    }
}

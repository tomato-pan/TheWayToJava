package fundamental.java_013;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.stream.Collectors;

public class readFile {
    public static void main(String[] args) {
        // 读取文件

        String  file = "D:\\panjgittest\\The_way_to_java\\fundation\\src\\fundamental.java_013\\test.txt";

        List<String> lineLists = null;
        try{
            lineLists = Files.lines(Paths.get(file), Charset.defaultCharset())
                    .flatMap(line -> Arrays.stream(line.split("\n")))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            //Your exception handling here
        }
        System.out.println(lineLists);
        lineLists.forEach(ele ->{
            System.out.println(ele);
        });

        List<String> lists= Arrays.asList("a Luis","José Luis","Soǝlènne","sqlPejanović","    ","潘 杰","//panj1@.Paul","一一一!#","とうてんᾤ","가갸거겨고교","Д Д","Ä Ä","ĀāĂăĄ ąĆćĈĉĊ");
        // 正则表达式
        String ss = "^[\u4e00-\u9fa5\u3130-\u318F\u0800-\u4e00\uAC00-\uD7A3\u0400-\u04FF\u0500-\u052F\u2DE0-\u2DFF\uA640-\uA69F\u1C80-\u1C8F 0-9a-zA-Z@\\._\\-\\s]{2,32}$";
        String ss1 = "^[\u4e00-\u9fa5\u3040-\u309F\u30A0-\u30FF\u31F0-\u31FF\uAC00-\uD7AF\u1100-\u11FF\u3130-\u318F\u00C0-\u00FF\u0100-\u017F\u0180-\u024F\u1F00-\u1FFF\u0410-\u044F0-9a-zA-Z@\\._\\-\\s]{2,32}$"; //中日韩基本拉丁字母+希腊+俄语+德语
        String ss2 = "^[0-9a-zA-Z@\\._\\-\\s]|[\\x{0400}-\\x{04FF}]|[\\x{0500}-\\x{052F}]|[\\x{2DE0}-\\x{2DFF}]|[\\x{A640}-\\x{A69F}]|[\\x{1C80}-\\x{1C8F}]{2,32}$";
         Pattern p = Pattern.compile(ss1);
        for (int i = 0; i < lists.toArray().length; i++) {
            Matcher matcher = p.matcher(lists.get(i));
            System.out.println(lists.get(i)+" "+matcher.find());
        }
        String aaa = "   ";
        System.out.println(aaa.trim().length()==0);

    }

}

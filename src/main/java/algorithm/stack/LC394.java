package algorithm.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class LC394 {

    public String decodeString(String s) {
        //双栈解法：
        //准备两个栈：一个存放数字，一个存放字符串
        //遍历字符有四种情况
        //1、如果是数字 将数字转成整型数字等待处理
        //2、如果是字符 将字符添加到当前临时字符串中
        //3、如果是'['  将当前数字和临时字符串添加到各自栈中
        //4、如果是']'  将数字和字符栈各取出，然后拼接成新的临时字符串
        //Java 推荐用Deque ArrayDeque实现栈
        //创建数字栈，创建字符串栈 及临时数字和临时字符串
        Deque<Integer> stack_digit = new ArrayDeque<>();
        Deque<StringBuilder> stack_string = new ArrayDeque<>();
        int tNum = 0;
        StringBuilder tString = new StringBuilder();
        int i = 0;
        //遍历字符串 分4中情况
        while(i<s.length()){
            char ch = s.charAt(i++);
            if(ch == '['){ //如果是"[" 将临时数字和临时字符串入栈
                stack_digit.push(tNum);
                stack_string.push(tString);
                tNum = 0;
                tString = new StringBuilder();
            }else if(ch == ']'){ //如果是"]" 将数字和字符串出栈 此时临时字符串res = 出栈字符串 + 出栈数字*res
                StringBuilder temp = stack_string.pop();
                int count = stack_digit.pop();
                for(int j = 0;j < count;j++){
                    temp.append(tString);
                }
                tString = temp;
            }else if('0' <= ch && ch <= '9'){
                //如果是数字 将字符转成整型数字 ch-‘0’。 注意数字不一定是个位 比如100[a] 所以digit要*10
                tNum = tNum * 10 + ch - '0';
            }else{
                //如果是字符 直接将字符放在临时字符串中
                tString.append(ch);
            }
        }
        return tString.toString();
    }
}

package fundamental.java_014;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        Arrays.sort(properties,(o1, o2)->o1[0]==o2[0]?o1[1]-o2[1]:o2[0]-o1[0]);
        int cnt=0;
        int max=-1;
        int n=properties.length;
        for(int i=0;i<n;i++){
            if(max>properties[i][1]){
                cnt++;
            }
            max=Math.max(max,properties[i][1]);

        }
        return cnt;
    }

    public static void main(String[] args) {
        List<String> lists= Arrays.asList("a Luis","José Luis","Soǝlènne","sqlPejanović","    ","潘 杰","//panj1@.Paul","一一一!#","とうてんᾤ","가갸거겨고교","Д Д","Ä Ä","ĀāĂăĄ ąĆćĈĉĊ");
        Solution sl = new Solution();
        sl.sortStr(lists);
        System.out.println(lists);
        System.out.println("avb".compareTo("aaa"));
    }
    public void sortStr(List<String> lists){
        Collections.sort(lists,(s1,s2)->s1.compareTo(s2));
    }
}

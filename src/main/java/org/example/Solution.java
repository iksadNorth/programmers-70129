package org.example;

class Solution {
    public int[] solution(String s) {
        int num=0, zeros=0;

        while(!s.equals("1")) {
            long cnt = s.chars().filter(c -> c == '0').count();
            num += (int) cnt; zeros++;
            s = trans(s);
        }

        return new int[]{zeros, num};
    }

    String trans(String s) {
        s = s.replace("0", "");
        int i = s.length();
        return Integer.toBinaryString(i);
    }
}
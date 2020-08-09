package com.ycc.haechan;


public class Solution1 {

    public int solve(String s){
        int answer = s.length();

        for (int i = 1; i <= s.length() / 2; i++) {

            StringBuilder result = new StringBuilder();
            String presentValue = s.substring(0, i);
            int count = 1;

            for (int j = i; j < s.length(); j += i) {
                int len = Math.min(j + i, s.length());
                String substring = s.substring(j, len);
                if (presentValue.equals(substring)) {
                    count++;
                } else {
                    if (count == 1) {
                        result.append(presentValue);
                    } else {
                        result.append(count).append(presentValue);
                    }
                    presentValue = substring;
                    count = 1;
                }
            }

            if (count != 1) {
                result.append(count).append(presentValue);
            } else {
                result.append(presentValue);
            }

            answer = Math.min(result.length(), answer);

        }

        return answer;
    }
}

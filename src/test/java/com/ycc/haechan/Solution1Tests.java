package com.ycc.haechan;

import com.ycc.haechan.Solution1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Solution1Tests {
    private Solution1 solution1;

    @BeforeEach
    public void prepareTest() {
        solution1 = new Solution1();
    }

    @Test
    public void aabbaccc_then_7() {
        //GIVEN - 테스트케이스, 결과기댓값 준비
        String preparedTestValue = "aabbaccc";
        int expectedResultValue = 7;

        //WHEN - 실제 로직 수행
        int actualResultValue = solution1.solve(preparedTestValue);
        System.out.println("test : " + actualResultValue);

        //THEN - 결과 비교
        Assertions.assertEquals(expectedResultValue, actualResultValue);
    }

    @Test
    public void ababcdcdababcdcd_then_9() {
        //GIVEN - 테스트케이스, 결과기댓값 준비
        String preparedTestValue = "ababcdcdababcdcd";
        int expectedResultValue = 9;

        //WHEN - 실제 로직 수행
        int actualResultValue = solution1.solve(preparedTestValue);
        System.out.println("test : " + actualResultValue);

        //THEN - 결과 비교
        Assertions.assertEquals(expectedResultValue, actualResultValue);
    }

    @Test
    public void abcabcdede_then_8() {
        //GIVEN - 테스트케이스, 결과기댓값 준비
        String preparedTestValue = "abcabcdede";
        int expectedResultValue = 8;

        //WHEN - 실제 로직 수행
        int actualResultValue = solution1.solve(preparedTestValue);
        System.out.println("test : " + actualResultValue);

        //THEN - 결과 비교
        Assertions.assertEquals(expectedResultValue, actualResultValue);
    }

    @Test
    public void abcabcabcabcdededededede_then_14() {
        //GIVEN - 테스트케이스, 결과기댓값 준비
        String preparedTestValue = "abcabcabcabcdededededede";
        int expectedResultValue = 14;

        //WHEN - 실제 로직 수행
        int actualResultValue = solution1.solve(preparedTestValue);
        System.out.println("test : " + actualResultValue);

        //THEN - 결과 비교
        Assertions.assertEquals(expectedResultValue, actualResultValue);
    }

    @Test
    public void xababcdcdababcdcd_then_17() {
        //GIVEN - 테스트케이스, 결과기댓값 준비
        String preparedTestValue = "xababcdcdababcdcd";
        int expectedResultValue = 17;

        //WHEN - 실제 로직 수행
        int actualResultValue = solution1.solve(preparedTestValue);
        System.out.println("test : " + actualResultValue);

        //THEN - 결과 비교
        Assertions.assertEquals(expectedResultValue, actualResultValue);
    }

    @Test
    public void ababcdcdcdcdcdefge_then_10() {
        //GIVEN - 테스트케이스, 결과기댓값 준비
        String preparedTestValue = "ababcdcdcdcdcdefge";
        int expectedResultValue = 10;

        //WHEN - 실제 로직 수행
        int actualResultValue = solution1.solve(preparedTestValue);
        System.out.println("test : " + actualResultValue);

        //THEN - 결과 비교
        Assertions.assertEquals(expectedResultValue, actualResultValue);
    }

    @Test
    public void abcabcxdedede_then_11() {
        //GIVEN - 테스트케이스, 결과기댓값 준비
        String preparedTestValue = "abcabcxdedede";
        int expectedResultValue = 11;

        //WHEN - 실제 로직 수행
        int actualResultValue = solution1.solve(preparedTestValue);
        System.out.println("test : " + actualResultValue);

        //THEN - 결과 비교
        Assertions.assertEquals(expectedResultValue, actualResultValue);
    }

    @Test
    public void abcdabcdabcdcdecdecdede_then_16() {
        //GIVEN - 테스트케이스, 결과기댓값 준비
        String preparedTestValue = "abcdabcdabcdcdecdecdede";
        int expectedResultValue = 16;

        //WHEN - 실제 로직 수행
        int actualResultValue = solution1.solve(preparedTestValue);
        System.out.println("test : " + actualResultValue);

        //THEN - 결과 비교
        Assertions.assertEquals(expectedResultValue, actualResultValue);
    }

    @Test
    public void abcdefabcdefabcabcghijklghijkl_then_20() {
        //GIVEN - 테스트케이스, 결과기댓값 준비
        String preparedTestValue = "abcdefabcdefabcabcghijklghijkl";
        int expectedResultValue = 20;

        //WHEN - 실제 로직 수행
        int actualResultValue = solution1.solve(preparedTestValue);
        System.out.println("test : " + actualResultValue);

        //THEN - 결과 비교
        Assertions.assertEquals(expectedResultValue, actualResultValue);
    }

    @Test
    public void aaabbcccdddxduio_then_13() {
        //GIVEN - 테스트케이스, 결과기댓값 준비
        String preparedTestValue = "aaabbcccdddxduio";
        int expectedResultValue = 13;

        //WHEN - 실제 로직 수행
        int actualResultValue = solution1.solve(preparedTestValue);
        System.out.println("test : " + actualResultValue);

        //THEN - 결과 비교
        Assertions.assertEquals(expectedResultValue, actualResultValue);
    }
}


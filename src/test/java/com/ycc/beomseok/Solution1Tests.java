package com.ycc.beomseok;

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
    public void given_aabbaccc_then_7() {
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
    public void given_ababcdcdababcdcd_then_9() {
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
    public void given_abcabcdede_then_8() {
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
    public void given_abcabcabcabcdededededede_then_14() {
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
    public void given_xababcdcdababcdcd_then_17() {
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
    public void given_abxabdabu_then_9() {
        //GIVEN - 테스트케이스, 결과기댓값 준비
        String preparedTestValue = "abxabdabu";
        int expectedResultValue = 9;

        //WHEN - 실제 로직 수행
        int actualResultValue = solution1.solve(preparedTestValue);
        System.out.println("test : " + actualResultValue);

        //THEN - 결과 비교
        Assertions.assertEquals(expectedResultValue, actualResultValue);
    }

    @Test
    public void given_abcdabcdefghiefghi_then_15() {
        //GIVEN - 테스트케이스, 결과기댓값 준비
        String preparedTestValue = "abcdabcdefghiefghi";
        int expectedResultValue = 15;

        //WHEN - 실제 로직 수행
        int actualResultValue = solution1.solve(preparedTestValue);
        System.out.println("test : " + actualResultValue);

        //THEN - 결과 비교
        Assertions.assertEquals(expectedResultValue, actualResultValue);
    }

    @Test
    public void given_abcabcdefdef_then_8() {
        //GIVEN - 테스트케이스, 결과기댓값 준비
        String preparedTestValue = "abcabcdefdef";
        int expectedResultValue = 8;

        //WHEN - 실제 로직 수행
        int actualResultValue = solution1.solve(preparedTestValue);
        System.out.println("test : " + actualResultValue);

        //THEN - 결과 비교
        Assertions.assertEquals(expectedResultValue, actualResultValue);
    }

    @Test
    public void given_a_then_8() {
        //GIVEN - 테스트케이스, 결과기댓값 준비
        String preparedTestValue = "a";
        int expectedResultValue = 1;

        //WHEN - 실제 로직 수행
        int actualResultValue = solution1.solve(preparedTestValue);
        System.out.println("test : " + actualResultValue);

        //THEN - 결과 비교
        Assertions.assertEquals(expectedResultValue, actualResultValue);
    }

    @Test
    public void given_aaaaaaaaaabbbbbbbbbbddddddddddii_then_11() {
        //GIVEN - 테스트케이스, 결과기댓값 준비
        String preparedTestValue = "aaaaaaaaaabbbbbbbbbbddddddddddii";
        int expectedResultValue = 11;

        //WHEN - 실제 로직 수행
        int actualResultValue = solution1.solve(preparedTestValue);
        System.out.println("test : " + actualResultValue);

        //THEN - 결과 비교
        Assertions.assertEquals(expectedResultValue, actualResultValue);
    }
}
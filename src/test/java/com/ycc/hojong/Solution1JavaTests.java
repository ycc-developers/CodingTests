package com.ycc.hojong;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Solution1JavaTests {
    private Solution1 solution1;

    @BeforeEach
    public void prepareTest() {
        solution1 = new Solution1();
    }

    @Test
    public void given_abcdefghijklmnopqrstuvwxyz_then_26() {
        //GIVEN - 테스트케이스, 결과기댓값 준비
        String preparedTestValue = "abcdefghijklmnopqrstuvwxyz";
        int expectedResultValue = 26;

        //WHEN - 실제 로직 수행
        int actualResultValue = solution1.solve(preparedTestValue);
        System.out.println("test : " + actualResultValue);

        //THEN - 결과 비교
        Assertions.assertEquals(expectedResultValue, actualResultValue);
    }

    @Test
    public void given_aaaaaaaaaaaaaaa_then_3() {
        //GIVEN - 테스트케이스, 결과기댓값 준비
        String preparedTestValue = "aaaaaaaaaaaaaaa";
        int expectedResultValue = 3;

        //WHEN - 실제 로직 수행
        int actualResultValue = solution1.solve(preparedTestValue);
        System.out.println("test : " + actualResultValue);

        //THEN - 결과 비교
        Assertions.assertEquals(expectedResultValue, actualResultValue);
    }

    @Test
    public void given_aabbbaaccccddddd_then_10() {
        //GIVEN - 테스트케이스, 결과기댓값 준비
        String preparedTestValue = "aabbbaaccccddddd";
        int expectedResultValue = 10;

        //WHEN - 실제 로직 수행
        int actualResultValue = solution1.solve(preparedTestValue);
        System.out.println("test : " + actualResultValue);

        //THEN - 결과 비교
        Assertions.assertEquals(expectedResultValue, actualResultValue);
    }

    @Test
    public void given_abcdefghabcdefg_then_15() {
        //GIVEN - 테스트케이스, 결과기댓값 준비
        String preparedTestValue = "abcdefghabcdefg";
        int expectedResultValue = 15;

        //WHEN - 실제 로직 수행
        int actualResultValue = solution1.solve(preparedTestValue);
        System.out.println("test : " + actualResultValue);

        //THEN - 결과 비교
        Assertions.assertEquals(expectedResultValue, actualResultValue);
    }

    @Test
    public void given_aabbbaccccccdddd_then_9() {
        //GIVEN - 테스트케이스, 결과기댓값 준비
        String preparedTestValue = "aabbbaccccccdddd";
        int expectedResultValue = 9;

        //WHEN - 실제 로직 수행
        int actualResultValue = solution1.solve(preparedTestValue);
        System.out.println("test : " + actualResultValue);

        //THEN - 결과 비교
        Assertions.assertEquals(expectedResultValue, actualResultValue);
    }

    @Test
    public void given_baabaababa_then_8() {
        //GIVEN - 테스트케이스, 결과기댓값 준비
        String preparedTestValue = "baabaababa";
        int expectedResultValue = 8;

        //WHEN - 실제 로직 수행
        int actualResultValue = solution1.solve(preparedTestValue);
        System.out.println("test : " + actualResultValue);

        //THEN - 결과 비교
        Assertions.assertEquals(expectedResultValue, actualResultValue);
    }

    @Test
    public void given_ababcdfgcdfg_then_9() {
        //GIVEN - 테스트케이스, 결과기댓값 준비
        String preparedTestValue = "ababcdfgcdfg";
        int expectedResultValue = 9;

        //WHEN - 실제 로직 수행
        int actualResultValue = solution1.solve(preparedTestValue);
        System.out.println("test : " + actualResultValue);

        //THEN - 결과 비교
        Assertions.assertEquals(expectedResultValue, actualResultValue);
    }

    @Test
    public void given_ababacdcdcd_then_9() {
        //GIVEN - 테스트케이스, 결과기댓값 준비
        String preparedTestValue = "ababacdcdcd";
        int expectedResultValue = 9;

        //WHEN - 실제 로직 수행
        int actualResultValue = solution1.solve(preparedTestValue);
        System.out.println("test : " + actualResultValue);

        //THEN - 결과 비교
        Assertions.assertEquals(expectedResultValue, actualResultValue);
    }

    @Test
    public void given_aiaaiaaai_then_7() {
        //GIVEN - 테스트케이스, 결과기댓값 준비
        String preparedTestValue = "aiaaiaaai";
        int expectedResultValue = 7;

        //WHEN - 실제 로직 수행
        int actualResultValue = solution1.solve(preparedTestValue);
        System.out.println("test : " + actualResultValue);

        //THEN - 결과 비교
        Assertions.assertEquals(expectedResultValue, actualResultValue);
    }

    @Test
    public void given_ziz_then_3() {
        //GIVEN - 테스트케이스, 결과기댓값 준비
        String preparedTestValue = "ziz";
        int expectedResultValue = 3;

        //WHEN - 실제 로직 수행
        int actualResultValue = solution1.solve(preparedTestValue);
        System.out.println("test : " + actualResultValue);

        //THEN - 결과 비교
        Assertions.assertEquals(expectedResultValue, actualResultValue);
    }

}
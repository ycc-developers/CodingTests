package com.ycc.beomseok

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class Solution1Tests {
    private lateinit var solution1: Solution1

    @BeforeEach
    fun prepareTest() {
        solution1 = Solution1()
    }

    @Test
    fun given_aabbaccc_then_7() {
        //GIVEN - 테스트케이스, 결과기댓값 준비
        val preparedTestValue = "aabbaccc"
        val expectedResultValue = 7

        //WHEN - 실제 로직 수행
        val actualResultValue = solution1.solve(preparedTestValue)
        println("test : $actualResultValue")

        //THEN - 결과 비교
        Assertions.assertEquals(expectedResultValue, actualResultValue)
    }

    @Test
    fun given_ababcdcdababcdcd_then_9() {
        //GIVEN - 테스트케이스, 결과기댓값 준비
        val preparedTestValue = "ababcdcdababcdcd"
        val expectedResultValue = 9

        //WHEN - 실제 로직 수행
        val actualResultValue = solution1.solve(preparedTestValue)
        println("test : $actualResultValue")

        //THEN - 결과 비교
        Assertions.assertEquals(expectedResultValue, actualResultValue)
    }

    @Test
    fun given_abcabcdede_then_8() {
        //GIVEN - 테스트케이스, 결과기댓값 준비
        val preparedTestValue = "abcabcdede"
        val expectedResultValue = 8

        //WHEN - 실제 로직 수행
        val actualResultValue = solution1.solve(preparedTestValue)
        println("test : $actualResultValue")

        //THEN - 결과 비교
        Assertions.assertEquals(expectedResultValue, actualResultValue)
    }

    @Test
    fun given_abcabcabcabcdededededede_then_14() {
        //GIVEN - 테스트케이스, 결과기댓값 준비
        val preparedTestValue = "abcabcabcabcdededededede"
        val expectedResultValue = 14

        //WHEN - 실제 로직 수행
        val actualResultValue = solution1.solve(preparedTestValue)
        println("test : $actualResultValue")

        //THEN - 결과 비교
        Assertions.assertEquals(expectedResultValue, actualResultValue)
    }

    @Test
    fun given_xababcdcdababcdcd_then_17() {
        //GIVEN - 테스트케이스, 결과기댓값 준비
        val preparedTestValue = "xababcdcdababcdcd"
        val expectedResultValue = 17

        //WHEN - 실제 로직 수행
        val actualResultValue = solution1.solve(preparedTestValue)
        println("test : $actualResultValue")

        //THEN - 결과 비교
        Assertions.assertEquals(expectedResultValue, actualResultValue)
    }

    @Test
    fun given_abxabdabu_then_9() {
        //GIVEN - 테스트케이스, 결과기댓값 준비
        val preparedTestValue = "abxabdabu"
        val expectedResultValue = 9

        //WHEN - 실제 로직 수행
        val actualResultValue = solution1.solve(preparedTestValue)
        println("test : $actualResultValue")

        //THEN - 결과 비교
        Assertions.assertEquals(expectedResultValue, actualResultValue)
    }

    @Test
    fun given_abcdabcdefghiefghi_then_15() {
        //GIVEN - 테스트케이스, 결과기댓값 준비
        val preparedTestValue = "abcdabcdefghiefghi"
        val expectedResultValue = 15

        //WHEN - 실제 로직 수행
        val actualResultValue = solution1.solve(preparedTestValue)
        println("test : $actualResultValue")

        //THEN - 결과 비교
        Assertions.assertEquals(expectedResultValue, actualResultValue)
    }

    @Test
    fun given_abcabcdefdef_then_8() {
        //GIVEN - 테스트케이스, 결과기댓값 준비
        val preparedTestValue = "abcabcdefdef"
        val expectedResultValue = 8

        //WHEN - 실제 로직 수행
        val actualResultValue = solution1.solve(preparedTestValue)
        println("test : $actualResultValue")

        //THEN - 결과 비교
        Assertions.assertEquals(expectedResultValue, actualResultValue)
    }

    @Test
    fun given_a_then_8() {
        //GIVEN - 테스트케이스, 결과기댓값 준비
        val preparedTestValue = "a"
        val expectedResultValue = 1

        //WHEN - 실제 로직 수행
        val actualResultValue = solution1.solve(preparedTestValue)
        println("test : $actualResultValue")

        //THEN - 결과 비교
        Assertions.assertEquals(expectedResultValue, actualResultValue)
    }

    @Test
    fun given_aaaaaaaaaabbbbbbbbbbddddddddddii_then_11() {
        //GIVEN - 테스트케이스, 결과기댓값 준비
        val preparedTestValue = "aaaaaaaaaabbbbbbbbbbddddddddddii"
        val expectedResultValue = 11

        //WHEN - 실제 로직 수행
        val actualResultValue = solution1.solve(preparedTestValue)
        println("test : $actualResultValue")

        //THEN - 결과 비교
        Assertions.assertEquals(expectedResultValue, actualResultValue)
    }
}
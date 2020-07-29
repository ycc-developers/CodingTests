package com.ycc.jongin

import com.ycc.beomseok.Solution1
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
    fun `(Given) aabbaccc (Then) 7`() {
        //GIVEN - 테스트케이스, 결과기댓값 준비
        val preparedTestValue = "aabbaccc"
        val expectedResultValue = "7"

        //WHEN - 실제 로직 수행
        val actualResultValue = solution1.solve(preparedTestValue)
        println("test : $actualResultValue")

        //THEN - 결과 비교
        Assertions.assertEquals(expectedResultValue, actualResultValue)
    }

    @Test
    fun `(Given) ababcdcdababcdcd (Then) 9`() {
        //GIVEN - 테스트케이스, 결과기댓값 준비
        val preparedTestValue = "ababcdcdababcdcd"
        val expectedResultValue = "9"

        //WHEN - 실제 로직 수행
        val actualResultValue = solution1.solve(preparedTestValue)
        println("test : $actualResultValue")

        //THEN - 결과 비교
        Assertions.assertEquals(expectedResultValue, actualResultValue)
    }

    @Test
    fun `(Given) abcabcdede (Then) 8`() {
        //GIVEN - 테스트케이스, 결과기댓값 준비
        val preparedTestValue = "abcabcdede"
        val expectedResultValue = "8"

        //WHEN - 실제 로직 수행
        val actualResultValue = solution1.solve(preparedTestValue)
        println("test : $actualResultValue")

        //THEN - 결과 비교
        Assertions.assertEquals(expectedResultValue, actualResultValue)
    }

    @Test
    fun `(Given) abcabcabcabcdededededede (Then) 14`() {
        //GIVEN - 테스트케이스, 결과기댓값 준비
        val preparedTestValue = "abcabcabcabcdededededede"
        val expectedResultValue = "14"

        //WHEN - 실제 로직 수행
        val actualResultValue = solution1.solve(preparedTestValue)
        println("test : $actualResultValue")

        //THEN - 결과 비교
        Assertions.assertEquals(expectedResultValue, actualResultValue)
    }

    @Test
    fun `(Given) xababcdcdababcdcd (Then) 17`() {
        //GIVEN - 테스트케이스, 결과기댓값 준비
        val preparedTestValue = "ababcdcdababcdcd"
        val expectedResultValue = "9"

        //WHEN - 실제 로직 수행
        val actualResultValue = solution1.solve(preparedTestValue)
        println("test : $actualResultValue")

        //THEN - 결과 비교
        Assertions.assertEquals(expectedResultValue, actualResultValue)
    }
}
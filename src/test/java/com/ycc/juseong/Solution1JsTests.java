package com.ycc.juseong;

import com.ycc.JavaScriptConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.script.ScriptException;
import java.io.File;
import java.io.FileNotFoundException;

public class Solution1JsTests {
    private JavaScriptConverter converter;

    @BeforeEach
    public void prepareTest() throws FileNotFoundException, ScriptException {
        converter = new JavaScriptConverter("src/main/java/com/ycc/juseong/Solution1.js");
    }

    @Test
    public void given_case1_then_succes() throws ScriptException, NoSuchMethodException {
        //GIVEN - 테스트케이스, 결과기댓값 준비
        String preparedTestValue = "TestValue";
        String expectedResultValue = "";

        //WHEN - 실제 로직 수행
        String actualResultValue = converter.invoke("solve", preparedTestValue);
        System.out.println("test : " + actualResultValue);

        //THEN - 결과 비교
        Assertions.assertEquals(expectedResultValue, actualResultValue);
    }

    @Test
    public void given_case2_then_fail() throws ScriptException, NoSuchMethodException {
        //GIVEN - 테스트케이스, 결과기댓값 준비
        String preparedTestValue = "TestValue";
        String expectedResultValue = ";";

        //WHEN - 실제 로직 수행
        String actualResultValue = converter.invoke("solve", preparedTestValue);
        System.out.println("test : " + actualResultValue);

        //THEN - 결과 비교
        Assertions.assertNotEquals(expectedResultValue, actualResultValue);
    }
}
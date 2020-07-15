package com.ycc;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class JavaScriptConverter {
    private final Invocable invocable;

    public JavaScriptConverter(String filePath) throws FileNotFoundException, ScriptException {
        ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine engine = factory.getEngineByName("JavaScript");
        engine.eval(new BufferedReader(new FileReader(filePath)));
        invocable = (Invocable) engine;
    }

    public String invoke(String functionName, Object... args) throws ScriptException, NoSuchMethodException {
        return (String) invocable.invokeFunction(functionName, args);
    }
}

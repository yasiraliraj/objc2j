package ru.andremoniy.objctojavacnv;

import java.util.HashMap;
import java.util.Map;

/**
 * User: Andremoniy
 * Date: 04.10.12
 * Time: 10:06
 */
public class MethodContext {

    public String methodName;
    public Map<String, String> localVariables = new HashMap<>();

    public MethodContext(String name) {
        this.methodName = name;
    }
}

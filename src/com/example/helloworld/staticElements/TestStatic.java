package com.example.helloworld.staticElements;

public class TestStatic {
//    Static variable has an independent memory location.
//    Have a single copy on memory. They're not dependent on object.
    static private int staticVar = 0;

    public static int getStaticVar() {
        return staticVar;
    }

    public static void setStaticVar(int staticVar) {
        TestStatic.staticVar = staticVar;
    }
}

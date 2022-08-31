package org.example;

public class Test {

    private static Test test;

    public static  Test getInstance() {
        if(test == null)
            test = new Test();
        return  Test.test;
    }
}

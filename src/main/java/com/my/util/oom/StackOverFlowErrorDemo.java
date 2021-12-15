package com.my.util.oom;

public class StackOverFlowErrorDemo {
    public static void main(String[] args) {
        stackOverflowError();
    }

    private static void stackOverflowError(){
        stackOverflowError();
    }
}

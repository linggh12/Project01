package com.atguigu.java;

import java.util.ArrayList;

public class HelloWorld {
    public static void main(String[] args) {



        System.out.println("Hello World");

        ArrayList<String> arrayList = new ArrayList<>();

        String[] arr = new  String[]{"1","2","3","4"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (String s : arr) {
            System.out.println(s);
        }

    }
    public void haha(){
        
    }
}

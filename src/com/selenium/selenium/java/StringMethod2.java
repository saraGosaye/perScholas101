package com.selenium.selenium.java;
public class StringMethod2 {
    public static void main(String[] args){
        String str1 = "Hello, Students";
        String str2 = "Welcome";
        String str3 = "TEST";
        String str4 = "java";
        String str5 = "     string   ";
        int totalStudents = 50;
        String str6 = "abc def ghi";
        String[] strCount = str6.split("\\s");

        System.out.println(str1.concat(str2));
        System.out.println(str1.replace('e','a'));
        System.out.println(str3.toLowerCase());
        System.out.println(str4.toUpperCase());
        System.out.println(str5.trim());
        System.out.println(String.valueOf(totalStudents));
        System.out.println(strCount);
        for (String s: strCount){
            System.out.println("word: " + s);
        }
    }
}
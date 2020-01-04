package com.wxl.demo;

public class Test {
    int a = 10;
    long b = 10L;
    double c = 10.0;
    public static String  test(){
        try{
            return "11";
        }catch (Exception e){

            e.printStackTrace();
        }finally {
            System.out.println("111111111");
                    return "aa";
        }
    }
    public static void main(String args[]){
        String result = Test.test();
        System.out.println(result);
    }
}

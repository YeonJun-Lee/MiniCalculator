/**
* Midterm2
* Unit that that checks the calculation
* CS108-4
*@author YeonJunLee
*/
package com.minicalc.test;

public class UnitTests {
    public static void main(String[] args) {
        MiniCalculator miniCalc = new MiniCalculator();
        multiplyFiveTest();
        multiplySevenTest();
        divideTwoTest();
        calculateTest();
        calculateTest2();
    }

    public static void multiplyFiveTest() {
        MiniCalculator miniCalc = new MiniCalculator();
        miniCalc.multiply(5);

        if (miniCalc.total != 5) {
            System.out.println("FAILED MULTIPLY FIVE");
    }
        else {
            System.out.println("SUCCESS MULTIPLY FIVE");
        }
    }

    public static void multiplySevenTest(){
        MiniCalculator miniCalc = new MiniCalculator();
        miniCalc.multiply(7);
        if (miniCalc.total != 7) {
            System.out.println("FAILED MULTIPLY SEVEN");
        }
        else {
            System.out.println("SUCCESS MULTIPLY SEVEN");
        }
    }

    public static void divideTwoTest() {
        MiniCalculator minicalc = new MiniCalculator();
        minicalc.divide(2);

        if(minicalc.total != 0){
            System.out.println("FAILED DIVIDE TWO");
        }
        else{
            System.out.println("SUCCESS DIVIDE TWO");
        }
    }



    public static void calculateTest(){
        MiniCalculator miniCalc = new MiniCalculator();

        miniCalc.multiply(100);
        miniCalc.divide(2);
        miniCalc.divide(2);

        if(miniCalc.total != 25){
            System.out.println("CALCULATION FAILED");
        }

        else{
            System.out.println("CALCULATION SUCCESSFUL");
        }
    }

    public static void calculateTest2(){
        MiniCalculator miniCalc = new MiniCalculator();

        miniCalc.multiply(9);
        miniCalc.divide(3);
        miniCalc.divide(3);

        if(miniCalc.total != 1){
            System.out.println("CALCULATION2 FAILED");
        }

        else{
            System.out.println("CALCULATION2 SUCCESSFUL");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zikra230922;

/**
 *
 * @author user
 */
public class latihan12 {
    public static void main(String[] args) {
        
        int number1 = 10;
        int number2 = 23;
        int number3 = 5;
        
        long nilai=(number1>number2)?number1:(number2>number3)?number2:(number3>number1)?number3:number1;
        
        System.out.println("number1 = " + number1);
        System.out.println("number2 = " + number2);
        System.out.println("number3 = " + number3);
        System.out.println("Nilai tertinggi adalah angka ="+nilai);
    }
}

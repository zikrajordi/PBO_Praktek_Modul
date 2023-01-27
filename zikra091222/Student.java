/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zikra091222;

/**
 *
 * @author User
 */
public class Student extends person {
    
    public Student(){
        super("Zikra","Padang");
        System.out.println("Inside Student:Constructor");
    }
    
    public static void main(String[]args){
        Student student = new Student();
        System.out.println(student.getName());
        System.out.println(student.getAddress());
    }
}


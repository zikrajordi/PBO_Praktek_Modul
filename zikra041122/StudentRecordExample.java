/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zikra041122;

/**
 *
 * @author user
 */
public class StudentRecordExample {
     public static void main(String[] args) {
        StudentRecord student1 = new StudentRecord();
        //
        student1.setName("Ani");
        student1.setAddress("Padang");
        student1.setAge(20);
        student1.setmathGrade(70);
        student1.setenglishGrade(80);
        student1.setscienceGrade(90);
        //
        System.out.println("Nama        :"+student1.getName());
        System.out.println("Alamat      :"+student1.getAddress());
        System.out.println("Umur        :"+student1.getAge());
        System.out.println("Matematika  :"+student1.getmathGrade());
        System.out.println("B.Inggris   :"+student1.getenglishGrade());
        System.out.println("Pengetahuan :"+student1.getscienceGrade());
        System.out.println("Rata-rata   :"+student1.getaverage());
    }
}

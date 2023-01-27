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
public class StudentRecord {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private int maximum;
    //area kode penulisan selanjutnya
    
    private static int studentCount;
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public double getmathGrade(){
        return mathGrade;
    }
    
    public void setmathGrade(double mathGrade){
        this.mathGrade = mathGrade;
    }
    
    public double getenglishGrade(){
        return englishGrade;
    }
    
    public void setenglishGrade(double englishGrade){
        this.englishGrade = englishGrade;
    }
    
    public double getscienceGrade(){
        return scienceGrade;
    }
    
    public void setscienceGrade(double scienceGrade){
        this.scienceGrade = scienceGrade;
    }
    
    public double getaverage(){
        average = (mathGrade + englishGrade + scienceGrade) / 3;
        return average;
    }
    
    public int getmaximum(){
         return 0;
    }
    
    public int studentCount(){
        return studentCount;
    }

    void setname(String ani) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

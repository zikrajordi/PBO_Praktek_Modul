/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zikra091222;

import java.io.PrintStream;

/**
 *
 * @author User
 */
public class person {
    protected String name;
protected String address;
/**
* Default constructor
*/
public person(){
System.out.println("Inside Person:Constructor");
name = "";
address = "";
}
/**
* Constructor dengan dua parameter
*/
public person( String name, String address ){
this.name = name;
this.address = address;
}
/**
* Method accessor
     * @return 
*/
public String getName(){
return name;
}
public String getAddress(){
return address;
}
public void setName( String name ){
this.name = name;
}
public void setAddress( String add ){
this.address = add;
}
}
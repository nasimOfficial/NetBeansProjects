/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feb17Lab4v15.Task8;

/**
 *
 * @author Piplu
 */
public class Student{
    public String name;
    public String id;
    public String address;
    public double cgpa;
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public String getID(){
       return id; 
    }
    public void setID(String i){
        id = i;
        
    }
    public String getAddress(){
        return  address;
    }
    public void setAddress(String a){
        address = a;
        
    }
    public double getCGPA(){
     return cgpa ;   
    }
    public void setCGPA(double c){
        cgpa =c;
        
    }
    
}

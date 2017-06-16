/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3_order;

/**
 *
 * @author senafunakubo
 */
public class User {
    public  String firstName;
    public  String lastName;
    public  String Email;
    public  int phoneNumber;
    public  String address;
    public  String city;
    public  String zipCode;
    
    User(String firstName, String lastName, String Email, int phoneNumber, String address, String city, String zipCode){
      this.firstName = firstName;
      this.lastName = lastName;
      this.Email = Email;
      this.phoneNumber = phoneNumber;
      this.address = address;
      this.city = city;
      this.zipCode = zipCode;
    }
    
    public String getfirstName(){
        return firstName;
    }
    
    public String getlastName(){
        return lastName;
    }
    
    public String getEmail(){
        return Email;
    }
    
    public int getphoneNumber(){
        return phoneNumber;
    }
    
    public String getaddress(){
        return address;
    }
    
    public String getcity(){
        return city;
    }
    
    public String getzipCode(){
        return zipCode;
    }
    
    public void setfirstName(String firstName){
        this.firstName = firstName;
    }
    
    public void setlastName(String lastName){
        this.lastName = lastName;
    }
    
    public void setEmail(String Email){
        this.Email = Email;
    }
    
    public void setphoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    
    public void setaddress(String address){
        this.address = address;
    }
    
    public void setcity(String city){
        this.city = city;
    }
    
    public void setzipCode(String zipCode){
        this.zipCode = zipCode;
    }
}

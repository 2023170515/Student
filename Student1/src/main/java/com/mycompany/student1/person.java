/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.student1;

/**
 *
 * @author Administrator
 */

    

public abstract class person {
    
    int ID;
    String Name;
    String Email;
    String Password;
    String Role;

    
    person(int id ,String name,String email ,String password, String role){
        ID=id;
        Name=name;
        Email=email;
        Password=password;
        Role=role;
    }
    
    public void setID(int id){
        ID=id;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }
}



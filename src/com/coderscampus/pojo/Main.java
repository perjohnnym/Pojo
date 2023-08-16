package com.coderscampus.pojo;
public class Main {

    public static void main(String[] args){

        //here is where I instantiate - create -  the UserService
        UserService userservice = new UserService();
        //arrays allow us to store multiple items in a single variable
        //An array is a type of data structure

       String[] customer = new String[3];
        customer[0] = "JJM";
        customer[1] = "Pazzword1";
        customer[2] = "JuanitoM";

        User user = userservice.createUser(customer);
System.out.println(user.getName());

    }
}

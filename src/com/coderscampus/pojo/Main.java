package com.coderscampus.pojo;
public class Main {

    public static void main(String[] args){

        //here is where I instantiate the UserService
        UserService userservice = new UserService();
        User[] users = new User[10];

        userservice.createUser("JJM", "Password123", "john");




    }
}

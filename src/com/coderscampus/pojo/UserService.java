package com.coderscampus.pojo;

//This is a 'service' class that allows the programmer to manipulate all 'User' objects

public class UserService {


    // we have to instantiate a new user here
    //this
    //Note:  here we only need to pass in a single variable as a string array
 public User createUser(String[] customer){

     User user = new User();

     /*
     The createUser method will output a User object that will be populated with
     the username, password and name above.

      */


user.setUsername(customer[0]);
user.setPassword(customer[1]);
user.setName(customer[2]);




     //here we must ou
     return user;

    /* users[0].setUsername(String username);
     users[0].setPassword(password);
     users[0].setName(name);

     return users[0];

     */

  }


}

package com.bl.lambdaexpresion;

/*
 * User Registration validation using Lambda Function
 *
 * @auther : Sadanand Pandey
 * */
class UserRegistrationMain {
    public static void main(String[] args) {
        System.out.println(" -------- Welcome to User Registration Lambda Function-------");

        UserRegistration userRegistration = new UserRegistration();
        userRegistration.validateFirstName();
        System.out.println();

        userRegistration.validateLastName();
        System.out.println();

        userRegistration.validateEmail();
        System.out.println();

        userRegistration.validatePhoneNo();
        System.out.println();

        userRegistration.validatePassword();
    }
}
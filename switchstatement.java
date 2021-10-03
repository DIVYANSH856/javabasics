package com.company;

public class switchstatement {
    public static void main(String[] args) {
        String role = "admin";
        switch (role){
            case "admin":
                System.out.println( "you are an admin");
                break;
            case "moderator":
                System.out.println("you are a moderator");
                break;
            default:
                System.out.println("you are an guest");
        }
    }
}

package Part3;

import java.util.Scanner;

public class login {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter username: ");
        String username = s.nextLine();
        System.out.println("Enter password: ");
        String password = s.nextLine();
        checkpassword(username , password);
    }

    public static void checkpassword(String username , String password){
        if(username.equals("alex") && password.equals("sunshine")){
            System.out.println("You have successfully logged in!");
        } else if (username.equals("emma") && password.equals("haskell")){
            System.out.println("You have successfully logged in!");
        } else{
            System.out.println("Incorrect username or password");
        }
    }
}

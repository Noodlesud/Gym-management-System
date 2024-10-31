/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

public class UserCredentials {
    private static String Username;
    private static String Password;

    public UserCredentials(String username, String password) {
        UserCredentials.Username = username;
        UserCredentials.Password = password;
    }

    public static void setUsername(String username) {
        UserCredentials.Username = username;
    }

    public static String getUsername() {
        return Username;
    }

    public static void setPassword(String password) {
        UserCredentials.Password = password;
    }

    public static String getPassword() {
        return Password;
    }
}
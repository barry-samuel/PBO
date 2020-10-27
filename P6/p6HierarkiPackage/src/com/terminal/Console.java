package com.terminal;

// Visibilitas untuk semuanya
public class Console {
    public static void log(String message){
        System.out.println(message);
    }
}

// Ini hanya akan bisa diakses dari package com.terminal
class Terminal {
    public static void log(String message){
        System.out.println(message);
    }
}
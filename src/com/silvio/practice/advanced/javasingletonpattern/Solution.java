package com.silvio.practice.advanced.javasingletonpattern;

class Singleton{
    private static Singleton uniqueInstance = null;
    public static String str;

    private Singleton() {}

    static Singleton getSingleInstance() {
        if (uniqueInstance == null) uniqueInstance = new Singleton();
        return uniqueInstance;
    }
}
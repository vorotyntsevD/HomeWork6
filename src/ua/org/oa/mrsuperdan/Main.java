package ua.org.oa.mrsuperdan;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //errorA(2);
        //errorB();
        //errorC();
        //errorD("Dannie");
        //errorEv1();
        //errorEv2();
        //errorEv3();
        //errorF();
        //errorG();
        //errorH();
    }

    public static void errorA(int x) {
        int[] array = new int[x];
        try {
            System.out.println(array[x]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    public static void errorB() {
        User user = new User(null);
        try {
            user.getUserName();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public static void errorC() {
        Object x = new Integer(0);
        try {
            System.out.println((String) x);
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
    }

    public static void errorD(String s) {
        try {
            System.out.println(s.charAt(s.length()));
        } catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    public static void errorEv1() {
        String s = null;
        try {
            System.out.println(s.length());
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    public static void errorEv2() {
        User user = new User(null);
        try {
            user.getUserNameLength();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    public static void errorEv3() {
        User user = null;
        try {
            user.getUserName();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    public static void errorF() {
        errorF();
    }

    public static void errorG() {
        try {
            int i = Integer.parseInt("12a3");
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public static void errorH() {       // выводит OutOfMemoryError, но надо немного подождать
        List<Integer> list = new ArrayList<>();

        Random random = new Random();

        while (true)
            list.add(random.nextInt());
    }

}
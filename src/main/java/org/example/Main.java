package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        kiemTraSoChan(4);
        kiemTraSoChan(3);
        kiemTraSoChan(0);

        Character b = 'a';
        System.out.println(Character.isLetter(b));

        if(b == 'e'){
            System.out.println(b + " la nguyen am");
        } else {
            System.out.println(b + " la nguyen duong");
        }
        }
    public static boolean kiemTraSoChan (int a) {
        if(a % 2 == 0) {
            System.out.println(a + " la so chan");
            return true;
        } else {
            System.out.println(a + " la so le");
            return false;
        }
    }
    }

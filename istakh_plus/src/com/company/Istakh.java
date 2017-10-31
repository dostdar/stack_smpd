package com.company;

public class Istakh {
    String[] ints = new String[100];
    int top = 0;

    public void push(String a) {
        if (!ispor()) {
            top += 1;
            ints[top] = a;
        } else {
            System.out.println("Istakh overflow");
        }
    }

    public String pop() {
        if (!iskhali()) {
            top -= 1;
            return ints[top + 1];
        }
        System.out.println("underflow");
        return "0";
    }

    public boolean iskhali() {
        if (top == 0 ) {
            return true;
        }
        return false;
    }

    public boolean ispor() {
        if (top == 99 ) {
            return true;
        }
        return false;
    }


    public void print_istakh() {
        for (int counter =top; counter >-7 ;counter--) {
            System.out.println("Istakh" + (pop()) + ":" );
        }

    }



}

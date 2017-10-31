package com.company;

import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

public class Main {

    public static void main(String[] args) {
        Istakh istakh = new Istakh();
        Istakh temp = new Istakh();



        istakh.push("6");
        istakh.push("/");
        istakh.push("5");
        istakh.push("+");
        istakh.push("5");
        istakh.push("*");
        istakh.push("6");
        istakh.push("-");
        istakh.push("11");
        istakh.push("*");
        istakh.push("4");
        istakh.push("+");
        istakh.push("2");
        istakh.push("-");
        istakh.push("1");


        while (!istakh.iskhali()) {
            String s = istakh.pop();

            switch (s) {
                case "*":
                    double a = Double.parseDouble(temp.pop());
                    double b = Double.parseDouble(istakh.pop());
                    temp.push(String.valueOf((a*b)));
                    break;
                case "/":
                     a = Double.parseDouble(temp.pop());
                     b = Double.parseDouble(istakh.pop());
                    temp.push(String.valueOf((a/b)));
                    break;
                case "-":
                    b =(-1) * Double.parseDouble(istakh.pop());
                    temp.push(String.valueOf((b)));
                case "+":


                    break;
                default:
                    temp.push(s);
            }
        }
        double temp_plus=0;

        System.out.println("------------------");
        while (!temp.iskhali()) {
           temp_plus +=Double.parseDouble( temp.pop());
//            System.out.println(temp.pop());
        }
        System.out.println("----------------");

        System.out.println(temp_plus);

    }
}

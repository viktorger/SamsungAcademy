package ru.viktorger.iep0221;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");
        int a = 5;
        long b = 3453;

        //System.out.println(b);

        double d1 = 4.6;
        double d2 = 4.789;
        double d3 = -9.6;

        //System.out.println(d2 - (d3 * d1));

        int intExample1 = 3;
        int intExample2 = intExample1;
        intExample2= 6;

        boolean b1 = true;
        boolean b2 = intExample2 > intExample1;


        //System.out.println(b2);
        //System.out.println(intExample1 == intExample2);

        double f1 = 0.1;
        double f2 = 0.2;
        //System.out.println(f1 + f2 == 0.3);
        //System.out.println(Math.round (f1 + f2) == 0.3);
        //System.out.println(f1+f2);

        float f11 = 0.1f;
        float f22 = 0.2f;
        System.out.println(f11+f22 == 0.3f);
        System.out.println(f11+f22);
        System.out.println("====================");

        double one = 1.0/3.0;
        System.out.println(one * 3);
        System.out.println(one);


        String row = "Hello, String!";
        String row2 = "Hello";
        row2 += ", String!";

        System.out.println(row == row2);
        System.out.println(row);
        System.out.println(row2);
        System.out.println(row.equals(row2));

        String first = "Replace me";
        String second = first;
        first = "df";
        System.out.println(second);

        doSmth(row);

        char c = '5';

    }

    static void doSmth(String row) {
        if(row == null) {
            System.out.println("no no no");
            return;
        }
        System.out.println(row.length());
    }
}
package com.company;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

public class MyClass {

    public static void main(String[] args) {
        int[] Unidimensionarray = new int[10];
        for (int i = 1; i < Unidimensionarray.length + 1; i++) {
            Unidimensionarray[i - 1] = i;
        }
        System.out.println("Unidimensionarray =[");
        for (int i = 0; i < Unidimensionarray.length; i++) {
            String textToPrint = "" + Unidimensionarray[i];
            textToPrint +=
                    i == Unidimensionarray.length - 1 ?
                            "" :
                            ", ";
            System.out.println(textToPrint);
        }
        System.out.println("]");
        int[][] Bidimensionalarray=new int[10][10];
        for (int row=0; row<Bidimensionalarray.length;row++)
        {
            System.out.println("[");
            for(int column=0; column<Bidimensionalarray.length; column++);
            {System.out.println(Bidimensionalarray[row][column]);
        }


        int[][]Multidimensionarray=new int[10][10];
        for (int row=0; row<Multidimensionarray.length; row++)
        {
            for (int row=0; row<Multidimensionarray[row].length; column++)
            {
                Multidimensionarray[row][column]=valoare;
                valoare++
            }
        }
    }

    }

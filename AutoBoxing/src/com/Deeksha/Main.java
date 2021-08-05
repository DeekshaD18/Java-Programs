package com.Deeksha;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> myIntValues = new ArrayList<Integer>();

        for(int i = 0; i<=10; i++){
            myIntValues.add(Integer.valueOf(i));//AUTO-BOXING //Integer.valueOf(i)
        }

        for(int i = 0; i<=10; i++){
            System.out.println(myIntValues.get(i).intValue());//AUTO-UNBOXING //.intValue()
        }

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();

        for(double dbl = 1.0; dbl<=3.0; dbl+=0.25){
            myDoubleValues.add(Double.valueOf(dbl));
        }

        for(int dbl = 0; dbl<myDoubleValues.size(); dbl++ ){
            System.out.println(dbl+" --> "+myDoubleValues.get(dbl).doubleValue());
        }
    }
}

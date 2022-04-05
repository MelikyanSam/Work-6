package com.company.HomeWork.Work6;

public class Rfind {
    static String rfind(int a[], int e){
        int i=0;
        String w = "";
        for(; i < a.length; i++){
            if(a[i] == e) {
                w += (a.length-i) - 1;
                break;
            }
            else if(i == a.length - 1) w = "Folowing number has not found";
        }
        return w;
    }
    public static void main(String[] args) {
        int array[] = {5, 8, 12, 30, 2, 10 };

        System.out.println(rfind(array,30));

    }
}

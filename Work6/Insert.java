package com.company.HomeWork.Work6;

public class Insert {
    static int [] insert(int a[],int v, int e){
        a[e] = v;
        return a;
    }

    public static void main(String[] args) {
        int array[] = {5, 8, 12, 30, 2, 10 };
        array = insert(array, 54, 4);

        for (int i = 0; i< array.length; i++){
            System.out.println(array[i]);
        }
    }
}

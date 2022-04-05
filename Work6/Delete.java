package com.company.HomeWork.Work6;

public class Delete {
    static int[] delete(int a[], int e){
        int arr[] = new int [a.length-1];
        int g;
        for (int i = 0; i< a.length; i++){
            if(a[i] == e)  {
                g = a[a.length-1];
                a[a.length-1] = a[i];
                a[i] = g;
            }
        }
        for (int i = 0; i< arr.length; i++){
            arr[i] = a[i];
        }

            return arr;
    }


    public static void main(String[] args) {
        int array[] = {5, 8, 12, 30, 2, 10 };

        array = delete(array, 30);

        for (int i = 0; i< array.length; i++){
            System.out.println(array[i]);
        }



        }
}

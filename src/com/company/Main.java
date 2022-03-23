package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] array = {3,5,73,2,6,6,32,7345,23};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào phần tử cần thêm");
        int x = scanner.nextInt();
        System.out.println("nhập vị trí");
        int y = scanner.nextInt();
        array = addElement(array,y,x);
        for (int element: array) {
            System.out.println(element);
        }
    }
    static int[] addElement(int[] arr,int vitri,int value){
        int[] newArr = new int[arr.length+1];
        for (int i = 0; i<vitri;i++){
            newArr[i]=arr[i];
        }
        newArr[vitri]=value;
        for (int i = vitri+1;i<arr.length+1;i++ ){
            newArr[i]=arr[i-1];
        }
        return newArr;
    }
}

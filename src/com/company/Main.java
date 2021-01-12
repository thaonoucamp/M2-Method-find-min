package com.company;

public class Main {

    public static void main(String[] args) {
	// tao phuong thuc de thuc thi chuong trinh;
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int index = minValue(arr);
        System.out.println("Phan tu nho nhat trong mang la : "+arr[index]);
    }
    public static int minValue(int[] arr) {
        int min = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
//        System.out.println("item smallest is : "+min);
        return index;
    }
}

package com.ob.base.sort.b;

/**
 * @Author: oubin
 * @Date: 2020/8/17 16:08
 * @Description: 选择排序
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] array = new int[]{2,6,3,90,24};
        selectionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array [i] > array[j]) {
                    min = j;
                }
            }
            if (i != min) {
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
    }
}

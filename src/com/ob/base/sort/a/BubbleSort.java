package com.ob.base.sort.a;

/**
 * @Author: oubin
 * @Date: 2020/8/17 16:04
 * @Description: 冒泡排序
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] array = new int[]{2,6,3,90,24};
        bubbleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void bubbleSort(int[] array) {
        if (array == null || array.length < 2) {
            return;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }


}

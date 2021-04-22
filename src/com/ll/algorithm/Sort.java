package com.ll.algorithm;

/**
 * 主要记录一下十个排序算法的实现过程,实现的都是从小到大的排序
 * @author Lei
 * @version 0.1
 * @date 2021/4/22
 */
public class Sort {

    /**
     *
     * @param a 数组a
     * @param i 位置i
     * @param j 位置j
     */
    public static void swap(int[] a, int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    /**
     * 冒泡排序
     * @param a 数组a
     */
    public static void bubbleSort(int[] a){
        int length = a.length;
        for (int i = 0; i < length-1; i++){
            for (int j = i+1; j<length;j++){
                if (a[i] >= a[j]){
                    swap(a, i, j);
                }
            }
        }
    }

    /**
     * 选择排序
     * @param a 数组a
     */
    public static void selectionSort(int[] a){
        int length = a.length;
        for (int i = 0; i < length-1; i++) {
            int minindex = i;
            for (int j = i+1; j < length; j++) {
                if (a[j] < a[minindex]){
                    minindex = j;
                }
            }
            swap(a, i, minindex);
        }
    }

    /**
     * 插入排序
     * @param a 数组a
     */
    public static void insertiongSort(int[] a){
        int length = a.length;
        for (int i = 1; i < length; i++) {
            int index = i-1;
            int current = a[i];
            while (index >=0 && a[index] > current){
                a[index+1] = a[index];
                index--;
            }
            a[index+1]=current;
        }
    }


    /**
     * 希尔排序
     * @param a
     */
    public static void shellSort(int[] a){
        int length = a.length;
        for (int i = length/2; i>0; i = i/2){
            for (int j = i; j <length ; j++) {
                int current = a[j];
                int index= j-i;
                while (index>=0 && a[index] > current){
                    a[index+i] = a[index];
                    index = index - i;
                }
                a[index+i] = current;
            }
        }
    }


    /**
     * 归并排序
     * @param a
     */
    public static void mergeSort(int[] a){

    }




    public static void main(String[] args) {
        int[] a = new int[]{1,4,3,76,3,2,6,11};
        shellSort(a);
        for (Integer integer : a){
            System.out.println(integer);
        }
    }


}

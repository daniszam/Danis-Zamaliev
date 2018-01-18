/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.kpfu.itis.da;

import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число элементов первой матрицы");
        int n = sc.nextInt();
        int[] a = new int[n];
         for(int i = 0 ;i<n; i++){
            System.out.println("введите элемент "+ i);
            a[i] = sc.nextInt();
        }
        System.out.println("Введите число элементов второй матрицы");
        n = sc.nextInt();
        int[] a1 = new int[n];
        for(int i = 0 ;i<n; i++){
            System.out.println("введите элемент "+ i);
            a1[i] = sc.nextInt();
        }
        int z = a1.length + a.length;
         int[] massiv = new int[z];
        for (int i=0; i<z ; i++){
           massiv[i] = i<a.length? a[i]: a1[z-i-1];
        }
        Arrays.sort(massiv);
        System.out.println( Arrays.toString(massiv));
       System.out.println(Arrays.toString(a));
        for (int i = 0; i < 1000; i++) {
            if (binarySearch(massiv, i, 0, massiv.length - 1) != -1) {
                System.out.print(binarySearch(massiv, i, 0, massiv.length - 1)+" ");
            }
        }
    }

    public static int binarySearch(int[] a, int key, int left, int rigth) {

        if (left > rigth) {
            return key;
        }
        int center = left + (rigth - left) / 2;
        if (key > a[center]) {
            return binarySearch(a, key, center + 1, rigth);
        } else if (key < a[center]) {
            return binarySearch(a, key, left, center - 1);
        } else {
            return -1;
        }
    }
}

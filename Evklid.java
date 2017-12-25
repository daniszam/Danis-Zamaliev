/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evklid;

import java.util.Scanner;

/**
 *
 * @author danis
 */
public class Evklid {

    private double[] x;
    private int s = 0;
    private Scanner sc;

    public Evklid() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите максимальную степень");
        s = sc.nextInt();
        x = new double[s + 1];
        for (int i = s; i >= 0; i--) {
            System.out.println("Введите коэффицент при x^" + i);
            x[i] = sc.nextInt();
        }
    }

    public StringBuilder crat() {
        int q = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите корень");
        double z = sc.nextDouble();
        StringBuilder s = new StringBuilder();
        for (int j = x.length; j > 0; j--) {
            System.out.print(x[x.length - 1] + " ");
            q += 1;
            for (int i = x.length - 2; i >= q; i--) {
                x[i] = z * x[i + 1] + x[i];
                System.out.print(x[i] + " ");
            }
            System.out.println("Производная №"+q+"="+factorial(q)*x[q]);
            System.out.println("");
            if (j > 1) {
                s.append("(x-2)^" + q + "*" + x[q] + "+");
            } else {
                s.append("(x-2)^" + q + "*" + x[q] + "+");
            }
        }
        return s;
    }

    public StringBuilder noder() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите корень");
        double z = sc.nextDouble();
        StringBuilder s = new StringBuilder();
        s.append("(x+").append(-z).append(")(" + x[x.length - 1] + "x^" + (x.length - 2));
        for (int i = x.length - 2; i >= 0; i--) {
            x[i] = z * x[i + 1] + x[i];
            if (i != 0) {
                if (i == 1) {
                    s.append("+" + x[i]);
                } else {
                    s.append("+" + x[i] + "x^" + (i - 1));
                }
            } else {
                s.append(")+" + x[0]);
            }
        }

        return s;
    }
    
    public static int factorial(int z){
        if (z==0){
            return 1;
        }
        else{
            return factorial(z-1)*z;
        }
    } 
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gauss;

/**
 *
 * @author danis
 */
import java.util.Scanner;

public class Gauss {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность матрицы");
        int l = sc.nextInt();
        double[][] mat = new double[l][l];
        double[] b = new double[l];
        double[] x = new double[l];
        for (int j = 0; j < l; j++) {
            for (int i = 0; i < l; i++) {
                System.out.println("Введите a[" + (j + 1) + (i + 1) + "]");
                mat[j][i] = sc.nextInt();
            }
            System.out.println("ВВЕДИТЕ B" + (j + 1));
            b[j] = sc.nextInt();
        }
        for (int i = 0; i < l; i++) {
            for (double n : mat[i]) {
                System.out.print(n);
                System.out.print(" ");
            }
            System.out.println("|" + b[i]);
            System.out.println(" ");
        }
        System.out.println(" ");

        for (int k = 0; k < l - 1; k++) {
            for (int j = k + 1; j < l; j++) {
                b[j] = mat[k][k] * b[j] - mat[j][k] * b[k];
                for (int i = k + 1; i < l; i++) {
                    if (mat[k][k] != 0) {
                        mat[j][i] = mat[k][k] * mat[j][i] - mat[k][i] * mat[j][k];

                    }
                }

                mat[j][k] = 0;
            }
            for (int i = 0; i < l; i++) {
                for (double n : mat[i]) {
                    System.out.print(n);
                    System.out.print(" ");
                }
                System.out.println("|" + b[i]);
                System.out.println(" ");
            }
            System.out.println(" ");
        }
        for (int i = l - 1; i >= 0; i--) {
            double z = 0;
            for (int j = l - 1; j >= 0; j--) {
                if (j != 0 && mat[i][j - 1] != 0) {
                    z = z + mat[i][j] * x[j];
                }
                if (i == 0) {
                    while (i > 0) {
                        z = z + mat[i][j] * x[j];
                    }
                }
            }
            if (i != l - 1) {
                x[i] = (b[i] - z) / mat[i][i];
            } else {
                x[i] = b[i] / mat[i][i];
            }
            System.out.println("x" + (i + 1) + "=" + x[i]);
        }
    }
}

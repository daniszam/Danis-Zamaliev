/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Arrays;

/**
 *
 * @author danis
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a = {2, 0, 9, 7, 5, 6,7};
        /*int[] b = new int[a.length];
       int max = 0;
       for (int x:a){
           max = x> max? x : max ;
       }
       if ( 2==2 ){
           int z = 5;
       }
       for (int i = 0; i<=5; i ++){
           int z = a[i]+1;
       }
      
        System.out.println(max);
        System.arraycopy(a, 0, b, 0, a.length);
        for (int x:b){
            System.out.println(x);
        }
       int n = 10;
       int[][] stupen = new int[n][];
       for ( int i = 0 ; i<n; i++){
           stupen[i]=new int[n-1]; 
        }
       String s1 = new String("Hello");
String s2 = new String("Hello");
System.out.println(s1 == "Hello");
System.out.println(s1 == s2);
int x = 2, y = 5;
char a = 'a';
char b = 'b';
System.out.println(x + y);
System.out.println(x + y + "");
System.out.println("" + x + y);
System.out.println(x - y + "");
System.out.println(a + b);
System.out.println(a + b + "");
System.out.println("" + a + b);
System.out.println(a + y);
System.out.println("" + a + y);
     
        
}*/     
        System.out.println(a.length);
        int k = 6;
        int t,w=0;
        for (int i = 0; i < a.length/2; i++) {
            t = a[i];
            a[i] = a[a.length-1-i];
            a[a.length - 1 - i] = t;
        }
        System.out.println(Arrays.toString(a));
        for ( int i = 0; i < k/2; i ++ ){
            t=a[i];
            a[i]=a[k-i];
            a[k-i]=t;
        }
        System.out.println(Arrays.toString(a));
        for ( int i = k+1; i < a.length-1; i ++ ){
            t=a[i];
            a[i]=a[a.length-1-w];
            a[a.length-1-w]=t;
            w +=1;
        }
         System.out.println(Arrays.toString(a));
    }
}

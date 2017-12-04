/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.itis.kpfu.daniszamaliev;

/**
 *
 * @author danis_zam
 */
public class Numbers {
   int counter = 0;
   
   public int getCounter(){
       return counter;
   }
   
   public long calcFact(int number){
       counter ++;
       int fact = 1;
       if (number<0){
           throw new IllegalArgumentException("Число должно быть не отрицательным ");
       }
       for (int i = 1; i<=number; i++){
           fact *= i;
       }
       return fact;
   }
}


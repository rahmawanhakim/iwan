/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author ASUS
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nilai[] = new int[3];
        nilai [0] = 0;
        nilai [1] = 100;
        nilai [2] = 80;
        double ratarata = 0.0;
        
        for (int i = 0; i < nilai.length; i++)ratarata+=nilai[i] ;
            ratarata/=nilai.length;
            System.out.println("abdhy =" +nilai [0]);
            System.out.println("Farrel =" +nilai [1]);
            System.out.println("Iwan ="+nilai[2]);
            System.out.println();
            System.out.println("Rata rata = " + ratarata);
            
        }
                
    }
    


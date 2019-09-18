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
public class ArrayMultiDimensi {

    public static void main(String[] args) {
        int[][][] nilai = {
            {{54, 50}, {29, 80}, {40, 15}},
            {{30, 70}, {40, 45}, {56, 52}},
            {{49, 50}, {57, 30}, {65, 45}}
        };
        for (int i = 0; i < nilai.length; i++) {

            for (int j = 0; j < nilai[0].length; j++) {
                for (int k = 0; k < nilai[0][0].length; k++) {
                    System.out.println("nilai [" + i + "][" + j + "][" + k + "] = " + nilai[i][j][k] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

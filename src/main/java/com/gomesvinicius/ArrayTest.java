package com.gomesvinicius;

public class ArrayTest {
    public static void main(String[] args) {

        int [][] twoDimension  = new int [3][];
        twoDimension[0] = new int[2];
        twoDimension[1] = new int[5];
        twoDimension[2] = new int[4];

        System.out.println(twoDimension.length);
        System.out.println(twoDimension[0].length);
        System.out.println(twoDimension[1].length);
        System.out.println(twoDimension[2].length);
        System.out.println();

        for(int i = 0; i < twoDimension.length; i++){
            for(int j = 0; j < twoDimension[i].length; j++){
                twoDimension[i][j] = j + 1;
            }
        }

        for(int i = 0; i < twoDimension.length; i++){
            for(int j = 0; j < twoDimension[i].length; j++){
                System.out.println(twoDimension[i][j]);
            }
        }

    }
}

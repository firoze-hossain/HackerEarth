package com.hackerearth.basicProgramming.zoos;

import java.util.Scanner;

public class Zoos {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        int zcount = 0;

        int ocount = 0;

        String word = sc.next();

        int length = word.length();

        String[] arr = word.split("");

        for (int i = 0; i < length; i++) {

            if (arr[i].equals("z")) {

                zcount++;

            } else if (arr[i].equals("o")) {

                ocount++;

            }

        }

        if (2 * zcount == ocount) {

            System.out.print("Yes");

        } else {

            System.out.print("No");

        }

    }
}

package com.company;

import java.util.Scanner;

public class RunMethod {
    public static void run() {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("PRESS[1] TO SIGN IN");
            System.out.println("PRESS[2] TO SIGN UP");
            System.out.println("PRESS[3] TO EXIT");
            int choose = in.nextInt();
            switch (choose) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Goodbye");
                    break;
            }
            if (choose == 3) {
                break;
            }
        }
    }
}

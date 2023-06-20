package com.anaste;

public class Main {
    public static void main(String[] args) {
        triangleLeftDown(6, ".");
        triangleLeftUp(6, ".");
        System.out.println();

        System.out.println();

        triangleLeftDown(6, ".");
        triangleRightUp(6, ".");

        System.out.println();

        triangleRightDown(6, ".");
        triangleRightUp(6, ".");

        System.out.println();

        triangleRightDown(6, ".");
        triangleLeftUp(6, ".");

        System.out.println();

        triangleRightDown(6, ".");
        rectangle(6, ".");
        triangleRightUp(6, ".");

        System.out.println();

        triangleRightDown(6, ".");
        rectangle(6, ".");
        triangleLeftUp(6, ".");

        System.out.println();

        baum(3, 7, ".", 4);

        trapeze(6, ".");
    }

    public static void triangleLeftDown(int rows, String character) {
        for (int i = 1; i <= rows; i++) {
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print(character);
            }
            System.out.println();
        }
    }

    public static void triangleLeftUp(int rows, String character) {
        for (int i = rows; i >= 1; i--) {
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print(character);
            }
            System.out.println();
        }
    }

    public static void triangleRightUp(int rows, String character) {
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print(character);
            }
            System.out.println();
        }
    }

    public static void triangleRightDown(int rows, String character) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print(character);
            }
            System.out.println();
        }
    }

    public static void rectangle(int rows, String character) {
        for (int i = 1; i <= rows; i++) {
            for (int k = 1; k <= rows * 2 - 1; k++) {
                System.out.print(character);
            }
            System.out.println();
        }
    }

//    public static void triangleCentred(int rows, String character) {
//        for (int i = 1; i <= rows; i++) {
//            for (int j = 1; j <= rows - i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= 2 * i - 1; k++) {
//                System.out.print(character);
//            }
//            System.out.println();
//        }
//    }

    public static void baum(int size, int rows, String character, int delayToRight) {
        for (int s = 0; s < size; s++) {

            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= delayToRight; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= rows - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print(character);
                }
                System.out.println();
            }

        }
        System.out.println();
    }

    public static void trapeze(int rows, String character) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * rows + (i * 2); k++) {
                System.out.print(character);
            }
            System.out.println();
        }
    }


}

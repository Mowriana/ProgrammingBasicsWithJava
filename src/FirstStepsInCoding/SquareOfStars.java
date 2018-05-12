package FirstStepsInCoding;

import java.util.Scanner;

public class SquareOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());

        //uper
        for (int i = 0; i < a; i++) {
            System.out.printf("*");
        }
        System.out.printf("\n");

        //middle
        for (int i = 0; i < a - 2; i++)
        {
            System.out.printf("*");
            for (int j = 0; j < a - 2; j++)  {
                System.out.printf(" ");
            }
            System.out.printf("*");
            System.out.printf("\n");

        }
        //down
        for (int i = 0; i < a; i++) {
            System.out.printf("*");

            }

        }
    }
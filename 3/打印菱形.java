package lqb;
import java.util.Scanner;

public class ¥Ú”°¡‚–Œ {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int line=sc.nextInt();
        print(line*2+1);
    }

    public static void print(int size) {
        if (size % 2 == 0) {
            size++;
        }
        for (int i = 0; i < size / 2; i++) {
            for (int j = size / 2 + 1; j > i + 1; j--) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = size / 2 + 1; j > i + 1; j--) {
                System.out.print("*");
            }     
            System.out.println();
        }
        for (int i = size / 2 + 2; i < size; i++) {
            for (int j = 0; j < i - size / 2; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * size - 1 - 2 * i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i - size / 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
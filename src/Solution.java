import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int height = 0;
        int width = 0;
        while (height < 1) {
            while (width < 1) {
                System.out.println("ББББББББББББББББББББ");
                width++;
            }
            while (width <= 10) {
                if (width <= 9) {
                    System.out.println("Б                  Б");
                } else {
                    System.out.print("ББББББББББББББББББББ");
                }
                width++;
            }
            System.out.println();
            height++;
        }
    }
}
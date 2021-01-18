import java.util.Scanner;

public class Testino {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int even = Integer.MIN_VALUE;
        int minValue = Integer.MIN_VALUE;
        while (true) {
            if (sc.hasNextInt()){
                int number = sc.nextInt();
                if (number % 2 == 0 && even < number)
                even = number;
            } else if (even == Integer.MIN_VALUE) {
                System.out.println(minValue);
                break;
            } else {
                System.out.println(even);
                break;
            }
        }
    }
}

import java.util.Scanner;
import java.util.stream.IntStream;

public class LetsGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        boolean isExit = false;
        while (!isExit) {
            String line = scanner.nextLine();

            if (line.equals("ENTER")) {
                isExit = true;
            } else {
                int number = Integer.parseInt(line);
                sum += number;
            }
        }
        System.out.println(sum);
    }
}
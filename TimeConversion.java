import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter time in 12-hour format (e.g., 08:05:50PM): ");
        String str = scanner.nextLine();

        PrintTime(str);

        scanner.close();
    }

    public static void PrintTime(String str) {
        int h1 = (int) str.charAt(1) - '0';
        int h2 = (int) str.charAt(0) - '0';
        int hh = (h2 * 10 + h1 % 10);

        if (str.charAt(8) == 'A') {
            if (hh == 12) {
                System.out.print("00");
                for (int i = 2; i <= 7; i++)
                    System.out.print(str.charAt(i));
            } else {
                for (int i = 0; i <= 7; i++)
                    System.out.print(str.charAt(i));
            }
        } else {
            if (hh == 12) {
                System.out.print("12");
                for (int i = 2; i <= 7; i++)
                    System.out.print(str.charAt(i));
            } else {
                hh = hh + 12;
                System.out.print(hh);
                for (int i = 2; i <= 7; i++)
                    System.out.print(str.charAt(i));
            }
        }
    }
}

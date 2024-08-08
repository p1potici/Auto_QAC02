import java.util.Scanner;

public class LeapYear {
    static boolean isLeapYear(int y) {
        return (y % 400 == 0) || ((y % 100 != 0) && (y % 4 == 0));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introdu anii intre 1900- 2016:");
        int year = scanner.nextInt();

        if (year < 1900 || year > 2016) {
            System.out.println("te rog introdu un an intre anii 1900 si 2016.");
        } else {
            if (isLeapYear(year)) {
                System.out.println("februarie are 29 de zile in " + year + ".");
            } else {
                System.out.println("februarie are 28 de zile in  " + year + ".");
            }
        }
    }
}
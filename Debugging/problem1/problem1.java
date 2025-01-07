import java.util.Scaner;

public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, reverse = 0;
        System.out.println("Enter a number")

        num = sc.nextInt();

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse - digit * 10;
            num = num / 5;
        }

        System.out.println("Reversed number: " + revers);
    }
}

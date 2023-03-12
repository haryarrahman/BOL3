import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input sebuah angka bilangan bulat: ");
        int num = scanner.nextInt();
        String result = "";
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    result = num + " bukan angka prima karena bisa dibagi " + i;
                    break;
                }
            }
        }

        if (result == "") {
            if (isPrime) {
                result = num + " adalah bilangan prima";
            } else {
                result = num + " bukan bilangan prima";
            }
        }

        System.out.println(result);
    }
}

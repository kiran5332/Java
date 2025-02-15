import java.util.Scanner;

class GoodPrimeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the range: ");
        int range = sc.nextInt();
        int cnt = 0;

        for (int i = 2; i <= range; i++) {
            boolean isPrime = true;
            boolean isGoodPrime = true;

            // Check if 'i' is prime
            for (int j = 2; j * j <= i; j++) { // Optimized to √i
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            // If it's prime, check if all its digits are also prime
            if (isPrime) {
                int num = i;
                while (num > 0) {
                    int rem = num % 10;
                    if (rem == 0 || rem == 1 || rem == 4 || rem == 6 || rem == 8 || rem == 9) {
                        isGoodPrime = false;
                        break;
                    }
                    num /= 10;
                }

                if (isGoodPrime) {
                    cnt++;
                    System.out.println(i + " is a Good Prime Number");
                }
            }
        }

        System.out.println("Total count within Range 2 - " + range + " : " + cnt);
        sc.close();
    }
}


public class Main {
    public static void main(String[] args) {
        // Dost ededler 220-284 220-nin ozunden basqa bolenlerinin cemi 280-e, 280-nin ozwunden basqa bolenlerinin cemi 220-e beraberdir

        int num1 = 220;
        int num2 = 284;
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 1; i < num1; i++) {
            if (num1 % i == 0) {
                sum1 += i;
            }
        }
        for (int i = 1; i < num2; i++) {
            if (num2 % i == 0) {
                sum2 += i;
            }
        }

        if (sum1 == num2 && sum2 == num1) {
            System.out.println(num1 + " ve " + num2 + " dost ededlerdir.");
        } else {
            System.out.println(num1 + " ve " + num2 + " dost ededler deyil.");
        }

    }
}
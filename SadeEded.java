public class Main {
    public static void main(String[] args) {
        int number = 13;
        int x = 0;
        if (number == 0 || number == 1) {
            System.out.println(number + " ne sade ne murekkeb ededdir");
        } else {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    x++;
                }
            }
            if (x <= 2) {
                System.out.println(number + " sade ededdir.");
            } else {
                System.out.println(number + " murekkeb ededdir");
            }
        }

        //Muellimin yazdigi
        int number1 = 25;
        //int remainder = number % 2;
        boolean isPrime = true;

        if (number1 == 1) {
            System.out.println("Sade eded deyil");
            return;
        }

        if (number1 < 1) {
            System.out.println("Kecersiz eded");
            return;
        }

        for (int i = 2; i < number1; i++) {
            if (number1 % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {                    //bu ele isPrime==true demekdir
            System.out.println("Sade ededdir");
        } else {
            System.out.println("Murekkeb ededdir");
        }

    }
}
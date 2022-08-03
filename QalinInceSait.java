public class Main {
    public static void main(String[] args) {

        String herf = "A";

        switch (herf.toLowerCase()) {
            case "a":
            case "ı":
            case "o":
            case "u":
                System.out.println(herf + " qalin saitdir");
                break;
            case "e":
            case "ə":
            case "i":
            case "ö":
            case "ü":
                System.out.println(herf + " ince saitdir");
                break;
            default:
                System.out.println("Duzgen daxil edin");


        }

        //Muellimin yazdigi

        char harf = 'E';

        switch (harf){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Qalin saitdir");
                break;
            default:
                System.out.println("Ince saitdir");
        }

    }
}
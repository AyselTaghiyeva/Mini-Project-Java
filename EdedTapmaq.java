public class Main {
    public static void main(String[] args) {

        int[] ededler = new int[]{1,2,5,7,9,0};
        int tap = 5;
        boolean tesdiq = false;

        for(int eded:ededler){
            if(tap==eded){
                tesdiq = true;
                break;
            }
        }
        if(tesdiq){   //tesdiq == true
            System.out.println(tap + " ededlerin daxilinde vardir.");
        }else{
            System.out.println(tap + " ededlerin daxilinde yoxdur.");
        }

    }
}
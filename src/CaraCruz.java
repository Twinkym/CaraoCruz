import java.util.Random;
import java.util.Scanner;

public class CaraCruz {



    public static void main (String[] args){

        int coinValue1 = throwCoin();
        int coinValue2 = throwCoin();

        System.out.println("A salido cara: " + coinValue1);
        System.out.println("A salido cruz: " + coinValue2);
        while (askIfThrow()) {
              
        }
    }

    private static boolean askIfThrow() {
        System.out.println("Vols llençar una moneda? (S/N)");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        return text.equalsIgnoreCase("s");
    }

    private static int throwCoin() {
        return new Random().nextInt(1,3);
    }

}

import java.util.Scanner;

public class Platnosc implements Adapter {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public boolean rozpoznijPlatnosc() {
        System.out.println("Podaj numer karty:");
        int nrKarty = scanner.nextInt();
        System.out.println("Podaj nr CVV:");
        int nrcvv = scanner.nextInt();
        System.out.println("Podaj PIN:");
        int pin = scanner.nextInt();
        System.out.println("Płatność się powiodła.");
        return true;
    }
}

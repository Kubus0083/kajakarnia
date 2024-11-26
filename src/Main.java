import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Adapter platnosc = new Platnosc();
        List<Kajak> kajaki = new ArrayList<>();
        kajaki.add(new Kajak(9,Kajak.Rodzaj.Rodzniny,Kajak.Kolor.Czerwony));
        kajaki.add(new Kajak(4,Kajak.Rodzaj.Dwoosobowy,Kajak.Kolor.Czerwony));
        kajaki.add(new Kajak(8,Kajak.Rodzaj.Sportowy,Kajak.Kolor.Czerwony));
        kajaki.add(new Kajak(1,Kajak.Rodzaj.Jednoosobowy,Kajak.Kolor.Czerwony));
        kajaki.add(new Kajak(3,Kajak.Rodzaj.Jednoosobowy,Kajak.Kolor.Zielony));

        List<Rezerwacja> rezerwacja = new ArrayList<>();

        int choice = 0;
        while (choice != 2) {
            System.out.println("Witaj w wypożyczalni kajaków!");
            System.out.println("1 - Rezerwacja kajaka");
            System.out.println("2 - Wyjdź");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Podaj typ kajaka do rezerwacji (Jednoosobowy, Dwuosobowy, Sportowy, Rodzinny): ");
                    int kayakType = scanner.nextInt();
                    switch (kayakType){
                        case 1-> {
                            System.out.println("dostępne kajaki Jenoosobowe");
                            Map<Integer, Kajak> dostempne = new HashMap<>();
                            for (int i = 0; i < kajaki.size(); i++) {
                                if (kajaki.get(i).getRodzaj() == Kajak.Rodzaj.Jednoosobowy && kajaki.get(i).isDostępność() == true) {
                                    dostempne.put(dostempne.size(), kajaki.get(i));
                                    System.out.println("kajak kolor: " + kajaki.get(i).getKolor() + "cena za minutę: " + kajaki.get(i).getKosztPerMin());
                                }
                            }
                            int wypor = scanner.nextInt() - 1;
                            System.out.println("podaj datę (RRRR-MM-DD)");
                            String data = scanner.next();
                            System.out.println("podaj godzinę GG:MM");
                            String godz = scanner.next();

                            System.out.println("podaj liczbę minut: ");
                            int minuty = scanner.nextInt();
                            System.out.println("cena = " + minuty * dostempne.get(wypor).getKosztPerMin());
                            System.out.println("czy napewno chcesz Wynająć Kajak T/N");
                            if (scanner.next().equals("T")) {
                                if (platnosc.rozpoznijPlatnosc()) {
                                    rezerwacja.add(new Rezerwacja(dostempne.get(wypor), (new Date((data + "" + godz).toString())), minuty));
                                }
                            }
                        }
                        case 2-> {
                            System.out.println("dostępne kajaki Jenoosobowe");
                            Map<Integer, Kajak> dostempne = new HashMap<>();
                            for (int i = 0; i < kajaki.size(); i++) {
                                if (kajaki.get(i).getRodzaj() == Kajak.Rodzaj.Dwoosobowy && kajaki.get(i).isDostępność() == true) {
                                    dostempne.put(dostempne.size(), kajaki.get(i));
                                    System.out.println("kajak kolor: " + kajaki.get(i).getKolor() + "cena za minutę: " + kajaki.get(i).getKosztPerMin());
                                }
                            }
                            int wypor = scanner.nextInt() - 1;
                            System.out.println("podaj datę (RRRR-MM-DD)");
                            String data = scanner.next();
                            System.out.println("podaj godzinę GG:MM");
                            String godz = scanner.next();

                            System.out.println("podaj liczbę minut: ");
                            int minuty = scanner.nextInt();
                            System.out.println("cena = " + minuty * dostempne.get(wypor).getKosztPerMin());
                            System.out.println("czy napewno chcesz Wynająć Kajak T/N");
                            if (scanner.next().equals("T")) {
                                if (platnosc.rozpoznijPlatnosc()) {
                                    rezerwacja.add(new Rezerwacja(dostempne.get(wypor), (new Date((data + "" + godz).toString())), minuty));
                                }
                            }
                        }
                        case 3-> {
                            System.out.println("dostępne kajaki Jenoosobowe");
                            Map<Integer, Kajak> dostempne = new HashMap<>();
                            for (int i = 0; i < kajaki.size(); i++) {
                                if (kajaki.get(i).getRodzaj() == Kajak.Rodzaj.Sportowy && kajaki.get(i).isDostępność() == true) {
                                    dostempne.put(dostempne.size(), kajaki.get(i));
                                    System.out.println("kajak kolor: " + kajaki.get(i).getKolor() + "cena za minutę: " + kajaki.get(i).getKosztPerMin());
                                }
                            }
                            int wypor = scanner.nextInt() - 1;
                            System.out.println("podaj datę (RRRR-MM-DD)");
                            String data = scanner.next();
                            System.out.println("podaj godzinę GG:MM");
                            String godz = scanner.next();

                            System.out.println("podaj liczbę minut: ");
                            int minuty = scanner.nextInt();
                            System.out.println("cena = " + minuty * dostempne.get(wypor).getKosztPerMin());
                            System.out.println("czy napewno chcesz Wynająć Kajak T/N");
                            if (scanner.next().equals("T")) {
                                if (platnosc.rozpoznijPlatnosc()) {
                                    rezerwacja.add(new Rezerwacja(dostempne.get(wypor), (new Date((data + "" + godz).toString())), minuty));
                                }
                            }
                        }
                        case 4-> {
                            System.out.println("dostępne kajaki Jenoosobowe");
                            Map<Integer, Kajak> dostempne = new HashMap<>();
                            for (int i = 0; i < kajaki.size(); i++) {
                                if (kajaki.get(i).getRodzaj() == Kajak.Rodzaj.Rodzniny && kajaki.get(i).isDostępność() == true) {
                                    dostempne.put(dostempne.size(), kajaki.get(i));
                                    System.out.println("kajak kolor: " + kajaki.get(i).getKolor() + "cena za minutę: " + kajaki.get(i).getKosztPerMin());
                                }
                            }
                            int wypor = scanner.nextInt() - 1;
                            System.out.println("podaj datę (RRRR-MM-DD)");
                            String data = scanner.next();
                            System.out.println("podaj godzinę GG:MM");
                            String godz = scanner.next();

                            System.out.println("podaj liczbę minut: ");
                            int minuty = scanner.nextInt();
                            System.out.println("cena = " + minuty * dostempne.get(wypor).getKosztPerMin());
                            System.out.println("czy napewno chcesz Wynająć Kajak T/N");
                            if (scanner.next().equals("T")) {
                                if (platnosc.rozpoznijPlatnosc()) {
                                    rezerwacja.add(new Rezerwacja(dostempne.get(wypor), (new Date((data + "" + godz).toString())), minuty));
                                }
                            }
                        }

                    }

                }
                case 2 -> System.out.println("Dziękujemy za korzystanie z naszej wypożyczalni!");
                default -> System.out.println("Nieprawidłowy wybór. Spróbuj ponownie.");
            }
        }

        scanner.close();
    }
}
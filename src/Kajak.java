public class Kajak {

    public enum Rodzaj {
        Jednoosobowy, Dwoosobowy, Sportowy, Rodzniny
    }
    public enum Kolor {
        Czerwony, Niebieski, Zielony
    }

    private Rodzaj rodzaj;
    private boolean Dostępność = true;
    private double kosztPerMin;
    private Kolor kolor;

    public Kajak( double kosztPerMin, Rodzaj rodzaj,Kolor kolor) {
        this.kolor = kolor;
        this.kosztPerMin = kosztPerMin;
        this.rodzaj = rodzaj;
    }

    public void Wynajmnij(){
        this.Dostępność = false;
    }
    public void zwroc(){
        this.Dostępność=true;
    }

    public double getKosztPerMin() {
        return kosztPerMin;
    }

    public Kolor getKolor() {
        return kolor;
    }

    public Rodzaj getRodzaj() {
        return rodzaj;
    }

    public boolean isDostępność() {
        return Dostępność;
    }
}

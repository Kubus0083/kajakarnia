import java.text.SimpleDateFormat;
import java.util.Date;

public class Rezerwacja {
    private Kajak kajak;
    private Date dataWyporzyczenia;
    private double okres;

    public void wyswietlDateWyporzyczenia(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-mm-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(dataWyporzyczenia));
    }

    public Rezerwacja(Kajak kajak,Date data,double okres){
        this.kajak =kajak;
        this.dataWyporzyczenia =data;
        this.okres = okres;
    }
}


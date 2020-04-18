package bramka;

import pojazdy.Pojazd;

import java.time.LocalDateTime;

public class Wjazd {

    private final LocalDateTime dataWjazdu;
    private final Pojazd pojazd;

    public Wjazd(LocalDateTime dataWjazdu, Pojazd pojazd) {
        this.dataWjazdu = dataWjazdu;
        this.pojazd = pojazd;
    }

    public LocalDateTime getDataWjazdu() {
        return dataWjazdu;
    }

    public Pojazd getPojazd() {
        return pojazd;
    }
}

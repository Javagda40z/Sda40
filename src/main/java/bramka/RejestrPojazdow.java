package bramka;

import pojazdy.Pojazd;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class RejestrPojazdow {

    Map<String, Wjazd> rejestr = new HashMap<>();

    public boolean wpisz(Pojazd pojazd) {
        Wjazd wjazd = new Wjazd(LocalDateTime.now(), pojazd);

        if (czyPojazdJestWRejestrze(pojazd)) {
            return false;
        }

        rejestr.put(pojazd.getRejestracja(), wjazd);
        return true;
    }

    public Wjazd wypisz(Pojazd pojazd) {
        Wjazd wjazd = rejestr.remove(pojazd.getRejestracja());
        return wjazd;
    }

    private boolean czyPojazdJestWRejestrze(Pojazd pojazd) {
        return rejestr.containsKey(pojazd.getRejestracja());
    }

}

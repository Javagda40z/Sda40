package bramka;

import pojazdy.Pojazd;

public class Bramka implements Szlaban {

    private Raport raport;
    private RejestrPojazdow rejestrPojazdow;
    private KalkulatorOplat kalkulatorOplat;

    public Bramka(RejestrPojazdow rejestrPojazdow) {
        this.rejestrPojazdow = rejestrPojazdow;
        raport = new Raport();
    }

    @Override
    public void wjazd(Pojazd pojazd) {
        boolean czyWjechal = rejestrPojazdow.wpisz(pojazd);
        if (!czyWjechal) {
            zawolajPomoc(pojazd);
        } else {
            System.out.println("Pojazd o nr rejestracyjnym "
                    + pojazd.getRejestracja() + " wjechał na parking");
        }
    }

    private void zawolajPomoc(Pojazd pojazd) {
        System.out.println("Wolam pomoc dla pojazdu o nr rejestracyjnym: " +
                "" + pojazd.getRejestracja());
    }

    @Override
    public void wyjazd(Pojazd pojazd, int zaplata) {
        Wjazd wjazd = rejestrPojazdow.wypisz(pojazd);
        int koszt = kalkulatorOplat.policz(wjazd);

        if (koszt > zaplata) {
            zawolajPomoc(pojazd);
        }

        raport.dodajPojazd(pojazd.getTyp());
        raport.dodajKase(zaplata);
        raport.dodajKoszt(koszt);

        System.out.println("Wyjeżdza pojazd o nr rejestracyjnym "
                + wjazd.getPojazd().getRejestracja() +
                " zaplacono: " + zaplata + " a koszt to: " + koszt);
    }

    public void setKalkulatorOplat(KalkulatorOplat kalkulatorOplat) {
        this.kalkulatorOplat = kalkulatorOplat;
    }

    public Raport przygotujRaport() {
        return raport;
    }
}

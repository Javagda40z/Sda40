package bramka;

import pojazdy.Typ;

import java.util.EnumMap;
import java.util.Map;

public class Raport {

    private int zarobek;
    private int koszt;
    private Map<Typ, Integer> licznikPojazdow = new EnumMap<>(Typ.class);

    public int getZarobek() {
        return zarobek;
    }

    public Map<Typ, Integer> getLicznikPojazdow() {
        return licznikPojazdow;
    }

    public int getKoszt() {
        return koszt;
    }

    public void dodajKase(int kasa) {
        zarobek += kasa; // zarobek = zarobek + kasa;
    }

    public void dodajKoszt(int koszt) {
        this.koszt += koszt;
    }

    public void dodajPojazd(Typ typ) {

        if (licznikPojazdow.containsKey(typ)) {
            Integer licznik = licznikPojazdow.get(typ);
            licznik++;
            licznikPojazdow.put(typ, licznik);
        } else {
            licznikPojazdow.put(typ, 1);
        }
        // mozna tez tak:
        // licznikPojazdow.compute(typ, (k,v) -> 1 + (v == null ? 0 : v));

    }

    public void wyswietl() {
        System.out.println("Zarobiona kasa: " + zarobek);
        System.out.println("Koszt: " + koszt);
        for (Typ typ : licznikPojazdow.keySet()) { // przy pomocy entrysetu lepiej
            System.out.println("Pojazdow o typie: " + typ.name()
                    + " jest: " + licznikPojazdow.get(typ));
        }


    }
}

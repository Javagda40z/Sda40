import bramka.Bramka;
import bramka.KalkulatorOplat;
import bramka.Raport;
import bramka.RejestrPojazdow;
import pojazdy.Autobus;
import pojazdy.Motocykl;
import pojazdy.Paliwo;
import pojazdy.Samochod;

public class Application {


    //Sprawdzanie czy jest miejsce
    //SPrawdzanie czy rejestracja jest poprawna - statyczna metoda
    //Stworz nowy kalkulator oplat
    //Nie pozwalac na podmiane kalkulatora jezeli ktos jest na parkingu
    //Stosowac stary kalkulator do pojazdow ktore wjechaly przed podmiana
    //Zmienna oplata w zaleznosci od godziny
    //Zmienna oplata w zaleznosci od paliwa
    //Wydawanie reszty
    //Wzywanie policji?
    //Zrobienie lepszego raportu - np wysylanie maila albo generowanie do pliku
    //Co zostalo na parkingu?

    public static void main(String[] args) {
        RejestrPojazdow rejestrPojazdow = new RejestrPojazdow();
        Bramka bramka = new Bramka(rejestrPojazdow);
        bramka.setKalkulatorOplat(new KalkulatorOplat());

        Motocykl motocykl = new Motocykl("GD12345", Paliwo.BENZYNA);
        Samochod samochod = new Samochod("GD54321", Paliwo.BENZYNA);
        Autobus autobus = new Autobus("GD54322", Paliwo.BENZYNA);

        bramka.wjazd(motocykl);
        bramka.wjazd(samochod);
        bramka.wjazd(autobus);

        bramka.wyjazd(samochod, 10);
        bramka.wyjazd(autobus, 100);
//        bramka.wyjazd(samochod, 20);
//        bramka.wjazd(samochod);
//        bramka.wjazd(motocykl);


        Raport raport = bramka.przygotujRaport();
        raport.wyswietl(); // Raczej powinna byc klasa od wyswietlania raportu

    }
}

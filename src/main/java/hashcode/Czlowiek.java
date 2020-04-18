package hashcode;

public class Czlowiek {

    private String imie;
    private int wiek;

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public Czlowiek(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    public void poruszajSie() {
        System.out.println("Poruszam się chodząc.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;

        Czlowiek czlowiek = (Czlowiek) o;

        if (wiek != czlowiek.wiek) return false;
        return imie.equals(czlowiek.imie);
    }
    // jeżeli equals zwraca true to hashcode jest taki sam dla porownywanych obiektow
    // jezeli hashcode jest rowny to equals nie musi zwracac true
    // hashcode jest zawsze taki sam dla niezmienionych danych
    @Override
    public int hashCode() {
        int result = imie.hashCode();
        result = 31 * result + wiek;
        return result;
    }
}

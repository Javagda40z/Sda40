package pojazdy;

public abstract class Pojazd {

    private String rejestracja;
    private Typ typ;
    private Paliwo paliwo;

    public Pojazd(String rejestracja, Typ typ, Paliwo paliwo) {
        this.rejestracja = rejestracja;
        this.typ = typ;
        this.paliwo = paliwo;
    }

    public String getRejestracja() {
        return rejestracja;
    }

    public Typ getTyp() {
        return typ;
    }

    public Paliwo getPaliwo() {
        return paliwo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pojazd pojazd = (Pojazd) o;

        return rejestracja.equals(pojazd.rejestracja);
    }

    @Override
    public int hashCode() {
        return rejestracja.hashCode();
    }
}

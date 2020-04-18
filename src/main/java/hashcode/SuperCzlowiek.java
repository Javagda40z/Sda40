package hashcode;

public class SuperCzlowiek extends Czlowiek {

    int cokolwiek;

    public SuperCzlowiek(String imie, int wiek) {
        super(imie, wiek);
    }

    public int getCokolwiek() {
        return cokolwiek;
    }

    public void setCokolwiek(int cokolwiek) {
        this.cokolwiek = cokolwiek;
    }

    public void lataj() {
        System.out.println("Poruszam się latając");
    }

    @Override
    public void poruszajSie() {
        lataj();
    }
}

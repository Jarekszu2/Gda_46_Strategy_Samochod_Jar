package packSamochod;

import lombok.Data;

@Data
public class Samochod {
    private String nrRejestracyjny;
    private int predkosc;
    private int iloscPaliwa;
    private int poziomNaladowaniaAkumulatorow;
    private int mocSilnika;
    private INaped rodzajSilnika;

    public Samochod(String nrRejestracyjny, int iloscPaliwa, int mocSilnika, INaped rodzajSilnika) {
        this.nrRejestracyjny = nrRejestracyjny;
        this.predkosc = 0;
        this.iloscPaliwa = iloscPaliwa;
        this.poziomNaladowaniaAkumulatorow = 80;
        this.mocSilnika = mocSilnika;
        this.rodzajSilnika = rodzajSilnika;
    }

    public void przyspiesz() {
        if (mocSilnika < 100) {
            predkosc += 5;
        } else if (mocSilnika >= 100 && mocSilnika < 150) {
            predkosc += 8;
        } else if (mocSilnika >= 150) {
            predkosc += 10;
        }

        if ((iloscPaliwa - rodzajSilnika.getPoborPaliwaSilnika()) >= 0) {
            iloscPaliwa -= rodzajSilnika.getPoborPaliwaSilnika();
        } else {
            setPredkosc(0);
            setIloscPaliwa(0);
            System.err.println("Samochód zatrzymany. Brak paliwa.");
            showTheConditionOfTheVehicle();
        }

        if ((poziomNaladowaniaAkumulatorow - rodzajSilnika.getPoborPraduSilnika() >= 0) && (poziomNaladowaniaAkumulatorow - rodzajSilnika.getPoborPraduSilnika() <= 100)) {
            poziomNaladowaniaAkumulatorow -= rodzajSilnika.getPoborPraduSilnika();
        } else if (poziomNaladowaniaAkumulatorow - rodzajSilnika.getPoborPraduSilnika() < 0) {
            setPredkosc(0);
            System.err.println("Samochód zatrzymany. Rozładowany akumulator.");
            showTheConditionOfTheVehicle();
        } else if (poziomNaladowaniaAkumulatorow - rodzajSilnika.getPoborPraduSilnika() > 100) {
            poziomNaladowaniaAkumulatorow = 100;
        }
    }

    public void zwolnij(int predkosc) {

    }

    public void showTheConditionOfTheVehicle() {
        System.out.println("Prędkość: " + getPredkosc());
        System.out.println("Ilość paliwa: " + getIloscPaliwa());
        System.out.println("Poziom naładowania akumulatorów: " + getPoziomNaladowaniaAkumulatorow());
    }
}

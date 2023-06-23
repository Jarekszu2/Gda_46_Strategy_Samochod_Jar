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

    // w zależności od mocy silnika zwiększa prędkośc samochodu, pobiera odpowiednią ilość paliwa i prądu
    public void przyspiesz() {
        System.out.println("Przyspiesza.");
        // zwiększenie prędkości
        if (mocSilnika < 100) {
            if ((predkosc + 15) <= 120) {
                predkosc += 15;
            } else {
                predkosc = 120;
                System.err.println("Ograniczenie prędkości do 120.");
            }
        }


        if (mocSilnika >= 100 && mocSilnika < 150) {
            if ((predkosc + 18) <= 120) {
                predkosc += 18;
            } else {
                predkosc = 120;
                System.err.println("Ograniczenie prędkości do 120.");
            }
        }

        if (mocSilnika >= 150) {
            if ((predkosc + 22) <= 120) {
                predkosc += 22;
            } else {
                predkosc = 120;
                System.err.println("Ograniczenie prędkości do 120.");
            }
        }

        // pobór paliwa
        if ((iloscPaliwa - rodzajSilnika.getPoborPaliwaSilnika()) >= 0) {
            iloscPaliwa -= rodzajSilnika.getPoborPaliwaSilnika();
        } else {
            setPredkosc(0);
            setIloscPaliwa(0);
            System.err.println("Samochód zatrzymany. Brak paliwa.");
//            showTheConditionOfTheVehicle();
        }

        // pobór prądu
        if ((poziomNaladowaniaAkumulatorow - rodzajSilnika.getPoborPraduSilnika() >= 0) && (poziomNaladowaniaAkumulatorow - rodzajSilnika.getPoborPraduSilnika() <= 100)) {
            poziomNaladowaniaAkumulatorow -= rodzajSilnika.getPoborPraduSilnika();
        } else if (poziomNaladowaniaAkumulatorow - rodzajSilnika.getPoborPraduSilnika() < 0) {
            setPredkosc(0);
            setPoziomNaladowaniaAkumulatorow(0);
            System.err.println("Samochód zatrzymany. Rozładowany akumulator.");
//            showTheConditionOfTheVehicle();
        } else if (poziomNaladowaniaAkumulatorow - rodzajSilnika.getPoborPraduSilnika() > 100) {
            poziomNaladowaniaAkumulatorow = 100;
        }
    }

    // w zależności od typu silnika ładuje akumulatory (i zwalnia samochód)
    public void zwolnij() {
        System.out.println("Zwalnia.");
//        SilnikHybrydowy silnikHybrydowy = new SilnikHybrydowy();
        // ładowanie akumulatorów
        if (rodzajSilnika.getPoborPraduSilnika() > 0) {
            if ((poziomNaladowaniaAkumulatorow + rodzajSilnika.getPoborPraduSilnika()) <= 100) {
                poziomNaladowaniaAkumulatorow += rodzajSilnika.getPoborPraduSilnika();
            } else {
                poziomNaladowaniaAkumulatorow = 100;
            }
        }

        // zmniejszenie prędkości (wszyscy tak samo o 10)
        if ((predkosc - 10) >= 0) {
            predkosc -= 10;
        } else {
            setPredkosc(0);
            System.err.println("Samochód zatrzymany.");
        }
    }

    public void zmianaSilnika(INaped iNaped) {
//        setRodzajSilnika(iNaped);
        rodzajSilnika = iNaped;
    }

    public void showTheConditionOfTheVehicle() {
        System.out.print("Samochód: ");
        System.err.println(getNrRejestracyjny());
        System.out.println("Prędkość: " + getPredkosc());
        System.out.println("Ilość paliwa: " + getIloscPaliwa());
        System.out.println("Poziom naładowania akumulatorów: " + getPoziomNaladowaniaAkumulatorow());
    }
}

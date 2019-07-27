package packSamochod;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        Samochod samochod1 = new Samochod("GD 1S", 50,95, new SilnikSpalinowy());
        Samochod samochod2 = new Samochod("GD 2H", 50,140, new SilnikHybrydowy());
        Samochod samochod3 = new Samochod("GD 3E", 0,160, new SilnikElektryczny());

        samochod1.przyspiesz();
        samochod1.przyspiesz();
        samochod1.przyspiesz();
        samochod1.przyspiesz();
        samochod1.przyspiesz();
        samochod1.showTheConditionOfTheVehicle();
        System.out.println();
        samochod1.przyspiesz();
        samochod1.przyspiesz();


    }
}

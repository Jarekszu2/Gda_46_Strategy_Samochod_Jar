package packSamochod;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        Samochod samochod1 = new Samochod("Spalinowy", 50,95, new SilnikSpalinowy());
        Samochod samochod2 = new Samochod("Hybrydowy", 50,140, new SilnikHybrydowy());
        Samochod samochod3 = new Samochod("Elektryczny", 0,160, new SilnikElektryczny());
        Samochod samochod4 = new Samochod("Magic", 50,160, new SilnikSpalinowy());

        System.out.println("START SAMOCHODU SPALINOWEGO");
        samochod1.showTheConditionOfTheVehicle();
        System.out.println();
        samochod1.przyspiesz();
        samochod1.showTheConditionOfTheVehicle();
        System.out.println();
        samochod1.przyspiesz();
        samochod1.showTheConditionOfTheVehicle();
        System.out.println();
        samochod1.przyspiesz();
        samochod1.showTheConditionOfTheVehicle();
        System.out.println();
        samochod1.przyspiesz();
        samochod1.showTheConditionOfTheVehicle();
        System.out.println();
        samochod1.przyspiesz();
        samochod1.showTheConditionOfTheVehicle();
        System.out.println();
        samochod1.przyspiesz();
        samochod1.showTheConditionOfTheVehicle();
        System.out.println();
        samochod1.zwolnij();
        samochod1.showTheConditionOfTheVehicle();
        System.out.println();
        samochod1.przyspiesz();
        samochod1.showTheConditionOfTheVehicle();
        System.out.println();
        samochod1.przyspiesz();
        samochod1.showTheConditionOfTheVehicle();
        System.out.println();
        samochod1.przyspiesz();
        samochod1.showTheConditionOfTheVehicle();
        System.out.println();
        System.out.println();
        System.out.println();


        System.out.println("START SAMOCHODU HYBRYDOWEGO");
        samochod2.showTheConditionOfTheVehicle();
        System.out.println();
        samochod2.przyspiesz();
        samochod2.showTheConditionOfTheVehicle();
        System.out.println();
        samochod2.zwolnij();
        samochod2.showTheConditionOfTheVehicle();
        System.out.println();
        samochod2.zwolnij();
        samochod2.showTheConditionOfTheVehicle();
        System.out.println();
        System.out.println();
        System.out.println();


        System.out.println("START SAMOCHODU ELEKTRYCZNEGO");
        samochod3.showTheConditionOfTheVehicle();
        System.out.println();
        samochod3.przyspiesz();
        samochod3.showTheConditionOfTheVehicle();
        System.out.println();
        samochod3.przyspiesz();
        samochod3.showTheConditionOfTheVehicle();
        System.out.println();
        samochod3.przyspiesz();
        samochod3.showTheConditionOfTheVehicle();
        System.out.println();
        samochod3.przyspiesz();
        samochod3.showTheConditionOfTheVehicle();
        System.out.println();
        samochod3.przyspiesz();
        samochod3.showTheConditionOfTheVehicle();
        System.out.println();
        samochod3.przyspiesz();
        samochod3.showTheConditionOfTheVehicle();
        System.out.println();
        samochod3.przyspiesz();
        samochod3.showTheConditionOfTheVehicle();
        System.out.println();

        System.out.println();
        System.out.println();
        System.out.println("START SAMOCHODU ZMIENIAJĄCEGO SILNIKI");
        samochod4.showTheConditionOfTheVehicle();
        System.out.println();
        samochod4.przyspiesz();
        samochod4.showTheConditionOfTheVehicle();
        System.out.println();
        samochod4.zmianaSilnika(new SilnikHybrydowy());
        samochod4.przyspiesz();
        samochod4.showTheConditionOfTheVehicle();
        System.out.println();
        samochod4.zmianaSilnika(new SilnikElektryczny());
        samochod4.przyspiesz();
        samochod4.showTheConditionOfTheVehicle();
        System.out.println();
    }
}

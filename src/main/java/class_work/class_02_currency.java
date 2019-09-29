package class_work;

/**
 *
 */
public class class_02_currency {
    public static void main(String[] args) {

        double valueHryvna = 100;
        double rateUSD = 25.55;
        double rateGBP = 33.33;
        double rateEUR = 28.88;
        double rateRUB = 0.55;

        System.out.println("Hryvna sum: " + valueHryvna);
        System.out.println("USD sum: " + valueHryvna * rateUSD);
        System.out.println("GBP sum: " + valueHryvna * rateGBP);
        System.out.println("EUR sum: " + valueHryvna * rateEUR);
        System.out.println("RUB sum: " + valueHryvna * rateRUB);
    }
}

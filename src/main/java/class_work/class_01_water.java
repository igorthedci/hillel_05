package class_work;

/**
 * mix of two water cups
 */
public class class_01_water {
    public static void main(String[] args) {

        double cupV1 = 3.7;
        double cupT1 = 43;
        double cupV2 = 4.2;
        double cupT2 = 72;

        double mixT = (cupV1 * cupT1 + cupV2 * cupT2) / (cupV1 + cupV2);
        System.out.println("mix volume is " + (cupV1 + cupV2));
        System.out.println("mix temperature is " + mixT);
    }
}

public class Main {


    public enum Country {UKRAINE, CANADA, BRASIL, EGIPT, AUSTRALIA};


    public static void main(String[] args) {

        int[] array = {-12, 48, 23, -154, 835, 228, 16, 2, -111, 49};
        int sum = 0;
        int max = array[0];
        int countMinus = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];

            }
            if (array[i] < 0) {
                countMinus++;
            }
            if (array[i] > 0) {
                sum += array[i];
            }
        }
        int countPlus = array.length - countMinus;
        if (countMinus > countPlus) {
            System.out.println("Array has more minus sign elements");
        } else System.out.println("Array has more plus sign elements");

        System.out.println("The max element is:" + "  " + max);
        System.out.println("Sum of positive elements:" + " " + sum);
        System.out.println("Amount of minus elements:" + countMinus);
        System.out.println("Amount of plus elements:" + countPlus);

        for (Country c: Country.values()) {
            showContinent(c);
        }



    }

    private static void showContinent(Country c) {
        switch (c) {
            case BRASIL:
                System.out.println("South America");
                break;
            case EGIPT:
                System.out.println("Africa");
                break;
            case UKRAINE:
                System.out.println("Eurasia");
                break;
            case AUSTRALIA:
                System.out.println("Australia");
            case CANADA:
                System.out.println("North America");
                break;
            default:
                System.out.println("Country chosen bad");
        }
    }



}

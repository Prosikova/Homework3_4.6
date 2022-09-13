public class Main {
    public static void main(String[] args) {
        int amountBananas = 5;
        int weightBanana = 80;
        int weightBananas = amountBananas * weightBanana;
        int amountMilk = 200;
        float mlPerG = 1.05f;
        int amountIceCream = 2;
        int weightIceCream = 100;
        int amountEgg = 4;
        int weightEgg = 70;
        double weightSportBreakfast = weightBananas + amountMilk * mlPerG + amountIceCream * weightIceCream + amountEgg * weightEgg;
        System.out.println("Вес спортивного завтрака " + weightSportBreakfast + " г");
        int grPerKg = 1000;
        int weightSportBreakfastGr = 1090;
        float weightKg = weightSportBreakfastGr / (float)grPerKg;
        System.out.println("Вес спортивного завтрака " + weightKg + " кг");
    }
}
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {


        // * Первое задание с массивами

        int []massive = new int[20];
        int minimum = -10;
        int maximum = 10;

        Random rn = new Random();

        for (int i=0; i<20; i++) {
            massive[i] = rn.nextInt(maximum - minimum + 1) + minimum;
        }

        int maxNegativeIndex = 0;
        int minPositiveIndex = 0;

        for (int i=0; i<20; i++) {
            if (massive[minPositiveIndex] < 0) {
                minPositiveIndex += 1;
            }
            if (massive[maxNegativeIndex] >= 0) {
                maxNegativeIndex += 1;
            }
            if (massive[i] < 0 && massive[i] > massive[maxNegativeIndex]) {
                maxNegativeIndex = i;
            }
            if (massive[i] >= 0 && massive[i] < massive[minPositiveIndex]) {
                minPositiveIndex = i;
            }
        }

        System.out.printf("maxNegative=%d \n", massive[maxNegativeIndex]);
        System.out.printf("minPositive=%d \n", massive[minPositiveIndex]);

        for (int i=0; i<20; i++) {
            System.out.printf("[%d] ", massive[i]);
        }

        int temp = massive[maxNegativeIndex];
        massive[maxNegativeIndex] = massive[minPositiveIndex];
        massive[minPositiveIndex] = temp;

        System.out.println();

        for (int i=0; i<20; i++) {
            System.out.printf("[%d] ", massive[i]);
        }

        System.out.println("\n");
        
        // * Второе задание с конфетами

        MilkChocolate candie_0 = new MilkChocolate("AlpenGold-(коричневатое искушение)", 80, 59, 59);
        MilkChocolate candie_1 = new MilkChocolate("Kinder-(эй сыщик)", 40, 80, 32);
        WhiteChocolate candie_2 = new WhiteChocolate("AlpenGold-(white power)", 60, 70, true);
        DarkChocolate candie_3 = new DarkChocolate("Бабаевкий-(100 процентов какаушки)", 69, 96, 99.9f);
        Cookie candie_4 = new Cookie("Oreo", "Round", 88, 120);

        ArrayList<BaseCandy> candies = new ArrayList<>();

        candies.add(candie_0);
        candies.add(candie_1);
        candies.add(candie_2);
        candies.add(candie_3);
        candies.add(candie_4);

        printPresentInfo(candies);

        System.out.printf("PresentPrice-%.2fр | PresentWeight-%.2fг", getPresentPrice(candies), getPresentWeight(candies));
    }

    public static void printPresentInfo(ArrayList<BaseCandy> candies) {
        for (BaseCandy candy : candies) {
            System.out.printf("Name-%s | Weight-%.2fг | Price-%.2fр \n", candy.getName(), candy.getWeight(), candy.getPrice());
        }
    }

    public static float getPresentPrice(ArrayList<BaseCandy> candies) {
        float resultPrice= 0;

        for (BaseCandy candy : candies) {
            resultPrice += candy.getPrice();
        }

        return resultPrice;
    }

    public static float getPresentWeight(ArrayList<BaseCandy> candies) {
        float resultWeight = 0;

        for (BaseCandy candy : candies) {
            resultWeight += candy.getWeight();
        }

        return resultWeight;
    }

}

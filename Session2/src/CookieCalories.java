import java.util.Scanner;


public class CookieCalories {
    public static void main(String[] args){

        int value;
        Scanner keyboard = new Scanner(System.in);
        System.out.println(" How many cookies did you eat?");
        value = keyboard.nextInt();
        int cookie;
        int servings;
        int caloriesperserving;
        int totalcaloriesconsumed;
        cookie = value;
        servings = 10;
        caloriesperserving = 300;
        totalcaloriesconsumed = ((caloriesperserving/servings)*cookie);


        System.out.println("You have consumed " + totalcaloriesconsumed + " Calories");

    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class App
{
    public static void main(String[] args) {
        ArrayList<BodyMassIndex> bmiData = new ArrayList<BodyMassIndex>();

        while (moreInput()) {
            double height = getUserHeight();
            double weight = getUserWeight();

            BodyMassIndex bmi = new BodyMassIndex(height, weight);
            bmiData.add(bmi);

            displayBmiInfo(bmi);
        }

        displayBmiStatistics(bmiData);
    }

    static boolean moreInput()
    {
        String answer;
        Scanner scan = new Scanner(System.in);

        System.out.println("Would you like to enter BMI information? (Y or N)?");
        answer = scan.next();

        if(answer.equals("y") || answer.equals("Y"))
        {
            return true;
        }
        else if(answer.equals("n") || answer.equals("N"))
        {
            return false;
        }
        else // if an non valid input is added it will access this method again
        {
            moreInput();
        }
        return true; // actually not sure what's going on if i put a number then space enter that then put a space and = y it will somehow break out of the if else statement and return this
    }

    static double getUserHeight()
    {
        Scanner scan = new Scanner(System.in);
        double height;

        System.out.println("Please enter your height in inches.");
        height = scan.nextDouble();
        scan.nextLine();

        if(height < 0 || height == 0)
        {
            System.out.println("Please enter only positive values.");
            getUserHeight();
        }

        return height;
    }

    static double getUserWeight()
    {
        Scanner scan = new Scanner(System.in);
        double weight;

        System.out.println("Please enter your weight in pounds.");
        weight = scan.nextDouble();
        scan.nextLine();


        if(weight < 0 || weight == 0)
        {
            System.out.println("Please enter only positive values.");
            getUserWeight();
        }

        return weight;
    }

    public static void displayBmiInfo(BodyMassIndex bmi)
    {
        System.out.printf("Your BMI is: %.2f and your BMI category is %s\n", bmi.calcBMI(), bmi.bmiCategory());
    }

    private static void displayBmiStatistics(ArrayList<BodyMassIndex> bmiData)
    {
        double average = 0;
        for (BodyMassIndex bmi: bmiData)
        {
           average += bmi.calcBMI();
        }

        System.out.printf("%.2f", average/ bmiData.size());
    }
}







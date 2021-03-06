public class BodyMassIndex {

    private double height;
    private double weight;

    public BodyMassIndex(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    // calculates the bmi
    public double calcBMI()
    {
        double bmi = 703 * weight / (height * height);
        bmi = (double)Math.round(bmi * 100) / 100;

        return bmi;
    }

    //uses the bmi score to select what category the user would be in
    public String bmiCategory()
    {
        double bmi = 703 * weight / (height * height);
        String category;

        if(bmi < 18.5)
        {
            category = "Underweight";
        }
        else if(bmi >= 18.5 && bmi <= 24.9)
        {
            category = "Normal weight";
        }
        else if(bmi >= 25 && bmi <=29.9)
        {
            category = "Overweight";
        }
        else
        {
            category = "Obese";
        }

        return category;
    }

}

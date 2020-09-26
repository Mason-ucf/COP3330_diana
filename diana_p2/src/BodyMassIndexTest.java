import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.lang.Math;

public class BodyMassIndexTest {
    @Test
    public void testBmiCalculator()
    {
        BodyMassIndex b = new BodyMassIndex(71, 120);
        double bmi = b.calcBMI();
        bmi = (double)Math.round(bmi * 100) / 100;

        assertEquals(16.73, bmi);
    }

    @Test
    public void testBmiUnderweight()
    {
        BodyMassIndex b = new BodyMassIndex(71, 120);
        String category = b.bmiCategory();

        assertEquals("Underweight", category);
    }

    @Test
    public void testBmiNormalWeight()
    {
        BodyMassIndex b = new BodyMassIndex(71, 150);
        String category = b.bmiCategory();

        assertEquals("Normal weight", category);
    }

    @Test
    public void testBmiOverweight()
    {
        BodyMassIndex b = new BodyMassIndex(71, 200);
        String category = b.bmiCategory();

        assertEquals("Overweight", category);
    }

    @Test
    public void testBmiObese()
    {
        BodyMassIndex b = new BodyMassIndex(71, 300);
        String category = b.bmiCategory();

        assertEquals("Obese", category);
    }
}

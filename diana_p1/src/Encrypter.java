import java.util.Arrays;

public class Encrypter {

    public String encrypt(String value)
    {
        int valueToEncrypt = Integer.parseInt(value);
        int a, b, c, d;
        String encrypted;

        a = valueToEncrypt / 1000 % 10;
        b = valueToEncrypt / 100 % 10;
        c = valueToEncrypt / 10 % 10;
        d = valueToEncrypt % 10;

        int[] intArray = new int[]{a,b,c,d};

        intArray[0] = (a + 7) % 10;
        intArray[1] = (b + 7) % 10;
        intArray[2] = (c + 7) % 10;
        intArray[3] = (d + 7) % 10;

        intArray = swapNumbers(intArray);

        encrypted = convertToString(intArray);
        encrypted = encrypted.replaceAll("\\D","");

        return encrypted;
    }

    public static int[] swapNumbers(int[] intArray)
    {
        int temp;
        temp = intArray[0];
        intArray[0] = intArray[2];
        intArray[2] = temp;

        temp = intArray[1];
        intArray[1] = intArray[3];
        intArray[3] = temp;

        return intArray;
    }

    public static String convertToString(int intArray[])
    {
        String strArray[] = new String[intArray.length];

        for(int i = 0; i < intArray.length; i++)
        {
            strArray[i] = String.valueOf(intArray[i]);
        }
        return Arrays.toString(strArray);
    }
}

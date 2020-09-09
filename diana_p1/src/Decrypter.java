import java.util.Arrays;

public class Decrypter {

    public String decrypt(String value)
    {
        int valueToDecrypt = Integer.parseInt(value);
        int a, b, c, d;
        String decrypted;

        a = valueToDecrypt / 1000 % 10;
        b = valueToDecrypt / 100 % 10;
        c = valueToDecrypt / 10 % 10;
        d = valueToDecrypt % 10;

        int[] intArray = new int[]{a,b,c,d};

        intArray[0] = (a + 10 - 7) % 10;
        intArray[1] = (b + 10 - 7) % 10;
        intArray[2] = (c + 10 - 7) % 10;
        intArray[3] = (d + 10 - 7) % 10;

        intArray = swapNumbers(intArray);

        decrypted = convertToString(intArray);
        decrypted = decrypted.replaceAll("\\D","");

        return decrypted;
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

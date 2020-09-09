
public class Application {
    public static void main(String[] args)
    {
        Encrypter encrypt = new Encrypter();
        Decrypter decrypt = new Decrypter();

        String encrypted = encrypt.encrypt("1234");
        System.out.println(encrypted);

        String decrypted = decrypt.decrypt("0189");
        System.out.println(decrypted);
    }
}

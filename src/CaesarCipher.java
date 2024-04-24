import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int flag = 1;
        do{
            System.out.println("""
                    1. Encrypt Text
                    2. Decrypt Text
                    0. Exit
                    """);
            int choice = scanner.nextInt();
            switch (choice){
                case 0:
                    flag = 0;
                    break;
                case 1:
                    System.out.println("Encrypting text...");
                    System.out.println("Enter the text: ");
                    String text = scanner.next();
                    System.out.println("Enter key: ");
                    int key = scanner.nextInt();
                    String encryptedText = encrypt(text, key);
                    System.out.println("Encrypted text: ");
                    System.out.println(encryptedText);
                    break;
                case 2:
                    System.out.println("Decrypting text...");
                    System.out.println("Enter the text: ");
                    encryptedText = scanner.next();
                    System.out.println("Enter key: ");
                    key = scanner.nextInt();
                    String decryptedText = decrypt(encryptedText, key);
                    System.out.println("Decrypted text: ");
                    System.out.println(decryptedText);
                    break;
                default:
                    System.out.println("Input Err..");
                    break;
            }
        }while (flag!=0);

    }

    public static String encrypt(String text, int key){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<text.length(); i++){
            int a = text.charAt(i);
            sb.append((char) (a + key));
        }
        return sb.toString();
    }
    public static String decrypt(String cipherText, int key){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<cipherText.length(); i++){
            int a = cipherText.charAt(i);
            sb.append((char) (a - key));
        }
        return sb.toString();
    }

}

import java.io.*;
import java.util.Scanner;

public class FileEncryptDecrypt {

    // You can change this value to increase/decrease encryption strength
    private static final int SHIFT_KEY = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== File Encryption/Decryption ===");
        System.out.print("Enter 'e' to encrypt or 'd' to decrypt: ");
        String choice = scanner.nextLine().toLowerCase();

        System.out.print("Enter input file path: ");
        String inputFile = scanner.nextLine();

        System.out.print("Enter output file path: ");
        String outputFile = scanner.nextLine();

        if (choice.equals("e")) {
            processFile(inputFile, outputFile, SHIFT_KEY);
            System.out.println("Encryption complete. Output saved to: " + outputFile);
        } else if (choice.equals("d")) {
            processFile(inputFile, outputFile, -SHIFT_KEY);
            System.out.println("Decryption complete. Output saved to: " + outputFile);
        } else {
            System.out.println("Invalid choice. Please enter 'e' or 'd'.");
        }

        scanner.close();
    }

    public static void processFile(String inputFile, String outputFile, int shift) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                StringBuilder processedLine = new StringBuilder();
                for (char ch : line.toCharArray()) {
                    processedLine.append(shiftChar(ch, shift));
                }
                writer.write(processedLine.toString());
                writer.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error processing file: " + e.getMessage());
        }
    }

    // Shift letters and digits; leave others unchanged
    public static char shiftChar(char ch, int shift) {
        if (Character.isUpperCase(ch)) {
            return (char) ('A' + (ch - 'A' + shift + 26) % 26);
        } else if (Character.isLowerCase(ch)) {
            return (char) ('a' + (ch - 'a' + shift + 26) % 26);
        } else if (Character.isDigit(ch)) {
            return (char) ('0' + (ch - '0' + shift + 10) % 10);
        } else {
            return ch;
        }
    }
}

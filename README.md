🔐 File Encryption/Decryption

📄 Description
This Java console application allows users to encrypt or decrypt the contents of a text file using a simple Caesar cipher (character shifting). Users can choose to encrypt or decrypt, specify input and output file paths, and the program will process the file accordingly.

🧠 Skills Used
->File handling (FileReader, BufferedReader, FileWriter)
->String and character manipulation
->User input handling with Scanner

⚙️ How It Works
->Encrypts/decrypts using a simple shift-based algorithm (e.g., shifting ASCII characters by a key).
->Leaves special characters (spaces, punctuation) unchanged.
->Saves the result in a separate file specified by the user.

📋 Requirements
         1.  Java JDK 8 or higher
         2.A text file for input (.txt format recommended)

🚀 How to Run
1.Save the file as FileEncryptDecrypt.java
2.Open terminal/command prompt
3.Compile the code:
         javac FileEncryptDecrypt.java
4.Run the program:
         java FileEncryptDecrypt
         
🖥️ Example
=== File Encryption/Decryption ===
Enter 'e' to encrypt or 'd' to decrypt: e
Enter input file path: input.txt
Enter output file path: encrypted.txt
Encryption complete. Output saved to: encrypted.txt

🔓 Example Cipher
Original:
Hello123!
Encrypted (SHIFT_KEY = 4):
Lipps567!

🔐 Notes
->This uses a basic Caesar cipher, suitable for learning but not secure for real-world encryption.
->Special characters are not encrypted, only letters and digits are shifted.
->Avoid using this for sensitive data.

🛠️ Future Enhancements
->Support for more secure encryption (AES)
->GUI using Java Swing
-.Automatic file overwrite prevention
->Key-based encryption input

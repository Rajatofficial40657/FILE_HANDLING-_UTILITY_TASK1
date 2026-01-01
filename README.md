📌 Project Overview

This project demonstrates file handling operations in Java using a single script.
The program performs create, write, read, append, replace, and delete operations on a text file with user input and proper documentation.

🎯 Objective

To implement a Java program that demonstrates:

Creating a file

Writing data into a file

Reading data from a file

Modifying (appending) file content

Replacing text in a file

Deleting a file (optional)

🛠️ Technologies Used

Language: Java

IDE: VS Code

Concepts:

File Handling

Exception Handling

User Input

String Manipulation

📂 Project Structure
CODETECH_TASK1/
│
├── FileOperations.java
├── README.md
└── sample.txt (generated at runtime)

🚀 How to Run the Program
Step 1: Compile the program
javac FileOperations.java

Step 2: Run the program
java FileOperations

🔧 Features Implemented
Operation	Description
Create File	Creates a text file using user input
Write	Writes text into the file
Read	Reads and displays file content
Append	Adds new text without deleting old data
Replace	Replaces a word with another word
Delete	Deletes the file after confirmation
🧪 Sample Input / Output
Enter file name (with .txt): data.txt
Enter text to write into file: Hello Codtech

Reading file content:
Hello Codtech

Enter text to append into file: Internship Task 1
Enter word to replace: Codtech
Enter new word: CODETECH

Text replaced successfully.
Do you want to delete the file? (yes/no): no
File not deleted.

📘 Explanation

Scanner is used to take user input.

FileWriter writes and appends data.

BufferedReader reads file content line by line.

StringBuilder helps in replacing text.

File.delete() removes the file when required.

Try-catch handles IO exceptions safely.

🧾 Conclusion

This project successfully demonstrates Java file operations with clear structure, proper commenting, and user interaction, fulfilling CODTECH Internship Task-1 requirements.

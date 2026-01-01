import java.io.*;              // For file handling classes
import java.util.Scanner;      // For taking user input

public class FileOperations {

    public static void main(String[] args) {

        // Using try-catch to handle IO exceptions
        try {
            Scanner sc = new Scanner(System.in);

           
             //  STEP 1: TAKE FILE NAME FROM USER
               
            System.out.print("Enter file name (with .txt): - FileOperations.java:15");
            String fileName = sc.nextLine();

            // Creating file object with user-given name
            File file = new File(fileName);

           
            //   STEP 2: WRITE DATA INTO FILE
               
            System.out.print("Enter text to write into file: - FileOperations.java:24");
            String writeText = sc.nextLine();

            // FileWriter overwrites existing file content
            FileWriter writer = new FileWriter(file);
            writer.write(writeText + "\n");
            writer.close();   // Closing writer

           
             //  STEP 3: READ DATA FROM FILE
               
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;

            System.out.println("\nReading file content: - FileOperations.java:38");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();   // Closing reader
 
             //  STEP 4: APPEND (MODIFY) FILE DATA
            
            System.out.print("\nEnter text to append into file: - FileOperations.java:46");
            String appendText = sc.nextLine();

            // FileWriter with 'true' enables append mode
            FileWriter append = new FileWriter(file, true);
            append.write(appendText + "\n");
            append.close();

            
            //   STEP 5: REPLACE TEXT IN FILE
              
            System.out.print("\nEnter word to replace: - FileOperations.java:57");
            String oldWord = sc.nextLine();

            System.out.print("Enter new word: - FileOperations.java:60");
            String newWord = sc.nextLine();

            // Reading entire file content for replacement
            StringBuilder content = new StringBuilder();
            BufferedReader replaceReader = new BufferedReader(new FileReader(file));

            while ((line = replaceReader.readLine()) != null) {
                content.append(line.replace(oldWord, newWord)).append("\n");
            }
            replaceReader.close();

            // Writing modified content back to the file
            FileWriter replaceWriter = new FileWriter(file);
            replaceWriter.write(content.toString());
            replaceWriter.close();

            System.out.println("\nText replaced successfully. - FileOperations.java:77");

          
            //   STEP 6: DELETE FILE (OPTIONAL)
              
            System.out.print("\nDo you want to delete the file? (yes/no): - FileOperations.java:82");
            String choice = sc.nextLine();

            if (choice.equalsIgnoreCase("yes")) {
                if (file.delete()) {
                    System.out.println("File deleted successfully. - FileOperations.java:87");
                } else {
                    System.out.println("File deletion failed. - FileOperations.java:89");
                }
            } else {
                System.out.println("File not deleted. - FileOperations.java:92");
            }

            // Closing scanner object
            sc.close();

        } catch (IOException e) {
            // Handling file related errors
            e.printStackTrace();
        }
    }
}

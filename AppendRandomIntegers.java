import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class AppendRandomIntegers {
    public static void main(String[] args) {
        // Name of the file
        String fileName = "Exercise17_01.txt";

        try {
            // Create a FileWriter in append mode
            FileWriter writer = new FileWriter(fileName, true);

            // Generate 100 random integers
            Random random = new Random();
            for (int i = 0; i < 100; i++) {
                int randomInt = random.nextInt(100); // Random integer between 0 and 99
                writer.write(randomInt + " "); // Append integer followed by a space
            }

            // Close the writer to save changes
            writer.close();
            System.out.println("Successfully wrote 100 random integers to the file.");

        } catch (IOException e) {
            // Handle any I/O exceptions
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}



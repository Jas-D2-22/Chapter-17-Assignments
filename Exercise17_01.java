import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Exercise17_01 {
    public static void main(String[] args) {
        String fileName = "Exercise17_01.txt";
        Random random = new Random(); // To generate random numbers

        // Step 1: Create or append to the file
        try {
            File file = new File(fileName);
            // Use FileWriter in 'append' mode if file exists
            FileWriter writer = new FileWriter(file, true);

            // Step 2: Generate and write 100 random integers
            for (int i = 0; i < 100; i++) {
                int randomInt = random.nextInt(100); // Random number between 0 and 99
                writer.write(randomInt + " "); // Write the integer followed by a space
            }

            writer.close(); // Always close the writer
            System.out.println("100 random integers written to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}


import java.io.*;
import java.util.Scanner;

public class NotesApp {
	private static final String FILE_NAME = "C:\\Users\\madhu\\Documents\\notes.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("📒 Welcome to Notes Manager!");
        
        do {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add a Note");
            System.out.println("2. View Notes");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            
            choice = sc.nextInt();
            sc.nextLine(); // consume newline
            
            switch (choice) {
                case 1:
                    System.out.print("Enter your note: ");
                    String note = sc.nextLine();
                    addNote(note);
                    break;
                case 2:
                    viewNotes();
                    break;
                case 3:
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 3);

        sc.close();
    }

    // Method to add note
    private static void addNote(String note) {
        try (FileWriter fw = new FileWriter(FILE_NAME, true); // append mode
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(note);
            bw.newLine();
            System.out.println("✅ Note saved successfully.");
        } catch (IOException e) {
            System.out.println("❌ Error while saving note: " + e.getMessage());
        }
    }

    // Method to view notes
    private static void viewNotes() {
        try (FileReader fr = new FileReader(FILE_NAME);
             BufferedReader br = new BufferedReader(fr)) {
            String line;
            System.out.println("\n📄 Your Notes:");
            while ((line = br.readLine()) != null) {
                System.out.println("- " + line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("⚠️ No notes found. Add some first!");
        } catch (IOException e) {
            System.out.println("❌ Error while reading notes: " + e.getMessage());
        }
    }
}

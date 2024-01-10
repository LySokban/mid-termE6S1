import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat outputFormat = new SimpleDateFormat("MMMM dd, yyyy");

        System.out.print("Enter date in YYYY-MM-DD format: ");
        String inputDate = scanner.nextLine();

        try {
            java.util.Date parsedDate = inputFormat.parse(inputDate);
            String formattedDate = outputFormat.format(parsedDate);
            System.out.println("Converted date: " + formattedDate);
        } catch (ParseException e) {
            System.out.println("Error: Invalid date format. Please enter in YYYY-MM-DD format.");
        }


    }
}
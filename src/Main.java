import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Screen Match App\n");
        int year;

        Scanner input = new Scanner(System.in);
        List<Integer> evaluation = new ArrayList<>();

        System.out.println("Enter your favorite movie: ");
        String name = input.nextLine();

        while (true){
            System.out.println("Enter the year of the movie: ");
            try{
                year = input.nextInt();

                if (year > 0){
                    System.out.println(String.format("Year: ", year));
                    break;
                } else {
                    System.out.println("The year of the film cannot be less than zero!");
                }
            } catch (InputMismatchException e){
                System.out.println("Please enter a valid number!");
                input.nextLine();
            }
        }

        while (true){
            System.out.println("What's your rating for the movie: ");
            int rate = input.nextInt();

            if (rate >= 0 && rate <= 5){
                evaluation.add(rate);
                break;
            } else{
                System.out.println("The score must be between 0 and 5!");
            }
        }

        double mean = evaluation.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        boolean  included = true;
        String synopsis = "Adventure Movie starring Tom Cruise";

        int rating = (int) (mean/2);
        String plan = "free";

        String  message = """
                Movie: %s
                Year: %d
                Mean: %.1f
                Included: %b
                Synopsis: %s
                Classification: %d
                """.formatted(name, year, mean, included, synopsis, rating);
        System.out.println(message);

        if (year >= 2022){
            System.out.println("Current movie");
        } else {
            System.out.println("Old movie");
        }

        if (included && plan.equals("plus")){
            System.out.println("Authorized movie.");
        } else{
            System.out.println("This is an unauthorized movie. You need a paid plan.");
        }

        input.close();
    }
}

import java.util.Scanner;

class OddAndEven {
     int countOfOdd;
     int countOfEven;

    public void addNumber(int num) {
        if (num % 2 == 0) {
            this.countOfEven++; 
        } else {
            this.countOfOdd++; 
        }
    }
}

public class TestOddAndEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        OddAndEven counter = new OddAndEven();

        while (true) {
            System.out.print("Enter a number (or 'Q' to quit): ");
            String s = input.next();

            if (s.equals("q") || s.equals("Q")) {
                break;
            }
            int number = Integer.parseInt(s);
            counter.addNumber(number);
        }
        System.out.println("Number of Odd: " + counter.countOfOdd + ", Number of Even: " + counter.countOfEven);

        input.close();
    }
}
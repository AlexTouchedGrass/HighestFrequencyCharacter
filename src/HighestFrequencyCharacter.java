import java.util.Scanner;

public class HighestFrequencyCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s;
        String current;
        int sum = 0;
        String letter = "";

        System.out.println("Please enter a word or phrase below : ");
        s = scan.nextLine();


        for (int i = 0; i < s.length(); i++) {
            current = s.substring(i,i+1);

            if (i == 0 || !s.substring(0,i).contains(current)) {
                int count = 1;

                for (int j = i+1; j<s.length();j++) {
                    if (current.equals(s.substring(j,j+1))) {
                        count++;
                        if (count > sum) {
                            sum = count;
                            letter = s.substring(j,j+1);

                        }
                    }
                }
            }
        }System.out.println(letter + " occurs the most at " + sum + " time(s).");
    }
}

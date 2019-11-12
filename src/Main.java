import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scannerString = new Scanner(System.in);
        String boolString = scannerString.nextLine();
        String[] inputArray;
        Scanner scannerIn = new Scanner(System.in);
        String input = scannerIn.nextLine();
        if(Pattern.matches("\\W+", String.valueOf(input.charAt(0))))
            input = input.replaceFirst("\\W+", "");
        inputArray = input.split("\\W+");
        ArrayList<String> outputList = new ArrayList<>();
        for (int i = 0; i < boolString.length(); i++) {
            if(boolString.charAt(i) == '1'){
                outputList.add(inputArray[i]);
            }
        }
        System.out.println(outputList);
    }
}

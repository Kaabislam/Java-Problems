import java.util.*;

public class Main {

    public static String wordReverse(String input){
        String[] x = input.split(" ");
        Collections.reverse(Arrays.asList(x));
        StringBuilder stringBuilder = new StringBuilder();
        for(String element:x ){
            stringBuilder.append(element).append(" ");
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        while (true){
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            System.out.println(wordReverse(input));
        }
    }
}
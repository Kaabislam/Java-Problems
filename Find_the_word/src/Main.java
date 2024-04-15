import java.util.*;

public class Main {
    // a b c
    // 3
    public static String findWordUsingIndex(String input,Integer index){
        String[] stringArray = input.split(" ");
        if(index > stringArray.length){
            return "Index is Out of Range!";
        }
        return stringArray[index-1];

    }
    public static void main(String[] args) {

        System.out.println("Give the Index number u want to access");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        System.out.println("Give the input String...");
        scanner = new Scanner(System.in);
        String givenString = scanner.nextLine();
        String result = findWordUsingIndex(givenString,index);
        System.out.println(result);

    }
}
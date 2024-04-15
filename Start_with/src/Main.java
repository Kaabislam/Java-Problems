import java.util.Scanner;

public class Main {
    public static boolean startWithByBuiltInFunction(String input,String startWith){
        if (input.startsWith(startWith)){
            return true;
        }
        return false;
    }
    public static boolean startWithManual(String input,String startWith){
        if(input.length() < startWith.length()) return false;
        for (int i = 0;i < startWith.length();i++){
            if(input.charAt(i)!=startWith.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        while (true){
            System.out.println("Please give your String Input");
            Scanner scanner = new Scanner(System.in);
            String givenString = scanner.nextLine();

            System.out.println("Give By which the string started check");
            scanner = new Scanner(System.in);
            String startWithWord = scanner.nextLine();


            System.out.println(startWithManual(givenString,startWithWord));
        }


    }
}
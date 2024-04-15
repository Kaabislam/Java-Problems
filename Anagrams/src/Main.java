import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static boolean isAnagram(String string1,String string2){
        char[] charArray1 = string1.toCharArray();
        Arrays.sort(charArray1);
        String s1 = new String(charArray1);

        char[] charArray2 = string2.toCharArray();
        Arrays.sort(charArray2);
        String s2 = new String(charArray2);

        if(s1.equals(s2)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(System.getProperty("java.home"));


        while (true){
            System.out.println("Give the first string");
            Scanner scanner = new Scanner(System.in);
            String string1 = scanner.nextLine();

            System.out.println("Give the Second string");
            scanner = new Scanner(System.in);
            String string2 = scanner.nextLine();


            System.out.println(isAnagram(string1,string2));
        }

    }
}
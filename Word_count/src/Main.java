import java.util.*;
public class Main {
    public static Integer countOfWord(String inputString,String word){
        if(inputString.length() == 0){
            return 0;
        }
        Integer count = 0;
        String[] strArray = inputString.split(" ");
        for (int i = 0;i < strArray.length;i++){
            if(strArray[i].equals(word)){
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        while (true){
            System.out.println("Give the String");
            String input = new Scanner(System.in).nextLine();

            System.out.println("Give the Word");
            String word = new Scanner(System.in).nextLine();

            System.out.println(countOfWord(input,word));
        }

    }
}
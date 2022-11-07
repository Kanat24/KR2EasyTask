import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String text = "abcba abcba";
        isPalindrom(text);
        Map<Integer, String> peopleList= new HashMap<>();
        peopleList.put(1, "Alex");
        peopleList.put(2, "Max");
        peopleList.put(3, "Sergey");
        Iterator<Map.Entry<Integer, String>> iterator = peopleList.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, String> current = iterator.next();
            System.out.println(current.getKey() + ":" + current.getValue());
        }
        for (Map.Entry<Integer, String> integerStringEntry : peopleList.entrySet()) {
            System.out.println(integerStringEntry.getKey()+ ":" + integerStringEntry.getValue());
        }


    }
    public static void isPalindrom(String text){
        char[] textChar = text.replace(" ", "").toCharArray();
        char[] text2Char = textChar;
        String b= Arrays.toString(text2Char);
        for (int i=0; i< textChar.length/2; i++){
            char x = textChar[i];
            textChar[i]=textChar[textChar.length-i-1];
            textChar[textChar.length-i-1]= x;
        }
        String a= Arrays.toString(textChar);
        System.out.println(textChar);
        System.out.println(text2Char);
        if (a.equals(b)){
            System.out.println("Это палиндром");
        }else             System.out.println("Это не палиндром");

    }


}
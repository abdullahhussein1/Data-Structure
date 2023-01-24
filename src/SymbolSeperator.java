import java.util.Scanner;

public class SymbolSeperator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = scanner.next();
        int numSize=0;
        int symbSize=0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i)>='0' && text.charAt(i)<='9'){
                numSize++;
            }else  if(text.charAt(i)<'a' && !(text.charAt(i)>'z')){
                symbSize++;
            }
        }
        int[] nums = new int[numSize];
        int numCount=0;
        char[] symbols = new char[symbSize];
        int symbCount=0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i)>='0' && text.charAt(i)<='9'){
                nums[numCount++]=Integer.parseInt(String.valueOf(text.charAt(i)));
            }else if(text.charAt(i)<'a' && !(text.charAt(i)>'z')){
                symbols[symbCount++]=text.charAt(i);
            }
        }
        System.out.print("numbers: [ ");
        for (int i : nums) {
            System.out.print(i+" ");
        }
        System.out.println("]");
        System.out.println("There is "+numSize+" numbers in the text");

        System.out.print("symbols: [ ");
        for (char i : symbols) {
            System.out.print(i+" ");
        }
        System.out.println("]");


    }

}

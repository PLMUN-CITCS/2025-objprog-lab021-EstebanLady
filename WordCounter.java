
import java.util.Scanner;
public class WordCounter {
  public static void main(String[] args) {
     String n = getSentenceInput();
     countWords(n);
  }
  public static String getSentenceInput() {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a sentence: ");
    String n = input.nextLine();
    return n;
  }
  
  public static String countWords(String n) {
      String arr[] = n.split(" ");
      System.out.print("The sentence has " + arr.length + " words");
       return n;
  }
}
    
    
    
    
  
  

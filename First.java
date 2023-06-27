
import java.io.*;
import java.util.Scanner;

public class First {
    public static void main(String[] argv) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String inputString = sc.next();
       int indexfirst=getFirstNonRepeatingCharacter(inputString);
       System.out.println(indexfirst);
    }

    public static int getFirstNonRepeatingCharacter(String s) {
        for (int i = 0; i < s.length(); i++) {
            if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
                return i;
            }
        }
        return -1;
    }}

package Assignments.week3;

public class StringReverseOdd {
	
	public static void main(String[] args) {
        String test = "I am a software tester";
        //Splitting the string words into an array
        String[] words = test.split(" ");
        
        for (int i = 0; i < words.length; i++) {
            if (i % 2 != 0) { // Odd position word
                char[] chars = words[i].toCharArray();
                for (int j = chars.length - 1; j >= 0; j--) {
                    System.out.print(chars[j]);
                }
                System.out.print(" ");
            } else { // Even position word
                System.out.print(words[i] + " ");
            }
        }
    }
}



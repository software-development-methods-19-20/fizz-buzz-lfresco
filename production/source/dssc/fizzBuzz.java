package dssc;

import java.util.List;

public class fizzBuzz {

    public static final int[] NUMBERS = {3 , 5, 7};
    public static final String[] WORDS = {"Fizz", "Buzz", "Bang"};

    public static int[] checkforMultiple(int i){

        int[] result = new int[NUMBERS.length];
        for(int j = 0; j < NUMBERS.length; j++) {
            if (i % NUMBERS[j] == 0)
                result[j] = 1;

        }

        return result;
    }
    public static String print(int i) {


        int[] whichWords = checkforMultiple(i);
        String word = "";
        for(int j = 0; j < whichWords.length; j++){
            if(whichWords[j] == 1)
                word += WORDS[j];
        }

        word += word.isEmpty() ? i : "";
        return word;

    }
}

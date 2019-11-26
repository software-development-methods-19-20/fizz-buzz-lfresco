package dssc;

import java.util.List;

public class fizzBuzz {



    public static int[] checkforMultiple(int i){
        int[] numbers = {3,5,7};
        int[] result = new int[numbers.length];
        for(int j = 0; j < numbers.length; j++) {
            if (i % numbers[j] == 0)
                result[j] = 1;

        }

        return result;
    }
    public static String print(int i) {
        String[] words = {"Fizz", "Buzz", "Bang"};

        int[] whichWords = checkforMultiple(i);
        String word = "";
        for(int j = 0; j < whichWords.length; j++){
            if(whichWords[j] == 1)
                word += words[j];
        }

        word += word.isEmpty() ? i : "";
        return word;
        /**
        boolean multipleOfThree = i % 3 == 0;
        boolean multipleOfFive = i % 5 == 0;
        String word = "";

        if (multipleOfThree)
            word += "Fizz";

        if (multipleOfFive)
            word += "Buzz";

        word += word.isEmpty() ? i : "";

        return word;
        */
    }
}

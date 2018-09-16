package hackrice8.hmm.hearaid;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by minhle on 9/16/18.
 */

public class EyeModel {
    protected static int score;
    protected static int turn;


    public String getCorrectCharAnswer() {
        return correctCharAnswer;
    }

    public void setCorrectCharAnswer(String correctCharAnswer) {
        this.correctCharAnswer = correctCharAnswer;
    }

    protected static String correctCharAnswer = "A";

    public static String getRandomLetter(String exception){
        ArrayList<String> chars = new ArrayList<String>(Arrays.asList("A","B","C","D","E","F","G","H","I","J","K","L","M","N",
                "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"));
        chars.remove(exception.toUpperCase());
        return chars.get((int) (Math.random() * 24));
    }


    public EyeModel() {
        this.score = 0;
        this.turn = 0;
    }
}

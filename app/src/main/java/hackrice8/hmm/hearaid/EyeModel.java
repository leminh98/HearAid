package hackrice8.hmm.hearaid;

/**
 * Created by minhle on 9/16/18.
 */

public class EyeModel {
    protected static int score;
    protected static int turn;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getCorrectCharAnswer() {
        return correctCharAnswer;
    }

    public void setCorrectCharAnswer(String correctCharAnswer) {
        this.correctCharAnswer = correctCharAnswer;
    }

    protected static String correctCharAnswer = "";


    public EyeModel() {
        this.score = 0;
        this.turn = 0;
    }
}

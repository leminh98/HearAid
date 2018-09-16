package hackrice8.hmm.hearaid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MultipleChoiceAnswerActivity extends AppCompatActivity {
    Button btn1 = (Button) findViewById(R.id.btn1stChoice);
    Button btn2 = (Button) findViewById(R.id.btn2ndChoice);
    Button btn3 = (Button) findViewById(R.id.btn3rdChoice);
    Button btn4 = (Button) findViewById(R.id.btn4thChoice);
    int correct_answer = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_choice_answer);

//        Set the answer to a random button
        setRandomAnswer();

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                evaluateAndMoveOn(btn1);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                evaluateAndMoveOn(btn2);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                evaluateAndMoveOn(btn3);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                evaluateAndMoveOn(btn4);
            }
        });
    }

    protected void setRandomAnswer(){
        correct_answer = (int) Math.floor(Math.random() * 4) ;
        switch (correct_answer) {
            case 0:
                btn1.setText(EyeModel.correctCharAnswer);
//                btn2.setText();
        }
    }

    protected void evaluateAndMoveOn(Button btn) {

    }
}

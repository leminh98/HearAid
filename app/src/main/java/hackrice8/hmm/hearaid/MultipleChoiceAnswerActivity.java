package hackrice8.hmm.hearaid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MultipleChoiceAnswerActivity extends AppCompatActivity {
//    Button btn1 ;
//    Button btn2 ;
//    Button btn3 ;
//    Button btn4 ;
    int correct_answer = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_choice_answer);



        final Button btn1 = (Button) findViewById(R.id.btn1stChoice);
        final Button btn2 = (Button) findViewById(R.id.btn2ndChoice);
        final Button btn3 = (Button) findViewById(R.id.btn3rdChoice);
        final Button btn4 = (Button) findViewById(R.id.btn4thChoice);

        //        Set the answer to a random button
        setRandomAnswer(btn1, btn2, btn3, btn4);
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

    protected void setRandomAnswer(Button btn1,Button btn2, Button btn3,Button btn4){
        correct_answer = (int) Math.floor(Math.random() * 4) ;
        switch (correct_answer) {
            case 0:
                btn1.setText(EyeModel.correctCharAnswer);
                btn2.setText(EyeModel.getRandomLetter((String) btn1.getText()));
                btn3.setText(EyeModel.getRandomLetter((String) btn1.getText()));
                btn4.setText(EyeModel.getRandomLetter((String) btn1.getText()));
                break;
            case 1:
                btn2.setText(EyeModel.correctCharAnswer);
                btn1.setText(EyeModel.getRandomLetter((String) btn2.getText()));
                btn3.setText(EyeModel.getRandomLetter((String) btn2.getText()));
                btn4.setText(EyeModel.getRandomLetter((String) btn2.getText()));
                break;
            case 2:
                btn3.setText(EyeModel.correctCharAnswer);
                btn2.setText(EyeModel.getRandomLetter((String) btn3.getText()));
                btn1.setText(EyeModel.getRandomLetter((String) btn3.getText()));
                btn4.setText(EyeModel.getRandomLetter((String) btn3.getText()));
                break;
            default:
                btn4.setText(EyeModel.correctCharAnswer);
                btn2.setText(EyeModel.getRandomLetter((String) btn4.getText()));
                btn3.setText(EyeModel.getRandomLetter((String) btn4.getText()));
                btn1.setText(EyeModel.getRandomLetter((String) btn4.getText()));

        }
    }

    protected void evaluateAndMoveOn(Button btn) {
        if (btn.getText() == EyeModel.correctCharAnswer) {
            EyeModel.score += 1;
        }
        EyeModel.turn +=1;
        Intent intent;
        if (EyeModel.turn == 10) {
            intent = new Intent(this, EyeResultActivity.class);

        } else {
            intent = new Intent(this, RandomLetterActivity.class);
        }
        startActivity(intent);
    }
}

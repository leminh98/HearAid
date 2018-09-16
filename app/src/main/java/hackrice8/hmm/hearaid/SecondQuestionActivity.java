package hackrice8.hmm.hearaid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.HashMap;
import java.util.Map;

public class SecondQuestionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_question);

        //Buttons
        final Model model = new Model();
        final Button btnSubmit = (Button) findViewById(R.id.btnTo3);
        final Button btnb1 = (Button) findViewById(R.id.btnb1);
        final Button btnb2 = (Button) findViewById(R.id.btnb2);
        final Button btnb3 = (Button) findViewById(R.id.btnb3);
        final Button btnb4 = (Button) findViewById(R.id.btnb4);
        final Button btnb5 = (Button) findViewById(R.id.btnb5);
        final Button btnb6 = (Button) findViewById(R.id.btnb6);
        final Button btnb7 = (Button) findViewById(R.id.btnb7);
        final Button btnb8 = (Button) findViewById(R.id.btnb8);
        final Button btnb9 = (Button) findViewById(R.id.btnb9);
        final Button btnb10 = (Button) findViewById(R.id.btnb10);
        final Button btnb11 = (Button) findViewById(R.id.btnb11);
        final Button btnb12 = (Button) findViewById(R.id.btnb12);

        Map<Button, Integer> buttonsB = new HashMap<Button, Integer>(){{
            put(btnb1, R.raw.hearingtestb1);
            put(btnb2, R.raw.hearingtestb2);
            put(btnb3, R.raw.hearingtestb3);
            put(btnb4, R.raw.hearingtestb4);
            put(btnb5, R.raw.hearingtestb5);
            put(btnb6, R.raw.hearingtestb6);
            put(btnb7, R.raw.hearingtestb7);
            put(btnb8, R.raw.hearingtestb8);
            put(btnb9, R.raw.hearingtestb9);
            put(btnb10, R.raw.hearingtestb10);
            put(btnb11, R.raw.hearingtestb11);
            put(btnb12, R.raw.hearingtestb12);

        }};

        //Noise onclick
        model.buttonUI(this, buttonsB);

        //Submit button
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openThirdQuestionActivity();
            }
        });
    }

    public void openThirdQuestionActivity() {
        Intent secondQuestionIntent = new Intent(this, ThirdQuestionActivity.class);
        startActivity(secondQuestionIntent);

    }
}

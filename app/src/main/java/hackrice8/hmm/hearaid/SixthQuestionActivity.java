package hackrice8.hmm.hearaid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.HashMap;
import java.util.Map;

import javax.xml.transform.Result;

public class SixthQuestionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth_question);

        //Buttons
        final Model model = new Model();
        final Button btnSubmit = (Button) findViewById(R.id.btnEnd);
        final Button btnf1 = (Button) findViewById(R.id.btnf1);
        final Button btnf2 = (Button) findViewById(R.id.btnf2);
        final Button btnf3 = (Button) findViewById(R.id.btnf3);
        final Button btnf4 = (Button) findViewById(R.id.btnf4);
        final Button btnf5 = (Button) findViewById(R.id.btnf5);
        final Button btnf6 = (Button) findViewById(R.id.btnf6);
        final Button btnf7 = (Button) findViewById(R.id.btnf7);
        final Button btnf8 = (Button) findViewById(R.id.btnf8);
        final Button btnf9 = (Button) findViewById(R.id.btnf9);
        final Button btnf10 = (Button) findViewById(R.id.btnf10);
        final Button btnf11 = (Button) findViewById(R.id.btnf11);
        final Button btnf12 = (Button) findViewById(R.id.btnf12);

        Map<Button, Integer> buttonsF = new HashMap<Button, Integer>(){{
            put(btnf1, R.raw.hearingtestg1);
            put(btnf2, R.raw.hearingtestg2);
            put(btnf3, R.raw.hearingtestg3);
            put(btnf4, R.raw.hearingtestg4);
            put(btnf5, R.raw.hearingtestg5);
            put(btnf6, R.raw.hearingtestg6);
            put(btnf7, R.raw.hearingtestg7);
            put(btnf8, R.raw.hearingtestg8);
            put(btnf9, R.raw.hearingtestg9);
            put(btnf10, R.raw.hearingtestg10);
            put(btnf11, R.raw.hearingtestg11);
            put(btnf12, R.raw.hearingtestg12);

        }};
        //Noise onclick
        model.buttonUI(this, buttonsF);

        //Submit button
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openResultQuestionActivity();
            }
        });

    }
    public void openResultQuestionActivity() {
        Intent sixthQuestionIntent = new Intent(this, ResultActivity.class);
        startActivity(sixthQuestionIntent);

    }


}

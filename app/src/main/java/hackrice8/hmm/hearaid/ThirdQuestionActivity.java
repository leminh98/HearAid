package hackrice8.hmm.hearaid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.HashMap;
import java.util.Map;

public class ThirdQuestionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_question);
        //Buttons
        final Model model = new Model();
        final Button btnSubmit = (Button) findViewById(R.id.btnTo4);
        final Button btnc1 = (Button) findViewById(R.id.btnc1);
        final Button btnc2 = (Button) findViewById(R.id.btnc2);
        final Button btnc3 = (Button) findViewById(R.id.btnc3);
        final Button btnc4 = (Button) findViewById(R.id.btnc4);
        final Button btnc5 = (Button) findViewById(R.id.btnc5);
        final Button btnc6 = (Button) findViewById(R.id.btnc6);
        final Button btnc7 = (Button) findViewById(R.id.btnc7);
        final Button btnc8 = (Button) findViewById(R.id.btnc8);
        final Button btnc9 = (Button) findViewById(R.id.btnc9);
        final Button btnc10 = (Button) findViewById(R.id.btnc10);
        final Button btnc11 = (Button) findViewById(R.id.btnc11);
        final Button btnc12 = (Button) findViewById(R.id.btnc12);

        Map<Button, Integer> buttonsC = new HashMap<Button, Integer>(){{
            put(btnc1, R.raw.hearingtestc1);
            put(btnc2, R.raw.hearingtestc2);
            put(btnc3, R.raw.hearingtestc3);
            put(btnc4, R.raw.hearingtestc4);
            put(btnc5, R.raw.hearingtestc5);
            put(btnc6, R.raw.hearingtestc6);
            put(btnc7, R.raw.hearingtestc7);
            put(btnc8, R.raw.hearingtestc8);
            put(btnc9, R.raw.hearingtestc9);
            put(btnc10, R.raw.hearingtestc10);
            put(btnc11, R.raw.hearingtestc11);
            put(btnc12, R.raw.hearingtestc12);

        }};

        //Noise onclick
        model.buttonUI(this, buttonsC);

        //Submit button
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFourthQuestionActivity();
            }
        });
    }

    public void openFourthQuestionActivity() {
        Intent thirdQuestionIntent = new Intent(this, FourthQuestionActivity.class);
        startActivity(thirdQuestionIntent);

    }
}

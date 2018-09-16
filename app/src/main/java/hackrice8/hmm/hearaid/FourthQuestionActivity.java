package hackrice8.hmm.hearaid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.HashMap;
import java.util.Map;

public class FourthQuestionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_question);

        //Buttons
        final Model model = new Model();
        final Button btnSubmit = (Button) findViewById(R.id.btnTo5);
        final Button btnd1 = (Button) findViewById(R.id.btnd1);
        final Button btnd2 = (Button) findViewById(R.id.btnd2);
        final Button btnd3 = (Button) findViewById(R.id.btnd3);
        final Button btnd4 = (Button) findViewById(R.id.btnd4);
        final Button btnd5 = (Button) findViewById(R.id.btnd5);
        final Button btnd6 = (Button) findViewById(R.id.btnd6);
        final Button btnd7 = (Button) findViewById(R.id.btnd7);
        final Button btnd8 = (Button) findViewById(R.id.btnd8);
        final Button btnd9 = (Button) findViewById(R.id.btnd9);
        final Button btnd10 = (Button) findViewById(R.id.btnd10);
        final Button btnd11 = (Button) findViewById(R.id.btnd11);
        final Button btnd12 = (Button) findViewById(R.id.btnd12);

        Map<Button, Integer> buttonsD = new HashMap<Button, Integer>(){{
            put(btnd1, R.raw.hearingtestd1);
            put(btnd2, R.raw.hearingtestd2);
            put(btnd3, R.raw.hearingtestd3);
            put(btnd4, R.raw.hearingtestd4);
            put(btnd5, R.raw.hearingtestd5);
            put(btnd6, R.raw.hearingtestd6);
            put(btnd7, R.raw.hearingtestd7);
            put(btnd8, R.raw.hearingtestd8);
            put(btnd9, R.raw.hearingtestd9);
            put(btnd10, R.raw.hearingtestd10);
            put(btnd11, R.raw.hearingtestd11);
            put(btnd12, R.raw.hearingtestd12);

        }};

        //Noise onclick
        model.buttonUI(this, buttonsD);

        //Submit button
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFifthQuestionActivity();
            }
        });
    }

    public void openFifthQuestionActivity() {
        Intent fourthQuestionIntent = new Intent(this, FifthQuestionActivity.class);
        startActivity(fourthQuestionIntent);

    }
}

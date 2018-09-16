package hackrice8.hmm.hearaid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.HashMap;
import java.util.Map;


public class FirstQuestionActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_question);

        //Buttons
        final Model model = new Model();
        final Button btnSubmit = (Button) findViewById(R.id.btnTo2);
        final Button btna1 = (Button) findViewById(R.id.btna1);
        final Button btna2 = (Button) findViewById(R.id.btna2);
        final Button btna3 = (Button) findViewById(R.id.btna3);
        final Button btna4 = (Button) findViewById(R.id.btna4);
        final Button btna5 = (Button) findViewById(R.id.btna5);
        final Button btna6 = (Button) findViewById(R.id.btna6);
        final Button btna7 = (Button) findViewById(R.id.btna7);
        final Button btna8 = (Button) findViewById(R.id.btna8);
        final Button btna9 = (Button) findViewById(R.id.btna9);
        final Button btna10 = (Button) findViewById(R.id.btna10);
        final Button btna11 = (Button) findViewById(R.id.btna11);
        final Button btna12 = (Button) findViewById(R.id.btna12);

        Map<Button, Integer> buttonsA = new HashMap<Button, Integer>(){{
            put(btna1, R.raw.hearingtesta1);
            put(btna2, R.raw.hearingtesta2);
            put(btna3, R.raw.hearingtesta3);
            put(btna4, R.raw.hearingtesta4);
            put(btna5, R.raw.hearingtesta5);
            put(btna6, R.raw.hearingtesta6);
            put(btna7, R.raw.hearingtesta7);
            put(btna8, R.raw.hearingtesta8);
            put(btna9, R.raw.hearingtesta9);
            put(btna10, R.raw.hearingtesta10);
            put(btna11, R.raw.hearingtesta11);
            put(btna12, R.raw.hearingtesta12);

        }};


//        Button[] buttonsA = new Button[] {btna1, btna2, btna3, btna4,
//                                            btna5, btna6, btna7, btna8,
//                                                btna9, btna10, btna11, btna12};

        //Noise onclick
        model.buttonUI(this, buttonsA);

        //Submit button
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecondQuestionActivity();
            }
        });

    }

    public void openSecondQuestionActivity() {
        Intent firstQuestionIntent = new Intent(this, SecondQuestionActivity.class);
        startActivity(firstQuestionIntent);

    }
}

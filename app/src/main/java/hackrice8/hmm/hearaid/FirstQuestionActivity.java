package hackrice8.hmm.hearaid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


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

        Button[] buttonsA = new Button[] {btna1, btna2, btna3, btna4,
                                            btna5, btna6, btna7, btna8,
                                                btna9, btna10, btna11, btna12};

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

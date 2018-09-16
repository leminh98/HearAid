package hackrice8.hmm.hearaid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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

        Button[] buttonsB = new Button[] {btnb1, btnb2, btnb3, btnb4,
                btnb5, btnb6, btnb7, btnb8,
                btnb9, btnb10, btnb11, btnb12};

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

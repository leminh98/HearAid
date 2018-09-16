package hackrice8.hmm.hearaid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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

        Button[] buttonsF = new Button[] {btnf1, btnf2, btnf3, btnf4,
                btnf5, btnf6, btnf7, btnf8,
                btnf9, btnf10, btnf11, btnf12};

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

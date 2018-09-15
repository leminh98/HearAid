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
        final Button btnSubmit = (Button) findViewById(R.id.btnTo2);
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

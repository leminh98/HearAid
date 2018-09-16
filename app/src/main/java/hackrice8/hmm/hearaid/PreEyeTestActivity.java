package hackrice8.hmm.hearaid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PreEyeTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_eye_test);

        final Button btnNxt = (Button) findViewById(R.id.btnToEye);
        btnNxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRandomLetterActivity();
            }
        });
    }

    public void openRandomLetterActivity() {
        Intent firstQuestionIntent = new Intent(this, RandomLetterActivity.class);
        startActivity(firstQuestionIntent);

    }
}

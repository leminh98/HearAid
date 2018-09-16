package hackrice8.hmm.hearaid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class EyeResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye_result);
        final TextView score = (TextView) findViewById(R.id.txtScore);
        String displaytext = String.valueOf(EyeModel.score * 10) + "%";
        score.setText(displaytext);

        final Button btnReset = (Button) findViewById(R.id.btnEyeReset);
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSixthQuestionActivity();
            }
        });

    }

    public void openSixthQuestionActivity() {
        Intent fifthQuestionIntent = new Intent(this, HomeActivity.class);
        startActivity(fifthQuestionIntent);

    }
}


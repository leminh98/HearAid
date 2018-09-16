package hackrice8.hmm.hearaid;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final Button btnStartHearing = (Button) findViewById(R.id.btnStart);
        btnStartHearing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCalibrateActivity();
            }
        });

        final Button btnStartVision = (Button) findViewById(R.id.btnEyeTest);
        btnStartVision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRandomLetterActivity();
            }
        });

    }

    public void openCalibrateActivity() {
        Intent firstQuestionIntent = new Intent(this, CalibrationActivity.class);
        startActivity(firstQuestionIntent);

    }

    public void openRandomLetterActivity() {
        EyeModel eyeModel = new EyeModel();
        Intent firstQuestionIntent = new Intent(this, MultipleChoiceAnswerActivity.class);
        startActivity(firstQuestionIntent);

    }



}

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

public class CalibrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calibration);

        final Button btnCalibate = (Button) findViewById(R.id.btnCalibrate);
        final Button btnNext = (Button) findViewById(R.id.btnNext);

        btnCalibate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(btnCalibate.getContext(), R.raw.hearingtestcalibrated);
                mp.start();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFirstQuestionActivity();
            }
        });
    }

    public void openFirstQuestionActivity() {
        Intent firstQuestionIntent = new Intent(this, FirstQuestionActivity.class);
        startActivity(firstQuestionIntent);

    }
}

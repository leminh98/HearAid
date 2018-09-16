package hackrice8.hmm.hearaid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.AbsoluteLayout;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class RandomLetterActivity extends AppCompatActivity {

    protected String getRandomLetter(){
        String[] chars = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N",
                "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        return chars[(int) (Math.random() * 10)];
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_letter);

        RelativeLayout llayout = (RelativeLayout) findViewById(R.id.rootlayout);

        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);

        TextView tv = new TextView(this);
        tv.setLayoutParams(new RelativeLayout.LayoutParams(1200,670)//new Random().nextInt(metrics.widthPixels),
                //new Random().nextInt(metrics.heightPixels))
        );
        tv.setText(getRandomLetter());
        EyeModel.correctCharAnswer = (String) tv.getText();
        tv.setTextSize(new Random().nextInt(30) + 2);
        llayout.addView(tv);

        final Button buttonNext = (Button) findViewById(R.id.buttonNext);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMultipleChoicenActivity();
            }
        });

//        txt.setText(randLetter);
//        Relative.addView(txt);
//        setContentView(Relative);
    }

    public void openMultipleChoicenActivity() {
        Intent fifthQuestionIntent = new Intent(this, MultipleChoiceAnswerActivity.class);
        startActivity(fifthQuestionIntent);

    }
}

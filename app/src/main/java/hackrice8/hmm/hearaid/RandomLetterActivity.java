package hackrice8.hmm.hearaid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
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



        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.);

        for (int i = 0; i < 100; i++) {
            TextView tv = new TextView(this);
            tv.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT));
            int randomInt = new Random().nextInt(100) +1 ;
            tv.setText(""+randomInt);
            relativeLayout.addView(tv);
        }
//        txt.setText(randLetter);
//        Relative.addView(txt);
//        setContentView(Relative);
    }
}

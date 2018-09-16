package hackrice8.hmm.hearaid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.jjoe64.graphview.series.DataPoint;

import java.util.HashMap;
import java.util.Map;

public class SixthQuestionActivity extends AppCompatActivity {

    protected static DataPoint point1 = new DataPoint(5, -5);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth_question);

        //Buttons
        final btnMapping btnMapping = new btnMapping();
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

        final Map<Button, Integer> buttonsF = new HashMap<Button, Integer>(){{
            put(btnf1, R.raw.hearingtestg1);
            put(btnf2, R.raw.hearingtestg2);
            put(btnf3, R.raw.hearingtestg3);
            put(btnf4, R.raw.hearingtestg4);
            put(btnf5, R.raw.hearingtestg5);
            put(btnf6, R.raw.hearingtestg6);
            put(btnf7, R.raw.hearingtestg7);
            put(btnf8, R.raw.hearingtestg8);
            put(btnf9, R.raw.hearingtestg9);
            put(btnf10, R.raw.hearingtestg10);
            put(btnf11, R.raw.hearingtestg11);
            put(btnf12, R.raw.hearingtestg12);

        }};
        //Noise onclick
        btnMapping.buttonUI(this, buttonsF);

        //Submit button
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res = btnMapping.findActiveButton(SixthQuestionActivity.super.getApplicationContext(),buttonsF);
                if(res.equals("1")) {
                    point1 = new DataPoint(5, -5);
                } else if (res.equals("2")) {
                    point1 = new DataPoint(5, 0);
                } else if (res.equals("3")) {
                    point1 = new  DataPoint(5, 5);
                } else if (res.equals("4")) {
                    point1 = new  DataPoint(5, 10);
                } else if (res.equals("5")) {
                    point1 = new  DataPoint(5, 15);
                } else if (res.equals("6")) {
                    point1 = new  DataPoint(5, 20);
                } else if (res.equals("7")) {
                    point1 = new  DataPoint(5, 30);
                } else if (res.equals("8")) {
                    point1 = new  DataPoint(5, 40);
                } else if (res.equals("9")) {
                    point1 = new  DataPoint(5, 50);
                } else if (res.equals("10")) {
                    point1 = new  DataPoint(5, 60);
                } else if (res.equals("11")) {
                    point1 = new  DataPoint(5, 70);
                } else {
                    point1 = new  DataPoint(5, 80);
                }

                openResultQuestionActivity(point1);
            }
        });

    }
    public void openResultQuestionActivity(DataPoint point1) {
        HearModel.points[5] = point1;
        Intent sixthQuestionIntent = new Intent(this, ResultActivity.class);
        startActivity(sixthQuestionIntent);

    }


}

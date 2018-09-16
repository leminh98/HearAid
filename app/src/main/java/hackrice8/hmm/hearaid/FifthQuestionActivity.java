package hackrice8.hmm.hearaid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.jjoe64.graphview.series.DataPoint;

import java.util.HashMap;
import java.util.Map;

public class FifthQuestionActivity extends AppCompatActivity {

    protected static DataPoint point1 = new DataPoint(4, -5);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_question);

        //Buttons
        final btnMapping btnMapping = new btnMapping();
        final Button btnSubmit = (Button) findViewById(R.id.btnTo6);
        final Button btne1 = (Button) findViewById(R.id.btne1);
        final Button btne2 = (Button) findViewById(R.id.btne2);
        final Button btne3 = (Button) findViewById(R.id.btne3);
        final Button btne4 = (Button) findViewById(R.id.btne4);
        final Button btne5 = (Button) findViewById(R.id.btne5);
        final Button btne6 = (Button) findViewById(R.id.btne6);
        final Button btne7 = (Button) findViewById(R.id.btne7);
        final Button btne8 = (Button) findViewById(R.id.btne8);
        final Button btne9 = (Button) findViewById(R.id.btne9);
        final Button btne10 = (Button) findViewById(R.id.btne10);
        final Button btne11 = (Button) findViewById(R.id.btne11);
        final Button btne12 = (Button) findViewById(R.id.btne12);

        final Map<Button, Integer> buttonsE = new HashMap<Button, Integer>(){{
            put(btne1, R.raw.hearingteste1);
            put(btne2, R.raw.hearingteste2);
            put(btne3, R.raw.hearingteste3);
            put(btne4, R.raw.hearingteste4);
            put(btne5, R.raw.hearingteste5);
            put(btne6, R.raw.hearingteste6);
            put(btne7, R.raw.hearingteste7);
            put(btne8, R.raw.hearingteste8);
            put(btne9, R.raw.hearingteste9);
            put(btne10, R.raw.hearingteste10);
            put(btne11, R.raw.hearingteste11);
            put(btne12, R.raw.hearingteste12);

        }};

        //Noise onclick
        btnMapping.buttonUI(this, buttonsE);


        //Submit button
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res = btnMapping.findActiveButton(FifthQuestionActivity.super.getApplicationContext(), buttonsE);
                if(res.equals("1")) {
                    point1 = new DataPoint(4, -5);
                } else if (res.equals("2")) {
                    point1 = new DataPoint(4, 0);
                } else if (res.equals("3")) {
                    point1 = new  DataPoint(4, 5);
                } else if (res.equals("4")) {
                    point1 = new  DataPoint(4, 10);
                } else if (res.equals("5")) {
                    point1 = new  DataPoint(4, 15);
                } else if (res.equals("6")) {
                    point1 = new  DataPoint(4, 20);
                } else if (res.equals("7")) {
                    point1 = new  DataPoint(4, 30);
                } else if (res.equals("8")) {
                    point1 = new  DataPoint(4, 40);
                } else if (res.equals("9")) {
                    point1 = new  DataPoint(4, 50);
                } else if (res.equals("10")) {
                    point1 = new  DataPoint(4, 60);
                } else if (res.equals("11")) {
                    point1 = new  DataPoint(4, 70);
                } else {
                    point1 = new  DataPoint(4, 80);
                }
                openSixthQuestionActivity(point1);
            }
        });

    }

    public void openSixthQuestionActivity(DataPoint point1) {
        HearModel.points[4] = point1;
        Intent fifthQuestionIntent = new Intent(this, SixthQuestionActivity.class);
        startActivity(fifthQuestionIntent);

    }
}

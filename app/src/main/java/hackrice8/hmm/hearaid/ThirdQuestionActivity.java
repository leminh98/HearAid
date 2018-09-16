package hackrice8.hmm.hearaid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.jjoe64.graphview.series.DataPoint;

import java.util.HashMap;
import java.util.Map;

public class ThirdQuestionActivity extends AppCompatActivity {

    protected static DataPoint point1 = new DataPoint(2, -5);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_question);
        //Buttons
        final btnMapping btnMapping = new btnMapping();
        final Button btnSubmit = (Button) findViewById(R.id.btnTo4);
        final Button btnc1 = (Button) findViewById(R.id.btnc1);
        final Button btnc2 = (Button) findViewById(R.id.btnc2);
        final Button btnc3 = (Button) findViewById(R.id.btnc3);
        final Button btnc4 = (Button) findViewById(R.id.btnc4);
        final Button btnc5 = (Button) findViewById(R.id.btnc5);
        final Button btnc6 = (Button) findViewById(R.id.btnc6);
        final Button btnc7 = (Button) findViewById(R.id.btnc7);
        final Button btnc8 = (Button) findViewById(R.id.btnc8);
        final Button btnc9 = (Button) findViewById(R.id.btnc9);
        final Button btnc10 = (Button) findViewById(R.id.btnc10);
        final Button btnc11 = (Button) findViewById(R.id.btnc11);
        final Button btnc12 = (Button) findViewById(R.id.btnc12);

        final Map<Button, Integer> buttonsC = new HashMap<Button, Integer>(){{
            put(btnc1, R.raw.hearingtestc1);
            put(btnc2, R.raw.hearingtestc2);
            put(btnc3, R.raw.hearingtestc3);
            put(btnc4, R.raw.hearingtestc4);
            put(btnc5, R.raw.hearingtestc5);
            put(btnc6, R.raw.hearingtestc6);
            put(btnc7, R.raw.hearingtestc7);
            put(btnc8, R.raw.hearingtestc8);
            put(btnc9, R.raw.hearingtestc9);
            put(btnc10, R.raw.hearingtestc10);
            put(btnc11, R.raw.hearingtestc11);
            put(btnc12, R.raw.hearingtestc12);

        }};

        //Noise onclick
        btnMapping.buttonUI(this, buttonsC);


        //Submit button
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res = btnMapping.findActiveButton(ThirdQuestionActivity.super.getApplicationContext(), buttonsC);
                if(res.equals("1")) {
                    point1 = new DataPoint(2, -5);
                } else if (res.equals("2")) {
                    point1 = new DataPoint(2, 0);
                } else if (res.equals("3")) {
                    point1 = new  DataPoint(2, 5);
                } else if (res.equals("4")) {
                    point1 = new  DataPoint(2, 10);
                } else if (res.equals("5")) {
                    point1 = new  DataPoint(2, 15);
                } else if (res.equals("6")) {
                    point1 = new  DataPoint(2, 20);
                } else if (res.equals("7")) {
                    point1 = new  DataPoint(2, 30);
                } else if (res.equals("8")) {
                    point1 = new  DataPoint(2, 40);
                } else if (res.equals("9")) {
                    point1 = new  DataPoint(2, 50);
                } else if (res.equals("10")) {
                    point1 = new  DataPoint(2, 60);
                } else if (res.equals("11")) {
                    point1 = new  DataPoint(2, 70);
                } else {
                    point1 = new  DataPoint(2, 80);
                }
                openFourthQuestionActivity(point1);
            }
        });
    }

    public void openFourthQuestionActivity(DataPoint point1) {
        HearModel.points[2] = point1;
        Intent thirdQuestionIntent = new Intent(this, FourthQuestionActivity.class);
        startActivity(thirdQuestionIntent);

    }
}

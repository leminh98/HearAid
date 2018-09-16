package hackrice8.hmm.hearaid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.jjoe64.graphview.series.DataPoint;

import java.util.HashMap;
import java.util.Map;

public class FourthQuestionActivity extends AppCompatActivity {

    protected static DataPoint point1 = new DataPoint(3, -5);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_question);

        //Buttons
        final btnMapping btnMapping = new btnMapping();
        final Button btnSubmit = (Button) findViewById(R.id.btnTo5);
        final Button btnd1 = (Button) findViewById(R.id.btnd1);
        final Button btnd2 = (Button) findViewById(R.id.btnd2);
        final Button btnd3 = (Button) findViewById(R.id.btnd3);
        final Button btnd4 = (Button) findViewById(R.id.btnd4);
        final Button btnd5 = (Button) findViewById(R.id.btnd5);
        final Button btnd6 = (Button) findViewById(R.id.btnd6);
        final Button btnd7 = (Button) findViewById(R.id.btnd7);
        final Button btnd8 = (Button) findViewById(R.id.btnd8);
        final Button btnd9 = (Button) findViewById(R.id.btnd9);
        final Button btnd10 = (Button) findViewById(R.id.btnd10);
        final Button btnd11 = (Button) findViewById(R.id.btnd11);
        final Button btnd12 = (Button) findViewById(R.id.btnd12);

       final Map<Button, Integer> buttonsD = new HashMap<Button, Integer>(){{
            put(btnd1, R.raw.hearingtestd1);
            put(btnd2, R.raw.hearingtestd2);
            put(btnd3, R.raw.hearingtestd3);
            put(btnd4, R.raw.hearingtestd4);
            put(btnd5, R.raw.hearingtestd5);
            put(btnd6, R.raw.hearingtestd6);
            put(btnd7, R.raw.hearingtestd7);
            put(btnd8, R.raw.hearingtestd8);
            put(btnd9, R.raw.hearingtestd9);
            put(btnd10, R.raw.hearingtestd10);
            put(btnd11, R.raw.hearingtestd11);
            put(btnd12, R.raw.hearingtestd12);

        }};

        //Noise onclick
        btnMapping.buttonUI(this, buttonsD);

        //Submit button
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res = btnMapping.findActiveButton(FourthQuestionActivity.super.getApplicationContext(),buttonsD);
                if(res.equals("1")) {
                    point1 = new DataPoint(3, -5);
                } else if (res.equals("2")) {
                    point1 = new DataPoint(3, 0);
                } else if (res.equals("3")) {
                    point1 = new  DataPoint(3, 5);
                } else if (res.equals("4")) {
                    point1 = new  DataPoint(3, 10);
                } else if (res.equals("5")) {
                    point1 = new  DataPoint(3, 15);
                } else if (res.equals("6")) {
                    point1 = new  DataPoint(3, 20);
                } else if (res.equals("7")) {
                    point1 = new  DataPoint(3, 30);
                } else if (res.equals("8")) {
                    point1 = new  DataPoint(3, 40);
                } else if (res.equals("9")) {
                    point1 = new  DataPoint(3, 50);
                } else if (res.equals("10")) {
                    point1 = new  DataPoint(3, 60);
                } else if (res.equals("11")) {
                    point1 = new  DataPoint(3, 70);
                } else {
                    point1 = new  DataPoint(3, 80);
                }

                openFifthQuestionActivity(point1);
            }
        });
    }

    public void openFifthQuestionActivity(DataPoint point1) {
        HearModel.points[3] = point1;
        Intent fourthQuestionIntent = new Intent(this, FifthQuestionActivity.class);
        startActivity(fourthQuestionIntent);

    }
}

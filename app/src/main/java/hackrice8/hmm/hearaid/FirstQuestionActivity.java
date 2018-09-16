package hackrice8.hmm.hearaid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.jjoe64.graphview.series.DataPoint;

import java.util.HashMap;
import java.util.Map;


public class FirstQuestionActivity extends AppCompatActivity {

    protected static DataPoint point1 = new DataPoint(0, -5);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_question);

        //Buttons
        final Model model = new Model();
        final Button btnSubmit = (Button) findViewById(R.id.btnTo2);
        final Button btna1 = (Button) findViewById(R.id.btna1);
        final Button btna2 = (Button) findViewById(R.id.btna2);
        final Button btna3 = (Button) findViewById(R.id.btna3);
        final Button btna4 = (Button) findViewById(R.id.btna4);
        final Button btna5 = (Button) findViewById(R.id.btna5);
        final Button btna6 = (Button) findViewById(R.id.btna6);
        final Button btna7 = (Button) findViewById(R.id.btna7);
        final Button btna8 = (Button) findViewById(R.id.btna8);
        final Button btna9 = (Button) findViewById(R.id.btna9);
        final Button btna10 = (Button) findViewById(R.id.btna10);
        final Button btna11 = (Button) findViewById(R.id.btna11);
        final Button btna12 = (Button) findViewById(R.id.btna12);

        Map<Button, Integer> buttonsA = new HashMap<Button, Integer>(){{
            put(btna1, R.raw.hearingtesta1);
            put(btna2, R.raw.hearingtesta2);
            put(btna3, R.raw.hearingtesta3);
            put(btna4, R.raw.hearingtesta4);
            put(btna5, R.raw.hearingtesta5);
            put(btna6, R.raw.hearingtesta6);
            put(btna7, R.raw.hearingtesta7);
            put(btna8, R.raw.hearingtesta8);
            put(btna9, R.raw.hearingtesta9);
            put(btna10, R.raw.hearingtesta10);
            put(btna11, R.raw.hearingtesta11);
            put(btna12, R.raw.hearingtesta12);

        }};


        //Noise onclick
        String res = model.buttonUI(this, buttonsA);
        if(res.equals("1")) {
            point1 = new DataPoint(0, -5);
        } else if (res.equals("2")) {
            point1 = new DataPoint(0, 0);
        } else if (res.equals("3")) {
            point1 = new  DataPoint(0, 5);
        } else if (res.equals("4")) {
            point1 = new  DataPoint(0, 10);
        } else if (res.equals("5")) {
            point1 = new  DataPoint(0, 15);
        } else if (res.equals("6")) {
            point1 = new  DataPoint(0, 20);
        } else if (res.equals("7")) {
            point1 = new  DataPoint(0, 30);
        } else if (res.equals("8")) {
            point1 = new  DataPoint(0, 40);
        } else if (res.equals("9")) {
            point1 = new  DataPoint(0, 50);
        } else if (res.equals("10")) {
            point1 = new  DataPoint(0, 60);
        } else if (res.equals("11")) {
            point1 = new  DataPoint(0, 70);
        } else {
            point1 = new  DataPoint(0, 80);
        }

        //Submit button
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecondQuestionActivity();
            }
        });

    }

    public void openSecondQuestionActivity() {
        Model.points[0] = point1;
        Intent firstQuestionIntent = new Intent(this, SecondQuestionActivity.class);
        startActivity(firstQuestionIntent);

    }
}

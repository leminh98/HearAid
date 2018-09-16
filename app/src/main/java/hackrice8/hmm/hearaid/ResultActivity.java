package hackrice8.hmm.hearaid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        GraphView graph = (GraphView) findViewById(R.id.result);
        System.out.println(HearModel.points);
        LineGraphSeries<DataPoint> series = new LineGraphSeries<>(HearModel.points);
        graph.addSeries(series);

        final Button btnReset = (Button) findViewById(R.id.btnHearReset);
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomeActivity();
            }
        });
    }

    public void openHomeActivity() {
        Intent fifthQuestionIntent = new Intent(this, HomeActivity.class);
        startActivity(fifthQuestionIntent);

    }
}

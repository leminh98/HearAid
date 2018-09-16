package hackrice8.hmm.hearaid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        GraphView graph = (GraphView) findViewById(R.id.result);
        System.out.println(Model.points);
        LineGraphSeries<DataPoint> series = new LineGraphSeries<>(Model.points);
        graph.addSeries(series);
    }
}

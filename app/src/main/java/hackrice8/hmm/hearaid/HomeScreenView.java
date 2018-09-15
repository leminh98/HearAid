package hackrice8.hmm.hearaid;

import android.media.AudioTrack;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class HomeScreenView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen_view);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        buttonUI();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home_screen_view, menu);
        return true;
    }

    protected void buttonUI (){
        //Buttons creation
        final Button btn00 = (Button) findViewById(R.id.btn00);
        final Button btn01 = (Button) findViewById(R.id.btn01);


        //Color
        final int onColor = R.color.cardview_dark_background;
        final int offColor = R.color.colorAccent;

        //Modify color on click
        for (Button btn : firstColumnButtons) {
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    btn.setBackgroundColor(getResources().getColor(onColor));
                    for (Button other : firstColumnButtons) {
                        if (other != btn) {
                            other.setBackgroundColor(getResources().getColor(offColor));
                        }
                    }

                    MediaPlayer mp = MediaPlayer.create(btn00.getContext(), R.raw.hearingtestcalibrated);
                    mp.start();
                }
            });
        }

        /*
        btn00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn00.setBackgroundColor(getResources().getColor(onColor));
                btn01.setBackgroundColor(getResources().getColor(offColor));

                MediaPlayer mp = MediaPlayer.create(btn00.getContext(), R.raw.hearingtestcalibrated);
                mp.start();
            }
        });

        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn00.setBackgroundColor(getResources().getColor(offColor));
                btn01.setBackgroundColor(getResources().getColor(onColor));

                MediaPlayer mp = MediaPlayer.create(btn01.getContext(), R.raw.hearingtestd8);
                mp.start();
            }
        });
        */
    }
//    public void btnOnClick(View v) {
//
////        Button btn = (Button) findViewById(R.id.btn01);
////        btn.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View v) {
////                MediaPlayer mp = MediaPlayer.create(TestSonido.this, R.raw.hearingtestwarble_A1);
////                mp.start();
////            }
////        });
//    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

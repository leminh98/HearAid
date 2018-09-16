package hackrice8.hmm.hearaid;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import java.util.function.Function;

public class Model {

    protected void buttonUI (final Context context, final Button[] buttonsColumn){
        //Color and sound onclick
        final int offColor = R.color.cardview_dark_background;
        final int onColor = R.color.colorAccent;

        //Modify color of buttons in a column on click
        for (final Button btn : buttonsColumn) {
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Play audio and turn on color
                    btn.setBackgroundColor(ContextCompat.getColor(context, onColor));
                    MediaPlayer mp = MediaPlayer.create(btn.getContext(), R.raw.hearingtestcalibrated);
                    mp.start();
                    //Change color of other buttons to off
                    for (Button other : buttonsColumn) {
                        if (other != btn) {
                            other.setBackgroundColor(ContextCompat.getColor(context, offColor));
                        }
                    }


                }
            });
        }
    }


}

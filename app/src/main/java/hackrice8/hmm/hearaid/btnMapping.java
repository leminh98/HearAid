package hackrice8.hmm.hearaid;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import com.jjoe64.graphview.series.DataPoint;

import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;

public class btnMapping extends AppCompatActivity{

    protected String findActiveButton(final Context context, final Map<Button, Integer> audios) {
        String output = "0";
        for (final Button btn: audios.keySet()) {
            ColorDrawable colorId = (ColorDrawable) btn.getBackground();
            if (colorId.getColor() == ContextCompat.getColor(context, R.color.colorAccent)) {
                output = (String) btn.getText();
            }
        }
        return output;
    }


    protected void buttonUI (final Context context, final Map<Button,Integer> audios){
        //Color and sound onclick
        final int offColor = R.color.cardview_dark_background;
        final int onColor = R.color.colorAccent;

        String retval = "";
        //Modify color of buttons in a column on click
        for (final Button btn : audios.keySet()) {
//            retval = "";
            btn.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    //Play audio and turn on color
                    btn.setBackgroundColor(ContextCompat.getColor(context, onColor));
                    MediaPlayer mp = MediaPlayer.create(btn.getContext(), audios.get(btn));
                    mp.start();
                    //Change color of other buttons to off
                    for (Button other : audios.keySet()) {
                        if (other != btn) {
                            other.setBackgroundColor(ContextCompat.getColor(context, offColor));
                        }
                    }

                }
            });
        }
    }


}

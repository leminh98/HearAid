package hackrice8.hmm.hearaid;
import android.media.MediaPlayer;

public class Model {

    Button boton = (Button) findViewById(R.id.boton);
        boton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            MediaPlayer mp = MediaPlayer.create(TestSonido.this, R.raw.hearingtest);
            mp.start();
        }
    });

}

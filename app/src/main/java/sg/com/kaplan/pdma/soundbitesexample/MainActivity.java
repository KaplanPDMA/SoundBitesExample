package sg.com.kaplan.pdma.soundbitesexample;

import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get the UI handles
        ImageView imageViewBats = (ImageView) findViewById(R.id.imageViewBats);
        ImageView imageViewCat = (ImageView) findViewById(R.id.imageViewCat);
        ImageView imageViewEvil = (ImageView) findViewById(R.id.imageViewEvil);
        ImageView imageViewTorture = (ImageView) findViewById(R.id.imageViewTorture);

        final MediaPlayer soundBats = MediaPlayer.create(this, R.raw.babylaugh);
        final MediaPlayer soundCat = MediaPlayer.create(this, R.raw.catscream);
        final MediaPlayer soundEvil = MediaPlayer.create(this, R.raw.evillaugh);
        final MediaPlayer soundTorture = MediaPlayer.create(this, R.raw.torture);

        imageViewBats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundBats.start();
            }
        });

        imageViewCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundCat.start();
            }
        });

        imageViewEvil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundEvil.start();
            }
        });

        imageViewTorture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundTorture.start();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

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

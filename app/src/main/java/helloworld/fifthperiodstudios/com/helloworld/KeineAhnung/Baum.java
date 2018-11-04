package helloworld.fifthperiodstudios.com.helloworld.KeineAhnung;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import helloworld.fifthperiodstudios.com.helloworld.R;

public class Baum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baum);
        int k = 2+2*2+2;
        k = (int) Math.random()*k;
        //nutzloser kommentar
        Toast.makeText(this,"Nutzloser text",Toast.LENGTH_SHORT).show();
    }
}

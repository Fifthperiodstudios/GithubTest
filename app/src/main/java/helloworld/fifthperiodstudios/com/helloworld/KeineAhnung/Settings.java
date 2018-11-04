package helloworld.fifthperiodstudios.com.helloworld.KeineAhnung;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

import helloworld.fifthperiodstudios.com.helloworld.R;

public class Settings extends AppCompatActivity {
    Switch s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Button b = (Button) findViewById(R.id.button);
        s = (Switch) findViewById(R.id.switch1);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s.setChecked(true);
            }
        });
    }
}

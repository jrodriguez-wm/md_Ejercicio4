package mx.com.webmaps.md_ejercicio4;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AppCompatButton raised;
    AppCompatButton flat;
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        raised= (AppCompatButton) findViewById(R.id.raised_btn);
        flat = (AppCompatButton) findViewById(R.id.flat_btn);
        fab = (FloatingActionButton) findViewById(R.id.fab_btn);

        raised.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),"Raised Button",Toast.LENGTH_SHORT).show();
            }
        });

        flat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),"Flat Button",Toast.LENGTH_SHORT).show();
            }
        });

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),"Floating Action Button",Toast.LENGTH_SHORT).show();
            }
        });
    }
}

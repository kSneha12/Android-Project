package snhea.example.lenovo.myfirstapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button bt;
    private Button bt2;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.two);
        bt = (Button) findViewById(R.id.fbutton);

        bt2 = (Button) findViewById(R.id.sbutton);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt.setText("click");
                 Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
                 startActivity(intent);
                Toast.makeText(MainActivity.this, "clicked !!!!!!!", Toast.LENGTH_SHORT).show();
            }
        });


        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt2.setText("press");

                Toast.makeText(MainActivity.this, "pressed", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

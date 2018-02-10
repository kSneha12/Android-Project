package snhea.example.lenovo.myfirstapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Third2Activity extends AppCompatActivity {
private TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third2);
t1=(TextView)findViewById(R.id.text1);
        Bundle d = getIntent().getExtras();
        if (d != null) {
            String t = d.getString("dinga");
            int i=d.getInt("dingi");

            t1.setText(t+"  -  "+i);
        }
    }
}

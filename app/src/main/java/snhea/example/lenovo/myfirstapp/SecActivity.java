package snhea.example.lenovo.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecActivity extends AppCompatActivity {
    private EditText et;
    private EditText et2;
    private EditText et3;
    private TextView t3;
    private Button b4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);



        Log.d("TAG","onCreat");


        et = (EditText) findViewById(R.id.one);
        et2 = (EditText) findViewById(R.id.two);
        et3 = (EditText) findViewById(R.id.five);
        t3 = (TextView) findViewById(R.id.three);
        b4 = (Button) findViewById(R.id.four);

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // finish();

//                String first = et.getText().toString();
//                String sec = et2.getText().toString();
//                String thr = et3.getText().toString();
//
//                int result = Integer.parseInt(first) + Integer.parseInt(sec)+Integer.parseInt(thr);
//                t3.setText("Output is " + result);
//
//                Toast.makeText(SecActivity.this, "show", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("TAG","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TAG","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TAG","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TAG","onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("TAG","onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TAG","onDestory");
    }

}

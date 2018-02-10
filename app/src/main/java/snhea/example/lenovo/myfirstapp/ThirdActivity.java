package snhea.example.lenovo.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {
private Button bt1;
    private TextView t1;
    private EditText name;
    private EditText number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);


        Log.e("TAG","Oncreate");
        t1=(TextView) findViewById(R.id.one);
        bt1=(Button) findViewById(R.id.two);
        name=(EditText)findViewById(R.id.edit1) ;
        number=(EditText)findViewById(R.id.edit2) ;

//        t1.setText("oncreate\n");

        bt1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String za=name.getText().toString();
                String zp=number.getText().toString();
                int val=0;
                if(!zp.isEmpty())
                {
                    val = Integer.parseInt(zp);
                }

                Toast.makeText(ThirdActivity.this, za+"  "+zp, Toast.LENGTH_SHORT).show();
               Intent i=new Intent(ThirdActivity.this,Third2Activity.class);
                i.putExtra("dinga",za);
                i.putExtra("dingi",val);
                startActivity(i);

            }
        });



    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("TAG", "Onstart");
//        t1.append("onStart\n");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("TAG", "Onresume");
      //  t1.append("onResume\n");

    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.e("TAG", "Onpause");
//        t1.append("onPause\n");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("TAG", "Onstop");
//        t1.append("onStop\n");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("TAG", "Ondestroy");
//        t1.append("onDestroy\n");
    }
}



package snhea.example.lenovo.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.view.View.OnClickListener;

public class ImgActivity extends AppCompatActivity {
    Button button;
    ImageView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img);
        addListenerOnButton();
    }

    public void addListenerOnButton() {
view=(ImageView)findViewById(R.id.imgview);
button=(Button)findViewById(R.id.buttn1);
button.setOnClickListener(new OnClickListener() {
    @Override
    public void onClick(View v) {
        view.setImageResource(R.drawable.download);
    }
});
    }
}

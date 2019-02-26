package ru.forliho.p0111_resvalues;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public Integer knopka;
    public Button button1;
    public Button button2;
    public ImageView imageView;
    public TextView textView;
    private static final String TAG = "Mylog";

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG,"Нахожу кнопачки");
        textView =(TextView) findViewById(R.id.textView);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        imageView = (ImageView) findViewById(R.id.imageView);
//        imageView.setImageResource(R.drawable.gmail);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if (v.getId()==R.id.button1){
                    Log.d(TAG,"Жмякаю первую кнопку");
                   try {
                       knopka = 1;
                       imageView.setImageResource(R.drawable.gmail);
                       textView.setText("Нажата кнопка " +  knopka);
                       Toast toast = Toast.makeText(MainActivity.this,"Жмякнута точка одын",Toast.LENGTH_LONG);
                       toast.setGravity(Gravity.BOTTOM,0,0);
                       LinearLayout toastImage = (LinearLayout) toast.getView();
                       ImageView imagekartinka = new ImageView(MainActivity.this);
                       imagekartinka.setImageResource(R.drawable.record);
                       toastImage.addView(imagekartinka,0);

                       toast.show();
                   } catch (Exception e) {
                       Log.d(TAG,"Хули ты на 0 делишь Педрыло! ", e);
                       e.printStackTrace();
                   }
               } else if(v.getId()==R.id.button2){
                    imageView.setImageResource(R.drawable.clock);
                   Log.d(TAG,"Жмякаю вторую кнопку");
                   Toast toast = Toast.makeText(MainActivity.this,"Жмякнута точка дыва",Toast.LENGTH_LONG);
                   toast.show();
                   knopka = 2;
                   textView.setText("Нажата кнопка " +  knopka);
                }

            }
        };
        button1.setOnClickListener(onClickListener);
        button2.setOnClickListener(onClickListener);
    }
}

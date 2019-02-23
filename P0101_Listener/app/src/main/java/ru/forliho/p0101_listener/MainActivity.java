package ru.forliho.p0101_listener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView viewText;
    Button button1;
    Button button2;
    Button button3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewText = (TextView) findViewById(R.id.viewText);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);


        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.button1:
                        viewText.setText(R.string.text1);
                        break;
                    case R.id.button2:
                        viewText.setText(R.string.text2);
                        break;
                    case R.id.button3:
                        viewText.setText(R.string.text3);
                        break;
                }
            }
        };

        button1.setOnClickListener(onClickListener);
        button2.setOnClickListener(onClickListener);
        button3.setOnClickListener(onClickListener);

        viewText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button1.setText("НИХУЯ СЕБЕ Кнопка 1");
                button2.setText("Кнопка 2");
                button3.setText("Кнопка 3");
            }
        });

    }
}

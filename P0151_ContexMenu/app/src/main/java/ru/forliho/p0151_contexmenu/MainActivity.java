package ru.forliho.p0151_contexmenu;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textColor, textSize;
    final int MENU_COLOR_RED =1;
    final int MENU_COLOR_BLUE =2;
    final int MENU_COLOR_GREEN =3;
    final int SIZE_UP =4;
    final int SIZE_Doun =5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textColor = (TextView) findViewById(R.id.textColor);
        textSize= (TextView) findViewById(R.id.textSize);

        registerForContextMenu(textColor);
        registerForContextMenu(textSize);

    }



    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
      switch (v.getId()){
          case R.id.textColor:
              menu.add(0,MENU_COLOR_RED,0,"Красный цвет");
              menu.add(0,MENU_COLOR_BLUE,0,"Синий цвет");
              menu.add(0,MENU_COLOR_GREEN,0,"Зеленый цвет");
            break;
          case R.id.textSize:
              menu.add(0,SIZE_UP,0,"Увеличить шрифт");
              menu.add(0,SIZE_Doun,0,"Уменьшить шрифт");
              break;
      }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case MENU_COLOR_RED:
                textColor.setText("Красный цвет");
                textColor.setTextColor(Color.RED);
                break;
            case MENU_COLOR_GREEN:
                textColor.setText("Зеленый цвет");
                textColor.setTextColor(Color.GREEN);
                break;
            case MENU_COLOR_BLUE:
                textColor.setText("Синий цвет");
                textColor.setTextColor(Color.BLUE);
                break;
            case SIZE_UP:
                textSize.setTextSize(textSize.getTextSize()+1);
                break;
            case SIZE_Doun:
                textSize.setTextSize(textSize.getTextSize()-1);
                break;


        }
        return super.onContextItemSelected(item);
    }
}

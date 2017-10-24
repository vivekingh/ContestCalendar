package com.example.win_81.workshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       b1= (Button)findViewById(R.id.button);

        t= (TextView) findViewById(R.id.textView2);

          b1.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  t.setText("Roll no.: 15CS0109");
              }
          });
        b1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                //TextView t2 = (TextView)findViewById(R.id.textView2);
                t.setText("Hello World");
               return true;
            }
        });
    }



}

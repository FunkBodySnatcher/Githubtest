package com.example.gard.githubtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView klikk;
    private int clickCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        klikk = (TextView) findViewById(R.id.klikk);
        klikk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                klikk.setText("Nice click man!");

                clickCounter++;

                if(clickCounter == 2){

                    klikk.setText("Bye!");
                    klikk.animate().translationYBy(-2000).setDuration(2000);

                }

                klikk.setOnClickListener(null);

            }
        });
    }
}

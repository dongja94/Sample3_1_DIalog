package com.begentgroup.sampledialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button)findViewById(R.id.btn_single_choice);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MySingleDialogFragment f = new MySingleDialogFragment();
                f.show(getSupportFragmentManager(), "dialog");
            }
        });

        btn = (Button)findViewById(R.id.btn_show_custom);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomDialogFragment f = new CustomDialogFragment();
                f.show(getSupportFragmentManager(), "custom");
            }
        });
    }
}

package com.roy.animesh.androidswitchicon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.zagum.switchicon.SwitchIconView;

public class MainActivity extends AppCompatActivity {

    private SwitchIconView switchIconView1;
    private SwitchIconView switchIconView2;

    private View button1;
    private View button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchIconView1 = (SwitchIconView) findViewById(R.id.switchIconView1);
        switchIconView2 = (SwitchIconView) findViewById(R.id.switchIconView2);

        button1 =findViewById(R.id.btn1);
        button2 =findViewById(R.id.btn2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchIconView1.switchState();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchIconView2.switchState();
            }
        });



    }
}

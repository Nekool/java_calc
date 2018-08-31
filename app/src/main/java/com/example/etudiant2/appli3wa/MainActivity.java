package com.example.etudiant2.appli3wa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.LinearLayout;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("oncreate","hello");

    }
    TextView vueText = findViewById(R.id.cadre_text);;

    public String onClick(View v) {
        // 1) Possibly check for instance of first
        Button b = (Button)v;
        String buttonText = b.getText().toString();
        return buttonText;
    }
    public void onClickPlus(View v) {
        // 1) Possibly check for instance of first
        Button b = findViewById(R.id.addition);
        String buttonText = b.getText().toString();
    }
    public void onClickMoin(View v) {
        // 1) Possibly check for instance of first
        Button b = findViewById(R.id.soustraction);;
        String buttonText = b.getText().toString();
    }
    public void onClickDiv(View v) {
        // 1) Possibly check for instance of first
        Button b = findViewById(R.id.division);;
        String buttonText = b.getText().toString();
    }
    public void onClickMulti(View v) {
        // 1) Possibly check for instance of first
        Button b = findViewById(R.id.multiplication);;
        String buttonText = b.getText().toString();
    }
    public void onClickEgal(View v) {
        // 1) Possibly check for instance of first
        Button b = findViewById(R.id.egal);;
        String buttonText = b.getText().toString();
    }
}

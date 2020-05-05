package com.cadastro.db.pendulo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btSetas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Rotina do botão para as setas
    public void TelaSetas(View view) {
        Intent it1 = new Intent(this, Layout_Setas.class);
        startActivity(it1);
    }
}

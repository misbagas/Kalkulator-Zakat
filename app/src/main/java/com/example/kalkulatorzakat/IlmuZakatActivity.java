package com.example.kalkulatorzakat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IlmuZakatActivity extends AppCompatActivity {
    private Button btnkembalizakat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_ilmuzakat);

        Button kembalizakat = (Button) findViewById(R.id.btnkembalizakat);
        kembalizakat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent goHome = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(goHome);
            }
        });
    }
}

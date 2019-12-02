package com.example.kalkulatorzakat;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    final Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button exit_button = (Button) findViewById(R.id.exit_button);
        Button hitungZakat = (Button) findViewById(R.id.btnHitungZakat);
        final Button IlmuZakat = (Button) findViewById(R.id.btnIlmuZakat);


        hitungZakat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent goHitungZakat = new Intent(getApplicationContext(),HitungZakatActivity.class);
                startActivity(goHitungZakat);
            }
        });
        IlmuZakat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent goIlmuZakat = new Intent (getApplicationContext(),IlmuZakatActivity.class);
                startActivity(goIlmuZakat);
            }
        });
        exit_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.fragment_exit);
                Button dialogButton = (Button) dialog.findViewById(R.id.dialogButtonOK);
                Button dialogButton2 = (Button) dialog.findViewById(R.id.dialogButtonOK2);
                // if button is clicked, close the custom dialog
                dialogButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                        //Toast.makeText(getApplicationContext(),"Dismissed..!!", Toast.LENGTH_SHORT).show();
                    }
                });
                dialogButton2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finish();
                        //Toast.makeText(getApplicationContext(),"Dismissed..!!", Toast.LENGTH_SHORT).show();
                    }
                });
                dialog.show();
            }
        });

    }
}

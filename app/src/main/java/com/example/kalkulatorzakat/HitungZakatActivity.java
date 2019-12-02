package com.example.kalkulatorzakat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HitungZakatActivity extends AppCompatActivity implements View.OnClickListener{
private EditText edtHargaBeras,editjumlahanggota;
private Button btnHitung,btnReset,btnKembali;
private TextView tvhasil_zakat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_hitungzakat);
        edtHargaBeras = (EditText)findViewById(R.id.edt_harga_beras);
        editjumlahanggota = (EditText) findViewById(R.id.edt_jml_anggota);
        btnHitung = (Button) findViewById(R.id.btnHitung);
        btnReset = (Button) findViewById(R.id.btn_reset);
        tvhasil_zakat = (TextView) findViewById(R.id.hasil_zakat);
        btnHitung.setOnClickListener(this);
        btnReset.setOnClickListener(this);

        Button Kembali = (Button) findViewById(R.id.btn_kembali);
        Kembali.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent goHome = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(goHome);
            }
        });
    }

    public void onClick(View v){
        if(v.getId() == R.id.btnHitung){
            String H = edtHargaBeras.getText().toString().trim();
            String J = editjumlahanggota.getText().toString().trim();

            boolean isEmptyFields = false;

            if(TextUtils.isEmpty(H)){
                isEmptyFields=true;
                edtHargaBeras.setError("FIELD TIDAK BOLEH KOSONG");
            }

            if(TextUtils.isEmpty(J)){
                isEmptyFields=true;
                editjumlahanggota.setError("FIELD TIDAK BOLEH KOSONG");
            }

            if(!isEmptyFields){
                double HB = Double.parseDouble(H);
                int JA = Integer.parseInt(J);
                double hasil = HB*JA;
                tvhasil_zakat.setText(String.valueOf(hasil));
            }
        }
        if(v.getId() == R.id.btn_reset){
            edtHargaBeras.setText("");
            editjumlahanggota.setText("");
            tvhasil_zakat.setText("");
        }
    }
}

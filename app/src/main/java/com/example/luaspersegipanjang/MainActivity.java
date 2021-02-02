package com.example.luaspersegipanjang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edt_Panjang, edt_Lebar;
    private TextView txtluas;
    private Button edt_hitung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_Panjang = (EditText)findViewById(R.id.edt_Panjang);
        edt_Lebar = (EditText)findViewById(R.id.edt_Lebar);
        txtluas = (TextView)findViewById(R.id.txt_luas);
        edt_hitung = (Button)findViewById(R.id.edt_hitung);

        edt_hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String panjang, lebar;
                panjang = edt_Panjang.getText().toString();
                lebar = edt_Lebar.getText().toString();

                if (TextUtils.isEmpty(panjang)) {
                    edt_Panjang.setError("Harap di isi");
                    edt_Panjang.requestFocus();
                } else if (TextUtils.isEmpty(lebar)) {
                    edt_Lebar.setError("Harap di isi juga");
                    edt_Lebar.requestFocus();
                } else {
                    double p = Double.parseDouble(panjang);
                    double l = Double.parseDouble(lebar);
                    double hasil = p * l;

                    txtluas.setText("Hasil Luas = " + hasil);
                }
            }
        });
    }
}
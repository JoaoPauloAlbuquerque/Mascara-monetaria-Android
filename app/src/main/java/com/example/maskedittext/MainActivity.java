package com.example.maskedittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;

import java.text.DecimalFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.editText = this.findViewById(R.id.seu_edittext);
        this.editText.addTextChangedListener(new TextWatcher() {
            private boolean isUpdating = false;

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(this.isUpdating){
                    this.isUpdating = false;
                    return;
                }

                this.isUpdating = true;
                String string = charSequence.toString();
                String currentValor = string;
                if(string.contains(".") || string.contains(",")){
                    currentValor = string.replace(",", "");
                    currentValor = currentValor.replace(".", "");
                }

                try{
                    Locale locale;
                    if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.N){
                        locale = MainActivity.this.getResources().getConfiguration().getLocales().get(0);
                    } else {
                        locale = MainActivity.this.getResources().getConfiguration().locale;
                    }
                    Locale.setDefault(locale);

                    String valor = new DecimalFormat("###,##0.00").format(Double.parseDouble(currentValor) / 100);
                    editText.setText(valor);
                    editText.setSelection(valor.length());
                } catch (Exception e){
                    Log.e("ERRO", "AO CONVERTER VALOR");
                    editText.setText("");
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
}
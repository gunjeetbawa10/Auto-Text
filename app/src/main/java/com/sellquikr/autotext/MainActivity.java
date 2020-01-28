package com.sellquikr.autotext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import me.grantland.widget.AutofitTextView;

public class MainActivity extends AppCompatActivity {
    AutofitTextView autofitTextView;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        autofitTextView = (AutofitTextView)findViewById(R.id.autodemo);
        editText = (EditText)findViewById(R.id.edtText);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                autofitTextView.setText(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });



    }
}

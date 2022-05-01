package com.example.mvpapplication.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.mvpapplication.R;

public class MainActivity extends AppCompatActivity implements AppInterface {
    TextView textView;
    Button button;
    AppPresenter appPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        textView = findViewById ( R.id.textView );
        button = findViewById ( R.id.button );
        appPresenter = new AppPresenter ( this );

        button.setOnClickListener ( view -> {
           appPresenter.getMeNewName ();
        } );
    }

    @Override
    public void getMeName(String string) {
        textView.setText ( string );
    }
}
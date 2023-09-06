package com.example.lab3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle ;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityTwo extends Activity {
    EditText mEditText;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        TextView mTextView = findViewById(R.id.myView);
        mTextView.setText((String)getIntent().getSerializableExtra("message"));
    }
    public void back(View view){
        mEditText = findViewById(R.id.editText);
        String message = mEditText.getText().toString();
        Intent intent = new Intent(ActivityTwo.this, MainActivity.class);
        intent.putExtra("message",message);
        startActivity(intent);
    }
}
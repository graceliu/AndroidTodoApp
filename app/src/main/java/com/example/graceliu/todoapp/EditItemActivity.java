package com.example.graceliu.todoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {

    EditText etEditText;
    String selectedItemText;
    int selectedItemPosition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        selectedItemText = getIntent().getStringExtra("selectedItemText");
        selectedItemPosition = getIntent().getIntExtra("selectedItemPosition", 0);
        etEditText = (EditText) findViewById(R.id.etEditItem);
//        etEditText.setText(selectedItemText, TextView.BufferType.EDITABLE);
        etEditText.append(selectedItemText);
    }

    public void onEditItem(View view) {
        String updatedItemText = etEditText.getText().toString();

        Intent data = new Intent();
        data.putExtra("updatedItemText", updatedItemText);
        data.putExtra("updatedItemPosition", selectedItemPosition);
        setResult(RESULT_OK, data);
        finish();

    }
}

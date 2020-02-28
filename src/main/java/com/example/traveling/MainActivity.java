package com.example.traveling;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        EditText message = (EditText) findViewById(R.id.message);
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        intent.putExtra("MESSAGE", message.getText().toString());
        startActivity(intent);
        message.setText("");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        //responding to menu items selected
        switch (item.getItemId()) {
            case R.id.music:
                startActivity(new Intent(this, activity1.class));
                return true;
            case R.id.Cfile:
                startActivity(new Intent(this, activities.class));
                return true;
            case R.id.list:
                startActivity(new Intent(this, listviewing.class));
                return true;
            default:
                return true;

        }
    }
}

package com.example.traveling;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button dial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dial = findViewById(R.id.call);
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

    @RequiresApi(api = Build.VERSION_CODES.M)
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
            case R.id.recycle:
                startActivity(new Intent(this, recycler.class));
                return true;
            case R.id.inte:
            /*    Intent intent = new Intent(Intent.ACTION_CALL);*/
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:0777313062"));

                startActivity(intent);
            case R.id.store:
                startActivity(new Intent(this,fivec1.class));
                return true;
            case R.id.em:
                Intent inten = new Intent(Intent.ACTION_SEND);
                inten.setData(Uri.parse(("mailto:")));
                String to[] = {"twnmtskbnn@gmail.com", "josephsmukasa@gmail.com", "ktsmsusan@gmail.com"};
                inten.putExtra(Intent.EXTRA_EMAIL, to);
                inten.putExtra(Intent.EXTRA_TEXT, "Design an email");
                inten.setType("messege/rfc882");
                startActivity(inten);

                return true;
            case R.id.serve:
                startActivity(new Intent(this,TheService.class));

            default:
                return true;

        }

    }
}

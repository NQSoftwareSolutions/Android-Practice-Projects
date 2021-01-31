package com.example.optionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Todo : T1 Create A menu folder & create main_menu xml file

    }
    // Todo T3 Inflate menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
    //Todo T4 Add on click events on menu items

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.booking_menu:
                Toast.makeText(this, "Booking menu", Toast.LENGTH_LONG).show();
                break;
            case R.id.profile_menu:
                Toast.makeText(this, "Profile menu", Toast.LENGTH_LONG).show();
                break;
            case R.id.history_menu:
                Toast.makeText(this, "History menu", Toast.LENGTH_LONG).show();
                break;
        }
        return true;
    }
}
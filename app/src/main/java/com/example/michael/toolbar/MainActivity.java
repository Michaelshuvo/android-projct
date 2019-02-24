package com.example.michael.toolbar;

import android.content.Intent;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
  android.support.v7.widget.Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=(android.support.v7.widget.Toolbar)findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        MenuItem searchiteam=menu.findItem(R.id.search);
        SearchView searchView=(SearchView) MenuItemCompat.getActionView(searchiteam);
         searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
             @Override
             public boolean onQueryTextSubmit(String s) {
                 Toast.makeText(MainActivity.this,"ahahh",Toast.LENGTH_SHORT).show();
                 startActivity(new Intent(getApplicationContext(),result.class));
                 return true;
             }

             @Override
             public boolean onQueryTextChange(String s) {
                 Toast.makeText(MainActivity.this,"submiteed",Toast.LENGTH_SHORT).show();

                 return true;
             }
         });


        return true;
    }
}

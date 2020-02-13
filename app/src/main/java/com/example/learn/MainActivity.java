package com.example.learn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar t=findViewById(R.id.toolbar);
        setSupportActionBar(t);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.help:
                Toast.makeText(getApplicationContext(),"Help",Toast.LENGTH_SHORT).show();
                Intent s=new Intent(this,HelpActivity.class);
                startActivity(s);
                break;
            case R.id.setting:
                Toast.makeText(getApplicationContext(),"Setting",Toast.LENGTH_SHORT).show();
//Intent s=new Intent(this,settingsActivity.class);
                //startActivity(s);
                break;
            case R.id.update:
                Toast.makeText(getApplicationContext(),"update",Toast.LENGTH_SHORT).show();

                break;
            default: break;

        }
        return super.onOptionsItemSelected(item);
    }
}

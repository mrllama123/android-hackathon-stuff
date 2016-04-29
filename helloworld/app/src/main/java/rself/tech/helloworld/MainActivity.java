package rself.tech.helloworld;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private int count =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //Button increament = (Button)findViewById(R.id.increament);
        final Button increament = getIcreament("increament");
        final Button deincreament = getDeincrement("decreament");

        increament.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                count++;
            }
        });

        deincreament.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                count--;
            }
        });

    }

    private Button getIcreament(String s){
        int resID = getResources().getIdentifier(s,"id","rself.tech.helloworld");
        return (Button) findViewById(resID);
    }
    private Button getDeincrement(String s){
        int resID = getResources().getIdentifier(s,"id","rself.tech.helloworld");
        return (Button) findViewById(resID);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

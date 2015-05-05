package com.saransh.smartsupper;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.saransh.smartsupper.library.DatabaseHandler;
import com.saransh.smartsupper.library.UserFunctions;


public class MainActivity extends ActionBarActivity {

    TextView t;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t = (TextView) findViewById(R.id.text);

        DatabaseHandler db = new DatabaseHandler(getApplicationContext());

        int count = db.getRowCount();

        if(count > 0) {

            t.setText(db.getName());

        } else {
            Intent i = new Intent(this, Login.class);
            startActivity(i);
        }

        db.close();
    }

    public void sign_up_message(View view)
    {
        Intent intent = new Intent(this, SignUp.class);
        startActivity(intent);
    }
    public void login_message(View view)
    {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
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
        if (id == R.id.action_logout) {
            new UserFunctions().logoutUser(getApplicationContext());
            Intent i = new Intent(getApplicationContext(), Login.class);
            startActivity(i);
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

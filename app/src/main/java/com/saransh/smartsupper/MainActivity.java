package com.saransh.smartsupper;

import android.content.Intent;
<<<<<<< HEAD
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
=======
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
>>>>>>> 1bb239ab5309cc8f7ba1861ae09de1f4e0608f40
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

<<<<<<< HEAD
import com.facebook.AccessToken;
import com.facebook.AccessTokenTracker;
import com.facebook.CallbackManager;
=======
>>>>>>> 1bb239ab5309cc8f7ba1861ae09de1f4e0608f40
import com.facebook.FacebookSdk;


public class MainActivity extends ActionBarActivity {
<<<<<<< HEAD
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
=======

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(getApplicationContext());
        setContentView(R.layout.activity_main);
    }

>>>>>>> 1bb239ab5309cc8f7ba1861ae09de1f4e0608f40
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
<<<<<<< HEAD
=======
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

>>>>>>> 1bb239ab5309cc8f7ba1861ae09de1f4e0608f40
}

package richard.mike.com.purposebuilt;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class  Login extends AppCompatActivity implements View.OnClickListener {

    //make these private as not used elsewhere
    private EditText userName,password;
    private Button  loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        userName =(EditText) findViewById(R.id.userName);
        password=(EditText)findViewById(R.id.password);
        loginBtn = (Button) findViewById(R.id.loginbtn);
        loginBtn.setOnClickListener(this);

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

    //use this block to handle all clicks
    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.loginbtn:

                if (validatePassword()) {
                    Intent intent=new Intent(Login.this,Navi.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(Login.this ,"Incorrect login details",Toast.LENGTH_LONG).show();
                }
        }
    }

    //neater to do validation in its own method
    //let onclick method handle clicks
    //let validation method handle its stuff
    private Boolean validatePassword()
    {
        Boolean valid = false;
        if (userName.getText().toString().equals("1")&& password.getText().toString().equals ("1") ) {
            valid = true;
        }
        return valid;
    }
}

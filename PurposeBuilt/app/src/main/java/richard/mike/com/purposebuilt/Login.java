package richard.mike.com.purposebuilt;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class  Login extends AppCompatActivity {

EditText userName,password;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        userName =(EditText) findViewById(R.id.userName);
        password=(EditText)findViewById(R.id.password);


        final Button  loginBtn = (Button) findViewById(R.id.loginbtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (userName.getText().toString().equals("legend")&& password.getText().toString().equals ("123123") ) {
                    Toast.makeText(Login.this,"Logging In",Toast.LENGTH_LONG).show();

                    loginBtn.setBackgroundColor(Color.RED);
                    Intent intent=new Intent(Login.this,Navi.class);
                    startActivity(intent);



                }else{
                    Toast.makeText(Login.this ,"Please Enter the correct UserName or Password",Toast.LENGTH_LONG).show();
                }
            }
        });}





    public void onClick (View view){
          Intent i=new Intent (this,SignUp.class);
          startActivity (i);


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

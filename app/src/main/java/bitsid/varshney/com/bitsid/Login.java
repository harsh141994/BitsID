package bitsid.varshney.com.bitsid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Dell on 26-01-2016.
 */
public class Login extends Activity implements View.OnClickListener{
    Button loginButton;
    TextView tvForgotPassword, tvRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        loginButton = (Button)findViewById(R.id.loginButton);
        tvForgotPassword = (TextView)findViewById(R.id.forgotpassword);
        tvRegister = (TextView) findViewById(R.id.register);
        loginButton.setOnClickListener(this);
        tvRegister.setOnClickListener(this);
        tvForgotPassword.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.loginButton:
                Toast.makeText(this, "Working", Toast.LENGTH_SHORT).show();
                break;
            case R.id.forgotpassword:
                Intent i1 = new Intent(Login.this,ForgotPassword.class);
                startActivity(i1);
                //Toast.makeText(this,"Working",Toast.LENGTH_SHORT).show();
                break;
            case R.id.register:
                Intent i = new Intent(Login.this,SignUp.class);
                startActivity(i);
                break;
        }
    }
}

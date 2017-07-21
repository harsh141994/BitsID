package bitsid.varshney.com.bitsid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Dell on 26-01-2016.
 */
public class ForgotPassword extends Activity implements View.OnClickListener{
    Button submit;
    EditText email;
    String s = "@pilani.bits-pilani.ac.in";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgotpassword);
        submit = (Button) findViewById(R.id.forgot_submit);
        email = (EditText) findViewById(R.id.forgot_email);

        submit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.forgot_submit:
                String string = "Hi there,\nYour BITS ID password is ABCD\n With love,\nBITS ID Team";
                Intent i = new Intent(Intent.ACTION_SEND);
                i.putExtra(Intent.EXTRA_EMAIL,email.getText().toString() + s);
                i.putExtra(Intent.EXTRA_SUBJECT, "BITS ID Password");
                i.setType("plain/text");
                i.putExtra(Intent.EXTRA_TEXT, string);
                startActivity(i);
                Toast.makeText(ForgotPassword.this, "Password sent to mail", Toast.LENGTH_LONG).show();
                break;
        }
    }
    }

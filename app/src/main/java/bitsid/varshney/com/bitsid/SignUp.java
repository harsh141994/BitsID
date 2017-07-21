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
public class SignUp extends Activity implements View.OnClickListener{
    Button submitButton;
    EditText etName, etId, etHostel, etRoom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        submitButton = (Button) findViewById(R.id.submit);
        etName = (EditText) findViewById(R.id.name);
        etId = (EditText) findViewById(R.id.idno);
        etHostel = (EditText) findViewById(R.id.hostel);
        etRoom = (EditText) findViewById(R.id.room);
        submitButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.submit:
                if(etName.getText().toString().length() == 0 || etId.getText().toString().length() == 0 || etHostel.getText().toString().length() == 0 || etRoom.getText().toString().length() == 0){
                    Toast.makeText(this, "Complete the information", Toast.LENGTH_SHORT).show();
                    break;
                }
                //Change the Regular expression
                /*if(etId.getText().toString().matches("\\d{4}\\D\\d\\D\\d{4}\\D") == false){
                    Toast.makeText(this,"ID invalid",Toast.LENGTH_SHORT).show();
                    break;
                }*/
                Bundle b = new Bundle();
                b.putString("name", etName.getText().toString());
                b.putString("idno", etId.getText().toString());
                b.putString("hostel", etHostel.getText().toString());
                b.putString("room", etRoom.getText().toString());
                Intent i = new Intent(SignUp.this,MainActivity.class);
                i.putExtras(b);
                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(i);
        }
    }
}

package dellatan.mcm.edu.ph;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final String myUN = "Avr";
        final String myPW = "123";

        final Button btn = findViewById(R.id.button2);
        final EditText ntxt = findViewById(R.id.username);
        final EditText ptxt = findViewById(R.id.password);

        btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String typedUN = ntxt.getText().toString();
                        String typedPW = ptxt.getText().toString();


                        if (typedUN.equals(myUN) && typedPW.equalsIgnoreCase(myPW)){
                            Toast.makeText(Login.this,
                                    "You Successfully Logged In",
                                    Toast.LENGTH_LONG).show();
                            Intent intent1 = new Intent(Login.this, MainActivity.class);
                            startActivity(intent1);

                        }
                        else if(typedUN != myUN || typedPW != myPW){
                            Toast.makeText(Login.this,
                                    "Your Password or Username is Incorrect",
                                    Toast.LENGTH_LONG).show();
                        }
                    }
                }


        );


    }
}
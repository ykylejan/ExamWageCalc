package dellatan.mcm.edu.ph;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;


public class MainActivity extends AppCompatActivity {

    String fname;
    String lname;


    String department;
    String sex;

    Spinner sexInput;
    Spinner departmentInput;



    int age;
    int id;
    int hours;

    EditText fnameInput;
    EditText lnameInput;
    EditText ageInput;
    EditText idInput;
    EditText hoursInput;

    Button calcbtn;

    double salary =0;
    int overtime =0;

    double hmr = 130;
    double adm = 150;
    double aca = 140;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fnameInput = findViewById(R.id.txt_fname);
        lnameInput = findViewById(R.id.txt_lname);
        ageInput = findViewById(R.id.txt_age);
        idInput = findViewById(R.id.txt_id);
        hoursInput = findViewById(R.id.txt_hours);
        departmentInput = findViewById(R.id.spinner_department);
        sexInput = findViewById(R.id.spinner_sex);
        calcbtn = findViewById(R.id.btn_calc);


        sexInput.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        sex = sexInput.getSelectedItem().toString();
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                }
        );

        departmentInput.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        department = departmentInput.getSelectedItem().toString();
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                }
        );


        calcbtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        fname = fnameInput.getText().toString();
                        lname = lnameInput.getText().toString();
                        age = Integer.valueOf(ageInput.getText().toString());
                        hours = Integer.valueOf(hoursInput.getText().toString());
                        id = Integer.valueOf(idInput.getText().toString());

                        switch(department) {
                            case "Human Resources":
                                if (hours <= 8) {
                                    salary = hours*100;
                                    overtime = 0;
                                }

                                else if (hours > 8) {
                                    salary = 800+((hours-8)*hmr);
                                    overtime = hours - 8;
                                }
                                break;
                            case "Admin":
                                if (hours <= 8) {
                                    salary = hours*110;
                                    overtime = 0;
                                }

                                else if (hours > 8) {
                                    salary = 880+((hours-8)*adm);
                                    overtime = hours - 8;
                                }
                                break;

                            case "Academic":
                                if (hours <= 8) {
                                    salary = hours*90;
                                    overtime = 0;
                                }

                                else if (hours > 8) {
                                    salary = 880+((hours-8)*aca);
                                    overtime = hours - 8;
                                }
                                break;
                        }

                        Intent intent1 = new Intent(MainActivity.this, Receipt.class);
                        intent1.putExtra("over",String.valueOf(overtime));

                        intent1.putExtra("hhmr",String.valueOf(hmr));
                        intent1.putExtra("aadm",String.valueOf(adm));
                        intent1.putExtra("aaca",String.valueOf(aca));

                        intent1.putExtra("pangalan", fname);
                        intent1.putExtra("pangalan2", lname);
                        intent1.putExtra("gender", sex);
                        intent1.putExtra("edad",String.valueOf(age));
                        intent1.putExtra("aydi", String.valueOf(id));
                        intent1.putExtra("anint",String.valueOf(hours));
                        intent1.putExtra("sweldo",String.valueOf(salary));
                        intent1.putExtra("depar",String.valueOf(department));


                        startActivity(intent1);




                    }
                }
        );

    }
}

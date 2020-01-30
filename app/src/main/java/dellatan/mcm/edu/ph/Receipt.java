package dellatan.mcm.edu.ph;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Receipt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receipt);


        TextView idtv = findViewById(R.id.id_input);
        TextView nametv = findViewById(R.id.name_input);
        TextView agesextv = findViewById(R.id.agesex_input);
        TextView hourstv = findViewById(R.id.hours_input);
        TextView departmenttv = findViewById(R.id.department_input);
        TextView wagetv = findViewById(R.id.wage_input);

        TextView overtimehrstxt = findViewById(R.id.overtimehrs_txt);
        TextView overtimehrs = findViewById(R.id.overtimehrs_input);

        TextView overtimeratetxt = findViewById(R.id.overtimerate_txt);
        TextView overtimerate = findViewById(R.id.overtimerate_input);

        TextView rateinput = findViewById(R.id.rate_input);

        ImageView imgKyle = findViewById(R.id.imageView_kyle);
        ImageView imgDef = findViewById(R.id.imageView2);



        Button btnback = findViewById(R.id.btn_back);

        String ovrtme = getIntent().getStringExtra("over");
        String name = getIntent().getStringExtra("pangalan");
        String name2 = getIntent().getStringExtra("pangalan2");
        String hours = getIntent().getStringExtra("anint");
        String age = getIntent().getStringExtra("edad");
        String sex = getIntent().getStringExtra("gender");
        String department = getIntent().getStringExtra("depar");
        String salary = getIntent().getStringExtra("sweldo");
        String id = getIntent().getStringExtra("aydi");
        String hmr = getIntent().getStringExtra("hhmr");
        String adm = getIntent().getStringExtra("aadm");
        String aca = getIntent().getStringExtra("aaca");

        switch(id) {
            case "2018107002":
                imgKyle.setVisibility(View.VISIBLE);
                imgDef.setVisibility(View.GONE);
        }

        switch (hours) {
            case "0":
                overtimehrs.setVisibility(View.INVISIBLE);
                overtimerate.setVisibility(View.INVISIBLE);
                overtimehrstxt.setVisibility(View.INVISIBLE);
                overtimeratetxt.setVisibility(View.INVISIBLE);
            case "1":
                overtimehrs.setVisibility(View.INVISIBLE);
                overtimerate.setVisibility(View.INVISIBLE);
                overtimehrstxt.setVisibility(View.INVISIBLE);
                overtimeratetxt.setVisibility(View.INVISIBLE);
            case "2":
                overtimehrs.setVisibility(View.INVISIBLE);
                overtimerate.setVisibility(View.INVISIBLE);
                overtimehrstxt.setVisibility(View.INVISIBLE);
                overtimeratetxt.setVisibility(View.INVISIBLE);
            case "3":
                overtimehrs.setVisibility(View.INVISIBLE);
                overtimerate.setVisibility(View.INVISIBLE);
                overtimehrstxt.setVisibility(View.INVISIBLE);
                overtimeratetxt.setVisibility(View.INVISIBLE);
            case "4":
                overtimehrs.setVisibility(View.INVISIBLE);
                overtimerate.setVisibility(View.INVISIBLE);
                overtimehrstxt.setVisibility(View.INVISIBLE);
                overtimeratetxt.setVisibility(View.INVISIBLE);
            case "5":
                overtimehrs.setVisibility(View.INVISIBLE);
                overtimerate.setVisibility(View.INVISIBLE);
                overtimehrstxt.setVisibility(View.INVISIBLE);
                overtimeratetxt.setVisibility(View.INVISIBLE);
            case "6":
                overtimehrs.setVisibility(View.INVISIBLE);
                overtimerate.setVisibility(View.INVISIBLE);
                overtimehrstxt.setVisibility(View.INVISIBLE);
                overtimeratetxt.setVisibility(View.INVISIBLE);
            case "7":
                overtimehrs.setVisibility(View.INVISIBLE);
                overtimerate.setVisibility(View.INVISIBLE);
                overtimehrstxt.setVisibility(View.INVISIBLE);
                overtimeratetxt.setVisibility(View.INVISIBLE);
            case "8":
                overtimehrs.setVisibility(View.INVISIBLE);
                overtimerate.setVisibility(View.INVISIBLE);
                overtimehrstxt.setVisibility(View.INVISIBLE);
                overtimeratetxt.setVisibility(View.INVISIBLE);
        }

        overtimehrs.setText(ovrtme);

        switch(department) {
            case "Human Resources":
                rateinput.setText("\u20b1 100.00");
                overtimerate.setText("\u20b1 "+hmr+"0");

                overtimehrs.setText(ovrtme+" hrs");
                break;
            case "Admin":
                rateinput.setText("\u20b1 110.00");
                overtimerate.setText("\u20b1 "+adm+"0");

                overtimehrs.setText(ovrtme+" hrs");
                break;
            case "Academic":
                rateinput.setText("\u20b1 90.00");
                overtimerate.setText("\u20b1 "+aca+"0");

                overtimehrs.setText(ovrtme+" hrs");
                break;

        }

        nametv.setText(name2+", "+name);
        agesextv.setText(age+", "+sex);
        departmenttv.setText(department);
        hourstv.setText(hours+" hrs");
        wagetv.setText("\u20b1  "+salary+"0");
        idtv.setText(id);



        btnback.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent1 = new Intent(Receipt.this, MainActivity.class);
                        startActivity(intent1);
                    }
                }
        );


    }
}

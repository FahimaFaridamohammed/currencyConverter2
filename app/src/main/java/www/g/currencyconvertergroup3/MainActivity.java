package www.g.currencyconvertergroup3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private TextView textView;
    private Button  firstButton;
    private  Button secondButton;
    private Button  thirdButton;
    private  Button  fourthButton;
    private Button   fifthButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView = (TextView)findViewById(R.id.tv_textview_id);
        editText =(EditText)findViewById(R.id.et_edittext_id);
        Button firstButton = (Button) findViewById(R.id.bt_dollartoshilling_id);
        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double dollarshilling = Double.parseDouble(editText.getText().toString());
                Double shilling = dollarshilling*102.99;
                textView.setText(shilling + "");



            }
        });

        Button secondButton = (Button) findViewById(R.id.bt_shillingtodollar_id);
        secondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double shillingtodollar = Double.parseDouble(editText.getText().toString());
                Double dollar = shillingtodollar / 102.99;
                textView.setText(dollar + "");


            }
        });
        Button thirdButton = (Button) findViewById(R.id.bt_eurotoshilling_id);
        thirdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double eurotoshilling = Double.parseDouble(editText.getText().toString());
                Double shilling = eurotoshilling*115.79;

                textView.setText(shilling + "");



            }
        });
        Button fourthButton= (Button) findViewById(R.id.bt_shillingtoeuro_id);
        fourthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double shillingtoeuro = Double.parseDouble(editText.getText().toString());
                Double euro = shillingtoeuro/115.79;

                textView.setText(euro + "");



            }
                });

        Button fifthButton= (Button) findViewById(R.id.bt_dollartoeuro_id);
        fifthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double dollartoeuro = Double.parseDouble(editText.getText().toString());
                Double euro = dollartoeuro/1.12;

                textView.setText(euro + "");



            }
        });



    }
}

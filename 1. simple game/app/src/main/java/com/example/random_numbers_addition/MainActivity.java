package com.example.random_numbers_addition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends AppCompatActivity {
    int  first,second,result;
    TextView number_1,number_2;
    EditText   answer;
    final Random rand1=new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number_1=findViewById(R.id.textView4);
        number_2=findViewById(R.id.textView5);
        answer=findViewById(R.id.editTextTextPersonName3);
        first= rand1.nextInt(1000);
        second= rand1.nextInt(1000);
        number_1.setText(String.valueOf(first));
        number_2.setText(String.valueOf(second));





        findViewById(R.id.b1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(TextUtils.isEmpty(answer.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Empty Box",Toast.LENGTH_LONG).show();

                }else {


                    result= Integer.parseInt(answer.getText().toString());

                    if ((first+second)==result){
                        Toast.makeText(getApplicationContext(),"YOU WON...",Toast.LENGTH_LONG).show();

                    }else {
                        Toast.makeText(getApplicationContext(),"YOU LOST...",Toast.LENGTH_LONG).show();

                    }


                }


            }
        });







    }
}
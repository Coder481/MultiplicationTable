package com.example.multiplicationtable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submit(View view){
        EditText text = findViewById(R.id.editText);
        String num = text.getText().toString();

        if (num.length() == 0){
            Toast.makeText(this , "Invalid Input!!",Toast.LENGTH_SHORT).show();
        }
        else {
            int number = Integer.parseInt(num);
            StringBuilder result = calculateTable(number);
            display(result);
        }


    }
    // To Calculate Table
    private StringBuilder calculateTable(int n){
        StringBuilder builder = new StringBuilder();
        for (int i =1;i<=10;i++){
            builder.append(" "+n+"")
                    .append(" X ")
                    .append(" "+i+" ")
                    .append(" = ")
                    .append(" "+n*i)
                    .append("\n");
        }
        return builder;
    }

    // Reset the Table
    public void resetTable(View view){
        StringBuilder build = new StringBuilder();
        build.append("");
        display(build);
    }

    // Display Table on the Screen
    private void display(StringBuilder result){
        TextView quantityTextView = (TextView) findViewById(R.id.textView);
        quantityTextView.setText(result);
    }
}
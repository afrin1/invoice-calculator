package com.afdroid.invoicecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final double INVOICE_EGGS = 205.88;
    private static final double FREE_EGGS = 4.12;
    private EditText inputBox;
    private EditText inputPrice;
    private TextView result;
    private TextView invoicingEggs;
    private TextView freeEggs;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setElements();
    }

    private void setElements() {
        this.inputBox = findViewById(R.id.box_input);
        this.inputPrice = findViewById(R.id.price_input);
        this.result = findViewById(R.id.textResult);
        this.invoicingEggs = findViewById(R.id.invoicing_eggs);
        this.freeEggs = findViewById(R.id.free_eggs);
    }

    public void onClearBtnClicked(View v) {
        this.inputBox.setText("");
        this.inputPrice.setText("");
        this.result.setText("");
        this.invoicingEggs.setText("");
        this.freeEggs.setText("");
    }

    public void onCalculateBtnClicked(View v) {
        double box = Double.parseDouble(this.inputBox.getText().toString());
        double pricePerEgg = Double.parseDouble(this.inputPrice.getText().toString());
//        this.invoicingEggs.setText(Double.toString( Double.parseDouble(this.inputBox.getText().toString()) * INVOICE_EGGS));
//        this.freeEggs.setText(Double.toString( Double.parseDouble(this.inputBox.getText().toString()) * FREE_EGGS) );
//        this.result.setText(Double.toString((box * INVOICE_EGGS) * Double.parseDouble(this.inputPrice.getText().toString())));

        this.invoicingEggs.setText(Double.toString(box * INVOICE_EGGS));
        this.freeEggs.setText(Double.toString(box * FREE_EGGS));
        this.result.setText(Double.toString((box * INVOICE_EGGS) * pricePerEgg));
    }
}

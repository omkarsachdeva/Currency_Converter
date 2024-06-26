package com.example.currencyconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextAmount;
    private Spinner spinnerFrom;
    private Spinner spinnerTo;
    private Button buttonConvert;
    private TextView textViewResult;

    // Sample conversion rates (replace with real-time rates or use an API)
    private double usdToEurRate = 0.85;
    private double usdToGbpRate = 0.73;
    private double usdToInrRate = 83.35;
    private double usdToRubRate = 89.95;
    private double usdToCnyRate = 7.17;
    private double usdToBrlRate = 4.97;
    private double usdToChfRate = 0.87;



    private double inrToEurRate = .0111;
    private double inrToGbpRate = .0096;
    private double inrToUsdRate = 0.012;
    private double inrToRubRate = 1.07;
    private double inrToCnyRate = .0861;
    private double inrToBrlRate = 0.059;
    private double inrToChfRate = 0.01;


    private double eurToInrRate = 90.9;
    private double eurToGbpRate = .8576;
    private double eurToUsdRate = 1.09;
    private double eurToRubRate = 98.14;
    private double eurToCnyRate = 7.79;
    private double eurToBrlRate = 5.38;
    private double eurToChfRate = 0.95;




    private double gbpToEurRate = 1.166;
    private double gbpToInrRate = 106.09;
    private double gbpToUsdRate = 1.277;
    private double gbpToRubRate = 114.44;
    private double gbpToCnyRate = 9.084;
    private double gbpToBrlRate = 6.28;
    private double gbpToChfRate = 1.107;



    private double rubToEurRate = .0102;
    private double rubToGbpRate = .0087;
    private double rubToUsdRate = 0.0112;
    private double rubToInrRate = .926;
    private double rubToCnyRate = .0793;
    private double rubToBrlRate = 0.0549;
    private double rubToChfRate = 0.0097;


    private double cnyToEurRate = .0128;
    private double cnyToGbpRate = .11;
    private double cnyToUsdRate = 0.14;
    private double cnyToRubRate = 12.6;
    private double cnyToInrRate = 11.677;
    private double cnyToBrlRate = 0.69;
    private double cnyToChfRate = 0.1219;


    private double brlToEurRate = .1855;
    private double brlToGbpRate = .159;
    private double brlToUsdRate = 0.2034;
    private double brlToRubRate = 18.227;
    private double brlToCnyRate = 1.4462;
    private double brlToInrRate = 16.8892;
    private double brlToChfRate = 0.1763;


    private double chfToEurRate = 1.0524;
    private double chfToGbpRate = .9023;
    private double chfToUsdRate = 1.154;
    private double chfToRubRate = 103.40;
    private double chfToCnyRate = 8.20;
    private double chfToBrlRate = 5.6732;
    private double chfToInrRate = 95.815;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextAmount = findViewById(R.id.editTextAmount);
        spinnerFrom = findViewById(R.id.spinnerFrom);
        spinnerTo = findViewById(R.id.spinnerTo);
        buttonConvert = findViewById(R.id.buttonConvert);
        textViewResult = findViewById(R.id.textViewResult);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.currencies, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerFrom.setAdapter(adapter);
        spinnerTo.setAdapter(adapter);

        buttonConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertCurrency();
            }
        });
    }

    private void convertCurrency() {
        // Get user input
        double amount = Double.parseDouble(editTextAmount.getText().toString());

        // Get selected currencies
        String fromCurrency = spinnerFrom.getSelectedItem().toString();
        String toCurrency = spinnerTo.getSelectedItem().toString();

        // Perform conversion
        double result;
        //usd
        if (fromCurrency.equals("USD") && toCurrency.equals("EUR")) {
            result = amount * usdToEurRate;
        } else if (fromCurrency.equals("USD") && toCurrency.equals("GBP")) {
            result = amount * usdToGbpRate;
        }
        else if (fromCurrency.equals("USD") && toCurrency.equals("INR")) {
            result = amount * usdToInrRate;
        }
        else if (fromCurrency.equals("USD") && toCurrency.equals("RUB")) {
            result = amount * usdToRubRate;
        }
        else if (fromCurrency.equals("USD") && toCurrency.equals("CNY")) {
            result = amount * usdToCnyRate;
        }
        else if (fromCurrency.equals("USD") && toCurrency.equals("BRL")) {
            result = amount * usdToBrlRate;
        }
        else if (fromCurrency.equals("USD") && toCurrency.equals("CHF")) {
            result = amount * usdToChfRate;
        }

        //INR
        else if (fromCurrency.equals("INR") && toCurrency.equals("USD")) {
            result = amount * inrToUsdRate;
        }
        else if (fromCurrency.equals("INR") && toCurrency.equals("GBP")) {
            result = amount * inrToGbpRate;
        }
        else if (fromCurrency.equals("INR") && toCurrency.equals("EUR")) {
            result = amount * inrToEurRate;
        }
        else if (fromCurrency.equals("INR") && toCurrency.equals("RUB")) {
            result = amount * inrToRubRate;
        }
        else if (fromCurrency.equals("INR") && toCurrency.equals("CNY")) {
            result = amount * inrToCnyRate;
        }
        else if (fromCurrency.equals("INR") && toCurrency.equals("BRL")) {
            result = amount * inrToBrlRate;
        }
        else if (fromCurrency.equals("INR") && toCurrency.equals("CNF")) {
            result = amount * inrToChfRate;
        }

        //eur
        else if (fromCurrency.equals("EUR") && toCurrency.equals("USD")) {
            result = amount * eurToUsdRate;
        }
        else if (fromCurrency.equals("EUR") && toCurrency.equals("GBP")) {
            result = amount * eurToGbpRate;
        }
        else if (fromCurrency.equals("EUR") && toCurrency.equals("INR")) {
            result = amount * eurToInrRate;
        }
        else if (fromCurrency.equals("EUR") && toCurrency.equals("RUB")) {
            result = amount * eurToRubRate;
        }
        else if (fromCurrency.equals("EUR") && toCurrency.equals("CNY")) {
            result = amount * eurToCnyRate;
        }
        else if (fromCurrency.equals("EUR") && toCurrency.equals("BRL")) {
            result = amount * eurToBrlRate;
        }
        else if (fromCurrency.equals("EUR") && toCurrency.equals("CNF")) {
            result = amount * eurToChfRate;
        }


        //gbp
        else if (fromCurrency.equals("GBP") && toCurrency.equals("USD")) {
            result = amount * gbpToUsdRate;
        }
        else if (fromCurrency.equals("GBP") && toCurrency.equals("INR")) {
            result = amount * gbpToInrRate;
        }
        else if (fromCurrency.equals("GBP") && toCurrency.equals("EUR")) {
            result = amount *gbpToEurRate;
        }
        else if (fromCurrency.equals("GBP") && toCurrency.equals("RUB")) {
            result = amount * gbpToRubRate;
        }
        else if (fromCurrency.equals("GBP") && toCurrency.equals("CNY")) {
            result = amount * gbpToCnyRate;
        }
        else if (fromCurrency.equals("GBP") && toCurrency.equals("BRL")) {
            result = amount * gbpToBrlRate;
        }
        else if (fromCurrency.equals("GBP") && toCurrency.equals("CNF")) {
            result = amount * gbpToChfRate;
        }


        //rub
        else if (fromCurrency.equals("RUB") && toCurrency.equals("USD")) {
            result = amount * rubToUsdRate;
        }
        else if (fromCurrency.equals("RUB") && toCurrency.equals("GBP")) {
            result = amount * rubToGbpRate;
        }
        else if (fromCurrency.equals("RUB") && toCurrency.equals("EUR")) {
            result = amount * rubToEurRate;
        }
        else if (fromCurrency.equals("RUB") && toCurrency.equals("INR")) {
            result = amount * rubToInrRate;
        }
        else if (fromCurrency.equals("RUB") && toCurrency.equals("CNY")) {
            result = amount * rubToCnyRate;
        }
        else if (fromCurrency.equals("RUB") && toCurrency.equals("BRL")) {
            result = amount * rubToBrlRate;
        }
        else if (fromCurrency.equals("RUB") && toCurrency.equals("CNF")) {
            result = amount * rubToChfRate;
        }


        //cny

        else if (fromCurrency.equals("CNY") && toCurrency.equals("USD")) {
            result = amount * cnyToUsdRate;
        }
        else if (fromCurrency.equals("CNY") && toCurrency.equals("GBP")) {
            result = amount * cnyToGbpRate;
        }
        else if (fromCurrency.equals("CNY") && toCurrency.equals("EUR")) {
            result = amount * cnyToEurRate;
        }
        else if (fromCurrency.equals("CNY") && toCurrency.equals("RUB")) {
            result = amount * cnyToRubRate;
        }
        else if (fromCurrency.equals("CNY") && toCurrency.equals("INR")) {
            result = amount * cnyToInrRate;
        }
        else if (fromCurrency.equals("CNY") && toCurrency.equals("BRL")) {
            result = amount * cnyToBrlRate;
        }
        else if (fromCurrency.equals("CNY") && toCurrency.equals("CNF")) {
            result = amount * cnyToChfRate;
        }

        //brl

        else if (fromCurrency.equals("BRL") && toCurrency.equals("USD")) {
            result = amount * brlToUsdRate;
        }
        else if (fromCurrency.equals("BRL") && toCurrency.equals("GBP")) {
            result = amount * brlToGbpRate;
        }
        else if (fromCurrency.equals("BRL") && toCurrency.equals("EUR")) {
            result = amount * brlToEurRate;
        }
        else if (fromCurrency.equals("BRL") && toCurrency.equals("RUB")) {
            result = amount * brlToRubRate;
        }
        else if (fromCurrency.equals("BRL") && toCurrency.equals("CNY")) {
            result = amount * brlToCnyRate;
        }
        else if (fromCurrency.equals("BRL") && toCurrency.equals("INR")) {
            result = amount * brlToInrRate;
        }
        else if (fromCurrency.equals("BRL") && toCurrency.equals("CHF")) {
            result = amount * brlToChfRate;
        }

        //chf
        else if (fromCurrency.equals("CHF") && toCurrency.equals("USD")) {
            result = amount * chfToUsdRate;
        }
        else if (fromCurrency.equals("CHF") && toCurrency.equals("GBP")) {
            result = amount * chfToGbpRate;
        }
        else if (fromCurrency.equals("CHF") && toCurrency.equals("EUR")) {
            result = amount * chfToEurRate;
        }
        else if (fromCurrency.equals("CHF") && toCurrency.equals("RUB")) {
            result = amount * chfToRubRate;
        }
        else if (fromCurrency.equals("CHF") && toCurrency.equals("INR")) {
            result = amount * chfToInrRate;
        }
        else if (fromCurrency.equals("CHF") && toCurrency.equals("BRL")) {
            result = amount * chfToBrlRate;
        }
        else if (fromCurrency.equals("CHF") && toCurrency.equals("CNY")) {
            result = amount * chfToCnyRate;
        }





        else {
            // Handle other conversions as needed
            result = amount; // Default to the same amount if no conversion defined
        }

        // Display result
        textViewResult.setText("Result: " + result);
    }
}

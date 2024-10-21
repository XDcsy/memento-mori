package com.example.mementomori;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private WebView webView;
    private EditText birthdateInput;
    private EditText lifeExpectancyInput;
    private Button submitButton;
    private TextView calendar;
    private TextView stats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/index.html");

        birthdateInput = findViewById(R.id.birthdate_input);
        lifeExpectancyInput = findViewById(R.id.life_expectancy_input);
        submitButton = findViewById(R.id.submit_button);
        calendar = findViewById(R.id.calendar);
        stats = findViewById(R.id.stats);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String birthdate = birthdateInput.getText().toString();
                String lifeExpectancy = lifeExpectancyInput.getText().toString();
                // Implement logic to calculate and display calendar and stats
            }
        });
    }
}

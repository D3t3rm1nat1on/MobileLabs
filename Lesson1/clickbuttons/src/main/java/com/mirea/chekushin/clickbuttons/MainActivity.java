package com.mirea.chekushin.clickbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private TextView printF;
    private Button btnOk;
    private Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        printF = findViewById(R.id.printF);
        btnOk = findViewById(R.id.btnOk);
        btnCancel = findViewById(R.id.btnOk);
        View.OnClickListener onClickListener = v -> {
           printF.setText("Ты красавчик");
        };
        btnOk.setOnClickListener(onClickListener);
    }

    public void onCancel(View view) {
        Toast.makeText(this, "Уже не красавчик", Toast.LENGTH_SHORT).show();
    }
}
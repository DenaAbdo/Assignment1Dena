package com.example.assignment1dena;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.view.View;
public class MainActivity extends AppCompatActivity {

    ScrollView scrollView = findViewById(R.id.scrollView);
    TextView tvTittle = findViewById(R.id.tvTittle);
    View tvIntro = findViewById(R.id.tvIntro);
    TextView tvExp = findViewById(R.id.tvExp);
    View VExplain = findViewById(R.id.VExplain);
    TextView tvPractice = findViewById(R.id.tvPractice);
    Button btnGo = findViewById(R.id.btnGo);
    TextView tvHint = findViewById(R.id.tvHint);
    TextView tvQuestion = findViewById(R.id.tvQuestion);
    RadioGroup Radio = findViewById(R.id.Radio);
    RadioButton radioButton3 = findViewById(R.id.radioButton3);
    RadioButton RBchoice2 = findViewById(R.id.RBchoice2);
    CardView CV2 = findViewById(R.id.CV2);
    CardView CV1 = findViewById(R.id.CV1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Set the visibility of the last card view to VISIBLE
                CV2.setVisibility(View.VISIBLE);
            }
        });
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialog_layout, null);

        TextView dialogTitle = dialogView.findViewById(R.id.dialog_title);
        TextView dialogMessage = dialogView.findViewById(R.id.dialog_message);
        Button dialogButton = dialogView.findViewById(R.id.dialog_button);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(dialogView);
        AlertDialog alertDialog = builder.create();
    }
}
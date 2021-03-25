package com.example.lotteryframelayout;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    // GUI controls
    private TextView tvText;
    private ImageView ivLottery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // References to the ImageView and TextView
        tvText = findViewById(R.id.tvText);
        ivLottery = findViewById(R.id.ivLottery);

        ivLottery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Change the visibility mode of the TextView
                if (tvText.getVisibility() == View.GONE)
                    tvText.setVisibility(View.VISIBLE);
                else
                    tvText.setVisibility(View.GONE);

            }
        });
    }
}

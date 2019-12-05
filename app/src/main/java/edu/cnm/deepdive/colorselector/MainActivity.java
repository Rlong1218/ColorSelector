package edu.cnm.deepdive.colorselector;

import android.graphics.Color;
import android.util.Log;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

  private String TAG;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    getSupportActionBar().hide();

    int[] rgb = new int[3];

    SeekBar redSelector = findViewById(R.id.red_selector);
    redSelector.setMax(255);
    TextView redValue = findViewById(R.id.red_value);

    SeekBar blueSelector = findViewById(R.id.blue_selector);
    blueSelector.setMax(255);
    TextView blueValue = findViewById(R.id.blue_value);

    SeekBar greenSelector = findViewById(R.id.green_selector);
    greenSelector.setMax(255);
    TextView greenValue = findViewById(R.id.green_value);

    ImageView colorSquare = findViewById(R.id.colorSquare);


    redSelector.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {

      @Override
      public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        redValue.setText(String.valueOf(progress));
        rgb[0] = progress;
        colorSquare.setBackgroundColor(Color.rgb(rgb[0], rgb[1], rgb[2]));
      }

      @Override
      public void onStartTrackingTouch(SeekBar seekBar) {

      }

      @Override
      public void onStopTrackingTouch(SeekBar seekBar) {

      }
    });

    greenSelector.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
      @Override
      public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        greenValue.setText(String.valueOf(progress));
        rgb[1] = progress;
        colorSquare.setBackgroundColor(Color.rgb(rgb[0], rgb[1], rgb[2]));
      }

      @Override
      public void onStartTrackingTouch(SeekBar seekBar) {

      }

      @Override
      public void onStopTrackingTouch(SeekBar seekBar) {

      }
    });

    blueSelector.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
      @Override
      public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        blueValue.setText(String.valueOf(progress));
        rgb[2] = progress;
        colorSquare.setBackgroundColor(Color.rgb(rgb[0], rgb[1], rgb[2]));
      }

      @Override
      public void onStartTrackingTouch(SeekBar seekBar) {

      }

      @Override
      public void onStopTrackingTouch(SeekBar seekBar) {

      }
    });
  }

}

package vn.edu.usth.usthweather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.FragmentManager;

public class WeatherActivity extends AppCompatActivity {
    private static final String TAG = WeatherActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        // Create a new fragment to be placed in the activity
        WeatherFragment firstFragment = new WeatherFragment();
        ForecastFragment secondFragment = new ForecastFragment();

        // Add the fragment to the 'container' FrameLayout
    }
}
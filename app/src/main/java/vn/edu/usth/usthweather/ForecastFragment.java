package vn.edu.usth.usthweather;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ForecastFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_forecast, container, false);
        view.setBackgroundColor(Color.parseColor("#fc5c9c"));
        LinearLayout llayout = (LinearLayout) view.findViewById(R.id.llayout);

        String[] dates = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        for (int i=0; i<dates.length; i++){
            // Create LinearLayout
            LinearLayout row = new LinearLayout(this.getActivity());
            LinearLayout.LayoutParams row_params = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT, 0, 1f);
            row_params.setMargins(0, 10, 0, 10);
            row.setLayoutParams(row_params);
            row.setOrientation(LinearLayout.HORIZONTAL);

            // Parameter for the first two columns
            LinearLayout.LayoutParams first_params = new LinearLayout.LayoutParams(
                    0, 120, 3f);

            // Date of week
            TextView dText = new TextView(this.getContext());
            row_params.setMargins(0, 10, 0, 10);
            dText.setText(dates[i]);
            dText.setGravity(Gravity.CENTER_VERTICAL);
            dText.setLayoutParams(first_params);
            row.addView(dText);

            // Random status
            int[] icons = {R.drawable.sun, R.drawable.sunset, R.drawable.night, R.drawable.cloudy};
            String[] stt = {"Sunny", "Sunset", "Night", "Cloudy"};
            int n = (int)(Math.random()*4);

            // Icons
            ImageView icon = new ImageView(this.getContext());
            icon.setImageResource(icons[n]);
            icon.setLayoutParams(first_params);
            row.addView(icon);

            // Description
            LinearLayout des = new LinearLayout(this.getActivity());
            LinearLayout.LayoutParams des_params = new LinearLayout.LayoutParams(
                    0, 120, 7f);
            des_params.setMargins(60, 0, 0, 0);
            des.setLayoutParams(des_params);
            des.setGravity(Gravity.CENTER_VERTICAL);
            des.setOrientation(LinearLayout.VERTICAL);

            LinearLayout.LayoutParams text_params = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT, 0, 1f);

            TextView status = new TextView(this.getContext());
            status.setText(stt[n]);
            status.setLayoutParams(text_params);
            des.addView(status);

            // Random temperature
            int num1 = (int)(Math.random()*15+20);
            int num2 = num1 + (int)(Math.random()+5);

            TextView temp = new TextView(this.getContext());
            temp.setText(num1 + "C - " + num2 + "C");
            temp.setLayoutParams(text_params);
            des.addView(temp);

            row.addView(des);
            llayout.addView(row);
        }

        return view;
    }
}



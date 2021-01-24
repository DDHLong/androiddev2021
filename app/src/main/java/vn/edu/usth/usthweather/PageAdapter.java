package vn.edu.usth.usthweather;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {
    private final int PAGE_COUNT = 3;
    public PageAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public int getCount() {
        return PAGE_COUNT; // number of pages for a ViewPager
    }
    @Override
    public Fragment getItem(int page) {
        // returns an instance of Fragment corresponding to the specified page
        switch (page) {
            case 0: return WeatherAndForecastFragment.newInstance();
            case 1: return WeatherAndForecastFragment.newInstance();
            case 2: return WeatherAndForecastFragment.newInstance();


            default:
                return WeatherAndForecastFragment.newInstance();
        }
    }
    @Override
    public CharSequence getPageTitle(int page) {
        return "Page " + page ;
    }
}
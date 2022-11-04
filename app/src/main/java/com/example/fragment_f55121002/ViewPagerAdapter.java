package com.example.fragment_f55121002;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.Fragment;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.ArrayList;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private final List<Fragment> fragmentList = new ArrayList<>();
    private final List<String> FragmentListTitles = new ArrayList<>();

    public ViewPagerAdapter (FragmentManager fm){
        super(fm);
    }

    @Override
    public int getCount(){
        return FragmentListTitles.size();
    }

    @Override
    public Fragment getItem(int position){
        return fragmentList.get(position);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle (int position){
        return FragmentListTitles.get(position);
    }

    public void AddFragment (Fragment fragment, String Title){
        fragmentList.add(fragment);
        FragmentListTitles.add(Title);
    }

}

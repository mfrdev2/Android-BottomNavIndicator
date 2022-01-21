package com.frabbi.bottomnavindicator;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.frabbi.bottomnavindicator.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity<ActivityMainBinding> {

    @Override
    protected ActivityMainBinding onSetDataBinding(Bundle savedInstanceState) {
        return DataBindingUtil.setContentView(this,R.layout.activity_main);
    }

    @Override
    protected void onCreateView(Bundle savedInstanceState) {
        NavController navController = Navigation.findNavController(this, R.id.fragmentContainer);
        AppBarConfiguration build = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this,navController,build);
      // NavigationUI.setupWithNavController(binding.bottomNavigationView,navController);
    }
}
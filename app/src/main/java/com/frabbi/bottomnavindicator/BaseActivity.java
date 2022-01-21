package com.frabbi.bottomnavindicator;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.ViewDataBinding;

public abstract class BaseActivity<V extends ViewDataBinding> extends AppCompatActivity {
    protected V binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = onSetDataBinding(savedInstanceState);
        onCreateView(savedInstanceState);
    }

    protected abstract V onSetDataBinding(Bundle savedInstanceState);

    protected abstract void onCreateView(Bundle savedInstanceState);
}

package com.letran.home_test_tiki.views;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import com.letran.home_test_tiki.R;

public class Base_Activity extends AppCompatActivity {

    protected ConstraintLayout constraintLayout;
    protected View contentView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);
        getWindow().setStatusBarColor(ContextCompat.getColor(Base_Activity.this,R.color.bg_main));
        constraintLayout = (ConstraintLayout)findViewById(R.id.layout);
    }
}

package com.demo.progress;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
   private Button mBtnIncr,mBbtnDecr;
   private ProgressBar mCProgressBar;
    private int mIntPrgVal=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadViews();
    }

    private void loadViews() {
        mBtnIncr=(Button)findViewById(R.id.btn_prog_incr);
        mBbtnDecr=(Button)findViewById(R.id.btn_prog_decr);
        mCProgressBar=(ProgressBar)findViewById(R.id.circular_progress_bar);
        mBtnIncr.setOnClickListener(this);
        mBbtnDecr.setOnClickListener(this);
        mCProgressBar.setProgress(0);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_prog_incr:
                if(mIntPrgVal<90){
                    mIntPrgVal=mIntPrgVal+10;
                    mCProgressBar.setProgress(mIntPrgVal);
                }

                break;
            case R.id.btn_prog_decr:
                if(mIntPrgVal>10){
                    mIntPrgVal=mIntPrgVal-10;
                    mCProgressBar.setProgress(mIntPrgVal);
                }

                break;
            default:
                break;
        }
    }
}

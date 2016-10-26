package com.example.lenovopc.news;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.button1) Button button;
    @BindView(R.id.button2) Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
          ButterKnife.bind(this);


    }
    @OnClick({R.id.button1,R.id.button2})
    public void ass(View view){
switch (view.getId()){
    case R.id.button1:
        Toast.makeText(this,"lala",Toast.LENGTH_LONG).show();
          break;
    case R.id.button2:
        Toast.makeText(this,"lala",Toast.LENGTH_LONG).show();
        break;



}
    }
}

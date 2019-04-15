package com.yesia.fisikaku;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.yesia.fisikaku.Ui.HukumDua;
import com.yesia.fisikaku.Ui.HukumSatu;
import com.yesia.fisikaku.Ui.HukumTiga;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_first_law)
    Button btnFirstLaw;
    @BindView(R.id.tv_hk_satu)
    TextView tvHkSatu;
    @BindView(R.id.btn_second_law)
    Button btnSecondLaw;
    @BindView(R.id.tv_hk_dua)
    TextView tvHkDua;
    @BindView(R.id.btn_third_law)
    Button btnThirdLaw;
    @BindView(R.id.tv_hk_tiga)
    TextView tvHkTiga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_first_law, R.id.tv_hk_satu, R.id.btn_second_law, R.id.tv_hk_dua, R.id.btn_third_law, R.id.tv_hk_tiga})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_first_law:
                startActivity(new Intent(MainActivity.this, HukumSatu.class));
                finish();
                break;
            case R.id.tv_hk_satu:
                startActivity(new Intent(MainActivity.this, HukumSatu.class));
                finish();
                break;
            case R.id.btn_second_law:
                startActivity(new Intent(MainActivity.this, HukumDua.class));
                finish();
                break;
            case R.id.tv_hk_dua:
                startActivity(new Intent(MainActivity.this, HukumDua.class));
                finish();
                break;
            case R.id.btn_third_law:
                startActivity(new Intent(MainActivity.this, HukumTiga.class));
                finish();
                break;
            case R.id.tv_hk_tiga:
                startActivity(new Intent(MainActivity.this, HukumTiga.class));
                finish();
                break;
        }
    }
}

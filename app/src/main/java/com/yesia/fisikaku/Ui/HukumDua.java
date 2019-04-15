package com.yesia.fisikaku.Ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.yesia.fisikaku.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HukumDua extends AppCompatActivity {

    @BindView(R.id.tv_content_detail_nd)
    TextView tvContentDetailNd;
    @BindView(R.id.iv_rumus_nd)
    ImageView ivRumusNd;
    @BindView(R.id.et_gaya_nd)
    EditText etGayaNd;
    @BindView(R.id.et_massa_nd)
    EditText etMassaNd;
    @BindView(R.id.et_percepatan_nd)
    EditText etPercepatanNd;
    @BindView(R.id.hitun_nd)
    Button hitunNd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hukum_dua);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.et_gaya_nd, R.id.et_massa_nd, R.id.et_percepatan_nd, R.id.hitun_nd})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.et_gaya_nd:
                break;
            case R.id.et_massa_nd:
                break;
            case R.id.et_percepatan_nd:
                break;
            case R.id.hitun_nd:
                break;
        }
    }
}

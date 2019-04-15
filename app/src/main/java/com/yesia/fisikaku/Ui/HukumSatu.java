package com.yesia.fisikaku.Ui;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.yesia.fisikaku.Adapter.AdapterFisika;
import com.yesia.fisikaku.Model.FisikaItem;
import com.yesia.fisikaku.Model.ResponseFisika;
import com.yesia.fisikaku.Network.ConfigRetrofit;
import com.yesia.fisikaku.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HukumSatu extends AppCompatActivity {



    @BindView(R.id.recyclerview)
    RecyclerView recyclerview;
    @BindView(R.id.swipe)
    SwipeRefreshLayout swipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hukum);
        ButterKnife.bind(this);

        sendRequest();
    }

    private void sendRequest() {
        ConfigRetrofit.getInstance().getDataFisika().enqueue(new Callback<ResponseFisika>() {
            @Override
            public void onResponse(Call<ResponseFisika> call, Response<ResponseFisika> response) {
                if (response != null) {
                    List<FisikaItem> ListDataFisika = response.body().getFisika();
                    setUpListMovie(ListDataFisika);
                }
            }

            @Override
            public void onFailure(Call<ResponseFisika> call, Throwable t) {

            }
        });


    }

    private void setUpListMovie(List<FisikaItem> listDataMovie) {
        recyclerview.setLayoutManager(new LinearLayoutManager(this));
        recyclerview.setHasFixedSize(true);

        AdapterFisika adapterMovie = new AdapterFisika(this, listDataMovie);
        recyclerview.setAdapter(adapterMovie);
    }


}


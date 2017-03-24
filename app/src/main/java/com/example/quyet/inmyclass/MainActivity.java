package com.example.quyet.inmyclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.nearby.Nearby;

public class MainActivity extends AppCompatActivity {

    GoogleApiClient mGoogleApiClient;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            mGoogleApiClient = new GoogleApiClient.Builder(this)
                    .addApi(Nearby.MESSAGES_API)
                    .addConnectionCallbacks((GoogleApiClient.ConnectionCallbacks) this)
                    .enableAutoManage(this, (GoogleApiClient.OnConnectionFailedListener) this)
                    .build();
    }
}

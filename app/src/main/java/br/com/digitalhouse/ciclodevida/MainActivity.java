package br.com.digitalhouse.ciclodevida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("cicloDeVida","método OnCreated");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("cicloDeVida", "metodo OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("cicloDeVida", "metodo OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("cicloDeVida", "metodo OnResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("cicloDeVida", "metodo OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("cicloDeVida", "metodo OnDestroy");
    }
}
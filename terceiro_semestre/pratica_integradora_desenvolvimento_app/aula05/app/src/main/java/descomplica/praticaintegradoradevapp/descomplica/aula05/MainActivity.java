package descomplica.praticaintegradoradevapp.descomplica.aula05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ciclo de vida", "onStart invocado");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ciclo de vida", "onResume invocado");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ciclo de vida", "onPause invocado");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ciclo de vida", "onStop invocado");
    }
     @Override
     protected  void onRestart(){
        super.onRestart();
         Log.d("ciclo de vida", "onRestart invocado");
     }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ciclo de vida", "onDestroy invocado");
    }




}
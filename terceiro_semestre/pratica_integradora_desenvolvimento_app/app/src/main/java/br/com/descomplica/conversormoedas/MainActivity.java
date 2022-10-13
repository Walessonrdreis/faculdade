package br.com.descomplica.conversormoedas;

import static androidx.recyclerview.widget.RecyclerView.*;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static br.com.descomplica.conversormoedas.R.id.edit_value;
import static br.com.descomplica.conversormoedas.R.id.text_euro;
import static br.com.descomplica.conversormoedas.R.id.button_calculate;
import static br.com.descomplica.conversormoedas.R.id.text_dollar;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

   private ViewHolder mViewHolder = new ViewHolder() ;

   private static class ViewHolder {
       EditText editValue;
       TextView textDollar;
       TextView textEuro;
       Button buttonCalculate;
   }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.mViewHolder.editValue = findViewById(edit_value);
        this.mViewHolder.textDollar = findViewById(text_dollar);
        this.mViewHolder.textEuro = findViewById(text_euro);
        this.mViewHolder.buttonCalculate = findViewById(button_calculate);

        this.mViewHolder.buttonCalculate.setOnClickListener(this);
        this.clearValues();
    }

    private void clearValues() {
       this.mViewHolder.textDollar.setText("");
       this.mViewHolder.textEuro.setText("");
    }

    @Override
    public void onClick(View view) {
       int id = view.getId();
       if(id == button_calculate){
           Double value =
                   Double.valueOf(this.mViewHolder.editValue.getText().toString());
           this.mViewHolder.textDollar.setText(String.format("%.2f", value * 5));
           this.mViewHolder.textEuro.setText(String.format("%.2f", value * 6));



       }
        
    }
}
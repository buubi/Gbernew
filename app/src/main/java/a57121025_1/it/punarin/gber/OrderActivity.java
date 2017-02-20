package a57121025_1.it.punarin.gber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class OrderActivity extends AppCompatActivity {
    Button btnConfirm;
    Spinner spGas;
    RadioButton rdDont,rdHave;
    TextView tvTotalprice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        spGas = (Spinner)findViewById(R.id.spGas);
        btnConfirm = (Button)findViewById(R.id.btnConfirm);
        rdDont = (RadioButton)findViewById(R.id.rdDont);
        rdHave = (RadioButton) findViewById(R.id.rdHave);

        int totalprice = 0;
        if(spGas.getSelectedItemPosition()==0){
            totalprice+=250;
            if(rdDont.isChecked()){
                totalprice+=1800;
            }
            tvTotalprice.setText(totalprice+"");
        }
        else if(spGas.getSelectedItemPosition()==1){
            totalprice+=400;
            if(rdDont.isChecked()){
                totalprice+=2300;
            }
            tvTotalprice.setText(totalprice+"");
        }
        else if(spGas.getSelectedItemPosition()==2){
            totalprice+=1100;
            if(rdDont.isChecked()){
                totalprice+=4300;
            }
            tvTotalprice.setText(totalprice+"");

        }
        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}

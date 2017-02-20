package a57121025_1.it.punarin.gber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText edUserre,edPassre,edPassre2,edAddress,edFirst,edLast;
    Button btnSub,btnCan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        edUserre = (EditText) findViewById(R.id.edUserre);
        edPassre = (EditText) findViewById(R.id.edPassre);
        edPassre2 = (EditText) findViewById(R.id.edPassre2);
        edFirst = (EditText) findViewById(R.id.edFirst);
        edLast = (EditText) findViewById(R.id.edLast);

        if(edUserre.length()==0) {
            if(edPassre.length()==0){
                if(edPassre2.length()==0){
                    if(edFirst.length()==0){
                        if(edLast.length()==0){
                            if(edAddress.length()==0){

                            }
                        }
                    }
                }
            }
        }








//        if(edUserre.length()<8){ //Username ที่สมัครต้องมากกว่า 8 ตัว
//            Toast.makeText(RegisterActivity.this,"Please Enter your User more than 8 Lenght",Toast.LENGTH_LONG);
//        }
//        if(edPassre!=edPassre2){
//            Toast.makeText(RegisterActivity.this,"Password is not same",Toast.LENGTH_LONG);
//        }

    }
}

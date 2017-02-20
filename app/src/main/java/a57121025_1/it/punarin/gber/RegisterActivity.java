package a57121025_1.it.punarin.gber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
<<<<<<< HEAD
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText edUserre,edPassre,edPassre2,edAddress,edFirst,edLast;
    Button btnSub,btnCan;

=======
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {
    EditText edt_Userregis,edt_Passregis,edt_Fnameregis,edt_Lnameregis;
>>>>>>> refs/remotes/origin/master
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
<<<<<<< HEAD
        edUserre = (EditText) findViewById(R.id.edUserre);
        edPassre = (EditText) findViewById(R.id.edPassre);
        edPassre2 = (EditText) findViewById(R.id.edPassre2);
        edFirst = (EditText) findViewById(R.id.edFirst);
        edLast = (EditText) findViewById(R.id.edLast);

        if(edUserre.length()==0) {
            Toast.makeText(RegisterActivity.this,"Please Enter Username",Toast.LENGTH_LONG);
            if(edPassre.length()==0){
                Toast.makeText(RegisterActivity.this,"Please Enter Password",Toast.LENGTH_LONG);
                if(edPassre2.length()==0){
                    Toast.makeText(RegisterActivity.this,"Please Enter Confirm Password",Toast.LENGTH_LONG);
                    if(edFirst.length()==0){
                        Toast.makeText(RegisterActivity.this,"Please Enter FirstName",Toast.LENGTH_LONG);
                        if(edLast.length()==0){
                            Toast.makeText(RegisterActivity.this,"Please Enter LastName",Toast.LENGTH_LONG);
                            if(edAddress.length()==0){
                                Toast.makeText(RegisterActivity.this,"Please Enter Address",Toast.LENGTH_LONG);

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

=======
        // TODO: 2/9/2017 AD : Tel Button and EditText
>>>>>>> refs/remotes/origin/master
    }
}

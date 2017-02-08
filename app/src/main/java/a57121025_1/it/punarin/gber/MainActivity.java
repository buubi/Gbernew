package a57121025_1.it.punarin.gber;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button btnUser,btnRegis,btnSub,btnCan,btnLogin;
    EditText edUser,edPass,edUserre,edPassre,edPassre2;
    ImageView imLogo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Dialog regis = new Dialog(MainActivity.this);
        regis.setContentView(R.layout.activity_register);


        btnUser = (Button) findViewById(R.id.btnLogin);
        btnRegis = (Button) findViewById(R.id.btnRegis);
        btnSub = (Button) regis.findViewById(R.id.btnSubmit);
        btnCan = (Button) regis.findViewById(R.id.btnCancel);
        btnLogin = (Button) findViewById(R.id.btnLogin);

        edUser = (EditText) findViewById(R.id.edUser);
        edPass = (EditText) findViewById(R.id.edPass);
        edUserre = (EditText) regis.findViewById(R.id.edUserre);
        edPassre = (EditText) regis.findViewById(R.id.edPassre);
        edPassre2 = (EditText) regis.findViewById(R.id.edPassre2);

        imLogo = (ImageView) findViewById(R.id.imLogo);



        btnRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent regis = new Intent(MainActivity.this,RegisterActivity.class);
                startActivity(regis);
            }
        });



        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String DeUser = "User";
                String DePass = "Pass";
                String FromUser = edUser.getText().toString();
                String FromPass = edPass.getText().toString();
                List<NameValuePair> nv = new ArrayList<NameValuePair>();
                HttpClient hc = new DefaultHttpClient();
                HttpPost hp = new HttpPost("http//:punarin.coolpage.biz/android/login.php");
                HttpResponse hr;
                BufferedReader bf;
                String data = "";
                nv.add(new BasicNameValuePair("username",FromUser));
                nv.add(new BasicNameValuePair("password",FromUser));
                try {
                    hp.setEntity(new UrlEncodedFormEntity(nv));
                    hr = hc.execute(hp);
                    bf = new BufferedReader(new InputStreamReader(hr.getEntity().getContent()));
                    data = bf.readLine();
                    JSONArray jsonArray = new JSONArray(data);
                    JSONObject jObject = new JSONObject();
                    for(int i =0;i<jsonArray.length();i++){
                        jObject = jsonArray.getJSONObject(i);
                        if(jObject.getString("username").equals(edUser.getText().toString())&&jObject.getString("password").equals(edPass.getText().toString())){
                            Toast.makeText(MainActivity.this, "Welcome "+jObject.getString("full_name"), Toast.LENGTH_SHORT).show();
                            Intent myIntent = new Intent(MainActivity.this,OrderActivity.class);
                            startActivity(myIntent);
                        }
                        else
                            Toast.makeText(MainActivity.this, "Error Login", Toast.LENGTH_SHORT).show();

                    }
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                } catch (ClientProtocolException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (JSONException e) {
                    e.printStackTrace();
                }


                if(DeUser==FromUser||DePass==FromPass){
                    if (FromUser!=DeUser){
                        Toast.makeText(MainActivity.this,"User ไม่ถูกต้อง",Toast.LENGTH_LONG).show();
                    }
                    if (DePass!=FromPass){
                        Toast.makeText(MainActivity.this,"Pass ไม่ถูกต้อง",Toast.LENGTH_LONG).show();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this,"ยินดีต้อนรับสู่ Gber",Toast.LENGTH_LONG).show();
                    Intent Map = new Intent(MainActivity.this,MainMap.class);
                    startActivity(Map);
                }
            }
        });




    }
}

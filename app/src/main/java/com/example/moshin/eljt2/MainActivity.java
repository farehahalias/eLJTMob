package com.example.moshin.eljt2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

//import com.valdesekamdem.library.mdtoast.MDToast;

//import com.medialablk.easytoast.EasyToast;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    public static EditText txtUsername, txtPassword;
    public static String username,password,userId = "";

    // User Session Manager Class
//    UserSessionManager session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        // User Session
//        session = new UserSessionManager(getApplicationContext());

        txtUsername = (EditText) findViewById(R.id.editTextId);
        txtPassword = (EditText) findViewById(R.id.editTextPassword);
        Button btnLogin = (Button) findViewById(R.id.BtnLogin);

        // untuk testing
        txtUsername.setText("218");
        txtPassword.setText("111");


        // Login button
        btnLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                // Get username, password from EditText
                username = txtUsername.getText().toString();
                password = txtPassword.getText().toString();

                //validate password and user id == betul
                if(username.trim().length() > 0 && password.trim().length() > 0){

//                    AppCompatActivity a = ;
//                    FetchDataHome process = new FetchDataHome("login");
//                    process.execute();


                        if(password.equals("111")){
//                        if(result.equalsIgnoreCase("success")){

                            // Creating user login session
                            // Statically storing name="Android Example"
                            // and email="androidexample84@gmail.com"
//                        session.createUserLoginSession("Android Example", "androidexample84@gmail.com");

                            // Starting MainActivity
                            Intent i = new Intent(getApplicationContext(), MenuActivityAct.class);
                            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

                            // Add new Flag to start new Activity
                            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            startActivity(i);

                            finish();

                        }else{

                            // user id ngn password tak match //keluarkan toast
                            Toast mdToast = Toast.makeText(getApplicationContext() , "Username/Password is incorrect" , Toast.LENGTH_SHORT);
                            mdToast.show();

                        }

                }else{
                    //kalo user tak masuk apa2 id 0r pass
                    if(username.isEmpty() && password.isEmpty()) {

                        Toast mdToast = Toast.makeText(getApplicationContext() , "Please enter your Username and Password" , Toast.LENGTH_SHORT);
                        mdToast.show();
//



                    }
                    else{
                        txtUsername.setError(null);
                    }

//                    if(password.isEmpty()){
//                        Toast.makeText(getApplicationContext(), "Please enter your Password", Toast.LENGTH_LONG).show();
//                    }
//                    else{
//                        txtPassword.setError(null);
//                    }

                }

            }
        });

    }


    public void Testing(String result){
//        if(username.equals("218") && password.equals("111")){
            if(result.equalsIgnoreCase("success")){

            // Creating user login session
            // Statically storing name="Android Example"
            // and email="androidexample84@gmail.com"
//                        session.createUserLoginSession("Android Example", "androidexample84@gmail.com");

            // Starting MainActivity
            Intent i = new Intent(getBaseContext(), MenuActivityAct.class);
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

            // Add new Flag to start new Activity
            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(i);

            finish();

        }else{

            // user id ngn password tak match //keluarkan toast
                Toast mdToast = Toast.makeText(getApplicationContext() , "Username/Password is incorrect" , Toast.LENGTH_SHORT);
            mdToast.show();

        }
    }


}
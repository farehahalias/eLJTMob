package com.example.moshin.eljt2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    EditText txtUsername, txtPassword;

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


        // Login button
        btnLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                // Get username, password from EditText
                String username = txtUsername.getText().toString();
                String password = txtPassword.getText().toString();

                //validate password and user id == betul
                if(username.trim().length() > 0 && password.trim().length() > 0){

                    // untuk testing
                    // user ID = admin
                    // password = admin

                    if(username.equals("admin") && password.equals("admin")){

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
                        Toast.makeText(getApplicationContext(), "Username/Password is incorrect", Toast.LENGTH_LONG).show();

                    }
                }else{
                    //kalo user tak masuk apa2 id 0r pass
                    if(username.isEmpty()) {
                        txtUsername.setError("Please enter your User ID");
                    }
                    else{
                        txtUsername.setError(null);
                    }

                    if(password.isEmpty()){
                        txtPassword.setError("Please enter your Password");
                    }
                    else{
                        txtPassword.setError(null);
                    }

                }

            }
        });
    }
}
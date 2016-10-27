package com.example.gsauth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class GroupChoices extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_choices);
        toasterrr();



    }

    public void toasterrr(){

        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        //String name = user.getDisplayName();
        //Uri photoUrl = user.getPhotoUrl();

        String email = user.getEmail();

        //Toast toast = new Toast(getApplicationContext());

        Toast.makeText(getApplicationContext(), "Welcome " + email,
                Toast.LENGTH_LONG).show();
    }




}

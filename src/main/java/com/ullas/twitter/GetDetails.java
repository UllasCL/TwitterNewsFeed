package com.ullas.twitter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GetDetails extends AppCompatActivity
{
    Button User;
    TextView screenName;
    public String username;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_details);

        User=(Button)findViewById(R.id.getDetail);
        screenName=(TextView)findViewById(R.id.UserId);

        username=getIntent().getStringExtra("username");
        screenName.setText(username);

        User.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(GetDetails.this,dummy.class);
                intent.putExtra("username",username);
                startActivity(intent);
            }
        });
    }
}

package com.example.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.os.AsyncTask;
import android.widget.Toast;

//import com.example.android.myapplication.model.PersonInfo;
//import com.example.android.myapplication.network.RetrofitClientInstance;

import java.util.List;
import retrofit2.Response;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    Button sort_by_name, sort_by_age;
    private RecyclerView my_recycler_view;
    TextView peopleList;
    PersonInfo newList = new PersonInfo();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sort_by_name = (Button) findViewById(R.id.sort_by_name);
        sort_by_age = (Button) findViewById(R.id.sort_by_age);
        my_recycler_view = (RecyclerView) findViewById(R.id.my_recycler_view);
        peopleList = (TextView) findViewById(R.id.peopleList);

        peopleList.setText(newList.getData());

        sort_by_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        sort_by_age.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });
    }

}

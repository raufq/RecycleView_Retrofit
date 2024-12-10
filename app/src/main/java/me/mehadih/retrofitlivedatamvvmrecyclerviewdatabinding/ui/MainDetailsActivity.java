package me.mehadih.retrofitlivedatamvvmrecyclerviewdatabinding.ui;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import me.mehadih.retrofitlivedatamvvmrecyclerviewdatabinding.R;
import me.mehadih.retrofitlivedatamvvmrecyclerviewdatabinding.model.User;

public class MainDetailsActivity extends AppCompatActivity {

    @SuppressLint({"MissingInflatedId", "LocalSuppress"})
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.main_detail_activity);

         User user = (User) getIntent().getSerializableExtra("data");

        TextView schoolName = findViewById(R.id.schoolname);
        TextView city = findViewById(R.id.city);
        TextView schoolemail = findViewById(R.id.schoolemail);

        schoolName.setText(user.getName());
        schoolemail.setText(user.getEmail());
        city.setText(user.getUsername());
    }

}

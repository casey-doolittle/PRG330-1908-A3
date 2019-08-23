package edu.stevenshenager.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity {

    private Cart cart = new Cart();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                ((Button)view).setText("Hi mom");
                Toast toast = Toast.makeText(view.getContext(), "Clicked", Toast.LENGTH_SHORT);
                toast.show();
                setContentView(R.layout.store);
            }
        });

        ImageView imageview = findViewById(R.id.imageView4);
        imageview.setOnClickListener(new ElementClick());
    }

    public void helloClick(View view) {
        Toast toast = Toast.makeText(view.getContext(), "Hello from a method", Toast.LENGTH_SHORT);
        toast.show();
        cart.addDetail(new Detail("Hello", new BigDecimal("94.00"), new BigDecimal("2")));
    }

    public void showTotal(View view) {
        Toast toast = Toast.makeText(view.getContext(), "Order total: " + cart.total(), Toast.LENGTH_SHORT);
        toast.show();
    }
}

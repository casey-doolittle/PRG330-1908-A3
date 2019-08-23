package edu.stevenshenager.assignment3;

import android.view.View;
import android.widget.Toast;

public class ElementClick implements View.OnClickListener {
    @Override
    public void onClick(View view) {
        Toast toast = Toast.makeText(view.getContext(), "Hello from a click listener class", Toast.LENGTH_SHORT);
        toast.show();
    }
}

package in.ac.vit.sriharrsha.lab2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void add(View v){
        EditText num1=(EditText)findViewById(R.id.editText);
        EditText num2=(EditText)findViewById(R.id.editText2);
        TextView ans=(TextView)findViewById(R.id.sumView);
        ans.setText(Integer.toString(Integer.parseInt(num1.getText().toString())+Integer.parseInt(num2.getText().toString())));
    }
}

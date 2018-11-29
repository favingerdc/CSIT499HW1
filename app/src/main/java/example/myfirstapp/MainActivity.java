package example.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button NEBUTTON;
    private Button SEBUTTON;
    private Button SWBUTTON;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = (TextView) findViewById(R.id.buttonText);
        NEBUTTON = (Button) findViewById(R.id.NEButton);
        SEBUTTON = (Button) findViewById(R.id.SEButton);
        SWBUTTON = (Button) findViewById(R.id.SWButton);

        NEBUTTON.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                txt.setText("This is the North East campus, the buildings here include; the Student Union, the East and West Centennial Towers, Conrad Hall, Martin Hall, as well as Antelope Hall.");
            }
        });
        SEBUTTON.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                txt.setText("This is the South East Campus, the buildings here include; Copeland Hall, Student Affairs Building, the Library, Warner Hall, Bruner Hall, Fine Arts Building, Thomas Hall, Mens Hall, Randall and Mantor, as well as Otto Olsen.");
            }
        });
        SWBUTTON.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                txt.setText("This is the South West Campus, the buildings here include; Cushing, Health and Sports Center, North Residence, Education Building, South Residence, West Center, as well as the Health Science Complex. ");
            }
        });
    }
}

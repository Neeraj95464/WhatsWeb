package sivani2020.blogspot.www;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//    WebView webView;
    Button button1,button2,button3,button4,button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=findViewById(R.id.secondActivity1);
        button2=findViewById(R.id.secondActivity2);
        button3=findViewById(R.id.secondActivity3);
        button4=findViewById(R.id.secondActivity4);
        button5=findViewById(R.id.secondActivity5);

            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                    Intent intent = new Intent(MainActivity.this,MainActivity1.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, "Main 1", Toast.LENGTH_SHORT).show();
                    }catch (Exception e){
                        Toast.makeText(MainActivity.this, "problem  "+e, Toast.LENGTH_SHORT).show();
                    }
                }
            });



        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Main 2", Toast.LENGTH_SHORT).show();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity3.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Main 3", Toast.LENGTH_SHORT).show();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity4.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Main 4", Toast.LENGTH_SHORT).show();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity5.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Main 5", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
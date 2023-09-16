package papaya.in.sendmail;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SendMail mail = new SendMail("parktownmedical", "whvn nwob foug ohly",
                "salmanfarizs@gmail.com",
                "Testing Email Sending",
                "Yes, it's working well\nI will use it always.","/Users/salmanfariz/Desktop/SendMail-master/app/src/main/res/drawable/ic_launcher_background.xml");

        findViewById(R.id.sendMail).setOnClickListener(v -> mail.execute());
    }
}
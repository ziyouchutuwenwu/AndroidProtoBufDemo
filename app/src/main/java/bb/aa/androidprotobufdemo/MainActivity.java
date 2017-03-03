package bb.aa.androidprotobufdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        byte[] familyBytes = FamilyCodec.encode();
        My.Family family = FamilyCodec.decode(familyBytes);

        System.out.println(family.getPerson(0).getName());
    }
}

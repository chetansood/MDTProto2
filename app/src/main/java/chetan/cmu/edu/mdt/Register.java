package chetan.cmu.edu.mdt;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toolbar;

public class Register extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    }

}

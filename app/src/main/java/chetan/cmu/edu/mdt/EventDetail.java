package chetan.cmu.edu.mdt;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toolbar;

public class EventDetail extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    }
}
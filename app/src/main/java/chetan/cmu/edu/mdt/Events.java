package chetan.cmu.edu.mdt;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Events extends AppCompatActivity {

    // intialize events
    public static String[] listEvents = {"Ballet Dance","Salsa Dance","Sean's Speech","Chill Out at Heinz","Free Dunkin Donuts","Ask me for Dance"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        List<String> x = new ArrayList<String>();
        x.addAll(Arrays.asList(listEvents));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_events);
        ListAdapter adapter = new ArrayAdapter<String>(this, R.layout.simplerow, x);

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);

    }

}

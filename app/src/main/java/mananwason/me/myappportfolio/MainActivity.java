package mananwason.me.myappportfolio;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment implements View.OnClickListener {

        Button button1;
        Button button2;
        Button button3;
        Button button4;
        Button button5;
        Button button6;

        public PlaceholderFragment() {
        }

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }

        @Override
        public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
            super.onViewCreated(view, savedInstanceState);
            button1 = (Button) getActivity().findViewById(R.id.button1);
            button2 = (Button) getActivity().findViewById(R.id.button2);
            button3 = (Button) getActivity().findViewById(R.id.button3);
            button4 = (Button) getActivity().findViewById(R.id.button4);
            button5 = (Button) getActivity().findViewById(R.id.button5);
            button6 = (Button) getActivity().findViewById(R.id.button6);
            button1.setOnClickListener(this);
            button2.setOnClickListener(this);
            button3.setOnClickListener(this);
            button4.setOnClickListener(this);
            button5.setOnClickListener(this);
            button6.setOnClickListener(this);


        }

        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.button1:
                    Toast.makeText(getContext(), button1.getText().toString(), Toast.LENGTH_SHORT).show();
                    break;
                case R.id.button2:
                    Toast.makeText(getContext(), button2.getText().toString(), Toast.LENGTH_SHORT).show();
                    break;
                case R.id.button3:
                    Toast.makeText(getContext(), button3.getText().toString(), Toast.LENGTH_SHORT).show();
                    break;
                case R.id.button4:
                    Toast.makeText(getContext(), button4.getText().toString(), Toast.LENGTH_SHORT).show();
                    break;
                case R.id.button5:
                    Toast.makeText(getContext(), button5.getText().toString(), Toast.LENGTH_SHORT).show();
                    break;
                case R.id.button6:
                    Toast.makeText(getContext(), button6.getText().toString(), Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    }
}

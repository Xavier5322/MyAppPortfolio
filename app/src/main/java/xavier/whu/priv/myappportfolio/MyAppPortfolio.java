package xavier.whu.priv.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MyAppPortfolio extends AppCompatActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_app_portfolio);
        ((Button)findViewById(R.id.bt_mediaStreamer)).setOnClickListener(this);
        ((Button)findViewById(R.id.bt_scoreApp)).setOnClickListener(this);
        ((Button)findViewById(R.id.bt_libraryApp)).setOnClickListener(this);
        ((Button)findViewById(R.id.bt_buildItBigger)).setOnClickListener(this);
        ((Button)findViewById(R.id.bt_xyzReader)).setOnClickListener(this);
        ((Button)findViewById(R.id.bt_capstone)).setOnClickListener(this);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_mediaStreamer:
                Toast.makeText(this,getString(R.string.show_media_streamer),Toast.LENGTH_SHORT).show();
                break;
            case R.id.bt_scoreApp:
                Toast.makeText(this,getString(R.string.show_super_duo1),Toast.LENGTH_SHORT).show();
                break;
            case R.id.bt_libraryApp:
                Toast.makeText(this,getString(R.string.show_super_duo2),Toast.LENGTH_SHORT).show();
                break;
            case R.id.bt_buildItBigger:
                Toast.makeText(this,getString(R.string.show_ant_terminator),Toast.LENGTH_SHORT).show();
                break;
            case R.id.bt_xyzReader:
                Toast.makeText(this,getString(R.string.show_materialize),Toast.LENGTH_SHORT).show();
                break;
            case R.id.bt_capstone:
                Toast.makeText(this,getString(R.string.show_capstone),Toast.LENGTH_SHORT).show();
                break;
        }
    }

}

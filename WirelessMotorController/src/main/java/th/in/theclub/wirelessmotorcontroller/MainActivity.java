package th.in.theclub.wirelessmotorcontroller;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.view.View.OnClickListener;
import android.os.Handler;
import android.os.Message;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.util.Log;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends ActionBarActivity implements OnClickListener {

    //spinner variable
    private Spinner spnDutyDC1,spnDutyDC2,spnDutySV1,spnDutySV2;
    private String[] dutyDC1,dutyDC2,dutySV1,dutySV2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialWiget();

        //spinner
        dutyDC1 = getResources().getStringArray(R.array.dc_duty_cycle);
        ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, dutyDC1);
        dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnDutyDC1.setAdapter(dataAdapter1);

        dutyDC2 = getResources().getStringArray(R.array.dc_duty_cycle);
        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, dutyDC2);
        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnDutyDC2.setAdapter(dataAdapter2);

        dutySV1 = getResources().getStringArray(R.array.servo_duty_cycle);
        ArrayAdapter<String> dataAdapter3 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, dutySV1);
        dataAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnDutySV1.setAdapter(dataAdapter3);

        dutySV2 = getResources().getStringArray(R.array.servo_duty_cycle);
        ArrayAdapter<String> dataAdapter4 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, dutySV2);
        dataAdapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnDutySV2.setAdapter(dataAdapter4);
        //end spinner
    }//end onCreate

    private void initialWiget() {
        spnDutyDC1 = (Spinner) findViewById(R.id.spnDutyDC1);
        spnDutyDC2 = (Spinner) findViewById(R.id.spnDutyDC2);
        spnDutySV1 = (Spinner) findViewById(R.id.spnDutySV1);
        spnDutySV2 = (Spinner) findViewById(R.id.spnDutySV2);
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
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void onClick(View src) {

    }

}

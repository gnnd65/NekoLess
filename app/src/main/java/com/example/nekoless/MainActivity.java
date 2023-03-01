package com.example.nekoless;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    private MenuItem menuItem;
    private BluetoothAdapter bluetoothAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        menuItem = menu.findItem(R.id.bt_btn);
        setBtIcon();
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.bt_btn){

        }
        return super.onOptionsItemSelected(item);
    }

    private void setBtIcon(){
        if (bluetoothAdapter.isEnabled()){
            menuItem.setIcon(R.drawable.ic_bt_off);
        } else {
            menuItem.setIcon(R.drawable.ic_bt_on);
        }
    }

    private void enableBt(){
        Intent intent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
    }
}

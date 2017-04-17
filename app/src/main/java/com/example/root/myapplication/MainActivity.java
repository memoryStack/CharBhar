package com.example.root.myapplication;

        import android.app.AlertDialog;
        import android.app.Notification;
        import android.bluetooth.BluetoothAdapter;
        import android.bluetooth.BluetoothDevice;
        import android.bluetooth.BluetoothHeadset;
        import android.content.BroadcastReceiver;
        import android.content.Context;
        import android.content.DialogInterface;
        import android.content.Intent;
        import android.content.IntentFilter;
        import android.os.Bundle;
        import android.app.Activity;
        import android.support.v7.app.AppCompatActivity;
        import android.util.DisplayMetrics;
        import android.view.Menu;
        import android.view.MenuInflater;
        import android.view.View;
        import android.widget.Button;

        import java.util.Set;
        import java.util.logging.Handler;

public class MainActivity extends /*AppCompat*/Activity{
    public static int height,width;
    public static int density;
    private static String instruction_string;
    private static int  REQUEST_ENABLE_BT=1;
    //private BluetoothClass mConnectThread = null;
    private BluetoothDevice mDevice=null;
    public static BluetoothHeadset mBluetoothHeadset;

    // Get the default adapter
    public static BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DisplayMetrics displaymetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        height = displaymetrics.heightPixels;
        width = displaymetrics.widthPixels;
        density=displaymetrics.densityDpi;
        instruction_string="There are two players. 9 pieces of a similar colour for first player and 9 pieces of another colour for second player."+
                " Start the game by putting a piece in any corner of the diagram turn wise." +
                " You have to try to make a line by putting your piece in a row, either horizontally or vertically.(Bhar)." +
                "After placing all pieces you can move your pieces only corners which are connected to present filled corner"+
                " If you are able to make a ''Bhar' you can take one of the piece of the another player out of the game.(Char). " +
                "The player who is able to 'char' seven pieces of the opposite player first will be the winner.";
        Button btn_show = (Button) findViewById(R.id.instructions_button);
        btn_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                //Open popup window
                showPopup();
            }
        });

        // bluetooth work .......

        /*if (mBluetoothAdapter == null) {
            // Device does not support Bluetooth
        }

        if (!mBluetoothAdapter.isEnabled()) {
            Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            startActivityForResult(enableBtIntent, REQUEST_ENABLE_BT);
        }

        Set<BluetoothDevice> pairedDevices = mBluetoothAdapter.getBondedDevices();

        if (pairedDevices.size() > 0) {
            // There are paired devices. Get the name and address of each paired device.
            for (BluetoothDevice device : pairedDevices) {
                mDevice=device;
                String deviceName = device.getName();
                String deviceHardwareAddress = device.getAddress(); // MAC address
            }
        }

        mConnectThread = new BluetoothClass(mDevice);
        mConnectThread.start();*/
        /* Register for broadcasts when a device is discovered.
        IntentFilter filter = new IntentFilter(BluetoothDevice.ACTION_FOUND);
        registerReceiver(mReceiver, filter);
        // making app discoverable ...
        Intent discoverableIntent =
                new Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);
        discoverableIntent.putExtra(BluetoothAdapter.EXTRA_DISCOVERABLE_DURATION, 300);
        startActivity(discoverableIntent);*/


    }

    /*
    // Create a BroadcastReceiver for ACTION_FOUND.
    private final BroadcastReceiver mReceiver = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (BluetoothDevice.ACTION_FOUND.equals(action)) {
                // Discovery has found a device. Get the BluetoothDevice
                // object and its info from the Intent.
                BluetoothDevice device = intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE);
                String deviceName = device.getName();
                String deviceHardwareAddress = device.getAddress(); // MAC address
            }
        }
    };*/

    /*@Override
    protected void onDestroy() {
        super.onDestroy();

        // Don't forget to unregister the ACTION_FOUND receiver.
        unregisterReceiver(mReceiver);
    }*/
    /*@Override
    protected void onActivityResult(){

    }*/
    /* Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Notification.MessagingStyle.Message msg) {
            byte[] writeBuf = (byte[]) msg.obj;
            int begin = (int) msg.arg1;
            int end = (int) msg.arg2;
            switch (msg.what) {
                case 1:
                    String writeMessage = new String(writeBuf);
                    writeMessage = writeMessage.substring(begin, end);
                    break;
            }
        }
    };*/



    public void game_start(View view){
        Intent i = new Intent(this,GameActivity.class);
        startActivity(i);
    }

    public void showPopup(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage(instruction_string);
        alertDialogBuilder.setNegativeButton("Close",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.setCancelable(false);
        alertDialog.show();
    }


}



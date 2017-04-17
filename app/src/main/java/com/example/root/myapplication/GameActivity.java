package com.example.root.myapplication;

        import android.app.Activity;
        import android.content.DialogInterface;
        import android.support.v7.app.AlertDialog;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.LayoutInflater;
        import android.view.Menu;
        import android.view.MenuInflater;
        import android.view.MenuItem;

public class GameActivity extends AppCompatActivity {
    public static String msg;
    public static int new_game_indicator=0;
    CanvasView game_object = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        game_object = (CanvasView) findViewById(R.id.canvas_view);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.new_game_menu:
                    new_game_indicator=1;
                    game_object.new_game_preparation();
                    new_game_indicator=0;
                return true;
            default:
            return super.onOptionsItemSelected(item);
        }
    }

    public void open_up(){
        System.out.println("anuj1");
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        System.out.println("anuj4");
        alertDialogBuilder.setMessage(msg);
        System.out.println("anuj5");

        alertDialogBuilder.setPositiveButton("Play Again!",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                    }
                });
        alertDialogBuilder.setNegativeButton("Quit!",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.setCancelable(false);
        alertDialog.show();


    }
 }

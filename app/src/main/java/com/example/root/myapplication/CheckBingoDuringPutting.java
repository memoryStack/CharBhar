package com.example.root.myapplication;


        import android.app.Dialog;
        import android.app.DialogFragment;
        import android.content.DialogInterface;
        import android.graphics.Color;
        import android.os.Bundle;
        import android.support.v7.app.AlertDialog;

        import static com.example.root.myapplication.CanvasView.mBitmap;
        import static com.example.root.myapplication.CanvasView.mark;
        import static com.example.root.myapplication.CanvasView.x_cordinate_cases;
        import static com.example.root.myapplication.CanvasView.y_cordinate_cases;
        import static com.example.root.myapplication.CanvasView.eat_blue;
        import static com.example.root.myapplication.CanvasView.eat_red;
        import static com.example.root.myapplication.GameActivity.msg;

public class CheckBingoDuringPutting extends DialogFragment{
    void bingo() {
        int[] pixel = new int[24];
        pixel[0] = mBitmap.getPixel((int)x_cordinate_cases[0],(int) y_cordinate_cases[0]);
        pixel[1] = mBitmap.getPixel((int)x_cordinate_cases[3],(int) y_cordinate_cases[0]);
        pixel[2] = mBitmap.getPixel((int)x_cordinate_cases[6], (int) y_cordinate_cases[0]);

        pixel[3] = mBitmap.getPixel((int)x_cordinate_cases[1], (int) y_cordinate_cases[1]);
        pixel[4] = mBitmap.getPixel((int)x_cordinate_cases[3],(int) y_cordinate_cases[1]);
        pixel[5] = mBitmap.getPixel((int)x_cordinate_cases[5], (int) y_cordinate_cases[1]);

        pixel[6] = mBitmap.getPixel((int)x_cordinate_cases[2], (int) y_cordinate_cases[2]);
        pixel[7] = mBitmap.getPixel((int)x_cordinate_cases[3], (int) y_cordinate_cases[2]);
        pixel[8] = mBitmap.getPixel((int)x_cordinate_cases[4], (int) y_cordinate_cases[2]);

        pixel[9] = mBitmap.getPixel((int)x_cordinate_cases[0], (int) y_cordinate_cases[3]);
        pixel[10] = mBitmap.getPixel((int)x_cordinate_cases[1], (int) y_cordinate_cases[3]);
        pixel[11] = mBitmap.getPixel((int)x_cordinate_cases[2], (int) y_cordinate_cases[3]);

        pixel[12] = mBitmap.getPixel((int)x_cordinate_cases[4], (int) y_cordinate_cases[3]);
        pixel[13] = mBitmap.getPixel((int)x_cordinate_cases[5], (int) y_cordinate_cases[3]);
        pixel[14] = mBitmap.getPixel((int)x_cordinate_cases[6], (int) y_cordinate_cases[3]);

        pixel[15] = mBitmap.getPixel((int)x_cordinate_cases[2], (int) y_cordinate_cases[4]);
        pixel[16] = mBitmap.getPixel((int)x_cordinate_cases[3], (int) y_cordinate_cases[4]);
        pixel[17] = mBitmap.getPixel((int)x_cordinate_cases[4], (int) y_cordinate_cases[4]);

        pixel[18] = mBitmap.getPixel((int)x_cordinate_cases[1], (int) y_cordinate_cases[5]);
        pixel[19] = mBitmap.getPixel((int)x_cordinate_cases[3], (int) y_cordinate_cases[5]);
        pixel[20] = mBitmap.getPixel((int)x_cordinate_cases[5], (int) y_cordinate_cases[5]);

        pixel[21] = mBitmap.getPixel((int)x_cordinate_cases[0],(int) y_cordinate_cases[6]);
        pixel[22] = mBitmap.getPixel((int)x_cordinate_cases[3], (int) y_cordinate_cases[6]);
        pixel[23] = mBitmap.getPixel((int)x_cordinate_cases[6], (int) y_cordinate_cases[6]);

        if (pixel[0] == pixel[1] && pixel[0] == pixel[2]&&mark[0]==0) {
            if (pixel[0] == Color.RED) {
                mark[0]=1;
                eat_blue = 1;
            }
            if (pixel[0] == Color.BLUE) {
                mark[0]=1;
                eat_red = 1;
            }
        }if ((((pixel[0] != pixel[1])||(pixel[0] != pixel[2]))||((pixel[1] != pixel[2])))&&mark[0]==1) {mark[0]=0;}

        if (pixel[3] == pixel[4] && pixel[3] == pixel[5]&&mark[1]==0) {
            if (pixel[3] == Color.RED) {
                mark[1]=1;
                eat_blue = 1;
            }
            if (pixel[3] == Color.BLUE){
                eat_red = 1;
                mark[1]=1;
            }
        }if ((((pixel[3] != pixel[4])||(pixel[3] != pixel[5]))||((pixel[4] != pixel[5])))&&mark[1]==1) {mark[1]=0;}

        if (pixel[6] == pixel[7] && pixel[6] == pixel[8]&&mark[2]==0) {
            if (pixel[6] == Color.RED) {
                mark[2]=1;
                eat_blue = 1;
            }
            if (pixel[6]==Color.BLUE) {
                eat_red = 1;
                mark[2]=1;
            }
        }if ((((pixel[6] != pixel[7])||(pixel[6] != pixel[8]))||((pixel[7] != pixel[8])))&&mark[2]==1) {mark[2]=0;}

        if (pixel[9] == pixel[10] && pixel[9] == pixel[11]&&mark[3]==0) {
            if (pixel[9] == Color.RED) {
                eat_blue = 1;
                mark[3]=1;
            }
            if (pixel[9] == Color.BLUE) {
                eat_red = 1;
                mark[3]=1;
            }
        }if ((((pixel[9] != pixel[10])||(pixel[10] != pixel[11]))||((pixel[9] != pixel[11])))&&mark[3]==1) {mark[3]=0;}

        if (pixel[12] == pixel[13] && pixel[12] == pixel[14]&&mark[4]==0) {
            if (pixel[12] == Color.RED) {
                eat_blue = 1;
                mark[4]=1;
            }
            if (pixel[12] == Color.BLUE) {
                eat_red = 1;
                mark[4]=1;
            }
        }if ((((pixel[12] != pixel[13])||(pixel[13] != pixel[14]))||((pixel[12] != pixel[14])))&&mark[4]==1) {mark[4]=0;}

        if (pixel[15] == pixel[16] && pixel[15] == pixel[17]&&mark[5]==0) {
            if (pixel[15] == Color.RED) {
                eat_blue = 1;
                mark[5]=1;
            }
            if (pixel[15] == Color.BLUE) {
                eat_red = 1;
                mark[5]=1;
            }
        }if ((((pixel[15] != pixel[16])||(pixel[16] != pixel[17]))||((pixel[15] != pixel[17])))&&mark[5]==1) {mark[5]=0;}

        if (pixel[18] == pixel[19] && pixel[18] == pixel[20]&&mark[6]==0) {
            if (pixel[18] == Color.RED) {
                mark[6]=1;
                eat_blue = 1;
            }
            if (pixel[18] == Color.BLUE) {
                eat_red = 1;
                mark[6]=1;
            }
        }if ((((pixel[18] != pixel[19])||(pixel[19] != pixel[20]))||((pixel[18] != pixel[20])))&&mark[6]==1) {mark[6]=0;}

        if (pixel[21] == pixel[22] && pixel[21] == pixel[23]&&mark[7]==0) {
            if (pixel[21] == Color.RED) {
                eat_blue = 1;
                mark[7]=1;
            }
            if (pixel[21] == Color.BLUE) {
                eat_red = 1;
                mark[7]=1;
            }
        }if ((((pixel[21] != pixel[22])||(pixel[21] != pixel[23]))||((pixel[22] != pixel[23])))&&mark[7]==1) {mark[7]=0;}

        if (pixel[0] == pixel[9] && pixel[0] == pixel[21]&&mark[8]==0) {
            if (pixel[0] == Color.RED) {
                eat_blue = 1;
                mark[8]=1;
            }
            if (pixel[0] == Color.BLUE) {
                eat_red = 1;
                mark[8]=1;
            }
        }if ((((pixel[0] != pixel[9])||(pixel[0] != pixel[21]))||((pixel[9] != pixel[21])))&&mark[8]==1) {mark[8]=0;}

        if (pixel[3] == pixel[10] && pixel[3] == pixel[18]&&mark[9]==0) {
            if (pixel[3] == Color.RED) {
                eat_blue = 1;
                mark[9]=1;
            }
            if (pixel[3] == Color.BLUE) {
                eat_red = 1;
                mark[9]=1;
            }
        }if ((((pixel[3] != pixel[10])||(pixel[3] != pixel[18]))||((pixel[10] != pixel[18])))&&mark[9]==1) {mark[9]=0;}

        if (pixel[6] == pixel[11] && pixel[6] == pixel[15]&&mark[10]==0) {
            if (pixel[6] == Color.RED) {
                eat_blue = 1;
                mark[10]=1;
            }
            if (pixel[6] == Color.BLUE) {
                eat_red = 1;
                mark[10]=1;
            }
        }if ((((pixel[6] != pixel[11])||(pixel[6] != pixel[15]))||((pixel[11] != pixel[15])))&&mark[10]==1) {mark[10]=0;}

        if (pixel[1] == pixel[4] && pixel[1] == pixel[7]&&mark[11]==0) {
            if (pixel[1] == Color.RED) {
                eat_blue = 1;
                mark[11]=1;
            }
            if (pixel[1] == Color.BLUE) {
                eat_red = 1;
                mark[11]=1;
            }
        }if ((((pixel[1] != pixel[4])||(pixel[1] != pixel[7]))||((pixel[4] != pixel[7])))&&mark[11]==1) {mark[11]=0;}

        if (pixel[16] == pixel[19] && pixel[16] == pixel[22]&&mark[12]==0) {
            if (pixel[16] == Color.RED) {
                eat_blue = 1;
                mark[12]=1;
            }
            if (pixel[16] == Color.BLUE) {
                eat_red = 1;
                mark[12]=1;
            }
        }if ((((pixel[16] != pixel[19])||(pixel[16] != pixel[22]))||((pixel[22] != pixel[19])))&&mark[12]==1) {mark[12]=0;}

        if (pixel[8] == pixel[12] && pixel[8] == pixel[17]&&mark[13]==0) {
            if (pixel[8] == Color.RED) {
                eat_blue = 1;
                mark[13]=1;
            }
            if (pixel[8] == Color.BLUE) {
                eat_red = 1;
                mark[13]=1;
            }
        }if ((((pixel[8] != pixel[12])||(pixel[8] != pixel[17]))||((pixel[12] != pixel[17])))&&mark[13]==1) {mark[13]=0;}

        if (pixel[5] == pixel[13] && pixel[5] == pixel[20]&&mark[14]==0) {
            if (pixel[5] == Color.RED) {
                eat_blue = 1;
                mark[14]=1;
            }
            if (pixel[5] == Color.BLUE) {
                eat_red = 1;
                mark[14]=1;
            }
        }if ((((pixel[5] != pixel[13])||(pixel[5] != pixel[20]))||((pixel[13] != pixel[20])))&&mark[14]==1) {mark[14]=0;}

        if (pixel[2] == pixel[14] && pixel[2] == pixel[23]&&mark[15]==0) {
            if (pixel[2] == Color.RED) {
                eat_blue = 1;
                mark[15]=1;
            }
            if (pixel[2] == Color.BLUE) {
                eat_red = 1;
                mark[15]=1;
            }
        }if ((((pixel[2] != pixel[14])||(pixel[2] != pixel[23]))||((pixel[14] != pixel[23])))&&mark[15]==1) {mark[15]=0;}

    }

    //////////////////////////////////////
    //if(){
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the Builder class for convenient dialog construction
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage(msg)
                .setPositiveButton("Play Again!", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // FIRE ZE MISSILES!
                    }
                })
                .setNegativeButton("Quit!", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // User cancelled the dialog
                    }
                });
        // Create the AlertDialog object and return it
        return builder.create();
    }
    //}
}

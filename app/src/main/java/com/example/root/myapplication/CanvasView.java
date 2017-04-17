package com.example.root.myapplication;

import java.util.Vector;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import static com.example.root.myapplication.GameActivity.msg;
import static com.example.root.myapplication.GameActivity.new_game_indicator;
import static com.example.root.myapplication.MainActivity.height;
import static com.example.root.myapplication.MainActivity.width;

public class CanvasView extends View {
    GameActivity gameActivity;

    public static Vector x_1 = new Vector();
    public static Vector y_1 = new Vector();
    public static Vector x_2 = new Vector();
    public static Vector y_2 = new Vector();
    public static int no_of_red=0,no_of_blue=0;
    public static int[]  mark= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    public static final Paint player1_paint = new Paint();
    public static final Paint player2_paint = new Paint();
    Paint line = new Paint();

    public static boolean previous_red_moved = false, previous_blue_moved = false, red_selected = false, blue_selected = false;
    public static int  prev_x, prev_y, next_x, next_y,no_of_touch_to_put_dot =0;
    public static int top_y=3*(height/10),top_x=width/8;
    public static float x_gap=top_x;
    public static float y_gap=x_gap;
    public static float ball_size=x_gap/5f;
    public static int temp_x, temp_y;
    public static int first_red_selected_indicator=0,eat_red=0,eat_blue=0,l = 0, g = 0, pixel,flag_to_move = 0;
    public static final float x_cordinate_cases[] = new float[7];
    public static final float y_cordinate_cases[] = new float[7];
    public static Bitmap mBitmap = null;
    Canvas bitmapCanvas = null;
    set_co_ordinate set_co = new set_co_ordinate();

    public CanvasView(Context context){
        super(context);
        System.out.println("i am in Context conext...");
        gameActivity = (GameActivity) context;
        init();
    }

    public CanvasView(Context context, AttributeSet attrs) {
        super(context, attrs);
        gameActivity = (GameActivity) context;
        init();
        System.out.println("i am in CanvasView...");
    }

    public void init() {
        System.out.println("i am in init...");
        no_of_touch_to_put_dot=0;
        flag_to_move = 0;
        g = 0;
        l = 0;
        first_red_selected_indicator=0;
        eat_red=0;
        eat_blue=0;
        top_y=3*(height/10);
        top_x=width/8;
        x_gap=top_x;
        y_gap=x_gap;
        previous_red_moved = false;
        previous_blue_moved = false;
        red_selected = false;
        blue_selected = false;

        x_cordinate_cases[0] = top_x;
        y_cordinate_cases[0] = top_y;

        for (int i = 1; i < 7; i++) {
            x_cordinate_cases[i] = x_cordinate_cases[i - 1] + x_gap;
            y_cordinate_cases[i] = y_cordinate_cases[i - 1] + y_gap;
        }

        player1_paint.setAntiAlias(true);
        player1_paint.setColor(Color.RED);
        player1_paint.setStyle(Paint.Style.FILL);
        player2_paint.setAntiAlias(true);
        player2_paint.setColor(Color.BLUE);
        player2_paint.setStyle(Paint.Style.FILL);
        line.setAntiAlias(true);
        line.setColor(Color.WHITE);
        line.setStyle(Paint.Style.STROKE);
        line.setStrokeWidth(width/100);

    }

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        mBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        bitmapCanvas = new Canvas(mBitmap);
        canvas.drawColor(Color.WHITE, PorterDuff.Mode.CLEAR);

        bitmapCanvas.drawRect(x_cordinate_cases[0],y_cordinate_cases[0],x_cordinate_cases[6],y_cordinate_cases[6],line);
        bitmapCanvas.drawRect(x_cordinate_cases[1],y_cordinate_cases[1],x_cordinate_cases[5],y_cordinate_cases[5],line);
        bitmapCanvas.drawRect(x_cordinate_cases[2],y_cordinate_cases[2],x_cordinate_cases[4],y_cordinate_cases[4],line);
        bitmapCanvas.drawLine(x_cordinate_cases[3],y_cordinate_cases[0],x_cordinate_cases[3],y_cordinate_cases[2],line);
        bitmapCanvas.drawLine(x_cordinate_cases[4],y_cordinate_cases[3],x_cordinate_cases[6],y_cordinate_cases[3],line);
        bitmapCanvas.drawLine(x_cordinate_cases[3],y_cordinate_cases[4],x_cordinate_cases[3],y_cordinate_cases[6],line);
        bitmapCanvas.drawLine(x_cordinate_cases[0],y_cordinate_cases[3],x_cordinate_cases[2],y_cordinate_cases[3],line);

        int vec1_size=x_1.size();
        int vec2_size=x_2.size();

        System.out.println("i am in invalidate...");

        for (int i = 0; i < vec1_size; i++) {
            int x1= (int) x_1.get(i);
            int y1= (int) y_1.get(i);
            bitmapCanvas.drawCircle(x1,y1,ball_size,player1_paint);
        }

        for (int i = 0; i < vec2_size; i++) {
            int x2= (int) x_2.get(i);
            int y2= (int) y_2.get(i);
            bitmapCanvas.drawCircle(x2,y2,ball_size,player2_paint);
        }

        canvas.drawBitmap(mBitmap,0,0,null);

        if(no_of_touch_to_put_dot <= 18&&no_of_touch_to_put_dot!=0){
            CheckBingoDuringPutting check_bingo= new CheckBingoDuringPutting();
            check_bingo.bingo();
        }

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction() & MotionEvent.ACTION_MASK) {
            case MotionEvent.ACTION_DOWN:
                no_of_touch_to_put_dot++;
                temp_x = (int) event.getX();
                temp_y = (int) event.getY();
                find_center();
                break;
            case MotionEvent.ACTION_UP:
                break;
            case MotionEvent.ACTION_POINTER_UP:
                break;
            case MotionEvent.ACTION_POINTER_DOWN:
                break;
            case MotionEvent.ACTION_MOVE:
                break;
        }
        return true;
    }

    public void find_center(){
        SettingCenter.precise_center(temp_x, temp_y);
        pixel = mBitmap.getPixel(temp_x, temp_y);
        if (g == 0) {
            if(no_of_touch_to_put_dot<=18)
                no_of_touch_to_put_dot--;
        }
        else{
            if (no_of_touch_to_put_dot <=18) {// this has been handled ....
                if (eat_blue == 1 || eat_red == 1) {// we have to eat
                    if (pixel == Color.RED && eat_red == 1) {
                        no_of_touch_to_put_dot--;
                        CheckBingo bingo_check = new CheckBingo();
                        bingo_check.hide_cordinate();
                        eat_red = 0;
                        invalidate();
                    }
                    if (pixel == Color.BLUE && eat_blue == 1) {
                        no_of_touch_to_put_dot--;
                        CheckBingo bingo_check = new CheckBingo();
                        bingo_check.hide_cordinate();
                        eat_blue = 0;
                        invalidate();
                    }
                    //color_change_indicator=1;
                }
                else {
                    if (((pixel == Color.RED || pixel == Color.BLUE) && (eat_blue == 0 || eat_red == 0))) {// means we have to draw on occupied space
                        no_of_touch_to_put_dot--;
                    }
                    if ((pixel != Color.RED && pixel != Color.BLUE)) {
                        set_co.setting_cordinate();// means another ball is added to field...
                    }
                }
                if(eat_blue == 1 || eat_red == 1)
                    no_of_touch_to_put_dot--;
            }
            else{

                //if(((pixel == Color.RED || pixel == Color.BLUE) && (eat_blue == 0 && eat_red == 0))){

                int j = 0;

                if (!red_selected && !blue_selected) {
                    handle_selection();
                    j++;
                }

                if((((previous_red_moved)&&(red_selected))||(((previous_blue_moved)&&(blue_selected))))&&(eat_red == 0 && eat_blue == 0)){
                    red_selected=false;
                    blue_selected=false;
                }

                if (((red_selected || blue_selected) && (eat_red == 0 && eat_blue == 0) && j == 0)&&((pixel != Color.RED && pixel != Color.BLUE))) {
                    handle_moving();
                }

                if (((red_selected || blue_selected) && (eat_red == 0 && eat_blue == 0) && j == 0)&&((pixel == Color.RED && pixel == Color.BLUE))) {
                    red_selected=false;
                    blue_selected=false;
                }

                if (eat_red == 1 || eat_blue == 1) {
                    handle_eating();

                    if (no_of_blue == 2 || no_of_red == 2 || new_game_indicator == 1) {
                        new_game_preparation();
                    }

            //    }
            }
            }
        }
        g=0;
        l=0;
    }

    public class set_co_ordinate {
        void setting_cordinate() {
            if (no_of_touch_to_put_dot % 2 == 0) {
                x_2.addElement(temp_x);
                y_2.addElement(temp_y);
            }
            if (no_of_touch_to_put_dot % 2 != 0) {
                x_1.addElement(temp_x);
                y_1.addElement(temp_y);
            }
            invalidate();
        }
    }

    public void change_red_position() {
        MoveClass.update_co_ordinate(prev_x, prev_y, next_x, next_y);
        invalidate();
        CheckBingo bingo_check=new CheckBingo();
        bingo_check.bingo();
        red_selected=false;
        blue_selected=false;
        previous_red_moved=true;
        previous_blue_moved=false;
    }

    public void change_blue_position() {
        MoveClass.update_co_ordinate(prev_x, prev_y, next_x, next_y);
        invalidate();
        CheckBingo bingo_check=new CheckBingo();
        bingo_check.bingo();
        blue_selected=false;
        red_selected=false;
        previous_red_moved=false;
        previous_blue_moved=true;
    }

    public void handle_eating(){
        if (eat_red == 1 && red_selected) {
            CheckBingo bingo_check = new CheckBingo();
            bingo_check.hide_cordinate();
            red_selected = false;
            eat_red = 0;
            invalidate();
            if (no_of_red == 2) {
                msg="Player2 Won!";
            }
        }

        if (eat_blue == 1 && blue_selected) {
            CheckBingo bingo_check = new CheckBingo();
            bingo_check.hide_cordinate();
            blue_selected = false;
            eat_blue = 0;
            invalidate();
            if (no_of_blue == 2) {
                msg="Player1 Won!";
            }
        }

    }

    public void handle_moving(){
        next_x = temp_x;
        next_y = temp_y;
        flag_to_move = 0;
        MoveClass.next_step(prev_x, prev_y, next_x, next_y);
        if(flag_to_move==1) {
            if (red_selected) {
                change_red_position();
                red_selected=false;
            }
            if (blue_selected){
                change_blue_position();
                blue_selected=false;
            }
        }
        else{
            red_selected=false;
            blue_selected=false;
        }
    }

    public void handle_selection(){
        if(first_red_selected_indicator==0) {// this will ensure that first ball will be selected with red color ...
            if (pixel == Color.RED) {
                first_red_selected_indicator = 1;
                prev_x = temp_x;
                prev_y = temp_y;
                red_selected = true;
            }
        }
        else{
            // this if condition will take care if any ball is not selected ...
            if(!blue_selected&&!red_selected){//this will select ball if no ball is selected ...
                if(eat_blue==1||eat_red==1){
                    if(eat_blue==1){
                        blue_selected = true;
                    }
                    if(eat_red==1){
                        red_selected = true;
                    }
                }
                else{
                    // select to move (first tap or tap on previous coordinates).....
                    if (pixel == Color.BLUE) {
                        prev_x = temp_x;
                        prev_y = temp_y;
                        blue_selected = true;
                    }
                    if (pixel == Color.RED) {
                        prev_x = temp_x;
                        prev_y = temp_y;
                        red_selected = true;
                    }
                }
            }
        }
    }

    public void new_game_preparation(){
        x_1.clear();
        x_2.clear();
        y_1.clear();
        y_2.clear();
        invalidate();
        System.out.println("anuj3");
        mBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        bitmapCanvas = new Canvas(mBitmap);
        bitmapCanvas.drawColor(Color.BLACK, PorterDuff.Mode.CLEAR);
        init();
        if(new_game_indicator!=1){
            System.out.println("anuj2");
            gameActivity.open_up();
        }
        invalidate();

    }

}

package com.example.root.myapplication;


        import static com.example.root.myapplication.CanvasView.ball_size;
        import static com.example.root.myapplication.CanvasView.x_cordinate_cases;
        import static com.example.root.myapplication.CanvasView.y_cordinate_cases;
        import static com.example.root.myapplication.CanvasView.l;
        import static com.example.root.myapplication.CanvasView.temp_x;
        import static com.example.root.myapplication.CanvasView.temp_y;
        import static com.example.root.myapplication.CanvasView.g;

class SettingCenter {

    static  void precise_center(int x, int y){

        if((x>=x_cordinate_cases[0]-(2*ball_size)&&x<=x_cordinate_cases[0]+(2*ball_size))&&(y>=y_cordinate_cases[0]-(2*ball_size)&&y<=y_cordinate_cases[0]+(2*ball_size))){
            l=1;
            temp_x=(int) x_cordinate_cases[0];
            temp_y=(int) y_cordinate_cases[0];
        }
        if((x>=x_cordinate_cases[3]-(2*ball_size)&&x<=x_cordinate_cases[3]+(2*ball_size))&&(y>=y_cordinate_cases[0]-(2*ball_size)&&y<=y_cordinate_cases[0]+(2*ball_size))){
            l=1;
            temp_x=(int) x_cordinate_cases[3];
            temp_y=(int) y_cordinate_cases[0];
        }
        if((x>=x_cordinate_cases[6]-(2*ball_size)&&x<=x_cordinate_cases[6]+(2*ball_size))&&(y>=y_cordinate_cases[0]-(2*ball_size)&&y<=y_cordinate_cases[0]+(2*ball_size))){
            l=1;
            temp_x=(int) x_cordinate_cases[6];
            temp_y=(int) y_cordinate_cases[0];
        }
        if((x>=x_cordinate_cases[1]-(2*ball_size)&&x<=x_cordinate_cases[1]+(2*ball_size))&&(y>=y_cordinate_cases[1]-(2*ball_size)&&y<=y_cordinate_cases[1]+(2*ball_size))){
            l=1;
            temp_x=(int) x_cordinate_cases[1];
            temp_y=(int) y_cordinate_cases[1];
        }
        if((x>=x_cordinate_cases[3]-(2*ball_size)&&x<=x_cordinate_cases[3]+(2*ball_size))&&(y>=y_cordinate_cases[1]-(2*ball_size)&&y<=y_cordinate_cases[1]+(2*ball_size))){
            l=1;
            temp_x=(int) x_cordinate_cases[3];
            temp_y=(int) y_cordinate_cases[1];
        }
        if((x>=x_cordinate_cases[5]-(2*ball_size)&&x<=x_cordinate_cases[5]+(2*ball_size))&&(y>=y_cordinate_cases[1]-(2*ball_size)&&y<=y_cordinate_cases[1]+(2*ball_size))){
            l=1;
            temp_x=(int) x_cordinate_cases[5];
            temp_y=(int) y_cordinate_cases[1];
        }
        if((x>=x_cordinate_cases[2]-(2*ball_size)&&x<=x_cordinate_cases[2]+(2*ball_size))&&(y>=y_cordinate_cases[2]-(2*ball_size)&&y<=y_cordinate_cases[2]+(2*ball_size))){
            l=1;
            temp_x=(int) x_cordinate_cases[2];
            temp_y=(int) y_cordinate_cases[2];
        }
        if((x>=x_cordinate_cases[3]-(2*ball_size)&&x<=x_cordinate_cases[3]+(2*ball_size))&&(y>=y_cordinate_cases[2]-(2*ball_size)&&y<=y_cordinate_cases[2]+(2*ball_size))){
            l=1;
            temp_x=(int) x_cordinate_cases[3];
            temp_y=(int) y_cordinate_cases[2];
        }
        if((x>=x_cordinate_cases[4]-(2*ball_size)&&x<=x_cordinate_cases[4]+(2*ball_size))&&(y>=y_cordinate_cases[2]-(2*ball_size)&&y<=y_cordinate_cases[2]+(2*ball_size))){
            l=1;
            temp_x=(int) x_cordinate_cases[4];
            temp_y=(int) y_cordinate_cases[2];
        }
        if((x>=x_cordinate_cases[0]-(2*ball_size)&&x<=x_cordinate_cases[0]+(2*ball_size))&&(y>=y_cordinate_cases[3]-(2*ball_size)&&y<=y_cordinate_cases[3]+(2*ball_size))){
            l=1;
            temp_x=(int) x_cordinate_cases[0];
            temp_y=(int) y_cordinate_cases[3];
        }
        if((x>=x_cordinate_cases[1]-(2*ball_size)&&x<=x_cordinate_cases[1]+(2*ball_size))&&(y>=y_cordinate_cases[3]-(2*ball_size)&&y<=y_cordinate_cases[3]+(2*ball_size))){
            l=1;
            temp_x=(int) x_cordinate_cases[1];
            temp_y=(int) y_cordinate_cases[3];
        }
        if((x>=x_cordinate_cases[2]-(2*ball_size)&&x<=x_cordinate_cases[2]+(2*ball_size))&&(y>=y_cordinate_cases[3]-(2*ball_size)&&y<=y_cordinate_cases[3]+(2*ball_size))){
            l=1;
            temp_x=(int) x_cordinate_cases[2];
            temp_y=(int) y_cordinate_cases[3];
        }
        if((x>=x_cordinate_cases[4]-(2*ball_size)&&x<=x_cordinate_cases[4]+(2*ball_size))&&(y>=y_cordinate_cases[3]-(2*ball_size)&&y<=y_cordinate_cases[3]+(2*ball_size))){
            l=1;
            temp_x=(int) x_cordinate_cases[4];
            temp_y=(int) y_cordinate_cases[3];
        }
        if((x>=x_cordinate_cases[5]-(2*ball_size)&&x<=x_cordinate_cases[5]+(2*ball_size))&&(y>=y_cordinate_cases[3]-(2*ball_size)&&y<=y_cordinate_cases[3]+(2*ball_size))){
            l=1;
            temp_x=(int) x_cordinate_cases[5];
            temp_y=(int) y_cordinate_cases[3];
        }
        if((x>=x_cordinate_cases[6]-(2*ball_size)&&x<=x_cordinate_cases[6]+(2*ball_size))&&(y>=y_cordinate_cases[3]-(2*ball_size)&&y<=y_cordinate_cases[3]+(2*ball_size))){
            l=1;
            temp_x=(int) x_cordinate_cases[6];
            temp_y=(int) y_cordinate_cases[3];
        }
        if((x>=x_cordinate_cases[2]-(2*ball_size)&&x<=x_cordinate_cases[2]+(2*ball_size))&&(y>=y_cordinate_cases[4]-(2*ball_size)&&y<=y_cordinate_cases[4]+(2*ball_size))){
            l=1;
            temp_x=(int) x_cordinate_cases[2];
            temp_y=(int) y_cordinate_cases[4];
        }
        if((x>=x_cordinate_cases[3]-(2*ball_size)&&x<=x_cordinate_cases[3]+(2*ball_size))&&(y>=y_cordinate_cases[4]-(2*ball_size)&&y<=y_cordinate_cases[4]+(2*ball_size))){
            l=1;
            temp_x=(int) x_cordinate_cases[3];
            temp_y=(int) y_cordinate_cases[4];
        }
        if((x>=x_cordinate_cases[4]-(2*ball_size)&&x<=x_cordinate_cases[4]+(2*ball_size))&&(y>=y_cordinate_cases[4]-(2*ball_size)&&y<=y_cordinate_cases[4]+(2*ball_size))){
            l=1;
            temp_x=(int) x_cordinate_cases[4];
            temp_y=(int) y_cordinate_cases[4];
        }
        if((x>=x_cordinate_cases[1]-(2*ball_size)&&x<=x_cordinate_cases[1]+(2*ball_size))&&(y>=y_cordinate_cases[5]-(2*ball_size)&&y<=y_cordinate_cases[5]+(2*ball_size))){
            l=1;
            temp_x=(int) x_cordinate_cases[1];
            temp_y=(int) y_cordinate_cases[5];
        }
        if((x>=x_cordinate_cases[3]-(2*ball_size)&&x<=x_cordinate_cases[3]+(2*ball_size))&&(y>=y_cordinate_cases[5]-(2*ball_size)&&y<=y_cordinate_cases[5]+(2*ball_size))){
            l=1;
            temp_x=(int) x_cordinate_cases[3];
            temp_y=(int) y_cordinate_cases[5];
        }
        if((x>=x_cordinate_cases[5]-(2*ball_size)&&x<=x_cordinate_cases[5]+(2*ball_size))&&(y>=y_cordinate_cases[5]-(2*ball_size)&&y<=y_cordinate_cases[5]+(2*ball_size))){
            l=1;
            temp_x=(int) x_cordinate_cases[5];
            temp_y=(int) y_cordinate_cases[5];
        }
        if((x>=x_cordinate_cases[0]-(2*ball_size)&&x<=x_cordinate_cases[0]+(2*ball_size))&&(y>=y_cordinate_cases[6]-(2*ball_size)&&y<=y_cordinate_cases[6]+(2*ball_size))){
            l=1;
            temp_x=(int) x_cordinate_cases[0];
            temp_y=(int) y_cordinate_cases[6];
        }
        if((x>=x_cordinate_cases[3]-(2*ball_size)&&x<=x_cordinate_cases[3]+(2*ball_size))&&(y>=y_cordinate_cases[6]-(2*ball_size)&&y<=y_cordinate_cases[6]+(2*ball_size))){
            l=1;
            temp_x=(int) x_cordinate_cases[3];
            temp_y=(int) y_cordinate_cases[6];
        }
        if((x>=x_cordinate_cases[6]-(2*ball_size)&&x<=x_cordinate_cases[6]+(2*ball_size))&&(y>=y_cordinate_cases[6]-(2*ball_size)&&y<=y_cordinate_cases[6]+(2*ball_size))){
            l=1;
            temp_x=(int) x_cordinate_cases[6];
            temp_y=(int) y_cordinate_cases[6];
        }
        if(l==1){
            g=2;
        }
    }
}



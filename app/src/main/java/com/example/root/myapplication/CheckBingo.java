package com.example.root.myapplication;

        import android.graphics.Color;
        import android.graphics.Point;
        import static com.example.root.myapplication.CanvasView.mBitmap;
        import static com.example.root.myapplication.CanvasView.next_x;
        import static com.example.root.myapplication.CanvasView.next_y;
        import static com.example.root.myapplication.CanvasView.no_of_blue;
        import static com.example.root.myapplication.CanvasView.no_of_red;
        import static com.example.root.myapplication.CanvasView.temp_x;
        import static com.example.root.myapplication.CanvasView.temp_y;
        import static com.example.root.myapplication.CanvasView.x_1;
        import static com.example.root.myapplication.CanvasView.x_2;
        import static com.example.root.myapplication.CanvasView.x_cordinate_cases;
        import static com.example.root.myapplication.CanvasView.y_1;
        import static com.example.root.myapplication.CanvasView.y_2;
        import static com.example.root.myapplication.CanvasView.y_cordinate_cases;
        import static com.example.root.myapplication.CanvasView.eat_blue;
        import static com.example.root.myapplication.CanvasView.eat_red;

// checked completely ...
class CheckBingo {
    void bingo(){
        int [] pixel=new int [24];
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

        Point next_point=new Point(next_x,next_y);
        Point a;
        Point b;
        Point c;
        if(pixel[0]==pixel[1]&&pixel[0]==pixel[2]){
            a=new Point((int)x_cordinate_cases[0],(int)y_cordinate_cases[0]);
            b=new Point((int)x_cordinate_cases[3],(int)y_cordinate_cases[0]);
            c=new Point((int)x_cordinate_cases[6],(int)y_cordinate_cases[0]);
            if((next_point.x==a.x&&next_point.y==a.y)||(next_point.x==b.x&&next_point.y==b.y)||(next_point.x==c.x&&next_point.y==c.y)){
                if(pixel[0]== Color.RED){
                    eat_blue=1;
                }
                if(pixel[0]== Color.BLUE){
                    eat_red=1;
                }
            }
        }

        if(pixel[3]==pixel[4]&&pixel[3]==pixel[5]){
            a=new Point((int)x_cordinate_cases[1],(int)y_cordinate_cases[1]);
            b=new Point((int)x_cordinate_cases[3],(int)y_cordinate_cases[1]);
            c=new Point((int)x_cordinate_cases[5],(int)y_cordinate_cases[1]);
            if((next_point.x==a.x&&next_point.y==a.y)||(next_point.x==b.x&&next_point.y==b.y)||(next_point.x==c.x&&next_point.y==c.y)){
                if(pixel[3]== Color.RED){
                    eat_blue=1;
                }
                if(pixel[3]== Color.BLUE)
                    eat_red=1;{
                }
            }
        }

        if(pixel[6]==pixel[7]&&pixel[6]==pixel[8]){
            a=new Point((int)x_cordinate_cases[2],(int)y_cordinate_cases[2]);
            b=new Point((int)x_cordinate_cases[3],(int)y_cordinate_cases[2]);
            c=new Point((int)x_cordinate_cases[4],(int)y_cordinate_cases[2]);
            if((next_point.x==a.x&&next_point.y==a.y)||(next_point.x==b.x&&next_point.y==b.y)||(next_point.x==c.x&&next_point.y==c.y)){
                if(pixel[6]== Color.RED){
                    eat_blue=1;
                }
                if(pixel[6]== Color.BLUE){
                    eat_red=1;
                }
            }
        }
        if(pixel[9]==pixel[10]&&pixel[9]==pixel[11]){
            a=new Point((int)x_cordinate_cases[0],(int)y_cordinate_cases[3]);
            b=new Point((int)x_cordinate_cases[1],(int)y_cordinate_cases[3]);
            c=new Point((int)x_cordinate_cases[2],(int)y_cordinate_cases[3]);
            if((next_point.x==a.x&&next_point.y==a.y)||(next_point.x==b.x&&next_point.y==b.y)||(next_point.x==c.x&&next_point.y==c.y)){
                if(pixel[9]== Color.RED){
                    eat_blue=1;
                }
                if(pixel[9]== Color.BLUE){
                    eat_red=1;
                }
            }
        }
        if(pixel[12]==pixel[13]&&pixel[12]==pixel[14]){
            a=new Point((int)x_cordinate_cases[4],(int)y_cordinate_cases[3]);
            b=new Point((int)x_cordinate_cases[5],(int)y_cordinate_cases[3]);
            c=new Point((int)x_cordinate_cases[6],(int)y_cordinate_cases[3]);
            if((next_point.x==a.x&&next_point.y==a.y)||(next_point.x==b.x&&next_point.y==b.y)||(next_point.x==c.x&&next_point.y==c.y)){
                if(pixel[12]==Color.RED){
                    eat_blue=1;
                }
                if(pixel[12]== Color.BLUE){
                    eat_red=1;
                }
            }
        }
        if(pixel[15]==pixel[16]&&pixel[15]==pixel[17]){
            a=new Point((int)x_cordinate_cases[2],(int)y_cordinate_cases[4]);
            b=new Point((int)x_cordinate_cases[3],(int)y_cordinate_cases[4]);
            c=new Point((int)x_cordinate_cases[4],(int)y_cordinate_cases[4]);
            if((next_point.x==a.x&&next_point.y==a.y)||(next_point.x==b.x&&next_point.y==b.y)||(next_point.x==c.x&&next_point.y==c.y)){
                if(pixel[15]== Color.RED){
                    eat_blue=1;
                }
                if(pixel[15]== Color.BLUE){
                    eat_red=1;
                }
            }
        }
        if(pixel[18]==pixel[19]&&pixel[18]==pixel[20]){
            a=new Point((int)x_cordinate_cases[1],(int)y_cordinate_cases[5]);
            b=new Point((int)x_cordinate_cases[3],(int)y_cordinate_cases[5]);
            c=new Point((int)x_cordinate_cases[5],(int)y_cordinate_cases[5]);
            if((next_point.x==a.x&&next_point.y==a.y)||(next_point.x==b.x&&next_point.y==b.y)||(next_point.x==c.x&&next_point.y==c.y)){
                if(pixel[18]== Color.RED){
                    eat_blue=1;
                }
                if(pixel[18]== Color.BLUE){
                    eat_red=1;
                }
            }
        }
        if(pixel[21]==pixel[22]&&pixel[21]==pixel[23]){
            a=new Point((int)x_cordinate_cases[0],(int)y_cordinate_cases[6]);
            b=new Point((int)x_cordinate_cases[3],(int)y_cordinate_cases[6]);
            c=new Point((int)x_cordinate_cases[6],(int)y_cordinate_cases[6]);
            if((next_point.x==a.x&&next_point.y==a.y)||(next_point.x==b.x&&next_point.y==b.y)||(next_point.x==c.x&&next_point.y==c.y)){
                if(pixel[21]== Color.RED){
                    eat_blue=1;
                }
                if(pixel[21]== Color.BLUE){
                    eat_red=1;
                }
            }
        }
        // verify this part again ...
        if(pixel[0]==pixel[9]&&pixel[0]==pixel[21]){
            a=new Point((int)x_cordinate_cases[0],(int)y_cordinate_cases[0]);
            b=new Point((int)x_cordinate_cases[0],(int)y_cordinate_cases[3]);
            c=new Point((int)x_cordinate_cases[0],(int)y_cordinate_cases[6]);
            if((next_point.x==a.x&&next_point.y==a.y)||(next_point.x==b.x&&next_point.y==b.y)||(next_point.x==c.x&&next_point.y==c.y)){
                if(pixel[0]== Color.RED){
                    eat_blue=1;
                }
                if(pixel[0]== Color.BLUE){
                    eat_red=1;
                }
            }
        }
        if(pixel[3]==pixel[10]&&pixel[3]==pixel[18]){
            a=new Point((int)x_cordinate_cases[1],(int)y_cordinate_cases[1]);
            b=new Point((int)x_cordinate_cases[1],(int)y_cordinate_cases[3]);
            c=new Point((int)x_cordinate_cases[1],(int)y_cordinate_cases[5]);
            if((next_point.x==a.x&&next_point.y==a.y)||(next_point.x==b.x&&next_point.y==b.y)||(next_point.x==c.x&&next_point.y==c.y)){
                if(pixel[3]== Color.RED){
                    eat_blue=1;
                }
                if(pixel[3]== Color.BLUE){
                    eat_red=1;
                }
            }
        }
        if(pixel[6]==pixel[11]&&pixel[6]==pixel[15]){
            a=new Point((int)x_cordinate_cases[2],(int)y_cordinate_cases[2]);
            b=new Point((int)x_cordinate_cases[2],(int)y_cordinate_cases[3]);
            c=new Point((int)x_cordinate_cases[2],(int)y_cordinate_cases[4]);
            if((next_point.x==a.x&&next_point.y==a.y)||(next_point.x==b.x&&next_point.y==b.y)||(next_point.x==c.x&&next_point.y==c.y)){
                if(pixel[6]== Color.RED){
                    eat_blue=1;
                }
                if(pixel[6]== Color.BLUE){
                    eat_red=1;
                }
            }
        }
        if(pixel[1]==pixel[4]&&pixel[1]==pixel[7]){
            a=new Point((int)x_cordinate_cases[3],(int)y_cordinate_cases[0]);
            b=new Point((int)x_cordinate_cases[3],(int)y_cordinate_cases[1]);
            c=new Point((int)x_cordinate_cases[3],(int)y_cordinate_cases[2]);
            if((next_point.x==a.x&&next_point.y==a.y)||(next_point.x==b.x&&next_point.y==b.y)||(next_point.x==c.x&&next_point.y==c.y)){
                if(pixel[1]== Color.RED){
                    eat_blue=1;
                }
                if(pixel[1]== Color.BLUE){
                    eat_red=1;
                }
            }
        }//
        if(pixel[16]==pixel[19]&&pixel[16]==pixel[22]){
            a=new Point((int)x_cordinate_cases[3],(int)y_cordinate_cases[4]);
            b=new Point((int)x_cordinate_cases[3],(int)y_cordinate_cases[5]);
            c=new Point((int)x_cordinate_cases[3],(int)y_cordinate_cases[6]);
            if((next_point.x==a.x&&next_point.y==a.y)||(next_point.x==b.x&&next_point.y==b.y)||(next_point.x==c.x&&next_point.y==c.y)){
                if(pixel[16]== Color.RED){
                    eat_blue=1;
                }
                if(pixel[16]== Color.BLUE){
                    eat_red=1;
                }
            }
        }
        if(pixel[8]==pixel[12]&&pixel[8]==pixel[17]){
            a=new Point((int)x_cordinate_cases[4],(int)y_cordinate_cases[2]);
            b=new Point((int)x_cordinate_cases[4],(int)y_cordinate_cases[3]);
            c=new Point((int)x_cordinate_cases[4],(int)y_cordinate_cases[4]);
            if((next_point.x==a.x&&next_point.y==a.y)||(next_point.x==b.x&&next_point.y==b.y)||(next_point.x==c.x&&next_point.y==c.y)){
                if(pixel[8]== Color.RED){
                    eat_blue=1;
                }
                if(pixel[8]== Color.BLUE){
                    eat_red=1;
                }
            }
        }
        if(pixel[5]==pixel[13]&&pixel[5]==pixel[20]){
            a=new Point((int)x_cordinate_cases[5],(int)y_cordinate_cases[1]);
            b=new Point((int)x_cordinate_cases[5],(int)y_cordinate_cases[3]);
            c=new Point((int)x_cordinate_cases[5],(int)y_cordinate_cases[5]);
            if((next_point.x==a.x&&next_point.y==a.y)||(next_point.x==b.x&&next_point.y==b.y)||(next_point.x==c.x&&next_point.y==c.y)){
                if(pixel[5]== Color.RED){
                    eat_blue=1;
                }
                if(pixel[5]== Color.BLUE){
                    eat_red=1;
                }
            }
        }
        if(pixel[2]==pixel[14]&&pixel[2]==pixel[23]){
            a=new Point((int)x_cordinate_cases[6],(int)y_cordinate_cases[0]);
            b=new Point((int)x_cordinate_cases[6],(int)y_cordinate_cases[3]);
            c=new Point((int)x_cordinate_cases[6],(int)y_cordinate_cases[6]);
            if((next_point.x==a.x&&next_point.y==a.y)||(next_point.x==b.x&&next_point.y==b.y)||(next_point.x==c.x&&next_point.y==c.y)){
                if(pixel[2]== Color.RED){
                    eat_blue=1;
                }
                if(pixel[2]== Color.BLUE){
                    eat_red=1;
                }
            }
        }
    }

    void hide_cordinate(){
        if(eat_red ==1){
            int vec_size=x_1.size();
            for(int i=0;i<vec_size;i++){
                int x1= (int) x_1.get(i);
                int y1= (int) y_1.get(i);
                if(x1==temp_x&&y1==temp_y){
                    x_1.remove(i);
                    y_1.remove(i);
                    break;
                }
            }
            no_of_red=x_1.size();
            no_of_blue=x_2.size();
            System.out.println(no_of_red+"  red left");
        }
        if(eat_blue==1){
            int vec_size=x_2.size();
            for(int i=0;i<vec_size;i++){
                int x2= (int) x_2.get(i);
                int y2= (int) y_2.get(i);
                if(x2==temp_x&&y2==temp_y){
                    x_2.remove(i);
                    y_2.remove(i);
                    break;
                }
            }
            no_of_blue=x_2.size();
            no_of_red=x_1.size();
            System.out.println(no_of_blue+"  blue left");
        }
    }
}



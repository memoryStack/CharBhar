package com.example.root.myapplication;

        import android.graphics.Color;
        import static com.example.root.myapplication.CanvasView.blue_selected;
        import static com.example.root.myapplication.CanvasView.mBitmap;
        import static com.example.root.myapplication.CanvasView.previous_blue_moved;
        import static com.example.root.myapplication.CanvasView.previous_red_moved;
        import static com.example.root.myapplication.CanvasView.red_selected;
        import static com.example.root.myapplication.CanvasView.x_1;
        import static com.example.root.myapplication.CanvasView.x_2;
        import static com.example.root.myapplication.CanvasView.x_cordinate_cases;
        import static com.example.root.myapplication.CanvasView.y_1;
        import static com.example.root.myapplication.CanvasView.y_2;
        import static com.example.root.myapplication.CanvasView.y_cordinate_cases;
        import static com.example.root.myapplication.CanvasView.flag_to_move;

public class MoveClass {
    static void next_step(int x1, int y1, int x2, int y2){
        //2 choices
//        System.out.println("i came to chk valid move");
        if((x1==(int)x_cordinate_cases[0]&&y1==(int)y_cordinate_cases[0])&&((x2==(int)x_cordinate_cases[3]&&y2==(int)y_cordinate_cases[0])||(x2==(int)x_cordinate_cases[0]&&y2==(int)y_cordinate_cases[3]))){
            //System.out.println("anuj11");
            if((red_selected&&!previous_red_moved)||(blue_selected&&!previous_blue_moved)){
                flag_to_move=1;
            }
        }

        if((x1==(int)x_cordinate_cases[6]&&y1==(int)y_cordinate_cases[0])&&((x2==(int)x_cordinate_cases[3]&&y2==(int)y_cordinate_cases[0])||(x2==(int)x_cordinate_cases[6]&&y2==(int)y_cordinate_cases[3]))){
            //System.out.println("anuj12");
            if((red_selected&&!previous_red_moved)||(blue_selected&&!previous_blue_moved)){
                flag_to_move=1;
            }
        }

        if((x1==(int)x_cordinate_cases[1]&&y1==(int)y_cordinate_cases[1])&&((x2==(int)x_cordinate_cases[3]&&y2==(int)y_cordinate_cases[1])||(x2==(int)x_cordinate_cases[1]&&y2==(int)y_cordinate_cases[3]))){
            //System.out.println("anuj13");
            if((red_selected&&!previous_red_moved)||(blue_selected&&!previous_blue_moved)){
                flag_to_move=1;
            }
        }

        if((x1==(int)x_cordinate_cases[5]&&y1==(int)y_cordinate_cases[1])&&((x2==(int)x_cordinate_cases[3]&&y2==(int)y_cordinate_cases[1])||(x2==(int)x_cordinate_cases[5]&&y2==(int)y_cordinate_cases[3]))){
            //System.out.println("anuj14");
            if((red_selected&&!previous_red_moved)||(blue_selected&&!previous_blue_moved)){
                flag_to_move=1;
            }
        }

        if((x1==(int)x_cordinate_cases[2]&&y1==(int)y_cordinate_cases[2])&&((x2==(int)x_cordinate_cases[3]&&y2==(int)y_cordinate_cases[2])||(x2==(int)x_cordinate_cases[2]&&y2==(int)y_cordinate_cases[3]))){
            //System.out.println("anuj15");
            if((red_selected&&!previous_red_moved)||(blue_selected&&!previous_blue_moved)){
                flag_to_move=1;
            }
        }

        if((x1==(int)x_cordinate_cases[4]&&y1==(int)y_cordinate_cases[2])&&((x2==(int)x_cordinate_cases[3]&&y2==(int)y_cordinate_cases[2])||(x2==(int)x_cordinate_cases[4]&&y2==(int)y_cordinate_cases[3]))){
            //System.out.println("anuj16");
            if((red_selected&&!previous_red_moved)||(blue_selected&&!previous_blue_moved)){
                flag_to_move=1;
            }
        }

        if((x1==(int)x_cordinate_cases[2]&&y1==(int)y_cordinate_cases[4])&&((x2==(int)x_cordinate_cases[2]&&y2==(int)y_cordinate_cases[3])||(x2==(int)x_cordinate_cases[3]&&y2==(int)y_cordinate_cases[4]))){
            //System.out.println("anuj17");
            if((red_selected&&!previous_red_moved)||(blue_selected&&!previous_blue_moved)){
                flag_to_move=1;
            }
        }

        if((x1==(int)x_cordinate_cases[4]&&y1==(int)y_cordinate_cases[4])&&((x2==(int)x_cordinate_cases[4]&&y2==(int)y_cordinate_cases[3])||(x2==(int)x_cordinate_cases[3]&&y2==(int)y_cordinate_cases[4]))){
            //System.out.println("anuj18");
            if((red_selected&&!previous_red_moved)||(blue_selected&&!previous_blue_moved)){
                flag_to_move=1;
            }
        }

        if((x1==(int)x_cordinate_cases[1]&&y1==(int)y_cordinate_cases[5])&&((x2==(int)x_cordinate_cases[1]&&y2==(int)y_cordinate_cases[3])||(x2==(int)x_cordinate_cases[3]&&y2==(int)y_cordinate_cases[5]))){
            //System.out.println("anuj19");
            if((red_selected&&!previous_red_moved)||(blue_selected&&!previous_blue_moved)){
                flag_to_move=1;
            }
        }

        if((x1==(int)x_cordinate_cases[5]&&y1==(int)y_cordinate_cases[5])&&((x2==(int)x_cordinate_cases[3]&&y2==(int)y_cordinate_cases[5])||(x2==(int)x_cordinate_cases[5]&&y2==(int)y_cordinate_cases[3]))){
            //System.out.println("anuj20");
            if((red_selected&&!previous_red_moved)||(blue_selected&&!previous_blue_moved)){
                flag_to_move=1;
            }
        }

        if((x1==(int)x_cordinate_cases[0]&&y1==(int)y_cordinate_cases[6])&&((x2==(int)x_cordinate_cases[0]&&y2==(int)y_cordinate_cases[3])||(x2==(int)x_cordinate_cases[3]&&y2==(int)y_cordinate_cases[6]))){
            //System.out.println("anuj21");
            if((red_selected&&!previous_red_moved)||(blue_selected&&!previous_blue_moved)){
                flag_to_move=1;
            }
        }

        if((x1==(int)x_cordinate_cases[6]&&y1==(int)y_cordinate_cases[6])&&((x2==(int)x_cordinate_cases[3]&&y2==(int)y_cordinate_cases[6])||(x2==(int)x_cordinate_cases[6]&&y2==(int)y_cordinate_cases[3]))){
            //System.out.println("anuj22");
            if((red_selected&&!previous_red_moved)||(blue_selected&&!previous_blue_moved)){
                flag_to_move=1;
            }
        }
        // 3 choices...

        if((x1==(int)x_cordinate_cases[3]&&y1==(int)y_cordinate_cases[0])&&((x2==(int)x_cordinate_cases[0]&&y2==(int)y_cordinate_cases[0])||(x2==(int)x_cordinate_cases[3]&&y2==(int)y_cordinate_cases[1])||(x2==(int)x_cordinate_cases[6]&&y2==(int)y_cordinate_cases[0]))){
            //System.out.println("anuj23");
            if((red_selected&&!previous_red_moved)||(blue_selected&&!previous_blue_moved)){
                flag_to_move=1;
            }
        }

        if((x1==(int)x_cordinate_cases[3]&&y1==(int)y_cordinate_cases[2])&&((x2==(int)x_cordinate_cases[4]&&y2==(int)y_cordinate_cases[2])||(x2==(int)x_cordinate_cases[3]&&y2==(int)y_cordinate_cases[1])||(x2==(int)x_cordinate_cases[2]&&y2==(int)y_cordinate_cases[2]))){
            //System.out.println("anuj24");
            if((red_selected&&!previous_red_moved)||(blue_selected&&!previous_blue_moved)){
                flag_to_move=1;
            }
        }

        if((x1==(int)x_cordinate_cases[6]&&y1==(int)y_cordinate_cases[3])&&((x2==(int)x_cordinate_cases[6]&&y2==(int)y_cordinate_cases[0])||(x2==(int)x_cordinate_cases[5]&&y2==(int)y_cordinate_cases[3])||(x2==(int)x_cordinate_cases[6]&&y2==(int)y_cordinate_cases[6]))){
            //System.out.println("anuj25");
            if((red_selected&&!previous_red_moved)||(blue_selected&&!previous_blue_moved)){
                flag_to_move=1;
            }
        }

        if((x1==(int)x_cordinate_cases[3]&&y1==(int)y_cordinate_cases[4])&&((x2==(int)x_cordinate_cases[4]&&y2==(int)y_cordinate_cases[4])||(x2==(int)x_cordinate_cases[2]&&y2==(int)y_cordinate_cases[4])||(x2==(int)x_cordinate_cases[3]&&y2==(int)y_cordinate_cases[5]))){
            //System.out.println("anuj26");
            if((red_selected&&!previous_red_moved)||(blue_selected&&!previous_blue_moved)){
                flag_to_move=1;
            }
        }

        if((x1==(int)x_cordinate_cases[3]&&y1==(int)y_cordinate_cases[6])&&((x2==(int)x_cordinate_cases[3]&&y2==(int)y_cordinate_cases[5])||(x2==(int)x_cordinate_cases[6]&&y2==(int)y_cordinate_cases[6])||(x2==(int)x_cordinate_cases[0]&&y2==(int)y_cordinate_cases[6]))){
            //System.out.println("anuj27");
            if((red_selected&&!previous_red_moved)||(blue_selected&&!previous_blue_moved)){
                flag_to_move=1;
            }
        }

        if((x1==(int)x_cordinate_cases[4]&&y1==(int)y_cordinate_cases[3])&&((x2==(int)x_cordinate_cases[4]&&y2==(int)y_cordinate_cases[2])||(x2==(int)x_cordinate_cases[5]&&y2==(int)y_cordinate_cases[3])||(x2==(int)x_cordinate_cases[4]&&y2==(int)y_cordinate_cases[4]))){
            //System.out.println("anuj28");
            if((red_selected&&!previous_red_moved)||(blue_selected&&!previous_blue_moved)){
                flag_to_move=1;
            }
        }

        if((x1==(int)x_cordinate_cases[2]&&y1==(int)y_cordinate_cases[3])&&((x2==(int)x_cordinate_cases[2]&&y2==(int)y_cordinate_cases[2])||(x2==(int)x_cordinate_cases[2]&&y2==(int)y_cordinate_cases[4])||(x2==(int)x_cordinate_cases[1]&&y2==(int)y_cordinate_cases[3]))){
            ////System.out.println("anuj29");
            if((red_selected&&!previous_red_moved)||(blue_selected&&!previous_blue_moved)){
                flag_to_move=1;
            }
        }

        if((x1==(int)x_cordinate_cases[0]&&y1==(int)y_cordinate_cases[3])&&((x2==(int)x_cordinate_cases[0]&&y2==(int)y_cordinate_cases[0])||(x2==(int)x_cordinate_cases[0]&&y2==(int)y_cordinate_cases[6])||(x2==(int)x_cordinate_cases[1]&&y2==(int)y_cordinate_cases[3]))){
            //////System.out.println("anuj30");
            if((red_selected&&!previous_red_moved)||(blue_selected&&!previous_blue_moved)){
                flag_to_move=1;
            }
        }

        // 4 choices...
        if((x1==(int)x_cordinate_cases[3]&&y1==(int)y_cordinate_cases[1])&&((x2==(int)x_cordinate_cases[5]&&y2==(int)y_cordinate_cases[1])||(x2==(int)x_cordinate_cases[3]&&y2==(int)y_cordinate_cases[0])||(x2==(int)x_cordinate_cases[3]&&y2==(int)y_cordinate_cases[2])||(x2==(int)x_cordinate_cases[1]&&y2==(int)y_cordinate_cases[1]))){
            //////System.out.println("anuj31");
            if((red_selected&&!previous_red_moved)||(blue_selected&&!previous_blue_moved)){
                flag_to_move=1;
            }
        }

        if((x1==(int)x_cordinate_cases[5]&&y1==(int)y_cordinate_cases[3])&&((x2==(int)x_cordinate_cases[5]&&y2==(int)y_cordinate_cases[1])||(x2==(int)x_cordinate_cases[6]&&y2==(int)y_cordinate_cases[3])||(x2==(int)x_cordinate_cases[5]&&y2==(int)y_cordinate_cases[5])||(x2==(int)x_cordinate_cases[4]&&y2==(int)y_cordinate_cases[3]))){
            //////System.out.println("anuj32");
            if((red_selected&&!previous_red_moved)||(blue_selected&&!previous_blue_moved)){
                flag_to_move=1;
            }
        }

        if((x1==(int)x_cordinate_cases[3]&&y1==(int)y_cordinate_cases[5])&&((x2==(int)x_cordinate_cases[5]&&y2==(int)y_cordinate_cases[5])||(x2==(int)x_cordinate_cases[3]&&y2==(int)y_cordinate_cases[4])||(x2==(int)x_cordinate_cases[3]&&y2==(int)y_cordinate_cases[6])||(x2==(int)x_cordinate_cases[1]&&y2==(int)y_cordinate_cases[5]))){
            //////System.out.println("anuj33");
            if((red_selected&&!previous_red_moved)||(blue_selected&&!previous_blue_moved)){
                flag_to_move=1;
            }
        }

        if((x1==(int)x_cordinate_cases[1]&&y1==(int)y_cordinate_cases[3])&&((x2==(int)x_cordinate_cases[2]&&y2==(int)y_cordinate_cases[3])||(x2==(int)x_cordinate_cases[0]&&y2==(int)y_cordinate_cases[3])||(x2==(int)x_cordinate_cases[1]&&y2==(int)y_cordinate_cases[1])||(x2==(int)x_cordinate_cases[1]&&y2==(int)y_cordinate_cases[5]))){
            //////System.out.println("anuj34");
            if((red_selected&&!previous_red_moved)||(blue_selected&&!previous_blue_moved)){
                flag_to_move=1;
            }
        }
    }

    static void update_co_ordinate(int x1, int y1, int x2, int y2){
        if(red_selected){
            int vec1_size=x_1.size();
            for(int i=0;i<vec1_size;i++){
                int x1_cordinate= (int) x_1.get(i);
                int y1_cordinate= (int) y_1.get(i);
                if(x1==x1_cordinate&&y1==y1_cordinate){
                    x_1.set(i,x2);
                    y_1.set(i,y2);
                    mBitmap.setPixel(x2,y2, Color.RED);
                    mBitmap.setPixel(x1,y1, Color.WHITE);
                    break;
                }
            }
        }

        if(blue_selected){
            int vec2_size=x_2.size();
            for(int i=0;i<vec2_size;i++){
                int x2_cordinate= (int) x_2.get(i);
                int y2_cordinate= (int) y_2.get(i);
                if(x1==x2_cordinate&&y1==y2_cordinate){
                    x_2.set(i,x2);
                    y_2.set(i,y2);
                    mBitmap.setPixel(x2,y2, Color.BLUE);
                    mBitmap.setPixel(x1,y1, Color.WHITE);
                    break;
                }
            }
        }
    }
}


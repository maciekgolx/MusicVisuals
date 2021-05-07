package C19389881;

import processing.core.*;

public class Boxes
{
    MyVisual mv;

    public Boxes(MyVisual mv)
    {
        this.mv = mv; 
    }

    public void render()
    {
        for(int i = 0 ; i < mv.getBands().length ; i ++)
        {
            float halfwidth= mv.width/4;
            float halfheight= mv.height/4;
            float angle=0;
            mv.stroke(0, 0, 255);
            mv.noFill();
            //left cube
            mv.pushMatrix();
            mv.translate(halfwidth ,halfheight *3 , 0);
            angle = 0.02f ;
            mv.rotateX(angle+mv.getSmoothedBands()[1] *0.01f);
            mv.rotateY(angle+mv.getSmoothedBands()[1] *0.01f);
            mv.box(100);
            mv.popMatrix();
            //middle cube
            mv.pushMatrix();
            mv.translate(halfwidth*2 ,halfheight *3 , 0);
            angle = 0.02f ;
            mv.rotateX(angle+mv.getSmoothedBands()[1] *0.01f);
            mv.rotateY(angle+mv.getSmoothedBands()[1] *0.01f);
            mv.box(100);
            mv.popMatrix();
            //right cube
            mv.pushMatrix();
            mv.translate(halfwidth*3 ,halfheight *3 , 0);
            angle = 0.02f ;
            mv.rotateX(angle+mv.getSmoothedBands()[1] *0.01f);
            mv.rotateY(angle+mv.getSmoothedBands()[1] *0.01f);
            mv.box(100);
            mv.popMatrix();
        }
    }
}   
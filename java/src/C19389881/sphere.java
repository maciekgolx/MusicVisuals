package C19389881;

import processing.core.*;

public class sphere
{
    MyVisual mv;

    public sphere(MyVisual mv)
    {
        this.mv = mv; 
    }

    public void render()
    {
        for(int i = 0 ; i < mv.getBands().length ; i ++)
        {
            float halfwidth= mv.width/4;
            float halfheight= mv.height/4;

            mv.noStroke();
            mv.fill(140,140, 140);
            //left sphere
            mv.pushMatrix();
            mv.translate(halfwidth ,halfheight *3 , 0);
            mv.sphere(5+ mv.getSmoothedBands()[i] *.1f);
            mv.popMatrix();
            //middle sphere
            mv.pushMatrix();
            mv.translate(halfwidth*2 ,halfheight *3 , 0);
            mv.sphere(5+ mv.getSmoothedBands()[i] *.1f);
            mv.popMatrix();
            //right spehere
            mv.pushMatrix();
            mv.translate(halfwidth*3 ,halfheight *3 , 0);
            mv.sphere(5+ mv.getSmoothedBands()[i] *.1f );
            mv.popMatrix();
        }
    }
}   
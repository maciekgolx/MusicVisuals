package C19389881;

import processing.core.*;
import processing.core.PApplet;

public class CircleThreads 
{
    
    MyVisual mv;
    float cy = 0;
    public CircleThreads(MyVisual mv)
    {
        this.mv = mv; 
        cy = this.mv.height / 2;
    }

    public void render()
    {
        float halfwidth= mv.width/2;
        float halfheight= mv.height/2;
        
        for(int i = 0 ; i < mv.getBands().length ; i ++)
        {
            mv.stroke(255);
            mv.noFill();
            mv.circle(halfwidth, halfheight, 100);
            mv.noStroke();
            mv.fill(PApplet.map(i, 0, mv.getBands().length, 255, 0), 255, 255);
            
            //far right
            mv.rect(halfwidth+60, halfheight-5, 40+mv.getSmoothedBands()[i] * 0.09f, 10);
            //far left
            mv.rect(halfwidth-60, halfheight-5, -40-mv.getSmoothedBands()[i] * 0.09f, 10);
            
            //top-right
            mv.pushMatrix();
            mv.translate(halfwidth+55,halfheight-20);
            mv.rotate(-60);
            mv.rect(0, 0, -40-mv.getSmoothedBands()[i] * 0.09f, 10);
            mv.popMatrix();

            mv.pushMatrix();
            mv.translate(halfwidth+45,halfheight-40);
            mv.rotate(+40);
            mv.rect(0, 0, -40-mv.getSmoothedBands()[i] * 0.09f, 10);
            mv.popMatrix();

            mv.pushMatrix();
            mv.translate(halfwidth+30,halfheight-55);
            mv.rotate(+90);
            mv.rect(0, 0, -40-mv.getSmoothedBands()[i] * 0.09f, 10);
            mv.popMatrix();

            //bot-right
            mv.pushMatrix();
            mv.translate(halfwidth+55,halfheight+30);
            mv.rotate(60);
            mv.rect(0, 0, -40-mv.getSmoothedBands()[i] * 0.09f, 10);
            mv.popMatrix();

            mv.pushMatrix();
            mv.translate(halfwidth+45,halfheight+45);
            mv.rotate(-40);
            mv.rect(0, 0, -40-mv.getSmoothedBands()[i] * 0.09f, 10);
            mv.popMatrix();

            mv.pushMatrix();
            mv.translate(halfwidth+25,halfheight+57);
            mv.rotate(-90);
            mv.rect(0, 0, -40-mv.getSmoothedBands()[i] * 0.09f, 10);
            mv.popMatrix();

            //top-left
            mv.pushMatrix();
            mv.translate(halfwidth-55,halfheight-20);
            mv.rotate(+60);
            mv.rect(0, 0, +40+mv.getSmoothedBands()[i] * 0.09f, 10);
            mv.popMatrix();

            mv.pushMatrix();
            mv.translate(halfwidth-45,halfheight-40);
            mv.rotate(-40);
            mv.rect(0, 0, +40+mv.getSmoothedBands()[i] * 0.09f, 10);
            mv.popMatrix();

            mv.pushMatrix();
            mv.translate(halfwidth-30,halfheight-55);
            mv.rotate(-90);
            mv.rect(0, 0, +40+mv.getSmoothedBands()[i] * 0.09f, 10);
            mv.popMatrix();

            //bottom-left 
            mv.pushMatrix();
            mv.translate(halfwidth-55,halfheight+30);
            mv.rotate(-60);
            mv.rect(0, 0, +40+mv.getSmoothedBands()[i] * 0.09f, 10);
            mv.popMatrix();

            mv.pushMatrix();
            mv.translate(halfwidth-45,halfheight+45);
            mv.rotate(+40);
            mv.rect(0, 0, +40+mv.getSmoothedBands()[i] * 0.09f, 10);
            mv.popMatrix();

            mv.pushMatrix();
            mv.translate(halfwidth-25,halfheight+57);
            mv.rotate(+90);
            mv.rect(0, 0, +40+mv.getSmoothedBands()[i] * 0.09f, 10);
            mv.popMatrix();
            //bottom
            mv.pushMatrix();
            mv.translate(halfwidth,halfheight+60);
            mv.rotate((float)+4.68);
            mv.rect(0, 0, -40-mv.getSmoothedBands()[i] * 0.09f, 10);
            mv.popMatrix();

            //top
            mv.pushMatrix();
            mv.translate(halfwidth,halfheight-60);
            mv.rotate((float)+4.73);
            mv.rect(0, 0, +40+mv.getSmoothedBands()[i] * 0.09f, 10);
            mv.popMatrix();
        }
    }
}
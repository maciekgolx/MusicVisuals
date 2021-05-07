package C19389881;

import processing.core.*;
import processing.core.PApplet;

public class Flower 
{
    
    MyVisual mv;
    float cy = 0;
    public Flower(MyVisual mv)
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
            mv.colorMode(PApplet.RGB);
            mv.fill(34,139,34);
            mv.noStroke();

            //stem
            mv.rect(halfwidth-5, halfheight+50, 10, 450);

            mv.noStroke();
            mv.fill(255,255,0);

            //middle of flower
            mv.circle(halfwidth, halfheight, 100);


            mv.fill(255,255,0);
            mv.noStroke();

            //sun
            mv.ellipse(halfwidth+850,halfheight-500,500,500);


            //sunray 1
            mv.pushMatrix();
            mv.translate(halfwidth+55,halfheight-20);
            mv.rotate(-60);
            mv.rect(-600, +250, 80 +mv.getSmoothedBands()[i] * 0.09f, -30);
            mv.popMatrix();


            //sunray 2
            mv.pushMatrix();
            mv.translate(halfwidth+55,halfheight-20);
            mv.rotate(+40);
            mv.rect(-600, -210, 80 +mv.getSmoothedBands()[i] * 0.09f, -30);
            mv.popMatrix();


            //sunray 3
            mv.pushMatrix();
            mv.translate(halfwidth+55,halfheight-20);
            mv.rotate(+90);
            mv.rect(-500, -510, 80 +mv.getSmoothedBands()[i] * 0.09f, -30);
            mv.popMatrix();


            mv.colorMode(PApplet.HSB);
            mv.fill(255, 255, 255);
            
            //top
            mv.beginShape();
            mv.vertex(halfwidth, halfheight-140 -mv.getSmoothedBands()[i] * 0.09f);
            mv.bezierVertex(halfwidth, halfheight-90-mv.getSmoothedBands()[i] * 0.09f, halfwidth+35+mv.getSmoothedBands()[i] * 0.09f , halfheight-75, halfwidth , halfheight-50 );
            mv.vertex(halfwidth, halfheight-140-mv.getSmoothedBands()[i] * 0.09f);
            mv.bezierVertex(halfwidth, halfheight-90 -mv.getSmoothedBands()[i] * 0.09f, halfwidth-35-mv.getSmoothedBands()[i] * 0.09f , halfheight-75 , halfwidth , halfheight-50  );
            mv.endShape();
            


           //bot
            mv.beginShape();
            mv.vertex(halfwidth, halfheight+140);
            mv.bezierVertex(halfwidth, halfheight+90, halfwidth+35 , halfheight+75, halfwidth, halfheight+50);
            mv.vertex(halfwidth, halfheight+140);
            mv.bezierVertex(halfwidth, halfheight+90, halfwidth-35, halfheight+75, halfwidth, halfheight+50);
            mv.endShape();
            

            //right
            mv.beginShape();
            mv.vertex(halfwidth+140+mv.getSmoothedBands()[i] * 0.09f, halfheight);
            mv.bezierVertex(halfwidth+90 +mv.getSmoothedBands()[i] * 0.09f, halfheight, halfwidth+75 , halfheight+35 +mv.getSmoothedBands()[i] * 0.09f, halfwidth+50, halfheight );
            mv.vertex(halfwidth+140 +mv.getSmoothedBands()[i] * 0.09f, halfheight);
            mv.bezierVertex(halfwidth+90 +mv.getSmoothedBands()[i] * 0.09f, halfheight, halfwidth+75 , halfheight-35 -mv.getSmoothedBands()[i] * 0.09f, halfwidth+50, halfheight );
            mv.endShape();
           
            //left
            mv.beginShape();
            mv.vertex(halfwidth-140-mv.getSmoothedBands()[i] * 0.09f, halfheight);
            mv.bezierVertex(halfwidth-90-mv.getSmoothedBands()[i] * 0.09f, halfheight, halfwidth-75 , halfheight+35 +mv.getSmoothedBands()[i] * 0.09f, halfwidth-50, halfheight );
            mv.vertex(halfwidth-140-mv.getSmoothedBands()[i] * 0.09f, halfheight);
            mv.bezierVertex(halfwidth-90-mv.getSmoothedBands()[i] * 0.09f, halfheight, halfwidth-75 , halfheight-35 -mv.getSmoothedBands()[i] * 0.09f, halfwidth-50, halfheight );
            mv.endShape();

            //bottom right
            mv.pushMatrix();
            mv.translate(halfwidth+1040,halfheight-350);
            mv.rotate(+40);
            mv.beginShape();
            mv.vertex(halfwidth, halfheight-140 -mv.getSmoothedBands()[i] * 0.09f);
            mv.bezierVertex(halfwidth, halfheight-90 -mv.getSmoothedBands()[i] * 0.09f, halfwidth+35+mv.getSmoothedBands()[i] * 0.09f , halfheight-75, halfwidth, halfheight-50 );
            mv.vertex(halfwidth, halfheight-140 -mv.getSmoothedBands()[i] * 0.09f);
            mv.bezierVertex(halfwidth, halfheight-90 -mv.getSmoothedBands()[i] * 0.09f, halfwidth-35 -mv.getSmoothedBands()[i] * 0.09f , halfheight-75, halfwidth, halfheight-50 );
            mv.endShape();
            mv.popMatrix();

            //top left
            mv.pushMatrix();
            mv.translate(halfwidth+1040,halfheight-350);
            mv.rotate(+40);
            mv.beginShape();
            mv.vertex(halfwidth, halfheight+140+mv.getSmoothedBands()[i] * 0.09f);
            mv.bezierVertex(halfwidth, halfheight+90+mv.getSmoothedBands()[i] * 0.09f, halfwidth+35 +mv.getSmoothedBands()[i] * 0.09f, halfheight+75, halfwidth, halfheight+50 );
            mv.vertex(halfwidth, halfheight+140+mv.getSmoothedBands()[i] * 0.09f);
            mv.bezierVertex(halfwidth, halfheight+90+mv.getSmoothedBands()[i] * 0.09f, halfwidth-35 -mv.getSmoothedBands()[i] * 0.09f , halfheight+75, halfwidth, halfheight+50 );
            mv.endShape();
            mv.popMatrix();

            //bottom left
            mv.pushMatrix();
            mv.translate(halfwidth+1043,halfheight-353);
            mv.rotate(+40);
            mv.beginShape();
            mv.vertex(halfwidth+140+mv.getSmoothedBands()[i] * 0.09f, halfheight);
            mv.bezierVertex(halfwidth+90+mv.getSmoothedBands()[i] * 0.09f, halfheight, halfwidth+75 , halfheight+35+mv.getSmoothedBands()[i] * 0.09f, halfwidth+50, halfheight );
            mv.vertex(halfwidth+140+mv.getSmoothedBands()[i] * 0.09f, halfheight);
            mv.bezierVertex(halfwidth+90+mv.getSmoothedBands()[i] * 0.09f, halfheight, halfwidth+75 , halfheight-35 -mv.getSmoothedBands()[i] * 0.09f, halfwidth+50, halfheight );
            mv.endShape();
            mv.popMatrix();

            //top right
            mv.pushMatrix();
            mv.translate(halfwidth+1043,halfheight-353);
            mv.rotate(+40);
            mv.beginShape();
            mv.vertex(halfwidth-140 -mv.getSmoothedBands()[i] * 0.09f, halfheight);
            mv.bezierVertex(halfwidth-90 -mv.getSmoothedBands()[i] * 0.09f, halfheight, halfwidth-75 , halfheight+35+mv.getSmoothedBands()[i] * 0.09f, halfwidth-50, halfheight );
            mv.vertex(halfwidth-140 -mv.getSmoothedBands()[i] * 0.09f, halfheight);
            mv.bezierVertex(halfwidth-90 -mv.getSmoothedBands()[i] * 0.09f, halfheight, halfwidth-75 , halfheight-35 -mv.getSmoothedBands()[i] * 0.09f, halfwidth-50, halfheight );
            mv.endShape();
            mv.popMatrix();
            
        }


    }
}

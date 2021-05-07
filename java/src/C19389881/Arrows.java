package C19389881;

import processing.core.*;

public class Arrows 
{
    
    MyVisual mv;

    public Arrows(MyVisual mv)
    {
        this.mv = mv; 
    }

    public void render()
    {
        //widht
        float halfwidth= mv.width/10;
        float midarroww=halfwidth*5;
        float leftarrow=halfwidth*3;
        float rightarrow=halfwidth*6;

        //height
        float halfheight= mv.height/8;
        float botarrow=halfheight *6;
        float toparrow=halfheight;
        float midarrowh=halfheight*4;
        for(int i = 0 ; i < mv.getBands().length ; i ++)
        {
            mv.colorMode(PApplet.HSB);
            mv.smooth();
            mv.noStroke();
            mv.fill(PApplet.map(i, 255, mv.getBands().length, 255, 255), 255, 255);
            
            //arrow at the bottom of the screen
            mv.beginShape();
            mv.vertex(midarroww, botarrow-mv.getSmoothedBands()[i] * 0.09f);
            mv.bezierVertex(midarroww+10, botarrow+40-mv.getSmoothedBands()[i] * 0.09f, midarroww+20 , botarrow+80 -mv.getSmoothedBands()[i] * 0.09f, midarroww+35, botarrow+125);
           
            mv.vertex(midarroww, botarrow-mv.getSmoothedBands()[i] * 0.09f);
            mv.bezierVertex(midarroww-10, botarrow+40-mv.getSmoothedBands()[i] * 0.09f, midarroww-20 , botarrow+80 -mv.getSmoothedBands()[i] * 0.09f, midarroww-35, botarrow+125);
           
            mv.vertex(midarroww-35, botarrow+125);
            mv.bezierVertex(midarroww-10, botarrow+80, midarroww+10 , botarrow+80, midarroww+35, botarrow+125);
            mv.endShape();
        
            //Arrow at the top of the screen
            mv.beginShape();
            mv.vertex(midarroww, toparrow+125 +mv.getSmoothedBands()[i] * 0.09f);
            mv.bezierVertex(midarroww+10, toparrow+80 +mv.getSmoothedBands()[i] * 0.09f, midarroww+20 , toparrow+40 +mv.getSmoothedBands()[i] * 0.09f, midarroww+35, toparrow);
           
            mv.vertex(midarroww, toparrow+125 +mv.getSmoothedBands()[i] * 0.09f);
            mv.bezierVertex(midarroww-10, toparrow+80 +mv.getSmoothedBands()[i] * 0.09f, midarroww-20 , toparrow+40 +mv.getSmoothedBands()[i] * 0.09f, midarroww-35, toparrow);
           
            mv.vertex(midarroww-35, toparrow);
            mv.bezierVertex(midarroww-10, toparrow+40, midarroww+10 , toparrow+40, midarroww+35, toparrow);
            mv.endShape();

            //Arrow on the left side of the screen
            mv.beginShape();
            mv.vertex(leftarrow+125 +mv.getSmoothedBands()[i] * 0.09f, midarrowh);
            mv.bezierVertex(leftarrow+80 +mv.getSmoothedBands()[i] * 0.09f, midarrowh-10, leftarrow+40 +mv.getSmoothedBands()[i] * 0.09f , midarrowh+20, leftarrow, midarrowh+35);
           
            mv.vertex(leftarrow+125 +mv.getSmoothedBands()[i] * 0.09f, midarrowh);
            mv.bezierVertex(leftarrow+80 +mv.getSmoothedBands()[i] * 0.09f, midarrowh -10, leftarrow+40  +mv.getSmoothedBands()[i] * 0.09f, midarrowh -20, leftarrow, midarrowh-35);
           
            mv.vertex(leftarrow, midarrowh-35);
            mv.bezierVertex(leftarrow +40, midarrowh -10, leftarrow+40 , midarrowh +10 , leftarrow, midarrowh+35 );
            mv.endShape();

            //Arrow on the right side of the screen
            mv.beginShape();
            mv.vertex(rightarrow -mv.getSmoothedBands()[i] * 0.09f, midarrowh);
            mv.bezierVertex(rightarrow+40 +mv.getSmoothedBands()[i] * 0.09f, midarrowh-10, rightarrow+80 -mv.getSmoothedBands()[i] * 0.09f , midarrowh+20, rightarrow+125, midarrowh+35);
           
            mv.vertex(rightarrow -mv.getSmoothedBands()[i] * 0.09f, midarrowh);
            mv.bezierVertex(rightarrow-40 +mv.getSmoothedBands()[i] * 0.09f, midarrowh -10, rightarrow+80 -mv.getSmoothedBands()[i] * 0.09f , midarrowh -20, rightarrow+125, midarrowh-35);
           
            mv.vertex(rightarrow+125, midarrowh-35);
            mv.bezierVertex(rightarrow +80, midarrowh -10, rightarrow+80 , midarrowh +10 , rightarrow+125, midarrowh+35 );
            mv.endShape();
            
        }
    }
}

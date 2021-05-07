package C19389881;

import processing.core.*;

public class Guitar {

    MyVisual mv;

    public Guitar(MyVisual mv)
    {
        this.mv = mv; 

    }

    public void render()
    {
        
        float halfwidth= mv.width/2;
        float halfheight= mv.height/2;

        //guitar drawing
        for(int i = 0 ; i < mv.getBands().length ; i ++)
        {
            mv.smooth();
            mv.noStroke();
            mv.colorMode(PApplet.RGB);
            mv.fill(139,69,19);
    
            mv.beginShape();
            
            //body 
            mv.vertex(halfwidth+20, halfheight-220);
            mv.bezierVertex(halfwidth+20, halfheight-220, halfwidth+100, halfheight-210, halfwidth+60, halfheight-80);
            mv.vertex(halfwidth+60, halfheight-80);
            mv.bezierVertex(halfwidth+60, halfheight-80, halfwidth+210, halfheight+140, halfwidth, halfheight+140);
            

            mv.vertex(halfwidth-20, halfheight-220);
            mv.bezierVertex(halfwidth-20, halfheight-220, halfwidth-100 , halfheight-210, halfwidth-60, halfheight-80);
            mv.vertex(halfwidth-60, halfheight-80);
            mv.bezierVertex(halfwidth-60, halfheight-80, halfwidth-210 , halfheight+140, halfwidth, halfheight+140);

            mv.vertex(halfwidth-20, halfheight-220);
            mv.bezierVertex(halfwidth-20, halfheight-220, halfwidth-20 , halfheight-500, halfwidth, halfheight-500);

            mv.vertex(halfwidth+20, halfheight-220);
            mv.bezierVertex(halfwidth+20, halfheight-220, halfwidth+20, halfheight-490, halfwidth, halfheight-500);

            mv.endShape();
            mv.noStroke();
            mv.fill(101, 67, 33);
            //hole in guitar
            mv.ellipse(halfwidth,halfheight-160,40,40);
            mv.noStroke();
            mv.fill(101, 67, 33);
            //strumming part 
            mv.quad(halfwidth+15,halfheight-450,halfwidth-15,halfheight-450,halfwidth-10,halfheight-500,halfwidth+10,halfheight-500);
        }
        mv.stroke(255,215,0);
        mv.noFill();
        for(int i=-10;i<11;i=i+4)
        {
            mv.line(halfwidth+i,halfheight-160,halfwidth+i,halfheight-490);
        }

        //nodes
        for(int i = 0 ; i < mv.getBands().length ; i ++)
        {   
            mv.noStroke();
            mv.fill(255,255,255);    
            mv.translate(-20, 40);
            mv.beginShape();
            mv.vertex(halfwidth+360, halfheight-20);
            mv.bezierVertex(halfwidth+360, halfheight-20-mv.getSmoothedBands()[i] * 0.09f, halfwidth+361 +mv.getSmoothedBands()[i] * 0.09f, halfheight+40 , halfwidth+361, halfheight+40 +mv.getSmoothedBands()[i] * 0.09f);
            mv.vertex(halfwidth+361, halfheight+40);
            mv.bezierVertex(halfwidth+361, halfheight+40 +mv.getSmoothedBands()[i] * 0.09f, halfwidth+330 +mv.getSmoothedBands()[i] * 0.09f, halfheight+60, halfwidth+360, halfheight+80 +mv.getSmoothedBands()[i] * 0.09f);

            mv.vertex(halfwidth+360, halfheight-20);
            mv.bezierVertex(halfwidth+360, halfheight-20-mv.getSmoothedBands()[i] * 0.09f, halfwidth+359 +mv.getSmoothedBands()[i] * 0.09f, halfheight+40, halfwidth+359, halfheight+40 +mv.getSmoothedBands()[i] * 0.09f);
            mv.vertex(halfwidth+359, halfheight+40);
            mv.bezierVertex(halfwidth+359, halfheight+40 +mv.getSmoothedBands()[i] * 0.09f, halfwidth+390 +mv.getSmoothedBands()[i] * 0.09f, halfheight+60, halfwidth+360, halfheight+80 +mv.getSmoothedBands()[i] * 0.09f);
            mv.endShape();

            mv.stroke(255,255,255);
            mv.noFill(); 
            mv.line(halfwidth+360,halfheight-20 -mv.getSmoothedBands()[i] * 0.09f,halfwidth+380,halfheight+20);
        }

        //nodes
        for(int i = 0 ; i < mv.getBands().length ; i ++)
        {   
            mv.noStroke();
            mv.fill(255,255,255);  
            
            mv.translate(-20,-40);      
            mv.beginShape();

            mv.vertex(halfwidth, halfheight-20);
            mv.bezierVertex(halfwidth, halfheight-20-mv.getSmoothedBands()[i] * 0.09f, halfwidth-1 +mv.getSmoothedBands()[i] * 0.09f, halfheight+40 , halfwidth-1, halfheight+40 +mv.getSmoothedBands()[i] * 0.09f);
            mv.vertex(halfwidth-1, halfheight+40);
            mv.bezierVertex(halfwidth-1, halfheight+40 +mv.getSmoothedBands()[i] * 0.09f, halfwidth+30 +mv.getSmoothedBands()[i] * 0.09f, halfheight+60, halfwidth, halfheight+80 +mv.getSmoothedBands()[i] * 0.09f);

            mv.vertex(halfwidth, halfheight-20);
            mv.bezierVertex(halfwidth, halfheight-20-mv.getSmoothedBands()[i] * 0.09f, halfwidth+1 +mv.getSmoothedBands()[i] * 0.09f, halfheight+40, halfwidth+1, halfheight+40 +mv.getSmoothedBands()[i] * 0.09f);
            mv.vertex(halfwidth+1, halfheight+40);
            mv.bezierVertex(halfwidth+1, halfheight+40 +mv.getSmoothedBands()[i] * 0.09f, halfwidth-30 +mv.getSmoothedBands()[i] * 0.09f, halfheight+60, halfwidth, halfheight+80 +mv.getSmoothedBands()[i] * 0.09f);
            mv.endShape();

            mv.stroke(255,255,255);
            mv.noFill(); 
            mv.line(halfwidth,halfheight-20 -mv.getSmoothedBands()[i] * 0.09f,halfwidth-20,halfheight+20);
        }
        
       
        
       
    }   
}
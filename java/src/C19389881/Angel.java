package C19389881;

import processing.core.*;

public class Angel {

    MyVisual mv;

    public Angel(MyVisual mv)
    {
        this.mv = mv; 
    }

    public void render()
    {
        float halfwidth= mv.width/2;
        float halfheight= mv.height/2;
        for(int i = 0 ; i < mv.getBands().length ; i ++)
        {
            mv.smooth();
            mv.noStroke();
            mv.fill(PApplet.map(i, 0, mv.getBands().length, 0, 0), 0, 255);
            mv.beginShape();
            mv.vertex(halfwidth, halfheight);
            mv.bezierVertex(halfwidth, halfheight-20-mv.getSmoothedBands()[i] * 0.2f, halfwidth+40 +mv.getSmoothedBands()[i] * 0.2f, halfheight-10, halfwidth +mv.getSmoothedBands()[i] * 0.2f, halfheight+25+mv.getSmoothedBands()[i] * 0.2f);
            mv.vertex(halfwidth, halfheight);
            mv.bezierVertex(halfwidth, halfheight-20- mv.getSmoothedBands()[i] * 0.2f, halfwidth-40 -mv.getSmoothedBands()[i] * 0.2f, halfheight-10, halfwidth -mv.getSmoothedBands()[i] * 0.2f, halfheight+25+mv.getSmoothedBands()[i] * 0.2f);
            mv.endShape();
        }
    }   
}
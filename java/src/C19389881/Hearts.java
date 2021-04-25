package C19389881;

import processing.core.*;

public class Hearts
{
    MyVisual mv;

    public Hearts(MyVisual mv)
    {
        this.mv = mv; 
    }

    public void render()
    {
        float halfwidth= mv.width/3;
        float halfheight= mv.height/3;
        for(int i = 0 ; i < mv.getBands().length ; i ++)
        {
            mv.smooth();
            mv.noStroke();
            mv.fill(PApplet.map(i, 255, mv.getBands().length, 255, 255), 255, 255);
            
            mv.beginShape();
            mv.vertex(halfwidth, halfheight);
            mv.bezierVertex(halfwidth, halfheight-20-mv.getSmoothedBands()[i] * 0.2f, halfwidth+40 +mv.getSmoothedBands()[i] * 0.2f, halfheight-10, halfwidth, halfheight+25+mv.getSmoothedBands()[i] * 0.2f);
            mv.vertex(halfwidth, halfheight);
            mv.bezierVertex(halfwidth, halfheight-20- mv.getSmoothedBands()[i] * 0.2f, halfwidth-40 -mv.getSmoothedBands()[i] * 0.2f, halfheight-10, halfwidth, halfheight+25+mv.getSmoothedBands()[i] * 0.2f);
            mv.endShape();
    
            mv.beginShape();
            mv.vertex(halfwidth+halfwidth, halfheight+15);
            mv.bezierVertex(halfwidth+halfwidth, halfheight-20-mv.getSmoothedBands()[i] * 0.2f, halfwidth+halfwidth+40 +mv.getSmoothedBands()[i] * 0.2f, halfheight-10,halfwidth+halfwidth, halfheight+25+mv.getSmoothedBands()[i] * 0.2f);
            mv.vertex(halfwidth+halfwidth, halfheight+15);
            mv.bezierVertex(halfwidth+halfwidth, halfheight-20- mv.getSmoothedBands()[i] * 0.2f, halfwidth+halfwidth-40 -mv.getSmoothedBands()[i] * 0.2f, halfheight-10, halfwidth+halfwidth, halfheight+25+mv.getSmoothedBands()[i] * 0.2f);
            mv.endShape();

            mv.beginShape();
            mv.vertex(halfwidth+halfwidth, halfheight+halfheight+15);
            mv.bezierVertex(halfwidth+halfwidth, halfheight+halfheight-20-mv.getSmoothedBands()[i] * 0.2f, halfwidth+halfwidth+40 +mv.getSmoothedBands()[i] * 0.2f, halfheight+halfheight-10,halfwidth+halfwidth, halfheight+halfheight+25+mv.getSmoothedBands()[i] * 0.2f);
            mv.vertex(halfwidth+halfwidth, halfheight+halfheight+15);
            mv.bezierVertex(halfwidth+halfwidth, halfheight+halfheight-20- mv.getSmoothedBands()[i] * 0.2f, halfwidth+halfwidth-40 -mv.getSmoothedBands()[i] * 0.2f, halfheight+halfheight-10, halfwidth+halfwidth, halfheight+halfheight+25+mv.getSmoothedBands()[i] * 0.2f);
            mv.endShape();

            mv.beginShape();
            mv.vertex(halfwidth, halfheight+halfheight+15);
            mv.bezierVertex(halfwidth, halfheight+halfheight-20-mv.getSmoothedBands()[i] * 0.2f, halfwidth+40 +mv.getSmoothedBands()[i] * 0.2f, halfheight+halfheight-10,halfwidth, halfheight+halfheight+25+mv.getSmoothedBands()[i] * 0.2f);
            mv.vertex(halfwidth, halfheight+halfheight+15);
            mv.bezierVertex(halfwidth, halfheight+halfheight-20- mv.getSmoothedBands()[i] * 0.2f, halfwidth-40 -mv.getSmoothedBands()[i] * 0.2f, halfheight+halfheight-10, halfwidth, halfheight+halfheight+25+mv.getSmoothedBands()[i] * 0.2f);
            mv.endShape();
        }
    }
}   
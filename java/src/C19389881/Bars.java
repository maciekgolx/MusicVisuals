package C19389881;

import processing.core.*;

// This is an example of a visual that uses the audio bands
public class Bars
{
    MyVisual mv;

    public Bars(MyVisual mv)
    {
        this.mv = mv; 
    }

    public void render()
    {
        float gap = mv.height / (float) mv.getBands().length;
        mv.noStroke();
        for(int i = 0 ; i < mv.getBands().length ; i ++)
        {
            //bars on the side of the screen
            mv.fill(PApplet.map(i, 0, mv.getBands().length, 255, 0), 255, 255);
            mv.rect(mv.width,i * gap,-mv.getSmoothedBands()[i] * 1.0f, gap); 
        
            mv.fill(PApplet.map(i, 0, mv.getBands().length, 255, 0), 255, 255);
            mv.rect(0,i * gap,mv.getSmoothedBands()[i] * 1.0f, gap); 
        }
    }
}
package C19389881;

import processing.core.*;

// This is an example of a visual that renders the waveform
public class Circle
{
    MyVisual mv;
    float cy = 0;

    public Circle(MyVisual mv)
    {
        this.mv = mv;
        cy = this.mv.height / 8;
    }

    public void render()
    {
        mv.colorMode(PApplet.HSB);
        for(int i = 0 ; i < mv.getAudioBuffer().size() ; i ++)
        {
            mv.stroke(
                PApplet.map(i, 0, mv.getAudioBuffer().size(), 0, 255)
                , 255
                , 255
            );
            //circle in the middle holo 
            mv.ellipse(mv.width/2, mv.height/5, cy + cy * mv.getAudioBuffer().get(i), cy + cy * mv.getAudioBuffer().get(i));
        }
    }
}
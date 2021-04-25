package C19389881;

import ie.tudublin.*;

public class MyVisual extends Visual
{    
    Circle cir;
    Hearts hrt;
    Angel agl;
    Boxes box;
    sphere sph;
    Bars bar;
    Arrows arr;
    CircleThreads cit;
    Guitar gui;
    
    public void settings()
    {
        //size(1024, 500);
        
        // Use this to make fullscreen
        //fullScreen();

        // Use this to make fullscreen and use P3D for 3D graphics
        fullScreen(P3D, SPAN); 
    }
    int which = 1;
    public void setup()
    {
        startMinim();
                
        // Call loadAudio to load an audio file to process 
        loadAudio("dancin.mp3");
         
        
        // Call this instead to read audio from the microphone
        //startListening(); 
        
        cir = new Circle(this);
        hrt = new Hearts(this);
        agl= new Angel(this);
        box= new Boxes(this);
        sph= new sphere(this);
        bar=new Bars(this);
        arr=new Arrows(this);
        cit=new CircleThreads(this);
        gui=new Guitar(this);
    }

    public void keyPressed()
    {
        if (keyCode >= '1' && keyCode <= '3') {
            which = keyCode - '0';
        }
        if (key == ' ')
        {
            getAudioPlayer().cue(0);
            getAudioPlayer().play();
        }
    }

    public void draw()
    {
        background(0);
        try
        {
            // Call this if you want to use FFT data
            calculateFFT(); 
        }
        catch(VisualException e)
        {
            e.printStackTrace();
        }
        // Call this is you want to use frequency bands
        calculateFrequencyBands(); 
        
        // Call this is you want to get the average amplitude
        calculateAverageAmplitude();
        switch (which)
        {
            case 1:
            {   
                bar.render();     
                cir.render();
                hrt.render();
                agl.render();
                box.render();
                sph.render();
            }        
            break;
            case 2:
            { 
                arr.render();
                cit.render();
            }
            break;
            case 3:
            { 
                gui.render();
            }
            break;
        }
    }
}

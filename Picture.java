/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Circle moon;
    private Square plain;
    private Person persona;
    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();
        
        plain = new Square();
        plain.makeVisible();
        plain.changeColor("green");
        plain.changeSize(500);
        plain.moveHorizontal(-310);
        plain.moveVertical(120);

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(180);
        sun.moveVertical(-90);
        sun.changeSize(80);
        sun.makeVisible();
        sun.slowMoveVertical(300);
        
        moon = new Circle();
        moon.makeVisible();
        moon.moveHorizontal(-150);
        moon.changeColor("magenta");
        moon.changeSize(50);
        
       
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
    public void amanecer() {
    moon.makeInvisible();
    sun.makeVisible();
    sun.slowMoveVertical(-240);
    
    Person persona0 = new Person();
    persona0.moveHorizontal(-250);
    persona0.makeVisible();
    persona0.slowMoveHorizontal(70);
   
    
    Person persona2 = new Person();
    persona2.moveHorizontal(150);
    persona2.makeVisible();
    persona2.slowMoveHorizontal(-110);
    }
}

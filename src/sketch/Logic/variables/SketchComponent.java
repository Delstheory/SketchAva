package sketch.Logic.variables;

import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.Rectangle;

public class SketchComponent extends Component{
    
    private SketchComponent parentComponent;
    private int x;
    private int y;
    private int height;
    private int width;
    private Image backgroundImage;
    private Color backgroundColor;
    private Color foregroundColor;
    private boolean isVisible;
    
    public SketchComponent(){
        setBackground(backgroundColor);
        setForeground(foregroundColor);
        setBounds(x, y, height, width);
        setSize(width, height);
        setVisible(isVisible);
    }
    
    public SketchComponent(Component comp){
        setBackground(comp.getBackground());
        setForeground(comp.getForeground());
        setBounds(comp.getBounds());
        setSize(comp.getWidth(), comp.getHeight());
        setFont(comp.getFont());
        setVisible(comp.isVisible());
    }
    
    //ADDITIONAL\\
    public SketchComponent transferToSketchComponent(Component comp){
        SketchComponent component = new SketchComponent(comp);
        return component;
    }
    
    //VOID TYPE\\
    public void setParentComponent(SketchComponent comp){
        this.parentComponent = comp;
    }
    
    public void setBounds(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }
    
    public void setBackgroundResource(Image img){
        backgroundImage = img;
    }
    
    public void setBackgroundColor(Color col){
        backgroundColor = col;
    }
    
    public void setForegroundColor(Color col){
        foregroundColor = col;
    }
    
    public void setVisible(boolean value){
        isVisible = value;
    }
    
    //RETURNING TYPE\\
    public SketchComponent getParentComponent(){
        return parentComponent;
    }
    
    public int getHeight(){
        return height;
    }
    
    public int getWidth(){
        return width;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public Rectangle getBounds(){
        return new Rectangle(x, y, width, height);
    }
    
    public Image getBackgroundResource(){
        return backgroundImage;
    }
    
    public Color getBackgroundColor(){
        return backgroundColor;
    }
    
    public Color getForegroundColor(){
        return foregroundColor;
    }
    
    public boolean isVisible(){
        return isVisible;
    }
}

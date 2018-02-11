package sketch.View.layouts;

import java.awt.Color;
import java.awt.Image;
import sketch.Logic.variables.SketchComponent;

public class ScrollVertical extends SketchComponent{
    //PROPERTIES\\
    //Layout props
    private String layoutWidth;
    private String layoutHeight;
    private int padding;
    private int margin;
    private String layoutGravity;
    private int weight;
    //View props
    private Image backgroundResource;
    private Color backgroundColor;
    private int rotate;
    private double alpha;
    private double translationX;
    private double translationY;
    private double scaleX;
    private double scaleY;
    
    public void add(SketchComponent comp){
        
    }
    
    public String getLayoutWidth() {
        return layoutWidth;
    }

    public void setLayoutWidth(String layoutWidth) {
        this.layoutWidth = layoutWidth;
    }

    public String getLayoutHeight() {
        return layoutHeight;
    }

    public void setLayoutHeight(String layoutHeight) {
        this.layoutHeight = layoutHeight;
    }

    public int getPadding() {
        return padding;
    }

    public void setPadding(int padding) {
        this.padding = padding;
    }

    public int getMargin() {
        return margin;
    }

    public void setMargin(int margin) {
        this.margin = margin;
    }

    public String getLayoutGravity() {
        return layoutGravity;
    }

    public void setLayoutGravity(String layoutGravity) {
        this.layoutGravity = layoutGravity;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Image getBackgroundResource() {
        return backgroundResource;
    }

    public void setBackgroundResource(Image backgroundResource) {
        this.backgroundResource = backgroundResource;
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public int getRotate() {
        return rotate;
    }

    public void setRotate(int rotate) {
        this.rotate = rotate;
    }

    public double getAlpha() {
        return alpha;
    }

    public void setAlpha(double alpha) {
        this.alpha = alpha;
    }

    public double getTranslationX() {
        return translationX;
    }

    public void setTranslationX(double translationX) {
        this.translationX = translationX;
    }

    public double getTranslationY() {
        return translationY;
    }

    public void setTranslationY(double translationY) {
        this.translationY = translationY;
    }

    public double getScaleX() {
        return scaleX;
    }

    public void setScaleX(double scaleX) {
        this.scaleX = scaleX;
    }

    public double getScaleY() {
        return scaleY;
    }

    public void setScaleY(double scaleY) {
        this.scaleY = scaleY;
    }
}

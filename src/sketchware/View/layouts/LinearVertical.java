package sketch.View.layouts;

import java.awt.Color;
import java.awt.Image;
import sketch.Logic.variables.SketchComponent;

public class LinearVertical extends SketchComponent{
    //PROPERTIES\\
    //Layout props
    public String layoutWidth;

    /**
     * 
     */
    public String layoutHeight;
    private int padding;
    private int margin;
    public String orientation;
    public int weightSum;
    public String gravity;
    public String layoutGravity;
    public int weight;
    //View props
    public Image backgroundResource;
    public Color backgroundColor;
    public int rotate;
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

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public int getWeightSum() {
        return weightSum;
    }

    public void setWeightSum(int weightSum) {
        this.weightSum = weightSum;
    }
    
    public String getGravity() {
        return gravity;
    }

    public void setGravity(String gravity) {
        this.gravity = gravity;
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

package sketch.View.widgets;

import java.awt.Color;
import java.awt.Image;
import sketch.Logic.variables.SketchComponent;

public class Button extends SketchComponent {

    private String id;
    /*LAYOUT PROPERTIES*/
    //Layout
    private String layout_width;
    private String layout_height;
    //Additional for Padding and Margin
    private boolean ifAll;
    private int all;
    //Padding
    private int paddingLeft;
    private int paddingTop;
    private int paddingRight;
    private int paddingBottom;
    //Margin
    private int marginLeft;
    private int marginTop;
    private int marginRight;
    private int marginBottom;
    //Gravity
    private String gravity;
    private String layout_gravity;
    //Weight
    private int weight;
    /*TEXT PROPERTIES*/
    //Text
    private String text;
    private int text_size;
    private String text_style;
    private Color text_color;
    /*VIEW PROPERTIES*/
    //Background
    private Image background_resource;
    private Color background_color;
    //Visible
    private boolean enabled;
    //Rotation
    private int rotate;

    /* 
        *NOT USING*
    //Alpha
    private double alpha;
    //Translation
    private double translationX;
    private double tarnslationY
    //Scale
    private double scaleX;
    private double scaleY;
     */
    public Button(String ID) {
        new Button(ID);
        setBounds(marginLeft, marginTop, Integer.valueOf(layout_width), Integer.valueOf(layout_height));
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLayout_width() {
        return layout_width;
    }

    public void setLayout_width(String layout_width) {
        this.layout_width = layout_width;
    }

    public String getLayout_height() {
        return layout_height;
    }

    public void setLayout_height(String layout_height) {
        this.layout_height = layout_height;
    }

    public boolean IfAll() {
        return ifAll;
    }

    public void setIfAll(boolean ifAll) {
        this.ifAll = ifAll;
    }

    public int getAll() {
        return all;
    }

    public void setAll(int all) {
        this.all = all;
    }

    public int getPaddingLeft() {
        return paddingLeft;
    }

    public void setPaddingLeft(int paddingLeft) {
        this.paddingLeft = paddingLeft;
    }

    public int getPaddingTop() {
        return paddingTop;
    }

    public void setPaddingTop(int paddingTop) {
        this.paddingTop = paddingTop;
    }

    public int getPaddingRight() {
        return paddingRight;
    }

    public void setPaddingRight(int paddingRight) {
        this.paddingRight = paddingRight;
    }

    public int getPaddingBottom() {
        return paddingBottom;
    }

    public void setPaddingBottom(int paddingBottom) {
        this.paddingBottom = paddingBottom;
    }

    public int getMarginLeft() {
        return marginLeft;
    }

    public void setMarginLeft(int marginLeft) {
        this.marginLeft = marginLeft;
    }

    public int getMarginTop() {
        return marginTop;
    }

    public void setMarginTop(int marginTop) {
        this.marginTop = marginTop;
    }

    public int getMarginRight() {
        return marginRight;
    }

    public void setMarginRight(int marginRight) {
        this.marginRight = marginRight;
    }

    public int getMarginBottom() {
        return marginBottom;
    }

    public void setMarginBottom(int marginBottom) {
        this.marginBottom = marginBottom;
    }

    public String getGravity() {
        return gravity;
    }

    public void setGravity(String gravity) {
        this.gravity = gravity;
    }

    public String getLayout_gravity() {
        return layout_gravity;
    }

    public void setLayout_gravity(String layout_gravity) {
        this.layout_gravity = layout_gravity;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getText_size() {
        return text_size;
    }

    public void setText_size(int text_size) {
        this.text_size = text_size;
    }

    public String getText_style() {
        return text_style;
    }

    public void setText_style(String text_style) {
        this.text_style = text_style;
    }

    public Color getText_color() {
        return text_color;
    }

    public void setText_color(Color text_color) {
        this.text_color = text_color;
    }

    public Image getBackground_resource() {
        return background_resource;
    }

    public void setBackground_resource(Image background_resource) {
        this.background_resource = background_resource;
    }

    public Color getBackground_color() {
        return background_color;
    }

    public void setBackground_color(Color background_color) {
        this.background_color = background_color;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public int getRotate() {
        return rotate;
    }

    public void setRotate(int rotate) {
        this.rotate = rotate;
    }
}

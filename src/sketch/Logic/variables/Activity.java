package sketch.Logic.variables;

import javax.swing.JFrame;

public class Activity extends JFrame {

    private static String title;

    public Activity() {

    }

    @Override
    public void setTitle(String t) {
        title = t;
    }

    public static void setAcсessible(boolean b) {
        if (b) {
            Activity a = new Activity();
        }
    }
    
    public void start(){
        setVisible(true);
    }
    
    public void finish(){
        setVisible(false);
    }
    
        public static String keyGetVal(String key) {
        return AKey.toKey(key).getExtraKey();
    }

    public static void keySetVal(String key, String value) {
        AKey.toKey(key).putExtraKey(value);
    }
}

class AKey {

    //VARIABLES\\
    private static String keyValue;

    //CONSTRUCTOR\\
    public AKey(String name) {
    }

    //METHODS\\
    public static void putExtraKey(String value) {
        keyValue = value;
    }

    public static String getExtraKey() {
        return keyValue;
    }

    public static AKey toKey(String s) {
        return new AKey(s);
    }
}

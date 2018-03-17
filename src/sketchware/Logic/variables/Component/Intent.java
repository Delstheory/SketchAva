package sketch.Logic.variables;

public class Intent {

    private static String action;
    private static String data;
    private static Activity screen;
    private static String flag;

    public Intent() {
    
    }

    public static void putExtraKey(String value) {
        keyValue = value;
    }

    public static String getExtraKey() {
        return keyValue;
    }
    
    public static void setAction(String act){
        action = act;   
    }
    
    public static void setScreen(Activity a){
        screen = a;   
    }
    
    public static void setFags(String flag){
        flag = f;   
    }
    
    public static void startActivity(Intent i){
        JFrame frame = new JFrame();
        //Change to fullscreen
        frame.setBounds(0, 0, 600, 800);
        frame.swtVisible(true);
    }
}

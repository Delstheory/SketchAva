package sketch.Logic.variables;

public class Intent extends Activity {

    public static String action;
    public static String data;
    public static Activity screen;
    public static String flag;

    public Intent() {

    }

    public static String keyGetVal(String key) {
        return IKey.toKey(key).getExtraKey();
    }

    public static void keySetVal(String key, String value) {
        IKey.toKey(key).putExtraKey(value);
    }

}

class IKey {

    //VARIABLES\\
    private static String keyValue;

    //CONSTRUCTOR\\
    public IKey(String name) {
    }

    //METHODS\\
    public static void putExtraKey(String value) {
        keyValue = value;
    }

    public static String getExtraKey() {
        return keyValue;
    }

    public static IKey toKey(String s) {
        return new IKey(s);
    }
}

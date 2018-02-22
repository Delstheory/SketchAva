package sketch.Logic.variables;

public class File {

    public File(String fileName) {

    }
    
    public static void keySetVal(String key, String val){
        FKey.toKey(key).setDataKey(val);
    }
    
    public static String keyGetVal(String key){
        return FKey.toKey(key).getDataKey();
    }
    
    public static void deleteKey(String key){
        FKey.toKey(key).delVal();
    }
}

class FKey {

    //VARIABLES\\
    private static String keyValue;

    //CONSTRUCTOR\\
    public FKey(String name) {
    }

    //METHODS\\
    protected static void setDataKey(String value) {
        keyValue = value;
    }

    protected static String getDataKey() {
        return keyValue;
    }
    
    protected static void delVal(){
        keyValue = null;
    }
    
    public static FKey toKey(String s){
        return new FKey(s);
    } 
}

package sketch.Logic.blocks;

/**
 * This class works with different variables(String, Number, Bool, Map)
 * @author Vladg24
 */
public class Variable {
    class Number {
        
        public static void addVariable(){
            public String variable;
        }
        
        public static void increaseOne(){
            variable = variable + 1;
        }
        
        public static void decreaseOne(){
            variable = variable - 1;
        }
    }
    
    class String {
        public static void addVariable(){
            public String variable;
        }
        
        public static void setVariableTo(String s){
            variable = s;   
        }
    }
    
    class Boolean {
        public static void addVariable(){
            public boolean variable;
        }
        
        public static void setVariableTo(boolean b){
            variable = b;   
        }
    }
    
    class Map {
        public static void addVariable(){
            String[] variable;
        }
        
        public static void createNewMap(){
            for(int i = 0;i<=variable.length();i++){
                map[i] = null;   
            }
        }
        
        public static void insertKeyValue(String key, String value){
           map[key] = value;
        }
        
        public static String getKeyValue(String key){
            return map[key];
        }
    }
}

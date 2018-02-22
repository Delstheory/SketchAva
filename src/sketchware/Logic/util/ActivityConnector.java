package sketch.Logic.util;

import sketch.Logic.variables.Activity;

public class ActivityConnector {

    public void connect(Activity a){
        a.setAcсessible(true);
    }

    public void disconnect(Activity a){
        a.setAcсessible(false);
    }
    
    public void callMethod(Activity a, String method){
        
    }
    
    public void callClass(Activity a, String className){
        
    }
}

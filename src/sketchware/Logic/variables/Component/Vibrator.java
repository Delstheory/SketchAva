package sketch.Logic.variables;

/**
* @author Vladg24
*/

public class Vibrator {

    public Vibrator() {
    }

    public static void vibrate(int ms, Activity a) {
        for (int i = 0; i < ms; i++) {
            a.setLocation(500 + 10, 250 + 10);
            a.setLocation(500 - 10, 250 - 10);
        }
    }
}

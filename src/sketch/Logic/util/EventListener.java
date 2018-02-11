package sketch.Logic.util;

import java.awt.event.ActionListener;
import sketch.Logic.variables.Button;

public interface EventListener extends ActionListener {

    public void onCreate();

    public void onClick(Button b);
}

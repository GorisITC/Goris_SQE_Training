/*
This is the abstract parent class for different shape classes, like rectangle, oval,
polygon and triangle. It provides an abstract method draw().
 */

import java.util.*;
import java.awt.*;

public abstract class Shapes {
    /** abstract method drow()
     @return void
     */
    public abstract void draw(java.util.List list, Graphics g);
}

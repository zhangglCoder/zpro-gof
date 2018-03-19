package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 物流管理
 */
public class LogisticsManger implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(arg+"发生变化");
    }
}

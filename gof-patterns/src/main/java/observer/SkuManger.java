package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 库存管理者
 */
public class SkuManger implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(arg+"发生变化");
    }
}

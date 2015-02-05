package observer.LapsedListenerProblem;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 监听者失效:监听者的lifecycle要比发布者的短,无法进行有效回收,导致内存溢出
 *
 * Created by wzyoung on 2015/2/5.
 */
public class LapsedListenerTest {

    public static class A {
        private String name;

        private List<PropertyChangeListener> listeners = new CopyOnWriteArrayList<PropertyChangeListener>();

        public A(String name) {
            this.name = name;
        }

        public void addListener(PropertyChangeListener listener) {
            listeners.add(listener);
        }

        private void fire(String property, Object oldValues, Object newValues) {
            for (PropertyChangeListener listener : listeners) {
                listener.propertyChange(
                        new PropertyChangeEvent(this, property, oldValues, newValues));
            }
        }

        public void setName(String name) {
            String oldValue = this.name;
            this.name = name;
            fire("name", oldValue, name);
        }

    }

    public static class B implements PropertyChangeListener {

        private A a;
        private int id;
        // 占用内存
        private Byte[] bytes = new Byte[1024 * 1024];

        public B(A a, int id) {
            this.a = a;
            this.id = id;
            this.a.addListener(this);
        }

        @Override
        public void propertyChange(PropertyChangeEvent evt) {

            System.out.println("on B-" + this.id + "--property:" + evt.getPropertyName() + ",newValue:" +
                    evt.getNewValue() + ",oldValue:" + evt.getOldValue());
        }
    }

    public static void main(String[] args) {

        A a = new A("name");
        int j = 0;
        while (true) {
            B b = new B(a, j);
            a.setName("name" + j);
            j++;
        }


    }

}

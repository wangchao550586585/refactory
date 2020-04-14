package HandleGeneralizationRelationship.ReplaceInheritanceWithDelegation.refactory;

import java.util.Vector;

/**
 * Created by Administrator on 2017/5/17.
 */
public class Refactory {
    private Vector vector = new Vector();

    public void push(Object element) {
        vector.insertElementAt(element, 0);
    }

    public Object pop() {
        Object firstElement = vector.firstElement();
        vector.removeElementAt(0);
        return firstElement;
    }

    public int size() {
        return vector.size();
    }

    public boolean isEmpty() {
        return vector.isEmpty();
    }
}

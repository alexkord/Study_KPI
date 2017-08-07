
import javax.swing.undo.UndoableEditSupport;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.UnaryOperator;

public class MyArrayList<E> extends ArrayList<E> {

    @Override
    public E set(int index, E element) {
        throw new UnsupportedOperationException("'set' isn't supported");
    }

    @Override
    public E remove(int index) {
        throw new UnsupportedOperationException("'remove' isn't supported");
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("'remove' isn't supported");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("'clear' isn't supported");
    }

    @Override
    public void removeRange(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("'removeRange' isn't supported");
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("'removeAll' isn't supported");
    }

    @Override
    public void replaceAll(UnaryOperator<E> operator) {
        throw new UnsupportedOperationException("'replaceAll' isn't supported");
    }
}

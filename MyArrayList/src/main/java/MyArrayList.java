
import javax.swing.undo.UndoableEditSupport;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.UnaryOperator;

public class MyArrayList<E> extends ArrayList<E> {
    public static final String ERROR_MESSAGE = "command doesn't support";

    @Override
    public E set(int index, E element) {
        throw new UnsupportedOperationException(ERROR_MESSAGE);
    }

    @Override
    public E remove(int index) {
        throw new UnsupportedOperationException(ERROR_MESSAGE);
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException(ERROR_MESSAGE);
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException(ERROR_MESSAGE);
    }

    @Override
    public void removeRange(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException(ERROR_MESSAGE);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException(ERROR_MESSAGE);
    }

    @Override
    public void replaceAll(UnaryOperator<E> operator) {
        throw new UnsupportedOperationException(ERROR_MESSAGE);
    }
}

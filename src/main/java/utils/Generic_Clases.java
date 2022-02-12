package utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

/**
 * Re-implementation of the ArrayList<E> list that represents the classes of a
 * student
 * 
 * @author danielsr
 *
 * @param <E>
 */
@SuppressWarnings("serial")
public class Generic_Clases<E> extends ArrayList<E> {
	/**
	 * If the size is less than 10, the class will be added to the list and return
	 * true. If the size is 10, it will not add the class and return false.
	 * 
	 * @param clase Object 'Clases' that will be passed.
	 * @return True if size is less than 10, false if size equals 10
	 */
	public boolean addClaseActual(E clase) {
		if (this.size() < 10)
			return add(clase);
		else
			return false;
	}

	/**
	 * @deprecated Function not allowed for this list.
	 */
	@Override
	public void clear() {
	}

	/**
	 * @deprecated Function not allowed for this list.
	 */
	@Override
	public E remove(int i) {
		return null;
	}

	/**
	 * @return
	 * @deprecated Function not allowed for this list.
	 */
	@Override
	public boolean remove(Object o) {
		return false;
	}

	/**
	 * @return
	 * @deprecated Function not allowed for this list.
	 */
	@Override
	public boolean removeAll(Collection<?> c) {
		return false;
	}

	/**
	 * @return
	 * @deprecated Function not allowed for this list.
	 */
	@Override
	public boolean removeIf(Predicate<? super E> p) {
		return false;
	}
}

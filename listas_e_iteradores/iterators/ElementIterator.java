package iterators;

import java.util.Iterator;
import java.util.NoSuchElementException;

import node_list.Position;
import node_list.PositionList;


public class ElementIterator<E> implements Iterator<E> {
	protected PositionList<E> list; // a lista subjacente
	protected Position<E> cursor; // a próxima posição

	/** Cria o elemento iterador sobre a lista fornecida. */
	public ElementIterator(PositionList<E> L) {
		list = L;
		cursor = (list.isEmpty()) ? null : list.first();
	}

	public boolean hasNext() {
		return (cursor != null);
	}

	public E next() throws NoSuchElementException {
		if (cursor == null)
			throw new NoSuchElementException("No next element");
		E toReturn = cursor.element();
		cursor = (cursor == list.last()) ? null : list.next(cursor);
				
		return toReturn;
	}
}
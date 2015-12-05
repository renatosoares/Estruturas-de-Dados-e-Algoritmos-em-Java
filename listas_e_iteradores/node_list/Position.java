package node_list;

import tree.InvalidPositionException;

public interface Position<E> {
	/** Return the element stored at this position. 
	 * @throws InvalidPositionException */
	E element() throws InvalidPositionException;
}

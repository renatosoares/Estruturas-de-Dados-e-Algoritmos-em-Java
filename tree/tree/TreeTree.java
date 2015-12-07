package tree;

import java.util.Iterator;

import node_list.Position;

public class TreeTree<E> implements Tree<E> {

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Position<E>> positions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E replace(Position<E> v, E e) throws InvalidPositionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Position<E> root() throws EmptyTreeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Position<E> parent(Position<E> v) throws InvalidPositionException, BoundaryViolationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Position<E>> children(Position<E> v) throws InvalidPositionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isInternal(Position<E> v) throws InvalidPositionException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isExternal(Position<E> v) throws InvalidPositionException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isRoot(Position<E> v) throws InvalidPositionException {
		// TODO Auto-generated method stub
		return false;
	}

}

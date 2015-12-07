package tree;

import java.util.Iterator;

import node_list.Position;

public class TreeTree<E> implements Tree<E> {

	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public Iterable<Position<E>> positions() {
		// TODO Auto-generated method stub
		return null;
	}

	public E replace(Position<E> v, E e) throws InvalidPositionException {
		// TODO Auto-generated method stub
		return null;
	}

	public Position<E> root() throws EmptyTreeException {
		// TODO Auto-generated method stub
		return null;
	}

	public Position<E> parent(Position<E> v) throws InvalidPositionException, BoundaryViolationException {
		// TODO Auto-generated method stub
		return null;
	}

	public Iterable<Position<E>> children(Position<E> v) throws InvalidPositionException {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isInternal(Position<E> v) throws InvalidPositionException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isExternal(Position<E> v) throws InvalidPositionException {
		return false;
	}

	public boolean isRoot(Position<E> v) throws InvalidPositionException {
		return false;
	}
	// se v é raiz, então profundidade de v igual a zero
	// em qualquer outro caso, a profundidade de v e um mais profundidade do pai de v
	public static <E> int depth(Tree<E> T, Position<E> v) throws Exception, Exception {
		if (T.isRoot(v))
			return 0;
		else
			return 1 + depth(T, T.parent(v));
	}
	// se v é um nodo externo, então a altura de v é igual a zero
	// em qualquer outro caso, a altura de v é um mais a altura maxima dos filhos de v
	public static <E> int height1(Tree<E> T) throws Exception {
		int h = 0;
		for (Position<E> v : T.positions()) {
			if (T.isExternal(v))
				h = Math.max(h, depth(T, v));
		}
		return h;
	}
/*
 * Em um caminhamento preOrder() de uma árvore T, a raiz de T é visitada primeiro e,
então, as subárvores, cujas raízes são seus filhos, são percorridas recursivamente.
Se a árvore esta ordenada então as subarvores são percorridas de acordo com a ordem
dos filhos.

 * */
	public static <E> String toStringPreorder(Tree<E> T, Position<E> v) throws Exception {
		String s = v.element().toString(); // the main "visit" action
		for (Position<E> w : T.children(v))
			s += ", " + toStringPreorder(T, w);
		return s;
	}
/*	Sendo uma variação do método toStringPreorder, ele implementa a definição fornecida anteriormente 
 * para gerar um representação string usando parêntes de uma ávore T. */
	
	public static <E> String parentheticRepresentation(Tree<E> T, Position<E> v) throws Exception {
		String s = v.element().toString(); // main visit action
		if (T.isInternal(v)) {
			Boolean firstTime = true;
			for (Position<E> w : T.children(v))
				if (firstTime) {
					s += " ( " + parentheticRepresentation(T, w); // the first
																	// child
					firstTime = false;
				} else
					s += ", " + parentheticRepresentation(T, w); // subsequent
																	// child
			s += " )"; // close parenthesis
		}
		return s;
	}
	
/*Caminhamento posOrder() primeiro percorre recursivamente as subárvores enraizadas
 *  no filhos da raiz, e depois visita a raiz.
*/
	public static <E> String toStringPostorder(Tree<E> T, Position<E> v) throws Exception {
		String s = "";
		for (Position<E> w : T.children(v))
			s += toStringPostorder(T, w) + " ";
		s += v.element(); // main visit action
		return s;
	}

}

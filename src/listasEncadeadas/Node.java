package listasEncadeadas;

/** Node of a singly linked list of strings. */
public class Node {
	private String element; // assumimos que os elemento são strings
	private Node next;

	/** Cria um nodo com um dado elemento e o próximo nodo. */
	public Node(String s, Node n) {
		element = s;
		next = n;
	}

	/** Retorna o elemento desse nodo. */
	public String getElement() {
		return element;
	}

	/** Retorna o próximo elemento deste nodo. */
	public Node getNext() {
		return next;
	}

	// Médodos modificados:
	/** Define o elemento deste nodo */
	public void setElement(String newElem) {
		element = newElem;
	}

	/** Define o próximo elemento deste nodo */
	public void setNext(Node newNext) {
		next = newNext;
	}
}

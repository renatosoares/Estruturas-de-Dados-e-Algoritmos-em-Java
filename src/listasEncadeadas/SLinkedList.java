package listasEncadeadas;

/** Lista simplismente encadeada . */
public class SLinkedList {
	protected Node head; // nodo cabeça da lista
	protected Node tail; // nodo calda da lista
	protected long size; // números de nodos da lista

	/** Construtor padrão que cria uma lista vázia */
	public SLinkedList() {
		head = null;
		size = 0;
	}
	// ...os métodos de pesquisa e atualização vão aqui ...
	
	// insersão de um elemento na cabeça de uma lista simplesmente encadeada
	public void addFirst(Node v) {
		v.setNext(head);
		head = v;
		size = size + 1;
	}
	// insersão de um elemento na calda 
	public void addLast(Node v) {
		v.setNext(null);
		tail.setNext(v);
		tail = v;
		size = size + 1;
	}
}

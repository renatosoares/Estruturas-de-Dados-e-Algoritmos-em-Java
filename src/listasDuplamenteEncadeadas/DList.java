package listasDuplamenteEncadeadas;

/** Lista duplamente encadeada com nodos do tipo DNode que armazenam strings */
public class DList {
	protected int size; // number of elements
	protected DNode header, trailer; // sentinels

	/** Construtor que cria uma lista vazia */
	public DList() {
		size = 0;
		header = new DNode(null, null, null); // Cria cabeça
		trailer = new DNode(null, header, null); // cria final
		header.setNext(trailer); // faz a cabeça e o final apontarem um para o outro
	}

	/** Retorna o número de elementos na lista */
	public int size() {
		return size;
	}

	/** Informa se a lista esta vazia */
	public boolean isEmpty() {
		return (size == 0);
	}

	/** Retorna o primeiro nodo da lista */
	public DNode getFirst() throws IllegalStateException {
		if (isEmpty())
			throw new IllegalStateException("List is empty");
		return header.getNext();
	}

	/** Retorna o último nodo da lista */
	public DNode getLast() throws IllegalStateException {
		if (isEmpty())
			throw new IllegalStateException("List is empty");
		return trailer.getPrev();
	}

	/**
	 * Retorna o nodo que antecede um dado nodo V. Gera erro se V é a cabeça
	 * 
	 */
	public DNode getPrev(DNode v) throws IllegalArgumentException {
		if (v == header)
			throw new IllegalArgumentException("Cannot move back past the header of the list");
		return v.getPrev();
	}

	/**
	 * Retorna o nodo que segue um dado nodo V. Gera erro se V é o final
	 * 
	 */
	public DNode getNext(DNode v) throws IllegalArgumentException {
		if (v == trailer)
			throw new IllegalArgumentException("Cannot move forward past the trailer of the list");
		return v.getNext();
	}

	/**
	 * insere um dado nodo Z antes de um dado nodo V. Gera um erro se V é a cabeça
	 * 
	 */
	public void addBefore(DNode v, DNode z) throws IllegalArgumentException {
		DNode u = getPrev(v); // Deve lançar uma IllegalArgumentException
		z.setPrev(u);
		z.setNext(v);
		v.setPrev(z);
		u.setNext(z);
		size++;
	}

	/**
	 * Insere um dado nodo Z depois de uma dado nodo V. Gera um erro se V é o final
	 * 
	 */
	public void addAfter(DNode v, DNode z) {
		DNode w = getNext(v); // Deve lançar uma IllegalArgumentException
		z.setPrev(v);
		z.setNext(w);
		w.setPrev(z);
		v.setNext(z);
		size++;
	}

	/** Insere o nodo fornecido no início da lista */
	public void addFirst(DNode v) {
		addAfter(header, v);
	}

	/** insere o nodo fornecido no fim da lista */
	public void addLast(DNode v) {
		addBefore(trailer, v);
	}

	/**
	 * Remove um dado nodo V da lista. Gera um erro se V é a cabeça ou o final
	 * 
	 */
	public void remove(DNode v) {
		DNode u = getPrev(v); // Deve lançar uma  IllegalArgumentException
		DNode w = getNext(v); // Deve lançar uma  IllegalArgumentException
		// Desconecta o nodo da lista
		w.setPrev(u);
		u.setNext(w);
		v.setPrev(null);
		v.setNext(null);
		size--;
	}

	/** indica se o nodo indicado possui um antecessor */
	public boolean hasPrev(DNode v) {
		return v != header;
	}

	/** indica se o nodo indicado possui um sucessor */
	public boolean hasNext(DNode v) {
		return v != trailer;
	}

	/** Retorna uma representação string da lista */
	public String toString() {
		String s = "[";
		DNode v = header.getNext();
		while (v != trailer) {
			s += v.getElement();
			v = v.getNext();
			if (v != trailer)
				s += ",";
		}
		s += "]";
		return s;
	}
}

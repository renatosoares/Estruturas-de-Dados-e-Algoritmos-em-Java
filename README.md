## Estruturas de Dados e Algoritmos

<p align="center">Implementação com a linguagem Java e com a IDE Eclipse</p>

------------------------------------------------------------------------

### :anchor: Projeto Orientado a Objetos

<p align="center">  ___ Conversão e genéricos ___  </p>

##### :scissors: Genéricos 

> Um tipo genérico é um tipo que não é definido em tempo de compilação, mas que é especificado em tempo de execução.


========================================================================


### :anchor: Arrays, Listas Encadeadas e Recursão

<p align="center">  ___ Listas Simplesmente encadeadas ___  </p>

##### :scissors: Implementando uma lista simplesmente encadeada 

> Definição da classe Node, a qual especifica o tipo dos objetos que serão armazenados nos nodos da lista. Os elementos serão strings.

##### :scissors: Inserção em uma lista simplesmente encadeada

> A idéia principal é que se cria um nodo novo, define-se sua ligação **next** para referir o mesmo objeto que **head** e, então, define-se **head** para apontar para o novo nodo.

##### :scissors: Inserindo um elemento na cauda de uma lista simplesmente encadeada

> Cria-se um nodo novo, atribui-se **null** para sua referência **next**, faz-se com que a referência **next** do nodo cauda aponte para este novo objeto, e que a referência para a cauda propriamente dita, **tail**, aponte para o nodo novo.

##### :scissors: Removendo um elemento em uma lista simplesmente encadeada

> A operação inversa da inserção de um novo elemento na cabeça de uma lista encadeada é a remoção de um elemento da cabeça da lista.

<p align="center">  ___ Listas duplamente encadeadas ___  </p>

##### :scissors: Sentinelas da cabeça e da calda 

> Acrescentados nodos especiais em ambas as extremidades de uma lista duplamente encadeada: um nodo **head** antes da cabeça da lista e um nodo **trailer** após a cauda da lista.

##### :scissors: Inserção no meio de uma lista duplamente encadeada

> Dado um nodo _v_ de uma lista duplamente encadeada, pode-se facilmente inserrir um no vo nodo **z** imediatamente após **v**.

##### :scissors: Remoção do meio de uma lista duplamente encadea

> Para remover o nodo **v**, basta fazer **u** e **w** apontarem um para o outro em vez de apontarem para **v**. 

##### :scissors: Implementação de uma lista duplamente encadeada

> Objetos da classe DNode, que armazena elementos **string**, são usados para todos os nodos da lista, incluindo os sentinelas **head** e **trailer**. A classe DList pode ser usada apenas para um alista duplamente encadeada de **strings**. Os métodos **getFirst** e **getLast** provêm acesso direto ao primeiro e último nodos da lista. Os métodos **getPrev** e **getNext** permitem percorrer a lista. Os métodos **getPrev** e **getNext** detectam os limites da lista. Os métodos **addFirst** e **addLast** acrescentam nodos no início e no fim da lista. Os métodos **addBefore** e **addAfter** acrescentam um nodo novo antes ou depois de um nodo existente. A existência de um único médoto de remoção, **remove**, não chega a ser uma restrição uma vez que é possível remover do início ou do fim de uma lista encadeada **L** executando **L.remove(L.getFirst())** ou  **L.remove(L.getLast())**, respectivemente. O método **toString** que converte a lista inteira em uma string é útil para propósitos de depuração e teste.

========================================================================





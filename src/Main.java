import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        listaEncadeada();
    }

    public static void pilha() {
        Stack<Integer> pilha = new Stack<>(); // criando uma instância de stack numérica

        // as pilhas em Java permitem 5 operações: push()[adicionar], pop()[remover], peek()[o último elemento], empty()[verifica se está vazia] e search()[procura um elemento]

        // adicionando inteiros de 0 a 9 na pilha
        for(int i=0; i<10; i++) {
            pilha.push(i);
        }
        System.out.println(pilha); // mostrando a pilha populada
        System.out.println(pilha.peek()); // -> 9 (último elemento)
        System.out.println(pilha.search(5)); // -> 5 (índice do elemento encontrado)
        System.out.println(pilha.pop()); // removendo o último elemento(9) [pop() retorna o objeto removido]
        System.out.println(pilha); // mostrando que a pilha agora vai de 0 a 8
    }

    public static void fila() {
        Queue<String> fila = new LinkedList<String>(); // criando um objeto de LinkedList, já que Queue é uma interface(mas dá no mesmo LinkedList implementa Queue)
        String input;
        Scanner sc = new Scanner(System.in);

        // adicionando nomes à Queue dinamicamente através de input
        for(int i=0; i<5; i++) {
            input = sc.nextLine();
            fila.add(input);    // -> add() permite adicionar elementos à Queue, assim como offer() [elementos adicionados ao final da fila]
        }
        System.out.println(fila); // -> uma fila com 5 nomes foi criada
        System.out.println(fila.remove()); // -> remove o primeiro elemento da minha Queue
        System.out.println(fila); // demonstra que o primeiro elemento foi removido
        // peek() retorna o primeiro elemento da fila
    }

    public static void listaEncadeada() {
        LinkedList<Integer> listaEncadeada = new LinkedList<>(); // instanciando um elemnto do tipo LinkedList

        // populando a lista encadeada
        for(int i=10; i<21; i++) {
            listaEncadeada.add(i);
        }
        System.out.println(listaEncadeada);
        listaEncadeada.remove(5); // removendo o elemento de índice 5
        // apesar de listas encadeadas não usarem índices, a classe LinkedList implementa métodos que utilizam índices para realizar algumas operações
        System.out.println(listaEncadeada);
    }
}
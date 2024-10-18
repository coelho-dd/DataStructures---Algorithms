import java.util.Stack; // java já possui uma classe pronta da linguagem que representa uma stack

public class Main {
    public static void main(String[] args) {
        pilha();
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
}
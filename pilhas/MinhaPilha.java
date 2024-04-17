package pilhas;

public class MinhaPilha {
  private int tamanhoMaximo;
  private char[] listaPilha;
  private int topo;

  // Método contrutor
  public MinhaPilha(int tamanho) {
    tamanhoMaximo = tamanho;
    listaPilha = new char[tamanhoMaximo];
    topo = -1;
  }

  // Funções da pilha
  public void push(char c) {
    listaPilha[++topo] = c;
  }

  public char pop() {
    if (isEmpty()) {
      System.out.println("A pilha está vazia");
    }
    return listaPilha[topo--];
  }

  public boolean isEmpty() {
    return topo == -1;
  }

  public char topo() {
    return listaPilha[topo];
  }
}
import java.io.IOException;

public class insertionSort {
    public static void main(String[] args) throws IOException {
        int quantidade = 1000;
        int[] vetor = new int[quantidade];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * quantidade);
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        System.out.println(" -------");



        long tempoInicial = System.currentTimeMillis();
        insertionSort(vetor);

        long tempoFinal = System.currentTimeMillis();

        System.out.println("Exceutado em =" + (tempoFinal - tempoInicial) + " ms");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }

    public static void insertionSort(int[] vetor) {
        int j;
        int key;
        int i;

        for (j = 1; j < vetor.length; j++) {
            key = vetor[j];
            for (i = j - 1; (i >= 0) && (vetor[i] > key); i--) {
                vetor[i + 1] = vetor[i];
            }
            vetor[i + 1] = key;
        }
    }
}
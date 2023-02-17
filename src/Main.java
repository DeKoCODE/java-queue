public class Main {
    public static void main(String[] args) {

        Fila<String> minhaFila = new Fila<>();

        minhaFila.enqueue("primeiro");
        minhaFila.enqueue("Segundo");
        minhaFila.enqueue("terceiro");
        minhaFila.enqueue("Terceiro");

        System.out.println(minhaFila);

        System.out.println(minhaFila.first());

    }
}

public class Main {

    public static void main(String[] args) {
        var operacoesMatematicas = new OperacoesMatematicas();

        var total = operacoesMatematicas.multiplicacao(1, 1);

        print(total);
    }

    private static void print(final int total) {
        System.out.printf("Resultado: %d", total);
    }

}

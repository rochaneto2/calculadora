public class Main {

    public static void main(String[] args) {
        var operacoesMatematicas = new OperacoesMatematicas();

        var total = operacoesMatematicas.subtracao(1, 1);

        print(total);
    }

    private static void print(final long total) {
        System.out.printf("Resultado da subtração: %d", total);
    }

}

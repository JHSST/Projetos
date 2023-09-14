public class OperacaoComercial {
    public static void main(String[] args) {

        Item produto1 = new Item("Produto 1", 100.0);
        Item produto2 = new Item("Produto 2", 50.0);
        Item servico1 = new Item("Serviço 1", 200.0);

        Imposto iss = new ISS();
        Imposto icms = new ICMS();
        Imposto ipi = new IPI();

        double valorTotal1 = produto1.valor + icms.calcularImposto(produto1.valor);
        double valorImposto1 = icms.calcularImposto(produto1.valor);
        double valorTotal2 = produto2.valor + icms.calcularImposto(produto2.valor);
        double valorImposto2 = icms.calcularImposto(produto2.valor);
        double valorTotal3 = servico1.valor + iss.calcularImposto(servico1.valor);
        double valorImposto3 = iss.calcularImposto(servico1.valor);

        System.out.println("Detalhes da Operação Comercial:");
        System.out.println("--------------------------------");

        System.out.println("Item: " + produto1.nome);
        System.out.println("Valor do Item: " + produto1.valor);
        System.out.println("Imposto/Taxa (" + icms.nome + "): " + valorImposto1);
        System.out.println("Valor Total: " + valorTotal1);
        System.out.println("--------------------------------");

        System.out.println("Item: " + produto2.nome);
        System.out.println("Valor do Item: " + produto2.valor);
        System.out.println("Imposto/Taxa (" + icms.nome + "): " + valorImposto2);
        System.out.println("Valor Total: " + valorTotal2);
        System.out.println("--------------------------------");

        System.out.println("Item: " + servico1.nome);
        System.out.println("Valor do Item: " + servico1.valor);
        System.out.println("Imposto/Taxa (" + iss.nome + "): " + valorImposto3);
        System.out.println("Valor Total: " + valorTotal3);
        System.out.println("--------------------------------");
    }
}

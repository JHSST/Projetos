import java.util.ArrayList;
import java.util.List;

public class Venda {
    private String cliente;
    private List<ItemVenda> itens;
    private double desconto;

    public Venda(String cliente) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
        this.desconto = 0.0;
    }

    public String getCliente() {
        return cliente;
    }

    public List<ItemVenda> getItens() {
        return itens;
    }

    public void adicionarItem(ItemVenda item) {
        itens.add(item);
    }

    public double calcularValorTotal() {
        return itens.stream().mapToDouble(ItemVenda::calcularValorTotal).sum();
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double calcularValorTotalComDesconto() {
        double total = calcularValorTotal();
        return total - desconto;
    }
}

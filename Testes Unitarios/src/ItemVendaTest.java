import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ItemVendaTest {

    @Test
    void testCriacao() {
        ItemVenda item = new ItemVenda("Produto 1", 10.0, 2);
        assertEquals("Produto 1", item.getDescricao());
        assertEquals(10.0, item.getValorUnitario());
        assertEquals(2, item.getQuantidade());
    }

    @Test
    void testValorTotal() {
        ItemVenda item = new ItemVenda("Produto 1", 10.0, 2);
        assertEquals(20.0, item.calcularValorTotal());
    }

    @Test
    void testAlteracaoQuantidade() {
        ItemVenda item = new ItemVenda("Produto 1", 10.0, 2);
        item.setQuantidade(3);
        assertEquals(30.0, item.calcularValorTotal());
    }
}

class VendaTest {

    @Test
    void testCriacao() {
        Venda venda = new Venda("Cliente 1");
        assertEquals("Cliente 1", venda.getCliente());
        assertTrue(venda.getItens().isEmpty());
    }

    @Test
    void testAdicaoItem() {
        Venda venda = new Venda("Cliente 1");
        venda.adicionarItem(new ItemVenda("Produto 1", 10.0, 2));
        assertEquals(1, venda.getItens().size());
        assertEquals(20.0, venda.calcularValorTotal());
    }

    @Test
    void testAplicacaoDesconto() {
        Venda venda = new Venda("Cliente 1");
        venda.adicionarItem(new ItemVenda("Produto 1", 100.0, 2));
        venda.setDesconto(10.0);
        assertEquals(190.0, venda.calcularValorTotalComDesconto());
    }
}

package app;

import model.ItemPedido;
import model.Pedido;

public class Papelaria {

    public static void main(String[] args) {

        System.out.println("=== PAPELARIA PONTO FINAL ===\n");

        
        Pedido pedido = new Pedido();

        
        pedido.adicionarItem(
                new ItemPedido("Caderno 10 materias", 24.90, 1, false)
        );

        pedido.adicionarItem(
                new ItemPedido("Lapis grafite", 1.50, 12, false)
        );

        pedido.adicionarItem(
                new ItemPedido("Kit escolar basico", 84.00, 1, true)
        );

        pedido.adicionarItem(
                new ItemPedido("Caneta azul", 2.80, 10, false)
        );

        pedido.exibirResumo();
    }
}


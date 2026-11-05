
package model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private static final double VALOR_MINIMO_FRETE_GRATIS = 150.0;
    private static final double VALOR_FRETE = 12.90;
    private static final double FRETE_GRATIS = 0.0;

    private List<ItemPedido> itens;

    public Pedido() {
        itens = new ArrayList<>();
    }


    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }


    public double calcularTotalItens() {
        double soma = 0.0;

        for (ItemPedido item : itens) {
            soma += item.calcularValorLiquido();
        }

        return soma;
    }

  
    public double calcularFrete() {
        return calcularFrete(calcularTotalItens());
    }

    public double calcularFrete(double valorItens) {
        if (valorItens >= VALOR_MINIMO_FRETE_GRATIS) {
            return FRETE_GRATIS;
        }

        return VALOR_FRETE;
    }

  
    public void exibirResumo() {
        for (ItemPedido item : itens) {
            item.exibirLinha();
        }

        double soma = calcularTotalItens();
        double frete = calcularFrete(soma);

        System.out.printf("%nItens:  R$ %.2f%n", soma);
        System.out.printf("Frete:  R$ %.2f%n", frete);
        System.out.printf("Total do pedido: R$ %.2f%n", soma + frete);
    }
}


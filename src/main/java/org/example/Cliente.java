package org.example;

public class Cliente {
    public String fazerPedido(String pedido) {
        return Vendedor.getInstancia().enviarPedidoLoja(pedido);
    }

    public String reclamar(String reclamacao) {
        return Vendedor.getInstancia().enviarReclamacaoCozinha(reclamacao);
    }

    public String pedirInformacao(String informacao) {
        return Vendedor.getInstancia().enviarInformacaoLoja(informacao);
    }
}

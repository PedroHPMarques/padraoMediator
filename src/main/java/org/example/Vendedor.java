package org.example;

public class Vendedor {
    private static Vendedor instancia = new Vendedor();

    private Vendedor() {}

    public static Vendedor getInstancia() {
        return instancia;
    }

    public String enviarPedidoLoja(String pedido) {
        return "Vendedor enviou pedido à loja.\n" +
                ">> " + Loja.getInstancia().receberPedido(pedido);
    }

    public String enviarReclamacaoCozinha(String reclamacao) {
        return "Vendedor enviou reclamação à loja.\n" +
                ">> " + Loja.getInstancia().receberReclamacao(reclamacao);
    }

    public String enviarInformacaoLoja(String informacao) {
        return "Vendedor enviou informacao à loja.\n" +
                ">> " + Loja.getInstancia().receberInformacao(informacao);
    }
}

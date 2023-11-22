package org.example;

public class Loja implements Setor {
    private static Loja instancia = new Loja();

    private Loja() {}

    public static Loja getInstancia() {
        return instancia;
    }

    public String receberPedido(String pedido) {
        return "Loja recebendo pedido: " + pedido;
    }

    public String receberReclamacao(String reclamacao) {
        return "Loja recebeu reclamação: " + reclamacao;
    }

    public String receberInformacao(String informacao) {
        return "Loja recebeu a informacao: " + informacao;
    }
}

package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
    @Test
    void deveFazerPedido() {
        Cliente cliente = new Cliente();
        assertEquals("Vendedor enviou pedido à loja.\n" +
                        ">> Loja recebendo pedido: Camisa G",
                cliente.fazerPedido("Camisa G"));
    }

    @Test
    void deveReclamar() {
        Cliente cliente = new Cliente();
        assertEquals("Vendedor enviou reclamação à loja.\n" +
                        ">> Loja recebeu reclamação: Tamanho errado",
                cliente.reclamar("Tamanho errado"));
    }

    @Test
    void devePedirInformacao() {
        Cliente cliente = new Cliente();
        assertEquals("Vendedor enviou informacao à loja.\n" +
                        ">> Loja recebeu a informacao: Tem outra cor?",
                cliente.pedirInformacao("Tem outra cor?"));
    }

}
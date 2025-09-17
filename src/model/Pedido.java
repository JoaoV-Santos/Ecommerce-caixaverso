package model;

import model.enums.StatusPagamento;
import model.enums.StatusPedido;

import java.time.LocalDateTime;
import java.util.List;

public class Pedido {
    private int id;
    private static int contador = 1;
    private Cliente cliente;
    LocalDateTime dataHora;
    StatusPedido statusPedido;
    StatusPagamento statusPagamento;
    private List<ItemPedido> itens;

    public Pedido (Cliente cliente ) {
        this.id = contador;
        contador++;
        dataHora = LocalDateTime.now();
        this.cliente = cliente;
        this.statusPedido = StatusPedido.ABERTO;
        this.statusPagamento = StatusPagamento.NENHUM;

    }
}

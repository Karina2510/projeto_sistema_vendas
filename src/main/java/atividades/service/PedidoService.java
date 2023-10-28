package atividades.service;

import atividades.domain.entity.Pedido;
import atividades.domain.enums.StatusPedido;
import atividades.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService {
    Pedido salvar(PedidoDTO dto);
    Optional<Pedido> obterPedidoCompleto(Integer id);

    void atualizaStatus(Integer id, StatusPedido statusPedido);
}

package com.exemplo.curso.entities.enums;

public enum PedidoStatus {

    AGUARDANDO_PAGAMENTO(1),
    PAGO(2),
    ENVIADO(3),
    ENTREGUE(4),
    CANCELADO(5);

    private int codigo;

    private PedidoStatus(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo(){
        return codigo;
    }

    public static PedidoStatus valueOf(int codigo){
        for (PedidoStatus pedido : PedidoStatus.values()){
            if(pedido.getCodigo() == codigo){
                return pedido;
            }
        }
        throw new IllegalArgumentException("Código inválido!");
    }
}

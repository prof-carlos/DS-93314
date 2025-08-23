package org.example.enums;

public class Cliente {
    private String nome;
    private Pedido pedido;
    private Cargos cargos;
    private Estado estado;

    public Cliente(String nome, Pedido pedido, Cargos cargos, Estado estado) {
        this.nome = nome;
        this.pedido = pedido;
        this.cargos = cargos;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Cargos getCargos() {
        return cargos;
    }

    public void setCargos(Cargos cargos) {
        this.cargos = cargos;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", pedido=" + pedido +
                ", cargos=" + cargos +
                ", estado=" + estado +
                '}';
    }
}

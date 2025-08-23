package org.example.enums;

public enum Estado {
    BAHIA("Bahia", "BA"),
    RIO_DE_JANEIRO("Rio de Janeiro", "RJ");

    private String nomeEstado;
    private String sigla;

    Estado(String nomeEstado, String sigla) {
        this.nomeEstado = nomeEstado;
        this.sigla = sigla;
    }

    public String getNomeEstado() {
        return nomeEstado;
    }

    public String getSigla() {
        return sigla;
    }
}

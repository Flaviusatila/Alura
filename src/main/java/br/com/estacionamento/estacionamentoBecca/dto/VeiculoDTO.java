package br.com.estacionamento.estacionamentoBecca.dto;

public class VeiculoDTO {

    private String placa;
    private String marca;
    private String modelo;
    private long  oid_tipo_veiculo;
    private double fatorEstacionamento;

    public double getFatorEstacionamento() {
        return fatorEstacionamento;
    }

    public void setFatorEstacionamento(double fatorEstacionamento) {
        this.fatorEstacionamento = fatorEstacionamento;
    }

    public long getOid_tipo_veiculo() {
        return oid_tipo_veiculo;
    }

    public void setOid_tipo_veiculo(long oid_tipo_veiculo) {
        this.oid_tipo_veiculo = oid_tipo_veiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}

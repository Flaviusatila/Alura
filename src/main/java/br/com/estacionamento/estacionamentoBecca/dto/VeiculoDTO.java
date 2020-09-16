package br.com.estacionamento.estacionamentoBecca.dto;


import br.com.estacionamento.estacionamentoBecca.enums.MarcaVeiculo;

import java.time.LocalDateTime;

public class VeiculoDTO {

    private java.lang.String placa;
    private String marcaveiculo;

    public String getMarcaveiculo() {
        return marcaveiculo;
    }

    public void setMarcaveiculo(String marcaveiculo) {
        this.marcaveiculo = marcaveiculo;
    }

    private String modelo;
    private long  oid_tipo_veiculo;
    private double fatorEstacionamento;
    private LocalDateTime horaEntrada;

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

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

    public java.lang.String getPlaca() {
        return placa;
    }

    public void setPlaca(java.lang.String placa) {
        this.placa = placa;
    }

//    public String getMarca(Model model) {
//        String marca = model.toString();
//        return marca;
//    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}

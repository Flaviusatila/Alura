package br.com.estacionamento.estacionamentoBecca.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Veiculo {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @NotNull
    private Long   id;
    private String placa;
    private String marca;
    private String modelo;
    private Double fatorEstacionamento;
    @NotNull
    private Long oid_tipo_veiculo;

    public void setOid_tipo_veiculo(Long oid_tipo_veiculo) {
        this.oid_tipo_veiculo = oid_tipo_veiculo;
    }

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "HH:mm dd-MM-yyyy")
    private LocalDateTime horaEntrada;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "HH:mm dd-MM-yyyy")
    private LocalDateTime horaSaida;

    private Double totalEstacionamento;

    public void setTotalEstacionamento(double totalEstacionamento) {
        this.totalEstacionamento = totalEstacionamento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Double getFatorEstacionamento() {
        return fatorEstacionamento;
    }

    public void setFatorEstacionamento(Double fatorEstacionamento) {
        this.fatorEstacionamento = fatorEstacionamento;
    }

    public Long getOid_tipo_veiculo() {
        return oid_tipo_veiculo;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalDateTime getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(LocalDateTime horaSaida) {
        this.horaSaida = horaSaida;
    }

    public Double getTotalEstacionamento() {
        return totalEstacionamento;
    }

    public void setTotalEstacionamento(Double totalEstacionamento) {
        this.totalEstacionamento = totalEstacionamento;
    }
}

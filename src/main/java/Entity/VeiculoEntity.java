package Entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "veiculo", schema="estacionamento")
public class VeiculoEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String placa;
    private String marca;
    private String modelo;
    private double fatorEstacionamento;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "HH:mm dd-MM-yyyy")
    private LocalDateTime horaEntrada;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "HH:mm dd-MM-yyyy")
    private LocalDateTime horaSaida;

    private double totalEstacionamento;

    public VeiculoEntity() {
    }

    public VeiculoEntity(String placa, String modelo, String marca) {
        super();
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
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

    public double getFatorEstacionamento() {
        return fatorEstacionamento;
    }

    public void setFatorEstacionamento(double fatorEstacionamento) {
        this.fatorEstacionamento = fatorEstacionamento;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
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

    public double getTotalEstacionamento() {
        return totalEstacionamento;
    }
}

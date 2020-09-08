package Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "veiculo")
public class VeiculoEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String placa;
    private String marca;
    private String modelo;
    private double fatorEstacionamento;
    private String horaEntrada;
    private String horaSaida;
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

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(String horaSaida) {
        this.horaSaida = horaSaida;
    }

    public double getTotalEstacionamento() {
        return totalEstacionamento;
    }
}

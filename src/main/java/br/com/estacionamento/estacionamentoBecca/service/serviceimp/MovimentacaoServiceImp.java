package br.com.estacionamento.estacionamentoBecca.service.serviceimp;


import br.com.estacionamento.estacionamentoBecca.model.Estacionamento;
import br.com.estacionamento.estacionamentoBecca.model.Movimentacao;
import br.com.estacionamento.estacionamentoBecca.model.Veiculo;
import br.com.estacionamento.estacionamentoBecca.repository.EstacionamentoRepository;
import br.com.estacionamento.estacionamentoBecca.repository.MovimentacaoRepository;
import br.com.estacionamento.estacionamentoBecca.repository.VeiculoRepository;
import br.com.estacionamento.estacionamentoBecca.service.CalculosService;
import br.com.estacionamento.estacionamentoBecca.service.MovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovimentacaoServiceImp implements MovimentacaoService, CalculosService {

    @Autowired
    MovimentacaoRepository movimentacaoRepository;

    @Autowired
    VeiculoRepository veiculoRepository;


    @Autowired
    EstacionamentoRepository estacionamentoRepository;

    private Double horaSessao;
    private Long   idEstacionamento;

    @Override
    public void saidaVeiculo(Veiculo veiculo, Movimentacao movimentacao) {
        Double varaivel = totalFaturamento(veiculo,movimentacao);
        veiculo.setTotalEstacionamento( varaivel );
        movimentacao.setTotal_valor_estacionado_movimentado( varaivel );
        movimentacao.setId_tipo_veiculo( veiculo.getOid_tipo_veiculo() );
        movimentacao.setId_veiculo( veiculo.getId() );
        movimentacao.getId_estacionamento();
        movimentacaoRepository.save( movimentacao );
        veiculoRepository.save( veiculo );
    }

    @Override
    public Movimentacao save(Movimentacao movimentacao) {
        this.horaSessao = movimentacao.getHrEstacionamentoCobrado();
        this.idEstacionamento = movimentacao.getId_estacionamento();
        return movimentacaoRepository.save( movimentacao );
    }

    @Override
    public Double pegaHoraCobradaBanco() {
        return this.horaSessao;
    }

    @Override
    public Long pegaIdEstacionamento() {
        return this.idEstacionamento;
    }


    public Double totalFaturamento(Veiculo veiculo, Movimentacao movimentacao) {
        int horaDuration = veiculo.getHoraSaida().getHour() - veiculo.getHoraEntrada().getHour();
        int minutoDuration = veiculo.getHoraSaida().getMinute();
        Double valorTotalEstacionado = 0.0;
        if (horaDuration > 0) {
            valorTotalEstacionado = Double.valueOf( horaDuration * movimentacao.getHrEstacionamentoCobrado( ) );
            if (minutoDuration >= 30)
                valorTotalEstacionado += Double.valueOf( movimentacao.getHrEstacionamentoCobrado( ) );
            if (veiculo.getFatorEstacionamento() != 0)
                valorTotalEstacionado = valorTotalEstacionado * 1.15;

        }else  if (minutoDuration >= 30){
            valorTotalEstacionado = Double.valueOf( movimentacao.getHrEstacionamentoCobrado( ) );
            if (veiculo.getFatorEstacionamento() != 0)
                valorTotalEstacionado = valorTotalEstacionado * 1.15;
        }
        System.out.println(horaDuration);
        System.out.println(minutoDuration);
        System.out.println("Estou sendo executado " + valorTotalEstacionado);
        return valorTotalEstacionado;
    }
}

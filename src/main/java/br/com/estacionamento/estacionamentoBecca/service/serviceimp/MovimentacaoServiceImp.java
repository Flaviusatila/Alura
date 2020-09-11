package br.com.estacionamento.estacionamentoBecca.service.serviceimp;


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

    @Override
    public Veiculo saidaVeiculo(Veiculo veiculo) {
        Movimentacao movimentacao = new Movimentacao();
        long varaivel = totalFaturamento();
        veiculo.setTotalEstacionamento( varaivel );
        movimentacao.setTotal_valor_estacionado_movimentado( varaivel );
        movimentacao.setId_tipo_veiculo( veiculo.getOid_tipo_veiculo() );
        movimentacao.setId_veiculo( veiculo.getId() );
        movimentacao.setId_estacionamento( 8 );
        movimentacaoRepository.save( movimentacao );
        return veiculoRepository.save( veiculo );
    }

    @Override
    public Movimentacao save(Movimentacao movimentacao) {
        return movimentacaoRepository.save( movimentacao );
    }

    @Override
    public long totalFaturamento() {
        long valor_hr = 5;
        long total_horas = 3;
        long fator_hora = 1;
        long valor_horas = total_horas * valor_hr;
        if (fator_hora != 0) {
            valor_horas = ( long ) (valor_horas * 0.15);
        }
        System.out.println("Estou sendo executado " + valor_horas);
        return valor_horas;
    }
}

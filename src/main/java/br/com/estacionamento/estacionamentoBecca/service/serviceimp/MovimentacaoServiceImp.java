package br.com.estacionamento.estacionamentoBecca.service.serviceimp;

import br.com.estacionamento.estacionamentoBecca.model.Estacionamento;
import br.com.estacionamento.estacionamentoBecca.model.Movimentacao;
import br.com.estacionamento.estacionamentoBecca.model.Veiculo;
import br.com.estacionamento.estacionamentoBecca.repository.MovimentacaoRepository;
import br.com.estacionamento.estacionamentoBecca.service.MovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovimentacaoServiceImp implements MovimentacaoService {

    @Autowired
    MovimentacaoRepository movimentacaoRepository;

    @Override
    public Movimentacao save(Movimentacao movimentacao) {
        Veiculo v1 =  new Veiculo();
        Estacionamento e1 = new Estacionamento();

        movimentacao.setId_estacionamento( e1.getId() );
        movimentacao.setTotal_valor_estacionado_movimentado( ( long ) v1.getTotalEstacionamento() );
        movimentacao.setId_tipo_veiculo( v1.getOid_tipo_veiculo() );
        movimentacao.setId_veiculo( v1.getId() );

        return movimentacaoRepository.save( movimentacao );
    }
}

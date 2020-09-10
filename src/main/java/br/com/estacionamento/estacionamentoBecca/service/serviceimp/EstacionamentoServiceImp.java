package br.com.estacionamento.estacionamentoBecca.service.serviceimp;

import br.com.estacionamento.estacionamentoBecca.model.Estacionamento;
import br.com.estacionamento.estacionamentoBecca.repository.EstacionamentoRepository;
import br.com.estacionamento.estacionamentoBecca.service.EstacionamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EstacionamentoServiceImp implements EstacionamentoService {

    @Autowired
    EstacionamentoRepository estacionamentoRepository;


    @Override
    public List<Estacionamento> findAll() {
        return estacionamentoRepository.findAll();
    }

    @Override
    public Estacionamento save(Estacionamento estacionamento) {
        return estacionamentoRepository.save(estacionamento);
    }

//    @Override
//    public Estacionamento save(Estacionamento estacionamento) {
//
//        @Query(value = "SELECT SUM(total_faturamento) FROM movimentacao")
//        Long a;
//        estacionamento.setTotalFaturamento(a);
//
//        @Query(value = "SELECT SUM(total_faturamento) FROM movimentacao WHERE oid_tipo_veiculo = 1")
//        Long b;
//        estacionamento.setTotalFaturamentoUtilitario( b );
//
//        @Query(value = "SELECT SUM(total_faturamento) FROM movimentacao WHERE oid_tipo_veiculo = 2")
//        Long c;
//        estacionamento.setTotalFaturamentoCarro( c );
//
//        @Query(value = "SELECT SUM(total_faturamento) FROM movimentacao WHERE oid_tipo_veiculo = 3")
//        long d;
//        estacionamento.setTotalFaturamentoMoto( d );
//        return estacionamentoRepository.save(estacionamento);
//    }
}

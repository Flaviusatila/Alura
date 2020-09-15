package br.com.estacionamento.estacionamentoBecca.controller;

import br.com.estacionamento.estacionamentoBecca.dto.EstacionamentoDTO;
import br.com.estacionamento.estacionamentoBecca.dto.MovimentacaoDTO;
import br.com.estacionamento.estacionamentoBecca.dto.VeiculoDTO;
import br.com.estacionamento.estacionamentoBecca.model.Estacionamento;
import br.com.estacionamento.estacionamentoBecca.model.Movimentacao;
import br.com.estacionamento.estacionamentoBecca.model.Veiculo;
import br.com.estacionamento.estacionamentoBecca.service.EstacionamentoService;
import br.com.estacionamento.estacionamentoBecca.service.MovimentacaoService;
import br.com.estacionamento.estacionamentoBecca.service.VeiculosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDateTime;

@Controller
public class MovimentacaoControlle {

    @Autowired
    VeiculosService veiculosService;


    @Autowired
    MovimentacaoService movimentacaoService;

    @RequestMapping(value = "/veiculos/{id}", method = RequestMethod.POST)
    public String salvarMovimentacaoSaida(
            @PathVariable("id") long id){
       Veiculo veiculos = veiculosService.findById(id);
       veiculos.setHoraSaida( LocalDateTime.now() );
       Movimentacao movimentacao = new Movimentacao();
       movimentacao.setHrEstacionamentoCobrado( movimentacaoService.pegaHoraCobradaBanco() );
       movimentacao.setId_estacionamento( movimentacaoService.pegaIdEstacionamento() );
       movimentacaoService.saidaVeiculo( veiculos , movimentacao);
        return "redirect:/veiculos";
    }

}

package br.com.estacionamento.estacionamentoBecca.controller;

import br.com.estacionamento.estacionamentoBecca.dto.EstacionamentoDTO;
import br.com.estacionamento.estacionamentoBecca.model.Estacionamento;
import br.com.estacionamento.estacionamentoBecca.model.Movimentacao;
import br.com.estacionamento.estacionamentoBecca.service.EstacionamentoService;
import br.com.estacionamento.estacionamentoBecca.service.MovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import java.util.List;

@Controller
public class EstacionamentoController {

    @Autowired
    EstacionamentoService estacionamentoService;

    @Autowired
    MovimentacaoService movimentacaoService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView getEstacionamento(){
        ModelAndView mv = new ModelAndView("estacionamentos");
        List<Estacionamento> estacionamentos = estacionamentoService.findAll();
        mv.addObject("estacionamento",estacionamentos);
        mv.setViewName( "index" );
        return mv;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String getEstacionamento(EstacionamentoDTO estacionamentoDTO){
        Estacionamento estacionamento = new Estacionamento();
        Movimentacao movimentacao = new Movimentacao();
        estacionamento.setValorHora( estacionamentoDTO.getValorHora());
        estacionamentoService.save( estacionamento );
        movimentacao.setId_estacionamento( estacionamento.getId() );
        movimentacao.setHrEstacionamentoCobrado( estacionamentoDTO.getValorHora() );
        movimentacaoService.save( movimentacao );

       return "redirect:/veiculos";
    }

}

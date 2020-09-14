package br.com.estacionamento.estacionamentoBecca.controller;

import br.com.estacionamento.estacionamentoBecca.dto.EstacionamentoDTO;
import br.com.estacionamento.estacionamentoBecca.model.Estacionamento;
import br.com.estacionamento.estacionamentoBecca.model.Veiculo;
import br.com.estacionamento.estacionamentoBecca.service.EstacionamentoService;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class EstacionamentoController {

    @Autowired
    EstacionamentoService estacionamentoService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView getEstacionamento(){
        ModelAndView mv = new ModelAndView("estacionamentos");
        List<Estacionamento> estacionamentos = estacionamentoService.findAll();
        mv.addObject("estacionamento",estacionamentos);
        mv.setViewName( "index" );
        return mv;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String getEstacionamento(EstacionamentoDTO estacionamentoDTO, RedirectAttributes atributes){
        Estacionamento estacionamento = new Estacionamento();
        estacionamento.setValorHora( estacionamentoDTO.getValorHora() );
        estacionamentoService.save( estacionamento );
       return "redirect:/veiculos";
    }

}

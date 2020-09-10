package br.com.estacionamento.estacionamentoBecca.controller;


import br.com.estacionamento.estacionamentoBecca.model.Veiculo;
import br.com.estacionamento.estacionamentoBecca.service.VeiculosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class VeiculoController {

    @Autowired
    VeiculosService veiculosService;

    @RequestMapping(value = "/veiculos", method = RequestMethod.GET)
    public ModelAndView getVeiculos(){
        ModelAndView mv = new ModelAndView("veiculos");
        List<Veiculo> veiculos = veiculosService.findAll();
        mv.addObject("veiculos",veiculos);
        return mv;
    }

    @RequestMapping(value = "/veiculos/{id}", method = RequestMethod.GET)
    public ModelAndView getVeiculosSaida(@PathVariable("id") long id){
        ModelAndView mv = new ModelAndView("saidaVeiculos");
        Veiculo veiculos = veiculosService.findById(id);
        mv.addObject("veiculos",veiculos);
        return mv;
    }

}

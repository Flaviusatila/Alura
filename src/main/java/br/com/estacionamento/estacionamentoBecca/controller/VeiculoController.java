package br.com.estacionamento.estacionamentoBecca.controller;

import br.com.estacionamento.estacionamentoBecca.model.Veiculo;
import br.com.estacionamento.estacionamentoBecca.service.VeiculosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

public class VeiculoController {

    @Autowired
    VeiculosService veiculosService;

    @RequestMapping(value = "/veiculos", method = RequestMethod.GET)
    public ModelAndView getPost(){
        ModelAndView mv = new ModelAndView("veiculos");
        List<Veiculo> veiculos = veiculosService.findAll();
        mv.addObject("veiculos",veiculos);
        return mv;
    }

}

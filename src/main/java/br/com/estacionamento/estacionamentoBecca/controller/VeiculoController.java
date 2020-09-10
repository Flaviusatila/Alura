package br.com.estacionamento.estacionamentoBecca.controller;


import br.com.estacionamento.estacionamentoBecca.model.Veiculo;
import br.com.estacionamento.estacionamentoBecca.service.VeiculosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class VeiculoController {

    @Autowired
    VeiculosService veiculosService;


//    @GetMapping("/veiculos")
//    public String veiculos(){
//        return "veiculos";
//    }
//    @RequestMapping("/")
//    public String index(){
//        return "index";
//    }
//
//    @RequestMapping("/welcome")
//    public String welcomepage() {
//        return "Welcome to Yawin Tutor";
//    }
    @RequestMapping(value = "/veiculos", method = RequestMethod.GET)
    public ModelAndView getPost(){
        ModelAndView mv = new ModelAndView("veiculos");
        List<Veiculo> veiculos = veiculosService.findAll();
        mv.addObject("veiculos",veiculos);
        return mv;
    }

}

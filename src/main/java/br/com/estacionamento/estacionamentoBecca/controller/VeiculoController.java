package br.com.estacionamento.estacionamentoBecca.controller;


import br.com.estacionamento.estacionamentoBecca.dto.VeiculoDTO;
import br.com.estacionamento.estacionamentoBecca.model.Veiculo;
import br.com.estacionamento.estacionamentoBecca.service.VeiculosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDateTime;
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
    @RequestMapping(value = "/veiculos", method = RequestMethod.POST)
    public String salvarVeiculo(VeiculoDTO veiculoDto, RedirectAttributes atributes){
        Veiculo veiculo = new Veiculo();
        veiculo.setHoraEntrada(LocalDateTime.now());
        veiculo.setPlaca( veiculoDto.getPlaca() );
        veiculo.setModelo( veiculoDto.getModelo() );
        veiculo.setMarca( veiculoDto.getMarca() );
        veiculo.setOid_tipo_veiculo( veiculoDto.getOid_tipo_veiculo() );
        veiculosService.save(veiculo);
        return "redirect:/veiculos";
    }

}

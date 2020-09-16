package br.com.estacionamento.estacionamentoBecca.controller;


import br.com.estacionamento.estacionamentoBecca.dto.VeiculoDTO;
import br.com.estacionamento.estacionamentoBecca.enums.MarcaVeiculo;
import br.com.estacionamento.estacionamentoBecca.model.Veiculo;
import br.com.estacionamento.estacionamentoBecca.service.VeiculosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Controller
public class VeiculoController {

    @Autowired
    VeiculosService veiculosService;

    @RequestMapping(value = "/veiculos", method = RequestMethod.GET)
    public ModelAndView getVeiculos(
            @RequestParam(name = "placa", required = false) String placa){
        if (StringUtils.isEmpty( placa )){
            ModelAndView mv = new ModelAndView("veiculos");
            List<Veiculo> veiculos = veiculosService.findAll();
            mv.addObject("veiculos",veiculos);
//            mv.addObject( "marcaveiculo", MarcaVeiculo.values() );
//          mv.addObject( veiculos );
//            mv.addObject( MarcaVeiculo.values() );
            return mv;
        }
            ModelAndView mv = new ModelAndView("saidaVeiculos");
            Optional<Veiculo> veiculos = veiculosService.findOne(placa);
            mv.addObject("veiculo",veiculos.get());
            mv.setViewName( "saidaVeiculos" );
            return mv;
    }

//    @RequestMapping(value = "/veiculos", method = RequestMethod.GET)
//    public ModelAndView getVeiculos() {
//        ModelAndView mav = new ModelAndView("veiculos");
//        mav.addObject("veiculo", veiculosService.findAll());
//        return mav;
//    }

    @RequestMapping(value = "/veiculos/{id}", method = RequestMethod.GET)
    public ModelAndView getVeiculosSaida(@PathVariable("id") long id){
        ModelAndView mv = new ModelAndView("saidaVeiculos");
        Veiculo veiculos = veiculosService.findById(id);
        mv.addObject("veiculo",veiculos);
        mv.setViewName( "saidaVeiculos" );
        return mv;
    }


    @RequestMapping(value = "/veiculos", method = RequestMethod.POST)
    public java.lang.String salvarVeiculo(VeiculoDTO veiculoDto){
        Veiculo veiculo = new Veiculo();
        veiculo.setHoraEntrada(LocalDateTime.now());
        veiculo.setPlaca( veiculoDto.getPlaca() );
        veiculo.setModelo( veiculoDto.getModelo() );
        veiculo.setMarcaveiculo( veiculoDto.getMarcaveiculo() );
        veiculo.setFatorEstacionamento( veiculoDto.getFatorEstacionamento());
        veiculo.setOid_tipo_veiculo( veiculoDto.getOid_tipo_veiculo() );
        veiculosService.save(veiculo);
        return "redirect:/veiculos";
    }

}

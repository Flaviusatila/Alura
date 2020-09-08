package Controller;

import Entity.VeiculoEntity;
import Repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class VeiculoController {


    @Autowired
    private VeiculoRepository repository;

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("veiculo")
    public String veiculo(Model model){

        Iterable<VeiculoEntity> veiculos = repository.findAll();

        model.addAttribute("veiculos", veiculos);

        return "veiculos";
    }

    @RequestMapping(value = "salvar", method = RequestMethod.POST )
    public String salvar(@RequestParam("placa") String placa, @RequestParam("modelo")String modelo,
                         @RequestParam("marca") String marca, Model model){

        VeiculoEntity novoVeiculo = new VeiculoEntity(placa, modelo, marca);

        repository.save(novoVeiculo);

        Iterable<VeiculoEntity> veiculos = repository.findAll();


        model.addAttribute("veiculos", veiculos);

        return "veiculos";

    }

}

package Service;

import Entity.VeiculoEntity;

import java.util.List;

public interface VeiculoService {

    List<VeiculoEntity> findAll();
    VeiculoEntity findById(long id);
    VeiculoEntity save(VeiculoEntity veiculos);
}
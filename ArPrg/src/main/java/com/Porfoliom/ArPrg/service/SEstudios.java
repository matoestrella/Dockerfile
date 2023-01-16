
package com.Porfoliom.ArPrg.service;

import com.Porfoliom.ArPrg.entity.Estudios;
import com.Porfoliom.ArPrg.repository.REstudios;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service 
@Transactional
public class SEstudios {
    
    @Autowired
    public REstudios estudRepo; // sobre escritura, alias, para buscar los metodos
   
    public List<Estudios> verEstudios(){
        List<Estudios> listaEstudioss=estudRepo.findAll();
        return listaEstudioss;
    }
    
    public Estudios buscarEstudios(int id){
       Estudios perso = estudRepo.findById(id).orElse(null);
       return perso;
   }
    
   public void crearEstudios(Estudios perso){
   estudRepo.save(perso);
   }
   
   public void borrarEstudios(int id){
   estudRepo.deleteById(id);
   }
    
   public void editarEstudios(Estudios perso){
   estudRepo.save(perso);
   }
    
}

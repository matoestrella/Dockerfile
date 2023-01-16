
package com.Porfoliom.ArPrg.service;

import com.Porfoliom.ArPrg.entity.Experiencia;
import com.Porfoliom.ArPrg.repository.RExperiencia;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
@Transactional
public class SExperiencia {
    
    @Autowired
    public RExperiencia expeRepo; // sobre escritura, alias, para buscar los metodos
   
    public List<Experiencia> verEstudios(){
        List<Experiencia> listaEstudioss=expeRepo.findAll();
        return listaEstudioss;
    }
    public Experiencia buscarPersona(int id){
       Experiencia perso = expeRepo.findById(id).orElse(null);
       return perso;
   }
    
   public void crearPersona(Experiencia perso){
   expeRepo.save(perso);
   }
   
   public void borrarPersona(int id){
   expeRepo.deleteById(id);
   }
    
   public void editarPersona(Experiencia perso){
   expeRepo.save(perso);
   }

    public List<Experiencia> verExperiencia() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Experiencia buscarExperiencia(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void crearExperiencia(Experiencia pers) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void borrarExperiencia(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void editarExperiencia(Experiencia pers) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

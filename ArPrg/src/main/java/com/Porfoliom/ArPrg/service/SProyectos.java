
package com.Porfoliom.ArPrg.service;

import com.Porfoliom.ArPrg.entity.Proyectos;
import com.Porfoliom.ArPrg.repository.RProyectos;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
@Transactional
public class SProyectos {
    
     @Autowired
    public RProyectos proyRepo; // sobre escritura, alias, para buscar los metodos
   
    public List<Proyectos> verEstudios(){
        List<Proyectos> listaEstudioss=proyRepo.findAll();
        return listaEstudioss;
    }
    public Proyectos buscarPersona(int id){
       Proyectos perso = proyRepo.findById(id).orElse(null);
       return perso;
   }
    
   public void crearPersona(Proyectos perso){
   proyRepo.save(perso);
   }
   
   public void borrarPersona(int id){
   proyRepo.deleteById(id);
   }
    
   public void editarPersona(Proyectos perso){
   proyRepo.save(perso);
   }

    public List<Proyectos> verProyectos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Proyectos buscarProyectos(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void crearProyectos(Proyectos pers) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void borrarProyectos(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void editarProyectos(Proyectos pers) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

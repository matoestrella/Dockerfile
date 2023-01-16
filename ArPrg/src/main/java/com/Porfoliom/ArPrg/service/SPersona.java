
package com.Porfoliom.ArPrg.service;

import com.Porfoliom.ArPrg.entity.Persona;
import com.Porfoliom.ArPrg.repository.RPersona;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
@Transactional
public class SPersona {
    
    @Autowired
    public RPersona persoRepo; // sobre escritura, alias, para buscar los metodos
   
    public List<Persona> verPersona(){
        List<Persona> listaPersonas=persoRepo.findAll();
        return listaPersonas;
    }
    
   public Persona buscarPersona(int id){
       Persona perso = persoRepo.findById(id).orElse(null);
       return perso;
   }
    
   public void crearPersona(Persona perso){
   persoRepo.save(perso);
   }
   
   public void borrarPersona(int id){
   persoRepo.deleteById(id);
   }
    
   public void editarPersona(Persona perso){
   persoRepo.save(perso);
   }
 
   public Persona LoginPersona (String email,String pasword){
     List <Persona> personas= persoRepo.findByEmailAndPasword(email,pasword);
       if(!personas.isEmpty()){
          return personas.get(0);
       }
       return null;
   }

    public Persona loginPersona(String email, String pasword) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
     
   
       
                   


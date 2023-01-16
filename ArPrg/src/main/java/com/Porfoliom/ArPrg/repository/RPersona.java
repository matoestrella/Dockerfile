
package com.Porfoliom.ArPrg.repository;

import com.Porfoliom.ArPrg.entity.Persona;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RPersona extends JpaRepository <Persona, Integer>{
   public List <Persona> findByEmailAndPasword(String email,String pasword);
}

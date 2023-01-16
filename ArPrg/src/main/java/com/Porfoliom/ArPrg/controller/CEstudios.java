
package com.Porfoliom.ArPrg.controller;

import com.Porfoliom.ArPrg.entity.Estudios;
import com.Porfoliom.ArPrg.service.SEstudios;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("estudios") 
@CrossOrigin(origins="http://localhost 4200")

public class CEstudios {
 @Autowired
 SEstudios estudServ;
 
 @GetMapping ("/lista")
 @ResponseBody   
 public List <Estudios> verEstudios(){
    return estudServ.verEstudios();
} 
 @GetMapping("/ver/{id}")
 @ResponseBody 
 public Estudios verEstudios(@PathVariable int id){
 return estudServ.buscarEstudios(id);
}
 
 @PostMapping("/crear")
  public String agregarEstudios(@RequestBody Estudios pers){
        estudServ.crearEstudios(pers);
  return "La persona fue creada";
}

 @DeleteMapping("/borrar/{id}")
 public String borrarEstudios(@PathVariable int id){
        estudServ.borrarEstudios(id);
        return "La persona fue borrada";
 
}
  @PutMapping("/editar")
  public void updateEstudios(@RequestBody Estudios pers){
        estudServ.editarEstudios(pers);
  
}
    
}

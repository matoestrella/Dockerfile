
package com.Porfoliom.ArPrg.controller;

import com.Porfoliom.ArPrg.entity.Proyectos;
import com.Porfoliom.ArPrg.service.SProyectos;
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
@RequestMapping ("proyectos") 
@CrossOrigin(origins="http://localhost 4200")

public class CProyectos {
    
     @Autowired
 SProyectos proyServ;
 
 @GetMapping ("/lista")
 @ResponseBody   
 public List <Proyectos> verProyectos(){
    return proyServ.verProyectos();
} 
 
 @GetMapping("/ver/{id}")
 @ResponseBody 
 public Proyectos verProyectos(@PathVariable int id){
 return proyServ.buscarProyectos(id);
}
 
 @PostMapping("/crear")
  public String agregarProyectos(@RequestBody Proyectos pers){
        proyServ.crearProyectos(pers);
  return "La persona fue creada";
}

 @DeleteMapping("/borrar/{id}")
 public String borrarProyectos(@PathVariable int id){
        proyServ.borrarProyectos(id);
        return "La persona fue borrada";
 
}
  @PutMapping("/editar")
  public void updateProyectos(@RequestBody Proyectos pers){
        proyServ.editarProyectos(pers);
  
}
    
}

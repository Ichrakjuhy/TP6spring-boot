package com.ichrak.Fleurs.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ichrak.Fleurs.entities.Fleur;
import com.ichrak.Fleurs.service.FleurService;
@RestController
@RequestMapping("/api")
@CrossOrigin
public class FleurRESTController {
@Autowired
FleurService fleurService;
@RequestMapping(path = "all",method = RequestMethod.GET)
public List<Fleur> getAllFleurs() {
return fleurService.getAllFleurs();
}
@RequestMapping(method = RequestMethod.GET)
public List<Fleur> getAllFleurs1() {
return fleurService.getAllFleurs();
}
@RequestMapping(value="/{id}",method = RequestMethod.GET)
public Fleur getFleurById(@PathVariable("id") Long id) {
return fleurService.getFleur(id);
}
@RequestMapping(method = RequestMethod.POST)
public Fleur createFleur(@RequestBody Fleur fleur) {
return fleurService.saveFleur(fleur);
}
@RequestMapping(method = RequestMethod.PUT)
public Fleur updateFleur(@RequestBody Fleur fleur) {
return fleurService.updateFleur(fleur);
}

@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
public void deleteFleur(@PathVariable("id") Long id)
{
	fleurService.deleteFleurById(id);
}
@RequestMapping(value="/flscat/{idCat}",method = RequestMethod.GET)
public List<Fleur> getFleursByCatId(@PathVariable("idCat") Long idCat) {
return fleurService.findByCategorieIdCat(idCat);
}
}

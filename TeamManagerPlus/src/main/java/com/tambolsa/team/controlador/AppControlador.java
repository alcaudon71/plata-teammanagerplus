package com.tambolsa.team.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tambolsa.team.modelo.Equipo;
import com.tambolsa.team.servicios.EquipoServicio;

@Controller
public class AppControlador {
 
    @Autowired
    private EquipoServicio servicio;
     
    // handler methods...
    
    @RequestMapping("/")
    public String viewHomePage(Model modelo) {
        List<Equipo> listaEquipos = servicio.listAll();
        modelo.addAttribute("listaEquipos", listaEquipos);
         
        return "index";
    }
    
    @RequestMapping("/new")
    public String showNewTeamPage(Model modelo) {
    	Equipo equipo = new Equipo();
        
        modelo.addAttribute("equipo", equipo);
         
        return "nuevo_equipo";
    }
    
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveTeam(@ModelAttribute("equipo") Equipo equipo) {
        servicio.save(equipo);
         
        return "redirect:/";
    }
    
    @RequestMapping("/edit/{id}")
    public ModelAndView showEditTeamPage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("editar_equipo");
        
        Equipo equipo = servicio.get(id);
        
        mav.addObject("equipo", equipo);
         
        return mav;
    }
 
    @RequestMapping("/delete/{id}")
    public String deleteTeam(@PathVariable(name = "id") int id) {
        servicio.delete(id);
        return "redirect:/";       
    }
    
}


package com.tarea1.controller;

import com.tarea1.dto.UsuarioRegistroDTO;
import com.tarea1.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registro")
public class RegistroUsuarioController {
    
    @Autowired
    private UsuarioService usuarioService;
    
    @ModelAttribute("usuario")
    public UsuarioRegistroDTO returnNuevoUsuarioRegistroDTO(){
        return new UsuarioRegistroDTO();
    }
    
    @GetMapping
    public String mostrarFormularioDeRegistro(){
        return "registro";
    }
    
    @PostMapping
    public String registrarCuentaDeUsuario(@ModelAttribute("usuario") UsuarioRegistroDTO registroDTO){
        usuarioService.guardar(registroDTO);
        return "redirect:/registro?exito";
    }
}

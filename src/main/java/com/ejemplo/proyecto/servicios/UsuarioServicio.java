package com.ejemplo.proyecto.servicios;

import com.ejemplo.proyecto.modelo.Usuario;
import com.ejemplo.proyecto.repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServicio implements IUsuarioServicio{

    @Autowired
    public UsuarioRepositorio usuaRepo;

    @Override
    public List<Usuario> verUsuarios() {
        return usuaRepo.findAll();
    }

    @Override
    public void crearUsuario(Usuario usuario) {
        usuaRepo.save(usuario);
    }

    @Override
    public void borrarUsuario(Long id) {
        usuaRepo.deleteById(id);
    }

    @Override
    public Usuario buscarUsuario(Long id) {
        return usuaRepo.findById(id).orElse(null);
    }
}

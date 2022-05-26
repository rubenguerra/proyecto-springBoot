package com.ejemplo.proyecto.modelo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter @Setter
@Entity
public class Curriculum {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String dni;
    private String nombre;
    private String telefono;
    private String direccion;
    private String email;
    private String empleo;
    private String cargo;
    private String titulo;
    private String ult_trabajo;
    private String empresa;

    public Curriculum() {
    }

    public Curriculum(long id, String dni, String nombre, String telefono, String direccion, String email, String empleo, String cargo, String titulo, String ult_trabajo, String empresa) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.empleo = empleo;
        this.cargo = cargo;
        this.titulo = titulo;
        this.ult_trabajo = ult_trabajo;
        this.empresa = empresa;
    }
}

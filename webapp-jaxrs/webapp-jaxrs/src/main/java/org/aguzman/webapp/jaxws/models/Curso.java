package org.aguzman.webapp.jaxws.models;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Curso {

    private Long id;

    private String nombre;

    private String descripcion;

    public Curso() {
    }

    public Curso(Long id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}

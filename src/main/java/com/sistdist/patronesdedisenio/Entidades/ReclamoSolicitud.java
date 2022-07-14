package com.sistdist.patronesdedisenio.Entidades;

public class ReclamoSolicitud {
    
    private String nombre;
    private String email;
    private String comentario;
    
    public ReclamoSolicitud(String nombre, String email, String comentario) {
        this.nombre = nombre;
        this.email = email;
        this.comentario = comentario;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getComentario() {
        return comentario;
    }
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    
}

package com.sistdist.patronesdedisenio.Entidades;

public final class Reclamo {

    private final String Nombre;
    private final String Direccion;
    private final String Correo;
    private final String Telefono;
    private final String Email;
    private final String Comentario;

    

    public String getNombre() {
        return Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getCorreo() {
        return Correo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public String getEmail() {
        return Email;
    }

    public String getComentario() {
        return Comentario;
    }

    private Reclamo(ReclamoBuilder builder){
        this.Comentario=builder.Comentario;
        this.Correo=builder.Correo;
        this.Direccion=builder.Direccion;
        this.Email=builder.Email;
        this.Nombre=builder.Nombre;
        this.Telefono=builder.Telefono;
    }

    public static class ReclamoBuilder {
        private String Nombre;
        private String Direccion;
        private String Correo;
        private String Telefono;
        private String Email;
        private String Comentario;
    
        public ReclamoBuilder(String Comentario){
            this.Comentario=Comentario;
        }
    
        public ReclamoBuilder AddNombre(String Nombre){
            this.Nombre=Nombre;
            return this;
        }
        public ReclamoBuilder AddDireccion(String Direccion){
            this.Nombre=Direccion;
            return this;
        }
        public ReclamoBuilder AddCorreo(String Correo){
            this.Correo=Correo;
            return this;
        }
        public ReclamoBuilder AddTelefono(String Telefono){
            this.Telefono=Telefono;
            return this;
        }
        public ReclamoBuilder AddEmail(String Email){
            this.Email=Email;
            return this;
        }
    
        public Reclamo build(){
            return new Reclamo(this);
        }
    }
}

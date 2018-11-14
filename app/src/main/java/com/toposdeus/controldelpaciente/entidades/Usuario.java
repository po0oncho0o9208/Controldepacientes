package com.toposdeus.controldelpaciente.entidades;

public class Usuario {


    private int fecharegistro;

    public Usuario(int fecharegistro, int nombre, String fechanacimiento, String genero, String estadocivil, int telefono, String email, String ocupacion, String alergias, int peso, int estatura) {
        this.fecharegistro = fecharegistro;
        this.nombre = nombre;
        this.fechanacimiento = fechanacimiento;
        this.genero = genero;
        this.estadocivil = estadocivil;
        this.telefono = telefono;
        this.email = email;
        this.ocupacion = ocupacion;
        this.alergias = alergias;
        this.peso = peso;
        this.estatura = estatura;
    }

    public int getFecharegistro() {
        return fecharegistro;
    }

    public void setFecharegistro(int fecharegistro) {
        this.fecharegistro = fecharegistro;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    int nombre;
    String fechanacimiento;
    String genero;
    String estadocivil;
    int telefono;
    String email;
    String ocupacion;
    String alergias;
    int peso;
    int estatura;

}

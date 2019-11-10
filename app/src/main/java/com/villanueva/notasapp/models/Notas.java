package com.villanueva.notasapp.models;

public class Notas {
    private Long id;
    private String titulo;
    private String nota;
    private String fecha;
    private boolean estadoF;
    private boolean estadoA;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public boolean isEstadoF() {
        return estadoF;
    }

    public void setEstadoF(boolean estadoF) {
        this.estadoF = estadoF;
    }

    public boolean isEstadoA() {
        return estadoA;
    }

    public void setEstadoA(boolean estadoA) {
        this.estadoA = estadoA;
    }

    public Notas(String titulo, String nota, String fecha, boolean estadoF, boolean estadoA) {
        this.titulo = titulo;
        this.nota = nota;
        this.fecha = fecha;
        this.estadoF = estadoF;
        this.estadoA = estadoA;
    }

    public Notas() {
    }

    @Override
    public String toString() {
        return "Notas{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", nota='" + nota + '\'' +
                ", fecha='" + fecha + '\'' +
                ", estadoF=" + estadoF +
                ", estadoA=" + estadoA +
                '}';
    }
}

package Modelo;

import java.util.Objects;

public class Materia {
    
    private Integer IDmateria;
    private String nombre;
    private Integer año;
    private boolean estado;

    public Materia(Integer IDmateria, String nombre, Integer año, boolean estado) {
        this.IDmateria = IDmateria;
        this.nombre = nombre;
        this.año = año;
        this.estado = estado;
    }

    public Materia() {
    }

    public Integer getIDmateria() {
        return IDmateria;
    }

    public void setIDmateria(Integer IDmateria) {
        this.IDmateria = IDmateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.IDmateria);
        hash = 97 * hash + Objects.hashCode(this.nombre);
        hash = 97 * hash + Objects.hashCode(this.año);
        hash = 97 * hash + (this.estado ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Materia other = (Materia) obj;
        if (this.estado != other.estado) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.IDmateria, other.IDmateria)) {
            return false;
        }
        return Objects.equals(this.año, other.año);
    }

    @Override
    public String toString() {
        return "Materia: \nID de Materia: " + IDmateria + ". Nombre: " + nombre + ". Año: " + año + ". Estado: " + estado + ".";
    }
    
    
}

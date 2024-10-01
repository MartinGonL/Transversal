package Modelo;

import java.time.LocalDate;
import java.util.Objects;

public class Alumno {
    
    private Integer dni;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private boolean estado;
    private int IDalumno;

    public Alumno(Integer dni, String nombre, String apellido, LocalDate fechaNacimiento, boolean estado, int IDalumno) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
        this.IDalumno = IDalumno;
    }

    public Alumno() {
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getIDalumno() {
        return IDalumno;
    }

    public void setIDalumno(int IDalumno) {
        this.IDalumno = IDalumno;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.dni);
        hash = 17 * hash + Objects.hashCode(this.nombre);
        hash = 17 * hash + Objects.hashCode(this.apellido);
        hash = 17 * hash + Objects.hashCode(this.fechaNacimiento);
        hash = 17 * hash + (this.estado ? 1 : 0);
        hash = 17 * hash + this.IDalumno;
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
        final Alumno other = (Alumno) obj;
        if (this.estado != other.estado) {
            return false;
        }
        if (this.IDalumno != other.IDalumno) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return Objects.equals(this.fechaNacimiento, other.fechaNacimiento);
    }

    @Override
    public String toString() {
        return "Alumno: \nDni: " + dni + ". Nombre: " + nombre + ". Apellido: " + apellido + ". Fecha de Nacimiento: " + fechaNacimiento + ".Estado: " + estado + ". ID Alumno: " + IDalumno + ".";
    }
    
}

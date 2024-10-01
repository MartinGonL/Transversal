package Modelo;

import java.util.Objects;

public class Inscripcion {
    
    private Integer IDinscripcion;
    private Integer IDalumno;
    private Integer IDmateria;
    private Integer nota;
    private boolean recursante;

    public Inscripcion(Integer IDinscripcion, Integer IDalumno, Integer IDmateria, Integer nota, boolean recursante) {
        this.IDinscripcion = IDinscripcion;
        this.IDalumno = IDalumno;
        this.IDmateria = IDmateria;
        this.nota = nota;
        this.recursante = recursante;
    }

    public Inscripcion() {
    }

    public Integer getIDinscripcion() {
        return IDinscripcion;
    }

    public void setIDinscripcion(Integer IDinscripcion) {
        this.IDinscripcion = IDinscripcion;
    }

    public Integer getIDalumno() {
        return IDalumno;
    }

    public void setIDalumno(Integer IDalumno) {
        this.IDalumno = IDalumno;
    }

    public Integer getIDmateria() {
        return IDmateria;
    }

    public void setIDmateria(Integer IDmateria) {
        this.IDmateria = IDmateria;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public boolean isRecursante() {
        return recursante;
    }

    public void setRecursante(boolean recursante) {
        this.recursante = recursante;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.IDinscripcion);
        hash = 53 * hash + Objects.hashCode(this.IDalumno);
        hash = 53 * hash + Objects.hashCode(this.IDmateria);
        hash = 53 * hash + Objects.hashCode(this.nota);
        hash = 53 * hash + (this.recursante ? 1 : 0);
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
        final Inscripcion other = (Inscripcion) obj;
        if (this.recursante != other.recursante) {
            return false;
        }
        if (!Objects.equals(this.IDinscripcion, other.IDinscripcion)) {
            return false;
        }
        if (!Objects.equals(this.IDalumno, other.IDalumno)) {
            return false;
        }
        if (!Objects.equals(this.IDmateria, other.IDmateria)) {
            return false;
        }
        return Objects.equals(this.nota, other.nota);
    }

    @Override
    public String toString() {
        return "Inscripcion: \nID de Inscripcion: " + IDinscripcion + ". ID de Alumno: " + IDalumno + ". ID de Materia: " + IDmateria + ". Nota: " + nota + ". Inscripto: " + recursante + ".";
    }
    
    
    
}

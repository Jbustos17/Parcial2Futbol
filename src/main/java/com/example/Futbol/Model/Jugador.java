package com.example.Futbol.Model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "jugador")
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idJugador;

    private String nombre;

    private String posicion;

    private Integer dorsal;

    private LocalDate fechaNac;

    private String nacionalidad;

    @ManyToOne
    @JoinColumn(name = "id_equipo", nullable = false)
    private Equipo equipo;

    @OneToMany(mappedBy = "jugador", cascade = CascadeType.ALL)
    private List<EstadisticasJugador> estadisticas;

    public Jugador() {
    }

    public Jugador(Integer idJugador, String nombre, String posicion, LocalDate fechaNac, Integer dorsal, String nacionalidad, Equipo equipo, List<EstadisticasJugador> estadisticas) {
        this.idJugador = idJugador;
        this.nombre = nombre;
        this.posicion = posicion;
        this.fechaNac = fechaNac;
        this.dorsal = dorsal;
        this.nacionalidad = nacionalidad;
        this.equipo = equipo;
        this.estadisticas = estadisticas;
    }

    public Integer getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(Integer idJugador) {
        this.idJugador = idJugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Integer getDorsal() {
        return dorsal;
    }

    public void setDorsal(Integer dorsal) {
        this.dorsal = dorsal;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public List<EstadisticasJugador> getEstadisticas() {
        return estadisticas;
    }

    public void setEstadisticas(List<EstadisticasJugador> estadisticas) {
        this.estadisticas = estadisticas;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "idJugador=" + idJugador +
                ", nombre='" + nombre + '\'' +
                ", posicion='" + posicion + '\'' +
                ", dorsal=" + dorsal +
                ", fechaNac=" + fechaNac +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", equipo=" + equipo +
                ", estadisticas=" + estadisticas +
                '}';
    }
}

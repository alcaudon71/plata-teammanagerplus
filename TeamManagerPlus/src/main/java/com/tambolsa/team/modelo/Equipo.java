package com.tambolsa.team.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="equipos")
public class Equipo {

	@Column(name="id")
	private Integer id;
	@Column(name="nombre")
	private String nombre;
	@Column(name="jugados")
	private Integer jugados;
	@Column(name="ganados")
	private Integer ganados;
	@Column(name="empatados")
	private Integer empatados;
	@Column(name="perdidos")
	private Integer perdidos;
	@Column(name="goles_favor")
	private Integer golesFavor;
	@Column(name="goles_contra")
	private Integer golesContra;
	@Column(name="puntos")
	private Integer puntos;
	
	public Equipo() {
		super();
	}

	// Getters y Setters 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getJugados() {
		return jugados;
	}

	public void setJugados(Integer jugados) {
		this.jugados = jugados;
	}

	public Integer getGanados() {
		return ganados;
	}

	public void setGanados(Integer ganados) {
		this.ganados = ganados;
	}

	public Integer getEmpatados() {
		return empatados;
	}

	public void setEmpatados(Integer empatados) {
		this.empatados = empatados;
	}

	public Integer getPerdidos() {
		return perdidos;
	}

	public void setPerdidos(Integer perdidos) {
		this.perdidos = perdidos;
	}

	public Integer getGolesFavor() {
		return golesFavor;
	}

	public void setGolesFavor(Integer golesFavor) {
		this.golesFavor = golesFavor;
	}

	public Integer getGolesContra() {
		return golesContra;
	}

	public void setGolesContra(Integer golesContra) {
		this.golesContra = golesContra;
	}

	public Integer getPuntos() {
		return puntos;
	}

	public void setPuntos(Integer puntos) {
		this.puntos = puntos;
	}

	@Override
	public String toString() {
		return "Equipo [id=" + id + ", nombre=" + nombre + ", jugados=" + jugados + ", ganados=" + ganados
				+ ", empatados=" + empatados + ", perdidos=" + perdidos + ", golesFavor=" + golesFavor
				+ ", golesContra=" + golesContra + ", puntos=" + puntos + "]";
	}
	
}

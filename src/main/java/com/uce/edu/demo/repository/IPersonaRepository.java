package com.uce.edu.demo.repository;

import java.util.List;

import com.uce.edu.demo.repository.modelo.Persona;

public interface IPersonaRepository {

	public Persona buscarPorId(Integer id);

	public void insertar(Persona persona);

	public void actualizar(Persona persona);

	public void eliminar(Integer id);
	
	public List<Persona> buscarTodos();

//	public int actualizarPorApellido(String genero, String apellido);
//
//	public int eliminarPorGenero(String genero);

}

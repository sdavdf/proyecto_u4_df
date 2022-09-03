package com.uce.edu.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IPersonaRepository;
import com.uce.edu.demo.repository.modelo.Persona;

@Service
public class PersonaServiceImpl implements IPersonaService{

	@Autowired
	private IPersonaRepository iPersonaRepository;
	
	@Override
	public Persona buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.iPersonaRepository.buscarPorId(id);
	}

	@Override
	public void insertar(Persona persona) {
		this.iPersonaRepository.insertar(persona);
		
	}

	@Override
	public void actualizar(Persona persona) {
		this.iPersonaRepository.actualizar(persona);
		
	}

	@Override
	public void eliminar(Integer id) {
		this.iPersonaRepository.eliminar(id);
		
	}

	@Override
	public List<Persona> buscarTodos() {
		// TODO Auto-generated method stub
		return this.iPersonaRepository.buscarTodos();
	}

	

}

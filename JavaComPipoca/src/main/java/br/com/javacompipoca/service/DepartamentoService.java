package br.com.javacompipoca.service;

import java.util.List;

import br.com.javacompipoca.domain.Departamento;

public interface DepartamentoService {
	
void salvar(Departamento departamento);
	
	void editar(Departamento departamento);
	
	void excluir(Long id);
	
	Departamento buscarPorId(Long id);
	
	List<Departamento> BuscarTodos();

	boolean depertamentoTemCargos(Long id);
}

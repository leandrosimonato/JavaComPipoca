package br.com.javacompipoca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.javacompipoca.dao.DepartamentoDao;
import br.com.javacompipoca.domain.Departamento;

@Service 
public class DepartamentoServiceImpl implements DepartamentoService {
	
	@Autowired
	public DepartamentoDao dao;
	
	@Transactional(readOnly = false)
	@Override
	public void salvar(Departamento departamento) {
		dao.save(departamento);
		
	}
	
	@Transactional(readOnly = false)
	@Override
	public void editar(Departamento departamento) {
		dao.update(departamento);
		
	}
	
	@Transactional(readOnly = false)
	@Override
	public void excluir(Long id) {
		dao.delete(id);
		
	}
	
	@Transactional(readOnly = true)
	@Override
	public Departamento buscarPorId(Long id) {
		return dao.findById(id);
	}
	
	@Transactional(readOnly = true)
	@Override
	public List<Departamento> BuscarTodos() {
		return dao.findAll();
	}

	@Override
	public boolean depertamentoTemCargos(Long id) {
		if (buscarPorId(id).getCargos().isEmpty()) {
			return false;
		}
		return false;
	}

}

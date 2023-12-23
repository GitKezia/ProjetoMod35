/**
 * 
 */
package br.kezia.com.dao;

import br.kezia.com.dao.generic.IGenericDAO;
import br.kezia.com.domain.Venda;
import br.kezia.com.exceptions.DAOException;
import br.kezia.com.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}

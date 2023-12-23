/**
 * 
 */
package br.kezia.com.services;

import br.kezia.com.dao.IProdutoDAO;
import br.kezia.com.domain.Produto;
import br.kezia.com.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}

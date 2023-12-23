/**
 * 
 */
package br.kezia.com.dao.jpa;

import br.kezia.com.dao.generic.jpa.GenericJpaDAO;
import br.kezia.com.domain.jpa.ProdutoJpa;


public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}

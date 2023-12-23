/**
 * 
 */
package br.kezia.com.dao.jpa;

import br.kezia.com.dao.generic.jpa.GenericJpaDAO;
import br.kezia.com.domain.jpa.ClienteJpa;


public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}

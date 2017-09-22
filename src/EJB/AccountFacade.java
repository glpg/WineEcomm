package EJB;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.Account;

@Stateless
public class AccountFacade extends AbstractFacade<Account> {
	
	@PersistenceContext(unitName = "WineEcommPU")
    private EntityManager em;
	
	@Override
    protected EntityManager getEntityManager() {
        return em;
    }
	
	public AccountFacade() {
        super(Account.class);
    }

}

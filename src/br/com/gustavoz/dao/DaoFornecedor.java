
package br.com.gustavoz.dao;

import br.com.gustavoz.model.Fornecedor;
import br.com.gustavoz.services.Manager;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author gustavoz
 */
public class DaoFornecedor {
    
    private EntityManager em;

    public DaoFornecedor() {
        em = Manager.getInstance().getEm();
    }
       
    
    public void salvar(Fornecedor p) {
        em.getTransaction().begin();
        if (p.getCodigo()>0) {
            p = em.merge(p);
        }
        em.persist(p);
        em.getTransaction().commit();
    }
    
    public List<Fornecedor> getAll(){
        Query qry = em.createQuery("Select p from br.com.gustavoz.model.Fornecedor p ");
        List produtos = qry.getResultList();
         return (List<Fornecedor>) produtos;     
    }
    
    public void remover(Fornecedor p) {
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();
    }
    
}

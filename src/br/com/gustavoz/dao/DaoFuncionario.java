
package br.com.gustavoz.dao;

import br.com.gustavoz.model.Funcionario;
import br.com.gustavoz.services.Manager;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author gustavoz
 */
public class DaoFuncionario {
    
    private EntityManager em;

    public DaoFuncionario() {
        em = Manager.getInstance().getEm();
    }
       
    
    public void salvar(Funcionario p) {
        em.getTransaction().begin();
        if (p.getCodigo()>0) {
            p = em.merge(p);
        }
        em.persist(p);
        em.getTransaction().commit();
    }
    
    public List<Funcionario> getAll(){
        Query qry = em.createQuery("Select p from br.com.gustavoz.model.Funcionario p ");
        List funcionarios = qry.getResultList();
         return (List<Funcionario>) funcionarios;     
    }
    
    public void remover(Funcionario p) {
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();
    }
    
}

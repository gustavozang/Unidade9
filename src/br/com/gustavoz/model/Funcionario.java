package br.com.gustavoz.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author gustavoz
 */
@Entity(name = "funcionario")
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int codigo;

    public static final String PROP_CODIGO = "codigo";

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        int oldCodigo = this.codigo;
        this.codigo = codigo;
        propertyChangeSupport.firePropertyChange(PROP_CODIGO, oldCodigo, codigo);
    }
    
    @Column
    private String nome;

    public static final String PROP_NOME = "nome";

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        propertyChangeSupport.firePropertyChange(PROP_NOME, oldNome, nome);
    }

    @Column
    private String endereco;

    public static final String PROP_ENDERECO = "endereco";

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        String oldEndereco = this.endereco;
        this.endereco = endereco;
        propertyChangeSupport.firePropertyChange(PROP_ENDERECO, oldEndereco, endereco);
    }
    
    @Column
    private String endereco_nr;

    public static final String PROP_ENDERECO_NR = "endereco_nr";

    public String getEndereco_nr() {
        return endereco_nr;
    }

    public void setEndereco_nr(String endereco_nr) {
        String oldEndereco_nr = this.endereco_nr;
        this.endereco_nr = endereco_nr;
        propertyChangeSupport.firePropertyChange(PROP_ENDERECO_NR, oldEndereco_nr, endereco_nr);
    }
    
    @Column
    private String bairro;

    public static final String PROP_BAIRRO = "bairro";

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        String oldBairro = this.bairro;
        this.bairro = bairro;
        propertyChangeSupport.firePropertyChange(PROP_BAIRRO, oldBairro, bairro);
    }
    
    @Column
    private String cidades;

    public static final String PROP_CIDADES = "cidades";

    public String getCidades() {
        return cidades;
    }

    public void setCidades(String cidades) {
        String oldCidades = this.cidades;
        this.cidades = cidades;
        propertyChangeSupport.firePropertyChange(PROP_CIDADES, oldCidades, cidades);
    }
      
    
    @Column
    private String telefone;

    public static final String PROP_TELEFONE = "telefone";

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        String oldTelefone = this.telefone;
        this.telefone = telefone;
        propertyChangeSupport.firePropertyChange(PROP_TELEFONE, oldTelefone, telefone);
    }
    
        @Column
    private String setor;

    public static final String PROP_SETOR = "setor";

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        String oldSetor= this.setor;
        this.setor = setor;
        propertyChangeSupport.firePropertyChange(PROP_SETOR, oldSetor, setor);
    }   
    
    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

}

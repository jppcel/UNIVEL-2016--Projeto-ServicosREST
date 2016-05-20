package br.univel.NovoRM.model;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Version;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Aluno implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	@Version
	@Column(name = "version")
	private int version;

	@Column
	private String nome;

	@Column
	private String sobrenome;

	@Column
	private String ra;

	@Column(length = 14)
	private String cpf;

	@Column(length = 15)
	private String rg;

	@Column(length = 150)
	private String rg_expeditor;

	@Column(length = 200)
	private String filiacao_pai;

	public Long getId() {
		return this.id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public int getVersion() {
		return this.version;
	}

	public void setVersion(final int version) {
		this.version = version;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Aluno)) {
			return false;
		}
		Aluno other = (Aluno) obj;
		if (id != null) {
			if (!id.equals(other.id)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getRg_expeditor() {
		return rg_expeditor;
	}

	public void setRg_expeditor(String rg_expeditor) {
		this.rg_expeditor = rg_expeditor;
	}

	public String getFiliacao_pai() {
		return filiacao_pai;
	}

	public void setFiliacao_pai(String filiacao_pai) {
		this.filiacao_pai = filiacao_pai;
	}

	@Override
	public String toString() {
		String result = getClass().getSimpleName() + " ";
		if (nome != null && !nome.trim().isEmpty())
			result += "nome: " + nome;
		if (sobrenome != null && !sobrenome.trim().isEmpty())
			result += ", sobrenome: " + sobrenome;
		if (ra != null && !ra.trim().isEmpty())
			result += ", ra: " + ra;
		if (cpf != null && !cpf.trim().isEmpty())
			result += ", cpf: " + cpf;
		if (rg != null && !rg.trim().isEmpty())
			result += ", rg: " + rg;
		if (rg_expeditor != null && !rg_expeditor.trim().isEmpty())
			result += ", rg_expeditor: " + rg_expeditor;
		if (filiacao_pai != null && !filiacao_pai.trim().isEmpty())
			result += ", filiacao_pai: " + filiacao_pai;
		return result;
	}
}
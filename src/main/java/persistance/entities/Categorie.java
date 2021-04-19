package persistance.entities;
// Generated 13 avr. 2021 � 15:21:25 by Hibernate Tools 4.0.1.Final

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Categorie generated by hbm2java
 */
@Entity
@Table(name = "CATEGORIE", schema = "GESTIONSTOCK")
public class Categorie implements java.io.Serializable {

	private BigDecimal idcateg;
	private String codecateg;
	private String libellecateg;
	private Set<Produit> produits = new HashSet<Produit>(0);

	public Categorie() {
	}

	public Categorie(BigDecimal idcateg) {
		this.idcateg = idcateg;
	}

	public Categorie(BigDecimal idcateg, String codecateg, String libellecateg, Set<Produit> produits) {
		this.idcateg = idcateg;
		this.codecateg = codecateg;
		this.libellecateg = libellecateg;
		this.produits = produits;
	}

	@Id

	@Column(name = "IDCATEG", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getIdcateg() {
		return this.idcateg;
	}

	public void setIdcateg(BigDecimal idcateg) {
		this.idcateg = idcateg;
	}

	@Column(name = "CODECATEG", length = 20)
	public String getCodecateg() {
		return this.codecateg;
	}

	public void setCodecateg(String codecateg) {
		this.codecateg = codecateg;
	}

	@Column(name = "LIBELLECATEG", length = 20)
	public String getLibellecateg() {
		return this.libellecateg;
	}

	public void setLibellecateg(String libellecateg) {
		this.libellecateg = libellecateg;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "categorie")
	public Set<Produit> getProduits() {
		return this.produits;
	}

	public void setProduits(Set<Produit> produits) {
		this.produits = produits;
	}

}

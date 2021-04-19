package persistance.entities;
// Generated 13 avr. 2021 � 15:21:25 by Hibernate Tools 4.0.1.Final

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Commande generated by hbm2java
 */
@Entity
@Table(name = "COMMANDE", schema = "GESTIONSTOCK")
public class Commande implements java.io.Serializable {

	private BigDecimal idCommande;
	private Client client = new Client();
	private Produit produit = new Produit();
	private BigDecimal qtecommande;
	private Date datecommande;
	private String etatcommande;

	public Commande() {
	}

	public Commande(BigDecimal idCommande) {
		this.idCommande = idCommande;
	}

	public Commande(BigDecimal idCommande, Client client, Produit produit, BigDecimal qtecommande, Date datecommande,
			String etatcommande) {
		this.idCommande = idCommande;
		this.client = client;
		this.produit = produit;
		this.qtecommande = qtecommande;
		this.datecommande = datecommande;
		this.etatcommande = etatcommande;
	}

	@Id

	@Column(name = "ID_COMMANDE", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getIdCommande() {
		return this.idCommande;
	}

	public void setIdCommande(BigDecimal idCommande) {
		this.idCommande = idCommande;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_CLIENT")
	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_PRODUIT")
	public Produit getProduit() {
		return this.produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	@Column(name = "QTECOMMANDE", precision = 22, scale = 0)
	public BigDecimal getQtecommande() {
		return this.qtecommande;
	}

	public void setQtecommande(BigDecimal qtecommande) {
		this.qtecommande = qtecommande;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATECOMMANDE", length = 7)
	public Date getDatecommande() {
		return this.datecommande;
	}

	public void setDatecommande(Date datecommande) {
		this.datecommande = datecommande;
	}

	@Column(name = "ETATCOMMANDE", length = 20)
	public String getEtatcommande() {
		return this.etatcommande;
	}

	public void setEtatcommande(String etatcommande) {
		this.etatcommande = etatcommande;
	}

}

package projetjava;

public class Ordinateur {
	protected String reference;
	protected String processeur;
	protected String ram;
	protected String disquedur;
	protected String os;
	protected String prix;
	
	public Ordinateur(String reference, String processeur, String ram, String disquedur, String os, String prix) {
		this.reference=reference;
		this.processeur=processeur;
		this.ram=ram;
		this.os=os;
		this.prix=prix;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getProcesseur() {
		return processeur;
	}

	public void setProcesseur(String processeur) {
		this.processeur = processeur;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getDisquedur() {
		return disquedur;
	}

	public void setDisquedur(String disquedur) {
		this.disquedur = disquedur;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getPrix() {
		return prix;
	}

	public void setPrix(String prix) {
		this.prix = prix;
	}

}

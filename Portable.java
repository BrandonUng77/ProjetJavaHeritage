package projetjava;

//MAGRO UNG
public class Portable extends Ordinateur {
	private int tailleecran;
	private int poids;
	private String webcam;
	private String lecteurdvd;
	
	public Portable(String reference, String processeur, String ram, String disquedur, String os, String prix,
			int tailleecran, int poids, String webcam, String lecteurdvd) {
		super(reference, processeur, ram, disquedur, os, prix);
		this.tailleecran=tailleecran;
		this.poids=poids;
		this.webcam=webcam;
		this.lecteurdvd=lecteurdvd;
		
		//Get&Set
	}

	public int getTailleecran() {
		return tailleecran;
	}

	public void setTailleecran(int tailleecran) {
		this.tailleecran = tailleecran;
	}

	public int getPoids() {
		return poids;
	}

	public void setPoids(int poids) {
		this.poids = poids;
	}

	public String getWebcam() {
		return webcam;
	}

	public void setWebcam(String webcam) {
		this.webcam = webcam;
	}

	public String getLecteurdvd() {
		return lecteurdvd;
	}

	public void setLecteurdvd(String lecteurdvd) {
		this.lecteurdvd = lecteurdvd;
	}

	@Override
	public String toString() {
		return "Portable [tailleecran=" + tailleecran + ", poids=" + poids + ", webcam=" + webcam + ", lecteurdvd="
				+ lecteurdvd + ", reference=" + reference + ", processeur=" + processeur + ", ram=" + ram
				+ ", disquedur=" + disquedur + ", os=" + os + ", prix=" + prix + "]";
	}	
	
}

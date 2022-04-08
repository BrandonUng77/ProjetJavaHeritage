package projetjava;

public class OrdiBureau extends Ordinateur {
	private String cartegraphique;
	private String chipset;
	private String clavier;
	
	public OrdiBureau(String reference, String processeur, String ram,
			String disquedur, String os, String prix, String cartegraphique, String chipset, String clavier) {
			super(reference, processeur, ram, disquedur, os, prix);
			this.cartegraphique=cartegraphique;
			this.chipset=chipset;
			this.clavier=clavier;
			
	}

	public String getCartegraphique() {
		return cartegraphique;
	}

	public void setCartegraphique(String cartegraphique) {
		this.cartegraphique = cartegraphique;
	}

	public String getChipset() {
		return chipset;
	}

	public void setChipset(String chipset) {
		this.chipset = chipset;
	}

	public String getClavier() {
		return clavier;
	}

	public void setClavier(String clavier) {
		this.clavier = clavier;
	}

	@Override
	public String toString() {
		return "OrdiBureau [cartegraphique=" + cartegraphique + ", chipset=" + chipset + ", clavier=" + clavier
				+ ", reference=" + reference + ", processeur=" + processeur + ", ram=" + ram + ", disquedur="
				+ disquedur + ", os=" + os + ", prix=" + prix + "]";
	}

}

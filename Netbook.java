package projetjava;

public class Main {

	public static void main(String[] args) {
		Netbook NetbookTest = new Netbook("Nt010","i78800","DDR4","HDD 1To","Windows","1700",17, 3, "Non", "Non");
		OrdiBureau OrdiBureau = new OrdiBureau("fix010","i58800","DDR4","SSD 1To","Windows","1900","gtx","lg1200","razer");
		Portable PortableTest = new Portable("PT010","i98800","DDR4","HDD 1To","Windows","1750",15, 2, "Oui", "Non");
		
		System.out.println(NetbookTest.toString());
		System.out.println(PortableTest.toString());
		System.out.println(OrdiBureau.toString());
	}

}

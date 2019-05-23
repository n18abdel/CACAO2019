package abstraction.eq3Transformateur1;

import java.util.ArrayList;
import java.util.HashMap;

public class Stock<T> {

	private HashMap<T, Double> stock;
	
	public Stock(ArrayList<T> produits) {
		for (T p: produits) { this.stock.put(p, 0.); }
	}
	public Stock() { }
	
	// -----------------------------------------------------------
	//          GETTERS & SETTERS
	// -----------------------------------------------------------
	
	public double getQuantiteEnStock(T produit) {
		return this.stock.get(produit);
	}
	
	public boolean estEnStock(T produit) {
		return this.stock.containsKey(produit);
	}
	
	public ArrayList<T> getProduitsEnStock() {
		ArrayList<T> resultat = new ArrayList<T>();
		for (T p: this.stock.keySet()) {
			resultat.add(p);
		}
		return resultat;
	}
	
	public void setQuantiteEnStock(T produit, double quantite) {
		if (quantite >= 0.) { this.stock.put(produit, quantite); }
		else { this.stock.put(produit, 0.); }
	}
	
	
	
}

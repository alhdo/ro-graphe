package xyz.alhdo;

import java.util.ArrayList;
import java.util.Arrays;

public class Graphe {
	protected int nbNoeuds;
	protected ArrayList<Noeud> noeuds;
	
	public Graphe() {
    //a completer
		noeuds = new ArrayList<>();
		Noeud noeud1 = new Noeud(1);
		Noeud noeud2 = new Noeud(2);
		Noeud noeud3 = new Noeud(3);
		Noeud noeud4 = new Noeud(4);
		noeud1.ajouteVoisin(noeud2,1);
		noeud1.ajouteVoisin(noeud3,1);
		noeud2.ajouteVoisin(noeud1,1);
		noeud2.ajouteVoisin(noeud3,1);
		noeud4.ajouteVoisin(noeud3,1);
		noeud4.ajouteVoisin(noeud2,1);
		noeuds.add(noeud1);
		noeuds.add(noeud2);
		noeuds.add(noeud3);
		noeuds.add(noeud4);


	}
	
	public Graphe(Noeud[] nds) {
    //a completer
		this.noeuds = (ArrayList<Noeud>) Arrays.asList(nds);
		this.nbNoeuds = noeuds.size();
	}
	
	
	public void affiche() {
		for (Noeud noeud:
			 noeuds) {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append(noeud.id).append(" : ");
			for (int i=0; i < noeud.nbVoisins(); i++){
				stringBuilder.append(noeud.successeurs.get(i).id).append(", ");
			}
			stringBuilder.append("\n");
			System.out.println(stringBuilder.toString());
		}
	}
	
	
}

package tools;

import java.util.ArrayList;

public class Material {

    private ArrayList<String> materials;
    private ArrayList<String> shares;

    public Material(ArrayList<String> materials, ArrayList<String> shares, ArrayList<String> materials1) {
        this.materials = materials;
        this.shares = shares;

        materials = new ArrayList<>();
        shares = new ArrayList<>();

        materials.add("Libros");
        materials.add("Revistas");
        materials.add("Periodicos");
        materials.add("Recursos Digitales");

        shares.add("Compra");
        shares.add("Donación");
        shares.add("Intercambio");
    }


    public ArrayList<String> getMaterials() {
        return materials;
    }

    public ArrayList<String> getShares() {
        return shares;
    }
}



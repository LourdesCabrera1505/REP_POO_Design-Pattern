package AdquisicionMateriales;

import Biblioteca.SingletonBiblioteca;

import java.util.ArrayList;

public class Material extends SingletonBiblioteca {

    private ArrayList<String> materials;
    private ArrayList<String> shares;

    public Material(int clase, float numero_Clasificacion, String seccion, String volumen, ArrayList<String> materials, ArrayList<String> shares) {
        super(clase, numero_Clasificacion, seccion, volumen);
        this.materials  = materials != null ? materials : new ArrayList<>();
        this.shares = shares != null ? shares : new ArrayList<>();

    }

    public ArrayList<String> getMaterials() {
        return materials;
    }

    public ArrayList<String> getShares() {
        return shares;
    }

    public void addMaterials (ArrayList<String> materials) {

        materials.add("Libros");
        materials.add("Revistas");
        materials.add("Periodicos");
        materials.add("Recursos Digitales");
    }

    public void addShares (ArrayList<String> shares) {

        shares.add("Compra");
        shares.add("Donación");
        shares.add("Intercambio");
    }
}



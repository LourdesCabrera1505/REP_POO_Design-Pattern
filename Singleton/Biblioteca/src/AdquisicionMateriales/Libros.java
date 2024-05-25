package AdquisicionMateriales;

import java.util.ArrayList;
import java.util.Date;

public class Libros extends Material{

    private String Titulo;
    private String Autor;
    private String Editorial;
    private String ISBN;
    private Date Fecha_Publicacion;


    public Libros(int clase, float numero_Clasificacion, String seccion, String volumen, ArrayList<String> materials, ArrayList<String> shares, String titulo, String autor, String editorial, String ISBN, Date fecha_Publicacion) {
        super(clase, numero_Clasificacion, seccion, volumen, materials, shares);
        Titulo = titulo;
        Autor = autor;
        Editorial = editorial;
        this.ISBN = ISBN;
        Fecha_Publicacion = fecha_Publicacion;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String editorial) {
        Editorial = editorial;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Date getFecha_Publicacion() {
        return Fecha_Publicacion;
    }

    public void setFecha_Publicacion(Date fecha_Publicacion) {
        Fecha_Publicacion = fecha_Publicacion;
    }
}

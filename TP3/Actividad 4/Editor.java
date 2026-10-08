import java.util.ArrayList;
import java.util.List;

public class Editor {
    private List<Figura> figuras;

    public Editor() {
        this.figuras = new ArrayList<>();
    }

    public void agregarFigura(Figura f) {
        if (f != null) figuras.add(f);
    }

    public void eliminarFigura(Figura f) {
        figuras.remove(f);
    }

    public double calcularArea() {
        double area = 0;
        for (Figura f : figuras) area += f.calcularArea();
        return area;
    }

    public void pintar() {
        for (Figura f : figuras) f.pintar();
    }

    public List<Figura> getFiguras() {
        return new ArrayList<>(figuras);
    }
}
import java.util.ArrayList;
import java.util.List;

public class GerenteDeFiguras {
    private List<FiguraGeometrica> figuras;

    public GerenteDeFiguras() {
        figuras = new ArrayList<FiguraGeometrica>();
    }

    public void adicionaFigura(FiguraGeometrica fig) {
        figuras.add(fig);
    }

    public void imprimeFiguras() {
        for (FiguraGeometrica fig : figuras) {
            System.out.println(fig.getNomeFigura());
        }
    }

    public double getMaiorAreaDeFigura() {
        double maiorArea = 0.0;
        for (FiguraGeometrica fig : figuras) {
            double area = fig.calculaArea();
            if (area > maiorArea) {
                maiorArea = area;
            }
        }
        return maiorArea;
    }

    public double calculaAreaTotalDeFiguras() {
        double total = 0.0;
        for (FiguraGeometrica fig : figuras) {
            total += fig.calculaArea();
        }
        return total;
    }

    public List<FiguraGeometrica> getFiguras() {
        return figuras;
    }
}

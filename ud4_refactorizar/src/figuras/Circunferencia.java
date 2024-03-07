package figuras;

public class Circunferencia {

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public void imprimir() {
        String color = "rojo";
        System.out.println("Di�metro: " + 2 * getRadio());
        System.out.println("Color: " + color);
        double area = 2 * 3.1416 * getRadio() * getRadio();
        System.out.println(area);
    }

    public boolean esIgual(Circunferencia otro, boolean conDecimales) {
        double radio1 = this.getRadio();
        double radio2 = otro.getRadio();
        if (conDecimales) {
            if (radio1 == radio2) {
                return true;
            } else {
                return false;
            }
        } else {
            if (Math.abs(radio1 - radio2) < 1) {
                return true;
            } else {
                return false;
            }
        }
    }
}


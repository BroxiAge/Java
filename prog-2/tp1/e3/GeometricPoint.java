package tp1.e3;

public class GeometricPoint {

    private double x = 0.0;
    private double y = 0.0;

    public GeometricPoint() {
    }

    public GeometricPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double deltaX, double deltaY) {
        this.x += deltaX;
        this.y += deltaY;
    }

    // Método para calcular la distancia desde otro punto PI
    public double distanceTo(GeometricPoint gp) {
        double deltaX = this.x - gp.x;
        double deltaY = this.y - gp.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}

public class Ellipse extends Shape {
    private Point center;
    private double radiusX;
    private double radiusY;

    public Ellipse(Point center, double radiusX, double radiusY, Style style) {
        super(style);
        this.center = center;
        this.radiusX = radiusX;
        this.radiusY = radiusY;
    }

    @Override
    public String toSvg() {
        StringBuilder svgCode = new StringBuilder();
        svgCode.append("<svg width=\"100\" height=\"100\">");
        if (style != null) {
            svgCode.append("<ellipse cx=\"").append(center.x).append("\" cy=\"").append(center.y)
                    .append("\" rx=\"").append(radiusX).append("\" ry=\"").append(radiusY)
                    .append("\" style=\"").append(style.toSvg()).append("\" />");
        } else {
            // Obsługa braku stylu
        }
        return svgCode.toString();
    }
}
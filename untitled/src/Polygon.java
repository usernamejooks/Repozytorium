public class Polygon extends Shape {
    private Point[] points;

    public Polygon(Point[] points, Style style) {
        super(style);
        this.points = points;
    }

    @Override
    public String toSvg() {
        StringBuilder svgCode = new StringBuilder();
        svgCode.append("<svg width=\"100\" height=\"100\">");
        if (style != null) {
            svgCode.append("<polygon points=\"");
            for (Point point : points) {
                svgCode.append(point.x).append(",").append(point.y).append(" ");
            }
            svgCode.append("\" style=\"").append(style.toSvg()).append("\" />");
        } else {
            // Obsługa braku stylu
        }
        return svgCode.toString();
    }
}
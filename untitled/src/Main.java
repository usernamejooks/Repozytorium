public class Main {
    public static void main(String[] args) {
        // Tworzenie punktów
        Point point1 = new Point(10, 20);
        Point point2 = new Point(30, 40);

        // Tworzenie odcinka
        Segment segment = new Segment(point1, point2);

        // Tworzenie stylu
        Style style = new Style("red", "blue", 2.0);

        // Tworzenie wielokąta
        Polygon polygon = new Polygon(new Point[]{point1, point2}, style);

        // Tworzenie elipsy
        Point center = new Point(50, 50);
        Ellipse ellipse = new Ellipse(center, 20, 30, style);

        // Tworzenie sceny SVG
        SvgScene scene = new SvgScene();
        scene.addShape(polygon);
        scene.addShape(ellipse);

        // Zapisywanie sceny do pliku HTML
        scene.save("scene.html");
    }
}

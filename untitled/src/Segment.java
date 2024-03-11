public class Segment {
    private Point startPoint;
    private Point endPoint;

    public Segment(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public double length() {
        int dx = endPoint.x - startPoint.x;
        int dy = endPoint.y - startPoint.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}

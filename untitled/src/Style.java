public class Style {
    public final String fillColor;
    public final String strokeColor;
    public final Double strokeWidth;

    public Style(String fillColor, String strokeColor, Double strokeWidth) {
        this.fillColor = fillColor;
        this.strokeColor = strokeColor;
        this.strokeWidth = strokeWidth;
    }

    public String toSvg() {
        StringBuilder svgStyle = new StringBuilder();
        svgStyle.append("fill:").append(fillColor).append(";");
        svgStyle.append("stroke:").append(strokeColor).append(";");
        svgStyle.append("stroke-width:").append(strokeWidth).append(";");
        return svgStyle.toString();
    }
}

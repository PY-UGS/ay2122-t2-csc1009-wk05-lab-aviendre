public class GeometricObject {
    public String color = "white";
    public boolean filled = false;
    public java.util.Date dateCreated;
    
    public GeometricObject() {
        this.dateCreated = new java.util.Date();
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = new java.util.Date();
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "created on " + dateCreated + "\n" + "Color: " + color + " and filled: " + filled;
    }
}

package course_Shapes.src.entities;

import course_Shapes.src.entities.enums.Color;

public class Circle extends Shape {

    private Double radius;

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }
    public Circle() { 
        super();
    }

    public Double getRadius() {
        return radius;
    }
    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
    
}

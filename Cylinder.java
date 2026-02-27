/*
 * A Cylinder is a Circle plus a height.
 */

// Task 1a. Edit the definition to make Cylinder a subclass of Circle
//         

public class Cylinder extends Circle {
    
    // Task 1b. add additional private height attribute (double)
        private double height;

    // Task 2. add code to define the following four constructors
    // no-arg constructor (set height to 1.0)
    public Cylinder(){
        super();
        height = 1;
    }
    // 1-arg constructor (set height to the given value)
    public Cylinder(double height){
        super();
        this.height = height;
    }
    // 2-arg constructor (set height and radius to the given values)
    public Cylinder(double height,double radius){
        super(radius);
        this.height = height;
    }
    // 3-arg constructor (set height, radius, and color to the given values)
    public Cylinder(double height, double radius, String color){
        this.height = height;
        super.setRadius(radius);
        super.setColor(color);
    }

    // Task 3. add getter and setter for height
    // (methods for radius and color are inherited)
    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }


    // Task 4. add code for method getVolume()
    // make use of superclass' getArea() method
    public double getVolume(){
        double v= super.getArea()*height;
        return v;
    }

 
    // Task 5. Override toString() method to describe itself
    // (output format should be in line with format: Cylinder[Circle[...],height=X.XX]
    @Override
    public String toString(){
        return("["+super.toString()+",height="+height);
    }
    
    @Override
    public double getArea(){
        double a = super.getArea()*2+this.getCircumference()*height;
        return a;
    }

    public double getBaseArea(){
        return super.getArea();
    }
 }
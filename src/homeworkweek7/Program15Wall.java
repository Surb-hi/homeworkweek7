package homeworkweek7;

public class Program15Wall {
    double width;//Veriable declearation
    double height;

public Program15Wall(){}// defalt constructare

    public Program15Wall(double width, double height) {//perameter constructore
        if (width < 0 && height > 0) {
            this.width = 0;
            this.height = height;
        } else if (width > 0 && height < 0) {
            this.width = width;
            this.height = 0;
        } else {
            this.width = width;
            this.height = height;
        }
    }

    public double getWidth() {//instant method1
        return width;

    }

    public double getHeight() {//instant method2
        return height;
    }

    public void setWidth(double width) {//noreturntypewithparameter
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }

    }

    public void setHeight(double height) {//noreturntypewithparamter
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }

    }

    public double getArea() {
        return this.height * this.width;
    }

    public static void main(String[] args) {
        Program15Wall wall = new Program15Wall(5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());

    }
}

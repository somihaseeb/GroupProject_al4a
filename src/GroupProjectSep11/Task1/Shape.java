package GroupProjectSep11.Task1;
/*
Create  an  Interface  'Shape'  with  undefined methods as calculateArea and calculate Perimiter.
 Create  2  classes  Circle  & Square that implements functionality defined in the Shape Interface.
 Test your code.
 */
//Area of circle; A= (pi)(r*r)-----Perimeter of circle; C= 2(pi)r -----r=radius
//Area of Square; A=L*L  --------Perimeter of Square; P=4L------L=length of a side

    public interface Shape {

        void calculateArea(double num);
        void calculatePerimeter(double num);
    }

    class Circle implements Shape{
        public void calculateArea(double num){
            System.out.println("Area of Circle = " + (Math.PI*num*num));
        }
        public void calculatePerimeter(double num){
            System.out.println("Perimeter of Circle =" + (2*Math.PI*num));
        }
    }

    class Square implements Shape{
        public void calculateArea(double num){
            System.out.println("Area of Square = "+(num*num));
        }
        public void calculatePerimeter(double num){
            System.out.println("Perimeter of Square = " + (4*num));
        }
    }


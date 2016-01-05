package Modul4.Figure;

public  class Figure {

    public  float calcullateTringleSquere(float verticalHeight, float base){

        return verticalHeight*base/2;

    }


    public float calculateRectangleSquere(float width, float height){
        return width*height;

    }


    public double calculateCircleSquere(float radius){
        return  Math.pow(radius, 2)*Math.PI;
    }



}

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package atelier11;
//initialise la classe shape
public class Shape{

    // initialise les variables et les met proteger
   protected String isColor;
   protected boolean isFilled;

   //constructeur sans argument qui set les variables
     public Shape() {
       isColor = "vert";
       isFilled = true;
    }

    //constructeur qui utulise des variables et les set aux variables de base
    public Shape(String color, Boolean filled) {
        color = isColor;
        filled = isFilled;
    }
    //encapsule le code
    public getColor() {
        return color;
    }
    public setColor(String newColor) {
        this.color = newColor;
    }
    public getFilled() {
        return filled;
    }
    public setFilled(Boolean newFilled) {
        this.filled = newFilled;
    }

    public static void main(String[] args) {
    }
}

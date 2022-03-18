import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class RectangleArea {
    double width, length, area;

    void getData()throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("This program will calculate Rectangle area");
        System.out.println("Enter w: ");
        width = Double.parseDouble(br.readLine());
        System.out.println("Enter l : ");
        length = Double.parseDouble(br.readLine());


    }
    void computeField(){
        area = width * length;
    }
    void fieldDisplay(){
        System.out.printf("The rectangle area are = " + area);
    }

}


public class Task1Rectangle {
    public static void main(String[] args) throws IOException {
        RectangleArea ra = new RectangleArea();
        ra.getData();
        ra.computeField();
        ra.fieldDisplay();
    }

}

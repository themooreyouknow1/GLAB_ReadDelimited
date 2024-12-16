import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ScanDelimiterFile {
    public static void main(String[] args) {
        try{
            String location = "/Users/jacobmoore/Downloads/cars.csv";
            File file = new File(location);
            Scanner input = new Scanner(file);
            ArrayList<String[]> data = new ArrayList<String[]>();
            while (input.hasNextLine()) {
                String line = input.nextLine();
                String[] splitedLine = line.split(",");
                data.add(splitedLine);
            }
            for (String[] line : data){
                System.out.println("Car Name :" + line[0] );
                System.out.println("MPG :" + line[1] );
                System.out.println("Cylinder :" + line[2] );
                System.out.println("Displacement :" + line[3]);
                System.out.println("Horsepower :" + line[4]);
                System.out.println("Weight :" + line[5]);
                System.out.println("Acceleration :" + line[6]);
                System.out.println("Model :" + line[7]);
                System.out.println("Origin :" + line[8]);
                System.out.println("===============================");
            }
        }catch (FileNotFoundException e){
            System.out.println("File not found");
            e.printStackTrace();
        }

    }

}

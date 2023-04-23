import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files



public class FileReading {

    public static String readFileToString(String fileName) {
        String completeString = "";
        try {
            File numbafile = new File(fileName.concat(".txt"));
            Scanner scannedFile = new Scanner(numbafile);
            while(scannedFile.hasNextLine()){
                String data = scannedFile.nextLine();
                completeString = completeString.concat(data);
                completeString = completeString.concat("\n");
            }
            scannedFile.close();
            return completeString;
            } catch (FileNotFoundException e) {
                System.out.println("Error occured");
                return completeString;
            }
    }
    public static String badParseIntegersFromText(String text){
        String leNumbers = "";
        String hStr = "";
        int strlen = text.length();
        for (int i = 0; i < strlen; i++) {
            if(text.charAt(i)!=' '&&text.charAt(i)!='\n'){
                hStr = hStr.concat(String.valueOf(text.charAt(i)));
            } else {  
                try {
                    Integer.valueOf(hStr);
                    leNumbers = leNumbers.concat(hStr);
                    leNumbers = leNumbers.concat(" ");
                } catch (Exception e) {
                    // System.out.println(hStr+" is not a number");
                }
                hStr = "";
            }
        }
        try {
            leNumbers = leNumbers.concat(hStr);
            leNumbers = leNumbers.concat(" ");
        } catch (Exception e) {
            System.out.println(hStr+" is not a number");
        }
        return leNumbers;
    }
}


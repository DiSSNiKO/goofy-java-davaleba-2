import java.lang.reflect.Constructor;

public class RandomKlass {
    private RandomKlass(){
        //aq ra unda chamewera
    }

    public static int[] getTenNums(String localFileName){
        int[] nujabes = new int[10];
        int nujabesIndex = 0;
        String streeng = FileReading.readFileToString(localFileName);
        String numberz = FileReading.badParseIntegersFromText(streeng);
        String hStr = "";
        for(int i = 0; i < numberz.length(); i++){
            if(numberz.charAt(i)!=' '){
                hStr = hStr.concat(String.valueOf(numberz.charAt(i)));
            } else {
                if(nujabesIndex>9){
                    break;
                } else {
                    try {
                        getTenNumsCheck(Integer.valueOf(hStr));
                        nujabes[nujabesIndex] = Integer.valueOf(hStr);
                        nujabesIndex++;
                    } catch(Exception e) {
                        System.out.println("!! "+e);
                    }
                }
                
                hStr = "";
            }
        }
        return nujabes;
   } 
   public static void getTenNumsCheck(int num) throws InvalidNumberException{
    if(num<0){
        throw new InvalidNumberException();
    }
   }
   public static int superEasySumFunction(int[] numArray, int arrLen){
    int sum = 0;
    for(int i = 0; i < arrLen; i++){
        sum=sum+numArray[i];
    }
    return sum;
   }
}
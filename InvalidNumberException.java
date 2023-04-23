public class InvalidNumberException extends Exception{
    public InvalidNumberException(){
        super("Error occured - Invalid number (must be a positive integer)");
    }
}

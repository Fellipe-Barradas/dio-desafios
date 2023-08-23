package exceptions;

public class ParametrosInvalidosException extends RuntimeException{

    public ParametrosInvalidosException(String mensagemError){
        super(mensagemError);
    }

}

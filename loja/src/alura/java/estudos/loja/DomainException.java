package alura.java.estudos.loja;

public class DomainException extends RuntimeException{

    private static final long serialVersionUID = 1l;

    public DomainException(String mensagem) {
        super(mensagem);
    }

}

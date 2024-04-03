package me.dio.service.exception;

// A classe NotFoundException estende a BusinessException,
// o que significa que ela é uma subclasse de BusinessException
// e, portanto, também é uma RuntimeException.
public class NotFoundException extends BusinessException {

    // Número de versão da classe para fins de serialização
    private static final long serialVersionUID = 1L;

    // Construtor padrão, que chama o construtor da superclasse BusinessException
    // com a mensagem "Resource not found."
    public NotFoundException() {
        super("Resource not found.");
    }

}
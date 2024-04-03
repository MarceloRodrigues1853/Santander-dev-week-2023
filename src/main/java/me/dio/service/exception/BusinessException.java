package me.dio.service.exception;

// Classe BusinessException que estende RuntimeException
// Isso significa que BusinessException é uma exceção não verificada,
// o que indica que não é necessário declarar ou lidar explicitamente com essa exceção
public class BusinessException extends RuntimeException {

    // Número de versão da classe para fins de serialização
    private static final long serialVersionUID = 1L;

    // Construtor que recebe uma mensagem de erro como parâmetro
    public BusinessException(String message) {
        // Chama o construtor da superclasse RuntimeException com a mensagem fornecida
        super(message);
    }
}
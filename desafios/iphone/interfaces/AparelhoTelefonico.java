

/**
 * Interface que define o comportamento de um aparelho telefônico
 */
public interface AparelhoTelefonico {
    /**
     * Realiza uma ligação para o número especificado
     * @param numero número de telefone para o qual se deseja ligar
     */
    void ligar(String numero);
    
    /**
     * Atende uma chamada telefônica recebida
     */
    void atender();
    
    /**
     * Inicia o serviço de correio de voz
     */
    void iniciarCorreioVoz();
}
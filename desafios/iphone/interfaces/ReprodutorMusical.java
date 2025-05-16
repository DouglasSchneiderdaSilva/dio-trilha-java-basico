
public interface ReprodutorMusical {
    /**
     * Inicia a reprodução da música atual
     */
    void tocar();
    
    /**
     * Pausa a reprodução da música atual
     */
    void pausar();
    
    /**
     * Seleciona uma música específica para reprodução
     * @param musica nome ou caminho da música a ser reproduzida
     */
    void selecionarMusica(String musica);
}

public interface NavegadorInternet {
    /**
     * Exibe uma página web a partir da URL especificada
     * @param url endereço da página web a ser exibida
     */
    void exibirPagina(String url);
    
    /**
     * Adiciona uma nova aba ao navegador
     */
    void adicionarNovaAba();
    
    /**
     * Atualiza (recarrega) a página atual
     */
    void atualizarPagina();
}
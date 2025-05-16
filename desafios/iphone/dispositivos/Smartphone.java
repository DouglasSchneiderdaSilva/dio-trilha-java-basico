
public class Smartphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;
    private String sistemaOperacional;
    private double versao;
    
    /**
     * Construtor para criar uma instância de Smartphone
     * @param modelo nome/modelo do smartphone
     * @param sistemaOperacional sistema operacional utilizado
     * @param versao versão do sistema operacional
     */
    public Smartphone(String modelo, String sistemaOperacional, double versao) {
        this.modelo = modelo;
        this.sistemaOperacional = sistemaOperacional;
        this.versao = versao;
    }
    
    // Getters
    public String getModelo() {
        return modelo;
    }
    
    public String getSistemaOperacional() {
        return sistemaOperacional;
    }
    
    public double getVersao() {
        return versao;
    }
    
    // Implementação dos métodos da interface ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }
    
    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }
    
    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }
    
    // Implementação dos métodos da interface AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }
    
    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }
    
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
    
    // Implementação dos métodos da interface NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }
    
    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba do navegador...");
    }
    
    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }
    
    @Override
    public String toString() {
        return "Smartphone [modelo=" + modelo + ", sistema=" + sistemaOperacional + 
               ", versão=" + versao + "]";
    }
}
public class Main {
    public static void main(String[] args) {
        // Criando uma instância de Smartphone
            // possivel implementar interação
        Smartphone meuCelular = new Smartphone("Galaxy S21", "Android", 13.0);
        
        // Exibindo informações do smartphone
        System.out.println("=== INFORMAÇÕES DO SMARTPHONE ===");
        System.out.println(meuCelular);
        System.out.println();
        
        // Demonstrando funcionalidades do reprodutor musical
        System.out.println("=== REPRODUTOR MUSICAL ===");
                // possivel implementar interação
        meuCelular.selecionarMusica("Bohemian Rhapsody - Queen");

        meuCelular.tocar();
        meuCelular.pausar();
        System.out.println();
        
        // Demonstrando funcionalidades do aparelho telefônico
        System.out.println("=== APARELHO TELEFÔNICO ===");
                // possivel implementar interação
        meuCelular.ligar("(11) 98765-4321");
        meuCelular.atender();
        meuCelular.iniciarCorreioVoz();
        System.out.println();
        
        // Demonstrando funcionalidades do navegador de internet
        System.out.println("=== NAVEGADOR DE INTERNET ===");
                // possivel implementar interação
        meuCelular.adicionarNovaAba();
        meuCelular.exibirPagina("https://www.exemplo.com.br");
        meuCelular.atualizarPagina();
    }
}
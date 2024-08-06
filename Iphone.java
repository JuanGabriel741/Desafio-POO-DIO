import java.util.Scanner;

public class Iphone {

    public static String url;
    public static String musica;
    public static String opcao;
    public static String acao;

    public static boolean repeticao = true;

    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    NavegadorInternet navegador = new NavegadorInternet();
    AparelhoTelefonico telefone = new AparelhoTelefonico();
    ReprodutorMusical reprodutor = new ReprodutorMusical();

    do{
        System.out.println("Selecione uma opcao");
        System.out.println("1-navegador de internet");
        System.out.println("2-reprodutor de musica");
        System.out.println("3-telefone");
        opcao = scanner.next();

        switch (opcao) {

            case "1":
                System.out.println("o que deseja fazer?");
                System.out.println("1-acessar um site");
                System.out.println("2-adicionar uma nova aba");
                System.out.println("3-atualizar pagina");
                acao = scanner.next();

                switch (acao) {
                    case "1":
                        System.out.printf("coloque a url do site: ");
                        url = scanner.next();
                        navegador.exibitPagina(url);
                        System.out.printf("deseja continuar usando o iphone: 1-sim 2-nao");
                        acao = scanner.next();
                        if(acao.equals("1")){repeticao = true;}
                        else{repeticao = false;}
                        break;
                    case "2":
                        navegador.adiocinarNovaAba();
                        System.out.printf("deseja continuar usando o iphone: 1-sim 2-nao");
                        acao = scanner.next();
                        if(acao.equals("1")){repeticao = true;}
                        else{repeticao = false;}
                        break;
                    case "3":
                        navegador.atualizarPagina();
                        System.out.printf("deseja continuar usando o iphone: 1-sim 2-nao");
                        acao = scanner.next();
                        if(acao.equals("1")){repeticao = true;}
                        else{repeticao = false;}
                        break;
                }
                break;

            case "2":

                System.out.println("o que deseja fazer?");
                System.out.println("1-tocar musica");
                System.out.println("2-pausar musica");
                System.out.println("3-selecionar uma musica");
                acao = scanner.next();

                switch (acao) {
                    case "1":
                        reprodutor.tocar();
                        System.out.printf("deseja continuar usando o iphone: 1-sim 2-nao");
                        acao = scanner.next();
                        if(acao.equals("1")){repeticao = true;}
                        else{repeticao = false;}
                        break;
                    case "2":
                        reprodutor.pausar();
                        System.out.printf("deseja continuar usando o iphone: 1-sim 2-nao");
                        acao = scanner.next();
                        if(acao.equals("1")){repeticao = true;}
                        else{repeticao = false;}
                        break;
                    case "3":
                        System.out.printf("digite o nome da musica: ");
                        musica = scanner.next();
                        reprodutor.selecionarMusica(musica);
                        System.out.printf("deseja continuar usando o iphone: 1-sim 2-nao");
                        acao = scanner.next();
                        if(acao.equals("1")){repeticao = true;}
                        else{repeticao = false;}
                        break;
                }
                break;

            case "3":

                System.out.println("o que deseja fazer?");
                System.out.println("1-ligar");
                System.out.println("2-atender");
                System.out.println("3-iniciar conversa");
                acao = scanner.next();

                switch (acao) {
                    case "1":
                        telefone.ligar();
                        System.out.printf("deseja continuar usando o iphone: 1-sim 2-nao");
                        acao = scanner.next();
                        if(acao.equals("1")){repeticao = true;}
                        else{repeticao = false;}
                        break;
                    case "2":
                        telefone.atender();
                        System.out.printf("deseja continuar usando o iphone: 1-sim 2-nao");
                        acao = scanner.next();
                        if(acao.equals("1")){repeticao = true;}
                        else{repeticao = false;}
                        break;
                    case "3":
                        telefone.iniciarConversa();
                        System.out.printf("deseja continuar usando o iphone: 1-sim 2-nao");
                        acao = scanner.next();
                        if(acao.equals("1")){repeticao = true;}
                        else{repeticao = false;}
                        break;
                }
                break;
        }



    }while(repeticao == true);

    }

}




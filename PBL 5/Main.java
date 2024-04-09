import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        exibirMenu();
    }

    public static void exibirMenu() {
        System.out.println("-----------------------------");
        System.out.println("---- Bem-vindo!!! ---- 😂");
        System.out.println("O que você deseja fazer?");
        System.out.println("-----------------------------");
        System.out.println("1 - Adicionar Vídeo");
        System.out.println("2 - Acessar Vídeo");
        System.out.println("3 - Registrar Canal");
        System.out.println("4 - Sair do programa");
        System.out.println("5 - Adicionar Shorts");
        System.out.println("6 - Melhorar suas habilidades");
        System.out.println("-----------------------------");
        System.out.print("Digite o que você deseja fazer: ");

        int response = scanner.nextInt();

        switch (response) {
            case 1:
                adicionarVideo();
                break;
            case 2:
                acessarVideo();
                break;
            case 3:
                registrarCanal();
                break;
            case 4:
                System.out.println("Saindo do programa...");
                break;
            case 5:
                adicionarShorts();
                break;
            case 6:
                melhorarHabilidades();
                break;
            default:
                System.out.println("Opção inválida, tente novamente.");
                break;
        }
    }

    public static void adicionarVideo() {
        System.out.println("Você escolheu adicionar um vídeo.");

        System.out.println("Insira a quantidade de views:");
        int view = scanner.nextInt();
        scanner.nextLine();  // Consumir a quebra de linha

        System.out.println("Insira a thumbnail do vídeo:");
        String thumbnail = scanner.nextLine();

        System.out.println("Insira os comentários:");
        String comentarios = scanner.nextLine();

        System.out.println("Insira o nome do canal:");
        String canal = scanner.nextLine();

        System.out.println("Insira a quantidade de likes:");
        int likes = scanner.nextInt();

        System.out.println("Insira a quantidade de deslikes:");
        int deslikes = scanner.nextInt();

        System.out.println("Insira a quantidade de inscritos no canal que postou o vídeo:");
        int inscritos = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Insira o anúncio do vídeo:");
        String anuncio = scanner.nextLine();

        System.out.println("Insira o título do vídeo:");
        String titulo = scanner.nextLine();

        System.out.println("Insira a duração do vídeo:");
        int duracao = scanner.nextInt();

        Video video = new Video(view, thumbnail, comentarios, canal, likes, deslikes, inscritos, anuncio, titulo, duracao);

        System.out.println("O vídeo adicionado foi:");
        System.out.println("Título: " + video.getTitulo());
        System.out.println("Visualizações: " + video.qnt_views);
        System.out.println("Thumbnail: " + video.thumbnail);
        System.out.println("Likes: " + video.qnt_likes);
        System.out.println("Deslikes: " + video.qnt_deslikes);
        System.out.println("Inscritos: " + video.qnt_inscritos);
        System.out.println("Anúncio: " + video.anuncio);
        System.out.println("Duração: " + video.duracao_video);

        System.out.println("ESSES SÃO OS DADOS DO SEU VÍDEO 🤣");
        System.out.println("__________________________________________________");

        exibirMenu();
    }

    public static void acessarVideo() {
        System.out.println("Você escolheu acessar um vídeo.");

    }

    public static void registrarCanal() {
        System.out.println("Você escolheu registrar um canal.");
  
    }

    public static void adicionarShorts() {
        System.out.println("Você escolheu adicionar Shorts.");
       
    }

    public static void melhorarHabilidades() {
        System.out.println("Você escolheu melhorar suas habilidades.");
        
    }
}

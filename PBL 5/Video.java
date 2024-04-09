public class Video {
    protected int qnt_views;
    protected String thumbnail;
    protected String comentarios;
    protected String canal;
    protected String upload;
    protected int qnt_likes;
    protected int qnt_deslikes;
    protected int qnt_inscritos;
    protected String anuncio;
    protected String titulo_video;
    protected int duracao_video;

    public Video() {
        qnt_views = 0;
        thumbnail = "sem thumb";
        comentarios = "nada";
        canal = "usuário canal";
        upload = "upload?";
        qnt_likes = 0;
        qnt_deslikes = 0;
        qnt_inscritos = 0;
        anuncio = "SEM";
        titulo_video = "TITULO 1";
        duracao_video = 0;
    }

    public Video(int qnt_views, String thumbnail, String comentarios, String canal, int qnt_likes, int qnt_deslikes, int qnt_inscritos, String anuncio, String titulo_video, int duracao_video) {
        this.qnt_views = qnt_views;
        this.thumbnail = thumbnail;
        this.comentarios = comentarios;
        this.canal = canal;
        this.qnt_likes = qnt_likes;
        this.qnt_deslikes = qnt_deslikes;
        this.qnt_inscritos = qnt_inscritos;
        this.anuncio = anuncio;
        this.titulo_video = titulo_video;
        this.duracao_video = duracao_video;
    }

    public String getTitulo() {
        return titulo_video;
    }

    public void darPlay() {
        System.out.println("video play🤣");
    }

    public void darLike(int likes) {
        // dar like nos videos
    }

    public void increverCanal() {
        // se inscrever no canal
    }

    public void darDeslike(int deslikes) {
        // dar deslike nos vídeos
    }

    public void selecionarTempo() {
        // selecionar tempo do vídeo
    }

    public void deixarComentario() {
        // deixar comentario no vídeo
    }

    public void pausarVideo() {
        // pausar vídeos
    }

    public void ativarLegenda() {
        // ativar legenda dos vídeos
    }

    public void qualidadeVideo() {
        // ajustar qualidade do vídeo
    }

    public void velocidadeVideo() {
        // aumentar / diminuir velocidade do vídeo
    }

    public void fecharVideo() {
        // fechar / sair do vídeo
    }

    public void modoTeatro() {
        // colocar vídeo em modo teatro
    }

    public void telaCheia() {
        // colocar vídeo em tela cheia
    }

    public static void darplay(Video video1) {
        // pfvr faz funcionar🥺
        throw new UnsupportedOperationException("Unimplemented method 'darplay'");
    }
}

public class Playlist extends Home {
    // atributos
    protected String videos_salvos;
    int qnt_videos;
    int duracao_playlist;

    public Playlist(String videosSalvos, int quantidadeVideos, int duracaoPlaylist) {
        this.videos_salvos = videosSalvos;
        this.qnt_videos = quantidadeVideos;
        this.duracao_playlist = duracaoPlaylist;
    }

}

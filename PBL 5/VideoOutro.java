public class VideoOutro {
    public class VideoAoVivo extends Video {
        public VideoAoVivo(int qnt_views, String thumbnail, String comentarios, String canal, int qnt_likes, int qnt_deslikes, int qnt_inscritos, String anuncio, String titulo_video, int duracao_video) {
            super(qnt_views, thumbnail, comentarios, canal, qnt_likes, qnt_deslikes, qnt_inscritos, anuncio, titulo_video, duracao_video);
        }
    
        public void darPlay() {
            System.out.println("Iniciando transmissão ao vivo: " + titulo_video);
        }
    }
    
    public class VideoAnuncio extends Video {
        public VideoAnuncio(int qnt_views, String thumbnail, String comentarios, String canal, int qnt_likes, int qnt_deslikes, int qnt_inscritos, String anuncio, String titulo_video, int duracao_video) {
            super(qnt_views, thumbnail, comentarios, canal, qnt_likes, qnt_deslikes, qnt_inscritos, anuncio, titulo_video, duracao_video);
        }
    
        public void darPlay() {
            System.out.println("Exibindo anúncio: " + titulo_video);
        }
    }
    
    public class VideoPadrao extends Video {
        public VideoPadrao(int qnt_views, String thumbnail, String comentarios, String canal, int qnt_likes, int qnt_deslikes, int qnt_inscritos, String anuncio, String titulo_video, int duracao_video) {
            super(qnt_views, thumbnail, comentarios, canal, qnt_likes, qnt_deslikes, qnt_inscritos, anuncio, titulo_video, duracao_video);
        }
    
    }
    
    
}

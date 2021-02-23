public class Video extends Media implements Played {
    private final String videoTitle;
    private final Status status;

    public Video(String author, String data, String post, PostType type, String videoTitle, Status status) {
        super(author, data, post, type);
        this.videoTitle = videoTitle;
        this.status = status;
    }

    public String getVideoTitle() {
        return videoTitle;
    }

    public void addNewVideo (){
        System.out.println("Select the file on your computer to start downloading.");
    }

    public void play() {
        final Video videoIsPlaying = new Video(
          this.getAuthor(),
          this.getData(),
          this.getPost(),
          this.getType(),
          this.getVideoTitle(),
          Status.ISPLAYING
        );

        System.out.println("Video status is " + Status.ISPLAYING);
        System.out.println("Enjoy the video!");
    }
}

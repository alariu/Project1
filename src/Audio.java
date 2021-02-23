public class Audio extends Media implements Played {
    private final String audioTitle;
    private final Status status;

    public Audio(String author, String data, String post, PostType type, String audioTitle, Status status) {
        super(author, data, post, type);
        this.audioTitle = audioTitle;
        this.status = status;
    }

    public String getAudioTitle() {
        return audioTitle;
    }

    public void addNewAudio (){
        System.out.println("Select the file on your computer to start downloading.");
    }

    public void play() {
        final Audio audioIsPlaying = new Audio(
                this.getAuthor(),
                this.getData(),
                this.getPost(),
                this.getType(),
                this.getAudioTitle(),
                Status.ISPLAYING
        );

        System.out.println("Audio status is " + Status.ISPLAYING);
        System.out.println("Enjoy the audio!");
    }
}

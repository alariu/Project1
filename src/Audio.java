public class Audio extends Media {
    private final String audioTitle;

    public Audio(String author, String data, String post, String postType, String audioTitle) {
        super(author, data, post, postType);
        this.audioTitle = audioTitle;
    }

    public void addNewAudio (){
        System.out.println("Select the file on your computer to start downloading");
    }
}

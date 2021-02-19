public class Video extends Media {
    private final String videoTitle;

    public Video(String author, String data, String post, String postType, String videoTitle) {
        super(author, data, post, postType);
        this.videoTitle = videoTitle;
    }

    public void addNewVideo (){
        System.out.println("Select the file on your computer to start downloading");
    }
}

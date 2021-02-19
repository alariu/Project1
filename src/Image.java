public class Image extends Media {
    private String imageTitle;

    public Image(String author, String data, String post, String postType, String imageTitle) {
        super(author, data, post, postType);
        this.imageTitle = imageTitle;
    }

    public void addNewImage (){
        System.out.println("Select the file on your computer to start downloading");
    }
}

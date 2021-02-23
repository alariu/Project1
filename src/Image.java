public class Image extends Media implements Printable {
    private String imageTitle;

    public Image(String author, String data, String post, PostType type, String imageTitle) {
        super(author, data, post, type);
        this.imageTitle = imageTitle;
    }

    public String getImageTitle() {
        return imageTitle;
    }

    public void addNewImage (){
        System.out.println("Select the file on your computer to start downloading.");
    }

    public void print() {
        System.out.println("Image" + imageTitle + "was printed.");

    }


}

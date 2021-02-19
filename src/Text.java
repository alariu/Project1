public class Text extends AbstractPost {

    public Text(String author, String data, String post, String postType) {
        super(author, data, post, postType);
    }

    public int getMaxSizeOfPost() {
        return 0;
    }
}

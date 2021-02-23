public class Media extends AbstractPost {

    public Media(String author, String data, String post, PostType type) {
        super(author, data, post, type);
    }

    public int getMaxSizeOfPost() {
        return 0;
    }


}

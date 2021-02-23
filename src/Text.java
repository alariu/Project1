public class Text extends AbstractPost implements Printable{

    public Text(String author, String data, String post, PostType type) {
        super(author, data, post, type);
    }

    public int getMaxSizeOfPost() {
        return 0;
    }


    public void print() {
        System.out.println("Post from" + getAuthor() + "dated" + getData() + "was printed.");

    }
}

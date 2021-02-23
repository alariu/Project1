public abstract class AbstractPost {
    private final String author;
    private final String data;
    private final String post;
    private final PostType type;

    public AbstractPost(String author, String data, String post, PostType type) {
        this.author = author;
        this.data = data;
        this.post = post;
        this.type = type;
    }

    public String getAuthor() {
        return author;
    }

    public String getData() {
        return data;
    }

    public String getPost() {
        return post;
    }

    public PostType getType() {
        return type;
    }

    public void showContent()
             {
                 System.out.printf("author: %s  data: %s  post: %s postType: %s \n", author, data, post, type);
    }

    public abstract int getMaxSizeOfPost();
}

public abstract class AbstractPost {
    private final String author;
    private final String data;
    private final String post;
    private final String postType;

    public AbstractPost(String author, String data, String post, String postType) {
        this.author = author;
        this.data = data;
        this.post = post;
        this.postType = postType;
    }

    public void showContent()
             {
                 System.out.printf("author: %s  data: %s  post: %s postType: %s \n", author, data, post, postType);
    }

    public abstract int getSize();
}

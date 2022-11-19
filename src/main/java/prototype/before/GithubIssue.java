package prototype.before;

public class GithubIssue {
    private int id;
    private String title;
    private GithubRepository githubRepository;

    public GithubIssue(GithubRepository githubRepository) {
        this.githubRepository = githubRepository;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

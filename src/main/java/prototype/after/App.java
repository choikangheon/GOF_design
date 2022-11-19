package prototype.after;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {
        GithubRepository repository = new GithubRepository();

        repository.setUser("brody");
        repository.setName("live-study");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("프로토타입");

        String url = githubIssue.getUrl();
        System.out.println(url);

        GithubIssue clone = (GithubIssue) githubIssue.clone();

        System.out.println(clone.getUrl());

        System.out.println(clone!= githubIssue);
        System.out.println(clone.equals(githubIssue));
    }
}

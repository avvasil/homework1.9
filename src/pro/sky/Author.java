package pro.sky;

public class Author {

    private final String authorFirstName;
    private final String authorLastName;

    public Author(String authorFirstName, String authorLastName) {
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
    }

    public String getAuthorFirstName() {
        return this.authorFirstName;
    }

    public String getGetAuthorLastName() {
        return this.authorLastName;
    }
}



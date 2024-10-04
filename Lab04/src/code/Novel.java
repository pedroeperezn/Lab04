/**
 * Models a novel with title, author, and year published.
 * @author Pedro Perez
 * @version 1.0
 */
public class Novel {
    private final String title;
    private final String authorName;
    private final int yearPublished;

    /**
     * Constructs a novel with title, author, and year of publication.
     * @param title novel's title.
     * @param authorName novel's author.
     * @param yearPublished novel's year publish.
     */
    public Novel(String title, String authorName, int yearPublished) {
        this.title = title;
        this.authorName = authorName;
        this.yearPublished = yearPublished;
    }

    /**
     * Gets the title of the novel.
     * @return Title of the novel.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the author's name.
     * @return Author's name.
     */
    public String getAuthorName() {
        return authorName;
    }

    /**
     * Gets the year the novel was published.
     * @return Year of publication.
     */
    public int getYearPublished() {
        return yearPublished;
    }
}
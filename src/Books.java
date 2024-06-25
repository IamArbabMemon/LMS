public class Books {

    private int id ,publicationYear;
    private String tittle,author;

    public Books(int id, int publicationYear, String tittle, String author) {
        this.id = id;
        this.publicationYear = publicationYear;
        this.tittle = tittle;
        this.author = author;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", publicationYear=" + publicationYear +
                ", tittle='" + tittle + '\'' +
                ", author='" + author + '\'';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

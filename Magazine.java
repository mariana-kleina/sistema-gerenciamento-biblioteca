public class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(String title, String author, int publicationYear, int issueNumber) {
        super(title, author, publicationYear);
        this.issueNumber = issueNumber;
    }

    @Override
    public void borrow() {
        System.out.println("A revista '" + title + "', edição " + issueNumber + ", foi emprestada.");
    }

    @Override
    public void returnItem() {
        System.out.println("A revista '" + title + "' foi devolvida.");
    }
    
    public void flipPages() {
        System.out.println("Folheando as páginas da revista.");
    }
}
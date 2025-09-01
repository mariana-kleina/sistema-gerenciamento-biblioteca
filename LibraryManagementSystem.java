public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem[] items = new LibraryItem[3];
        
        items[0] = new Book("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, "Fantasia");
        items[1] = new Magazine("National Geographic", "Vários Autores", 2023, 158);
        items[2] = new DigitalMedia("Curso de Java", "Instrutor Anônimo", 2024, "MP4");

        for (LibraryItem item : items) {
            System.out.println("----------------------------------------");
            item.displayInfo(); 
            item.borrow();
            item.returnItem();
            
            if (item instanceof Book) {
                ((Book) item).readSample();
            } else if (item instanceof Magazine) {
                ((Magazine) item).flipPages();
            } else if (item instanceof DigitalMedia) {
                ((DigitalMedia) item).play();
            }
        }
        System.out.println("----------------------------------------");
    }
}
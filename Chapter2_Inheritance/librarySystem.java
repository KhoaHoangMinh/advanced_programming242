public class librarySystem {
    public static class Book{
        private String title, author, ISBN;
        private int price, stock;

        public Book() {
            title = author = ISBN = "Unknown";
            price = stock = 0;
        }
        public Book(String title, String author, String ISBN, int price, int stock) {
            this.title = title;
            this.author = author;
            this.ISBN = ISBN;
            this.price = price;
            this.stock = stock;
        }

        String getTitle() {
            return title;
        }
        String getAuthor() {
            return author;
        }
        String getISBN() {
            return ISBN;
        }
        int getPrice() {
            return price;
        }
        int getStock() {
            return stock;
        }
        void setStock(int stock) {
            this.stock = stock;
        }
        void setTitle(String title) {
            this.title = title;
        }
        void setAuthor(String author) {
            this.author = author;
        }
        void setISBN(String ISBN) {
            this.ISBN = ISBN;
        }
        void setPrice(int price) {
            this.price = price;
        }
        public void displayDetails() {
            System.out.println("Title: " + title 
                    + ", Author: " + author 
                    + ", ISBN: " + ISBN
                    + ", Price: " + price
                    + ", Stock: " + stock);
        }
    }

    public static class Ebook extends Book {
        private int fileSize;
        public Ebook() {
            super("Unknown", "Unknown", "Unknown", 0, 0);
            fileSize = 0;
        }
        public Ebook(String title, String author, String ISBN, int price, int stock, int fileSize) {
            super(title, author, ISBN, price, stock);
            this.fileSize = fileSize;
        }
        public int getFileSize() {
            return fileSize;
        }
        public void setFileSize(int fileSize) {
            this.fileSize = fileSize;
        }
        @Override
        public void displayDetails() {
            System.out.println("Title: " + getTitle()
                    + ", Author: " + getAuthor()
                    + ", ISBN: " + getISBN()
                    + ", Price: " + getPrice()
                    + ", Stock: " + getStock()
                    + ", File size: " + getFileSize());
        }
    }

    public static class PrintedBook extends Book {
        private int pageCount;
        public PrintedBook() {
            super("Unknown", "Unknown", "Unknown", 0, 0);
            pageCount = 0;
        }
        public PrintedBook(String title, String author, String ISBN, int price, int stock, int pageCount) {
            super(title, author, ISBN, price, stock);
            this.pageCount = pageCount;
        }
        public int getPageCount() {
            return pageCount;
        }
        public void setPageCount(int pageCount) {
            this.pageCount = pageCount;
        }

        @Override
        public void displayDetails() {
            System.out.println("Title: " + getTitle()
                    + ", Author: " + getAuthor()
                    + ", ISBN: " + getISBN()
                    + ", Price: " + getPrice()
                    + ", Stock: " + getStock()
                    + ", Page count: " + getPageCount());
        }
    }

    public static class Library {
        private Book[] array;
        private int count;
        private int capacity = 10;

        public Library() {
            count = 0;
            array = new Book[capacity];
        }
        public void ensureCapacity() {
            if(count == capacity) {
                Book[] newArray = new Book[capacity * 2];
                System.arraycopy(array, 0, newArray, 0, count);
                array = newArray;
                capacity *= 2;
            }
        }
        public void addBook(Book pBook) {
            ensureCapacity();
            array[count++] = pBook;
        }
        int searchByTitle(String title) {
            for(int i = 0; i < count; i++) {
                if(array[i].getTitle().equals(title)) {
                    return i;
                }
            }
            return -1;
        }
        int searchByAuthor(String author) {
            for(int i = 0; i < count; i++) {
                if(array[i].getAuthor().equals(author)) {
                    return i;
                }
            }
            return -1;
        }
        void borrowBook(String ISBN) {
            for(int i = 0; i < count; i++) {
                if(array[i].getISBN().equals(ISBN)) {
                    int bookStock = array[i].getStock();
                    if(bookStock > 0) {
                        array[i].setStock(bookStock - 1);
                    } else return;
                }
            }
        }
        void displayAllBooks() {
            System.out.println("Count: " + count + ", Capacity: " + capacity);
            for(int i = 0; i < count; i++) {
                array[i].displayDetails();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Library System");
        Library library = new Library();

        Ebook ebook1 = new Ebook("Gone with the Wind", "Margaret Mitchell", "00124", 25, 5, 100);
        PrintedBook printedBook1 = new PrintedBook("Java Programming", "Herbert Schildt", "00234", 40, 3, 600);
        Ebook ebook2 = new Ebook("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "00345", 30, 7, 500);
        PrintedBook printedBook2 = new PrintedBook("Effective Java", "Joshua Bloch", "00456", 45, 2, 400);

        library.addBook(ebook1);
        library.addBook(printedBook1);
        library.addBook(ebook2);
        library.addBook(printedBook2);

        // Display all books
        System.out.println("Displaying all books in the library:");
        library.displayAllBooks();
        System.out.println("\n");

        // Search by Title
        String titleSearch = "Harry Potter and the Sorcerer's Stone";
        int index = library.searchByTitle(titleSearch);
        if (index != -1) {
            System.out.println("Found book with title: " + titleSearch);
            library.array[index].displayDetails();
        } else {
            System.out.println("No book found with the title: " + titleSearch);
        }

        // Search by Author
        String authorSearch = "Herbert Schildt";
        index = library.searchByAuthor(authorSearch);
        if (index != -1) {
            System.out.println("Found book by author: " + authorSearch);
            library.array[index].displayDetails();
        } else {
            System.out.println("No book found by author: " + authorSearch);
        }

        // Borrow a book by ISBN
        String isbnToBorrow = "00345"; // ISBN for "Harry Potter and the Sorcerer's Stone"
        library.borrowBook(isbnToBorrow);

        // Display all books after borrowing
        System.out.println("\nDisplaying all books after borrowing a book:");
        library.displayAllBooks();
    }
}

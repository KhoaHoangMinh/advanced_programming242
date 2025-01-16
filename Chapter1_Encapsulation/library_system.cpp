/*
Create a Library system using encapsulation and constructors.
    Create a Book class with attributes: title, author, ISBN, price, and stock.
    Create a Library class with:
        An array of Book objects.
        Methods to:
            Add new books.
            Search for books by title or author.
            Borrow books (reduce stock).
Write a main function to simulate library operation
 */
#include <iostream>
using namespace std;

class Book{
private:
    string title;
    string author;
    string ISBN;
    int price;
    int stock;
public:
    Book(string title, string author, string ISBN, int price, int stock) :
        title(title), author(author), ISBN(ISBN), price(price), stock(stock) {

    }
    string getTitle() {
        return title;
    }
    void setTitle(string title) {
        this->title = title;
    }
    string getAuthor() {
        return author;
    }
    void setAuthor(string author) {
        this->author = author;
    }
    string getISBN() {
        return ISBN;
    }
    void setISBN(string ISBN) {
        this->ISBN = ISBN;
    }
    int getPrice() {
        return price;
    }
    void setPrice(int price) {
        this->price = price;
    }
    int& getStock() {
        return stock;
    }
    void setStock(int stock) {
        this->stock = stock;
    }
    void displayInfo() {
        cout << "Title: " << title << ", ";
        cout << "Author: " << author << ", ";
        cout << "ISBN: " << ISBN << ", ";
        cout << "Price: $" << price << ", ";
        cout << "Stock: " << stock << endl;
    }
};

class Library{
private:
    Book** arr;
    int count;
    int capacity = 2;
public:
    Library() {
        count = 0;
        arr = new Book*[capacity];
    }
    ~Library() {
        delete[] arr;
    }
    void ensureCapcity() {
        if(count >= capacity) {
            capacity *= 2;
            Book** newArr = new Book*[capacity];
            for(int i = 0; i < count; i++) {
                newArr[i] = arr[i];
            }
            delete[] arr;
            arr = newArr;
        }
    }
    void addBook(string title, string author, string ISBN, int price, int stock) {
        ensureCapcity();
        arr[count++] = new Book(title, author, ISBN, price, stock);
    }
    bool searchByTitle(string title) {
        for(int i = 0; i < count; i++) {
            if(arr[i]->getTitle() == title) {
                cout << "Book with title " << title << " found at index " << i << endl;
                return true;
            }
        }
        cout << "Book with title " << title << " not found." << endl;
        return false;
    }
    bool searchByAuthor(string author) {
        for(int i = 0; i < count; i++) {
            if(arr[i]->getAuthor() == author) {
                cout << "Book with author " << author << " found at index " << i << endl;
                return true;
            }
        }
        cout << "Book with author " << author << " not found." << endl;
        return false;
    }
    void borrowBook(string title) {
        for(int i = 0; i < count; i++) {
            if(arr[i]->getTitle() == title) {
                arr[i]->getStock()--;
                return;
            }
        }
        cout << "Book with title " << title << " not found." << endl;
    }
    void listBook() {
        if(count == 0) {
            cout << "Library is empty." << endl;
        } else {
            for(int i = 0; i < count; i++) {
                cout << "Book " << i << ": ";
                arr[i]->displayInfo();
            }
        }
    }
    Book** getArr() {
        return arr;
    }
    int getCount() {
        return count;
    }
    int getCapacity() {
        return capacity;
    }
};
int main() {
    Library hcmutLib;
    cout << "hcmutLib: " << endl;
    hcmutLib.addBook("a", "b", "c", 2, 5);
    hcmutLib.addBook("c", "d", "e", 7, 2);
    hcmutLib.addBook("f", "g", "h", 1, 18);
    cout << "Count = " << hcmutLib.getCount() << ", Capacity = " << hcmutLib.getCapacity() << endl;
    hcmutLib.listBook();

    cout << endl << "Search: " << endl;
    hcmutLib.searchByAuthor("a");
    hcmutLib.searchByAuthor("b");
    hcmutLib.searchByTitle("g");
    hcmutLib.searchByTitle("f");

    cout << endl << "Borrow books: " << endl;
    cout << "Borrowing book e." << endl;
    hcmutLib.borrowBook("e");
    cout << "Borrowing book c." << endl;
    hcmutLib.borrowBook("c");
    cout << endl;

    hcmutLib.listBook();
    return 0;
}
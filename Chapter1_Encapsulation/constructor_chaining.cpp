/*
 Create a Laptop class with attributes:
    brand (string)
    model (string)
    price (double)
Add the following:
    A default constructor.
    A parameterized constructor to initialize all attributes.
    Use constructor chaining to call one constructor from another.
Write a main function to test the class.
 */
#include <iostream>
using namespace std;
class Laptop{
private:
    string brand;
    string model;
    int year;
public:
    Laptop(string brand,
        string model,
        int year) {

        this->brand = brand;
        this->model = model;
        this->year = year;
    }
    Laptop() : Laptop("Lenovo", "Thinkpad", 2023) {

    }
    string getBrand() {
        return brand;
    }
    void setBrand(string brand) {
        this->brand = brand;
    }
    string getModel() {
        return model;
    }
    void setModel(string model) {
        this->model = model;
    }
    int getYear() {
        return year;
    }
    void setYear(int year) {
        this->year = year;
    }
    void displayInfo() {
        cout << "Brand: " << brand << endl;
        cout << "Model: " << model << endl;
        cout  << "Year: " << year << endl << endl;
    }
};
int main() {
    Laptop myLaptop;
    myLaptop.displayInfo();
    return 0;
}
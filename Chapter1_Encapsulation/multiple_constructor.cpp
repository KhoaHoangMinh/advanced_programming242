/*
 Create a Car class with the following private attributes:
    brand (string)
    model (string)
    year (int)
Add the following:
    A default constructor that sets default values.
    A parameterized constructor to initialize all attributes.
    Setters and getters for all attributes.
Write a main function to:
    Create an object using the default constructor and display its details.
    Create another object using the parameterized constructor and display its details.
 */
#include <iostream>
using namespace std;
class Car{
private:
    string brand;
    string model;
    int year;
public:
    Car() {
        brand = "Toyota";
        model = "Vios";
        year = 2024;
    }
    Car(string brand,
        string model,
        int year) {

        this->brand = brand;
        this->model = model;
        this->year = year;
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
    cout << "Default constructor: " << endl;
    Car myCar;
    myCar.displayInfo();

    cout << "Parametrized constructor: " << endl;
    Car myWifeCar("BMW", "330i", 2022);
    myWifeCar.displayInfo();
    return 0;
}

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Mercedess", 1999);
        car1.print();
        car1.setYear(2001);
        car1.print();


        Rectangle reg1 = new Rectangle(4, 4);
        int area = reg1.calculateArea();
        System.out.println(area);
        reg1.setWidth(5);
        int newArea = reg1.calculateArea();
        System.out.println(newArea);

        Book firstBook = new Book("Му-му", "Толстой");
        firstBook.printInfo();
        firstBook.setAuthor("Тургенев");
        firstBook.printInfo();

        BankAccount izyaAccount = new BankAccount("Izya", 1000.00);
        izyaAccount.printBalance();
        izyaAccount.deposit(200.15);
        izyaAccount.printBalance();
        izyaAccount.withdraw(100.1);
        izyaAccount.printBalance();

        Point point1 = new Point(100,200);
        point1.print();
        point1.setX(150);
        point1.print();

        StudentGroup stgroup = new StudentGroup("A",15);
        stgroup.printInfo();
        stgroup.setStudentCount(18);
        stgroup.printInfo();

        Circle circle1 = new Circle(3.5);
        double resultArea = circle1.calculateArea();
        double resultLong = circle1.calculateCircumference();
        System.out.println("площадь: " +resultArea+", длина: "+resultLong);
        circle1.setRadius(5);
        System.out.println("площадь: " +circle1.calculateArea()+", длина: "+circle1.calculateCircumference());

        Teacher teacher1 = new Teacher("Olga Vasil`evna", "Math");
        teacher1.printInfo();
        teacher1.setSubject("English");
        teacher1.printInfo();

        Product priceForCucumber = new Product("Cucumber",99);
        priceForCucumber.printInfo();
        priceForCucumber.applyDiscount(13);
        priceForCucumber.printInfo();

        Laptop macBook1 = new Laptop("Mac", 2000);
        macBook1.printInfo();
        macBook1.setPrice(1800);
        macBook1.printInfo();
    }
}
class Car{
   String brand;
   int year;

   Car(String brand, int year){
       this.brand = brand;
       this.year= year;
   }
   public String getBrand(){
       return brand;
   }
   public int getYear(){
       return year;
   }
   public void setBrand(String brand){
       this.brand=brand;
   }
   public void setYear(int year){
       this.year = year;
   }
   public void print(){
       System.out.println("модель: "+getBrand()+" год выпуска: "+getYear());
   }

}
class Rectangle{
    int width;
    int height;

    Rectangle(int width, int height){
        this.width=width;
        this.height=height;
    }
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
    public void setWidth(int width){
        this.width=width;
    }
    public int calculateArea(){
        return width*height;
    }

}

class Book{
    String title;
    String author;

    Book(String title, String author){
        this.title = title;
        this.author = author;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public void setTitle (String title){this.title=title;}
    public void printInfo(){
        System.out.println(getTitle()+" автор:"+ getAuthor());
    }
}
class BankAccount{
    String owner;
    double balance;

    BankAccount(String owner, double balance){
        this.owner=owner;
        this.balance = balance;
    }
    public String getOwner(){
        return owner;
    }
    public double getBalance(){
        return balance;
    }
    public void setOwner(String owner){
        this.owner=owner;
    }
    public double deposit(double amount){
        balance = balance+amount;
        return balance;
    }
    public double withdraw( double amount){
        balance=balance-amount;
        return balance;
    }
    public void printBalance(){
        System.out.println(getOwner() + " имеет таки "+getBalance()+ " шекелей");
    }
}
class Point{
    int x;
    int y;
    Point(int x, int y){
        this.x = x;
        this.y=y;
    }
    public int getX(){
        return x;
    }
    public  int getY(){
        return y;
    }
    public void setX(int x){
        this.x=x;
    }
    public void print(){
        System.out.println("координаты: "+getX()+";"+getY());
    }
}
class StudentGroup{
   String groupName;
   int studentCount;

   StudentGroup(String groupName, int studentCount){
       this.groupName=groupName;
       this.studentCount=studentCount;
    }
    public String getGroupName(){
       return groupName;
    }
    public int getStudentCount(){
       return studentCount;
    }
    public void setGroupName(String groupName){
       this.groupName=groupName;
    }
    public void setStudentCount(int studentCount){
       this.studentCount=studentCount;
    }
    public void printInfo(){
        System.out.println("группа: "+getGroupName()+" количество человек: "+getStudentCount());
    }
}
class Circle{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return (double) radius;
    }
    public void setRadius(int radius){
        this.radius=radius;
    }
    public double calculateArea(){
      return (double)radius*radius*Math.PI;
    }
    public double calculateCircumference(){
       return (double) 2*Math.PI*radius;

    }
}
class Teacher{
    String name;
    String subject;
    Teacher(String name, String subject){
        this.name = name;
        this.subject=subject;
    }
    public String getName(){
        return name;
    }
    public  String getSubject(){
        return subject;
    }
    public void setSubject(String subject){
        this.subject=subject;
    }
    public void setName(String name){this.name=name;}
    public void printInfo(){
        System.out.println(getName()+" "+ getSubject());
    }

}
class Product{
    String name;
    double price;
    Product(String name, int price){
        this.name=name;
        this.price=price;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double applyDiscount(int discount){
        double newPrice = price - (price*discount/100);
        setPrice(newPrice);
        return newPrice;
    }
   public void printInfo(){
       System.out.println(getName() + " "+ getPrice());
   }
}
class Laptop{
    String brand;
    int price;
    Laptop(String brand, int price){
        this.brand=brand;
        this.price=price;
    }
    public String getBrand(){
        return brand;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public void setBrand(String brand){this.brand=brand;}
    public void printInfo(){
        System.out.println("Модель: "+getBrand()+" цена: "+ getPrice());
    }
}
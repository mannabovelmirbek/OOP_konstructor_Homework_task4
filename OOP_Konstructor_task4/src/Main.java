/*TASK 4
 Cоздайте класс Person c полями(name,
 age, work, salary, phonePrice). В main
 создайте 5 объектов класса, дайте
 значения через конструктор, положите
 эти объекты в массив, сначала
 выведите все эти объекты на консоль.
 Теперь выведите человека у которого
 самая высокая зарплата, выведите у
 кого самая низкая зарплата, выведите у
 кого самый дорогой телефон*/
public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Eli",25,"Tourizm",56000,86000);
        Person person2 = new Person("Ali",29,"Programmer",62000,74000);
        Person person3 = new Person("Uli",31,"Driver",48000,51000);
        Person person4 = new Person("Ili",19,"Teacher",34000,97000);
        Person person5 = new Person("Юli",23,"Menedjer",50000,31000);

        Person[] persons = {person1,person2,person3,person4,person5};
        for (Person p : persons){
            System.out.println("Name: "+p.name +
                    "\n"+"Work: "+ p.work +
                    "\n"+"Salary: "+ p.salary +
                    "\n"+"Price phone's: "+ p.phonePrice);
        }
        Person maxSalary = persons[0];
        Person minSalary = persons[0];
        for (int i = 1; i < persons.length; i++){
            if (persons[i].salary > maxSalary.salary){
                maxSalary = persons[i];
            }
            if (persons[i].salary < minSalary.salary){
                minSalary = persons[i];
            }
        }
        System.out.println("Max Salary: "+maxSalary.name+"  "+maxSalary.salary);
        System.out.println("Min Salary: "+minSalary.name+"  "+minSalary.salary);

        Person maxPricePhone = persons[0];
        for (int i = 1; i < persons.length; i++) {
            if (persons[i].phonePrice > maxPricePhone.phonePrice) {
                maxPricePhone = persons[i];
            }
        }
        System.out.println("Expensive phone: "+maxPricePhone.phonePrice+" Name: "+maxPricePhone.name);
    }
}

###  What is Data hiding?
  Data hiding is an essential concept in OOP. It simply means masking a class's
  internal operations and only providing an interface through which other 
  entities can interact with the class without being aware of what is happening
  within.

  The goal is to implement classes in a way that prevents any unauthorized access
  to or modification of the original contents of a class by it's instances.

- Components of data hiding?
    1. Encapsulation
    2. Abstraction

### Encapsulation
Encapsulation is a technique to achieve data hiding in OOP.
Encapsulation in OOP refers to binding data and the methods to manipulate that data
together in a single unit - class.

```java
public class Movie {
    private String title;
    private int year;
    private String genre;

    public Movie(String t,int y, String g) {
        title = t;
        year = y;
        genre = g;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String t) {
        title = t;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int y) {
        year = y;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String g) {
        genre = g;
    }
}
```
This is a very simple example of how to implement encapsulation in java.
The fields in this class are private which means they are not allowed to access
anywhere outside the class. The caller can access or modify via getters and setters.

On surface this may look simple, and why even bother with all this getter and setter verbose.
You're right. But in a broader context of a real world system, let's see you provide an api
to a payment processor to get accounts and account deatils. Ideally you should only provide
the details of the accounts such as balance, name and address and type of account. You do not
provide direct access to modify the balance of the account. And the only way you allow modifying
the account balance through only provided apis which does authenticate, authorize and validate
the payments. In a way this is encapsulation. The data which is accounts here are only accessed
and modified through provided apis which the user can debit or credit money.

# Abstraction

- Abstraction is a technique used in OOP that simplifies the program's structure.
It focuses only on revealing the necessary details of a system and hiding irrelevant information
to minimize it's complexity.

These are textbook bullshit definitions.

**Abstraction**
- purpose is to hide complexity by exposing only what something does.
- show only what operations are available
- let the user focus on intent, not implementation

**Encapsulation**
- Hide internal state and protect data from being tampered with
- how access is controlled and who's allowed to mutate state
- you definte strict boundaries between internal logic and the outside world


### Inheritance

- Inheritance provides a way to create a new class from an existing class.
The new class is a specialized version of the existing class such that it inherits all the
public attributes and methods of the existing class. The existing class is used as a starting point
or base to create the new class.

- Inheritance means is-a relationship. It's bullshit. Don't use it. Use composition.
- Single inheritance, Multi level inheritance, Hybrid inheritance, heirarchical inheritance.


### Polymorphism

- It just means having many forms. 
- Static polymorphism
    - method overloading
    - operator overloading
- Dynamic polymorphism
    - method overriding


OOPS concepts are mostly bullshit. You don't really need them. Encapsulation is good.
Method overloading is sometimes nice when you want to have a cleaner code.
Inheritance don't use.
Abstraction is abstraction. Don't over do it.


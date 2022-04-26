### Constructor Overloading
Easy Accuracy: 91.58% Submissions: 890 Points: 2

Design a class as described below.

class name : User
instance variable: name(String)
constructor: 2
    First:
    parameter: none
    task: initialize the instance
          variable to "Default"
    Second:
    parameter: name(String)
    task: initialize the instance variable
              to the value provided in the
          parameter. (use this keyword)

Example:

Input:
Geeks
Output:
Default
Geeks

Your Task:

Your task is to design a class as described in the question.

```java
class User{
    String name;
    public User(){
        this.name = "Default";
    }
    public User(String name){
        this.name = name;
    }
}
```

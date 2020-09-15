### Question 1
#### Assuming that scan is a properly initialized Scanner variable, which of the following correctly inputs a String?

> String val = scan.nextLine();

### Question 2
#### Consider the following code: 
```java
int x = -3;
x--;
System.out.println(x);
```

> -4

### Question 3
#### Which of the following data types would be most appropriate to use when recording whether a switch is in the “on” or “off” position?

> boolean

### Question 4
#### Which of the following is NOT a primitive data type?

> String

### Question 5
#### What is output by the following code?
```java
int a = 91;
System.out.println(a / 2);
```

> 45

### Question 6
#### Which of the following is a legal variable name in Java?

> ans

### Question 7
#### What is (6 % 2) * 7?

> 0

### Question 8
#### Which of the following would properly create A and B as integer variables?

> ```java
> int A;
> int B;
> ```

### Question 9
#### Consider the following code:
```java
int c = 3 – 37 % 2; 
System.out.println(c);
```
#### What is output?

> 2

### Question 10
#### Which of the following correctly stores the word umbrella in a variable called stuff?

> String stuff = "umbrella";

### Question 11
#### Consider the following code: 
```java
int x = 9;
int y = 6;
System.out.println( (x*y)/x );
```
#### What is output? 

> 6

### Question 12
#### Consider the following variable declaration:
```java
double y = 52;
```
#### Does a cast need to be added so this code will compile and run successfully? ______. If so, what should be typed for this cast? _______

> no, nothing

### Question 13
#### The following code is intended to input three integers and print the average. What is a potential problem with the code as written? 
```java
System.out.println("Please enter three integers: ");
int a = scan.nextInt();
int b = scan.nextInt();
int c = scan.nextInt();
System.out.println("The average is: " + (a + b + c) / 3);
```

> It needs a cast so that the decimal portion will be shown.

### Question 14
#### For which of the following would modular division be LEAST likely to be useful?

> converting decimals to whole numbers 

### Question 15
#### What is output by the following code?
```java
int val = -2;
val++;
val--;
val++;
val++;
val++;
val--;
val++;
System.out.println(val);
```

> 1

### Question 16
#### What is the value of w after executing this segment of code?

```java
int w = 18;
w += 18;
```

> 36

### Question 17
#### When might you encounter a problem with integer overflow?

> When trying to store an integer which is too big to be stored in an int variable 

### Question 18
#### There are two integer variables in our program, minutes and hours, which represents time. If in the program, we increase the number of minutes by one, which of the following lines of code will correctly update hour and minutes?

> ```java
> hours = hours + minutes / 60;
> minutes = minutes % 60;
>```

### Question 19
#### Correct the following code so that q stores the nearest integer below 82.3847.
```java
int q = 82.3847;
```
> int q = (int) 82.3847;

### Question 20
#### Which of the following will print the ones column of an integer stored in x?

> System.out.print(x % 10);
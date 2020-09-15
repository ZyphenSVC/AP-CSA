### Question 1
#### Which of the following expressions in Java is equal to 4?

> 11 % 7

### Question 2
#### What is printed when the following code has been executed?
```java
int x = 15;
int y = 4;
System.out.println((2 * x + y) % x);
```

> 4

### Question 3
#### Consider the following program which is intended to get the amount of time (in minutes) it took someone to do the chores and then converts it to hours and minutes.
```java
Scanner scan = new Scanner(System.in);
int h = 0;
int m;
System.out.print("How many minutes did it take you to do your chores? ");
m = scan.nextInt();
/* missing code */
System.out.println("It took you " + h + " hours and " + m + " minutes.");
```
#### Which of the following could replace the missing code so that it all works as intended?

> ```java
> h = m / 60;
> m = m % 60;
> ```
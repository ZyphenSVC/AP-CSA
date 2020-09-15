### Question 1
#### Which of these is a valid Karel command in Java?

> move();

### Question 2
#### Which of these is a valid Karel command in Java?

> turnLeft();

### Question 3
```java
public class FunKarel extends Karel 
{ 
    public void run() 
    { 
        move(); 
        putBall(); 
        move(); 
    } 
}
```
#### What is the name of this class?
> move();

### Question 4
#### What is the name of the method that gets called to start a Java Karel program?

> run()

### Question 5
#### Which is the correct class signature for a Karel program named CleanupKarel?

> public class CleanupKarel extends Karel

### Question 6
#### Which of these methods will create a method called turnRight that will have Karel turn left three times?

> ```java
> private void turnRight()
> {
>     turnLeft();
>     turnLeft();
>     turnLeft();
> }
> ```

### Question 7
#### What is a method in Karel?

> A method is a command that Karel can do. It has a name and a set of instructions.

### Question 8
#### What is top down design?

> Top down design is a way of designing your program by starting with the biggest problem and breaking it down into smaller and smaller pieces that are easier to solve.

### Question 9
#### Which of these show the proper format for a Java comment?

> All of the above

### Question 10
#### Which of these is a valid way to write a single line comment in Java?

> ```java
> // This is a comment
> ```

### Question 11
#### What is the correct class signature in Java for a SuperKarel program?

> ```java
> public class FunKarel extends SuperKarel
> ```

### Question 12
#### Which of these loops has Karel move 7 times?

> ```java
> for(int i = 0; i < 7; i++)
> {
>     move();
> }
> ```

### Question 13
#### Which of these loops will run correctly 10 times?

> ```java
> for(int i = 0; i < 10; i++)
> {
>     turnLeft();
> }
> ```

### Question 14
#### In the code snippet below, how many times will the putBall command run?

```java
putBall();

for(int i = 0; i < 100; i++)
{
    putBall();
}

for(int i = 0; i < 6; i++)
{
    putBall();
}
```

> 107

### Question 15
#### Which of these code snippets would be the best implementation of a method called moveToWall() which moves Karel to the end of a row in the current direction?

> ```java
> while(frontIsClear())
> {
>     move();
> }
> ```

### Question 16
#### If Karel is not on a tennis ball, and all directions around are clear:
#### What will happen when running this code?

```java
while(noBallsPresent())
{
    turnLeft();
}
```

> Karel will go into an infinite loop

### Question 17
#### What is the correct syntax for an if statement?

> ```java
> if(frontIsClear())
> {
>     move();
> }
>```

### Question 18
#### If Karel is directly in front of a wall, which condition would properly check if a wall is in front and turn left, and otherwise would move?

```java
if(<CONDITION>)
{
    turnLeft();
}
else
{
    move();
}
```

> frontIsBlocked()

### Question 19
#### Say you want to write a program to have Karel put down 300 tennis balls. Which control structure would you use?

> A for loop

### Question 20
#### Say you want to write a program to have Karel pick up all of the tennis balls in a location, but you don’t know how many tennis balls there are. Which control structure would you use?

> A while loop

### Question 21
#### What is a condition in Karel programming?

> A method that returns a true or false answer. Typically used within a control structure.

### Question 22
#### What is wrong with the style of this method declaration?

```java
private void spinKarel() {
turnLeft();
turnLeft();
turnLeft();
turnLeft();
}
```
```
(I) Indenting is wrong

(II) No comment

(III) Not using camelCasing for name

(IV) Brackets are not on their own line
```

> I, II, and IV

### Question 23
#### What is wrong with this method declaration?

```java
public karelDance()
[
    move();
    turnLeft();
    move();
    turnLeft();
    move();
]
```
```
(I) Not using curly brackets

(II) Missing void

(III) The method should start with a capital. i.e. KarelDance

(IV) Illegal characters in the method name
```

> I and II

### Question 24
#### How can we teach Karel new commands?

> Define a new method

### Question 25
#### Why does a programmer indent their code?

> All of the above
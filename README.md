## Jets Project

### Week 2 Homework for Skill Distillery

This program displays and manages a fleet of Jet objects.

### Overview
UML can be accessed here: https://github.com/SkillDistillery/SD17/blob/master/java1/Jets/images/UMLJets.png?raw=true

To run the program, you will need to be in the main class, JetsApplication.  When the program launches, the user will be prompted with a display menu. The display menu has 8 options and the user may enter into any of those options at any point. 

If the user enters the first case in the switch statement, they will be prompted with the models and specifications of the entire fleet in the array that is hard-coded into the program, The array originally includes 5 fighter jets and 3 cargo planes. This array can be added to if the user chooses to do so.

The second case in the switch statement will allow the user to take one of the jets out to fly.  It will prompt the user to choose which jet in the array they would like to take out. Once a jet is chosen, the planes specifications will be printed out for the user. This is possible because the specifications of the jets are inherited from their super class "Jets". 

The third case will prompt the user with the fastest jet in the array. This case calls a method that will calculate which jet in the array has the greatest speed. This will also account for jets added into the array by the user. 

The fourth case is similar to the third, but will prompt the user with the specifications of the jet with the longest range. This will also account for jets added into the array by the user. 

The fifth case loads up only the cargo planes in the array. It will print out a message showing the user that the cargo planes in the array have been loaded up. 

The sixth case will gear up only the fighter jets for combat. This is done by calling a method that was extended from a subclass in the package and also implements an interface. 

The seventh case will allow the user to enter their own jet into the array. The user will be prompted to enter the model, speed, range, and price of their jet. This jet will be placed into one of the empty spaces in the array. The user can enter as many as 95 different jets into the array. The program will search for the next empty space in the array and place the users new jet into that spot. After the jet has been entered, it will be available in the first option "View entire fleet" as well as the fastest and longest range options if they qualify. 
 

### Technologies
1. Imports
2. Switch statements
3. If/else statements
4. The use of Abstraction, Polymorphism, Inheritance, and Encapsulation
5. For loops
6. Do while loop
7. Arrays
8. The use of "getters and setters"
9. Constructors 
10. Interfaces
11. Super classes and sub classes


### Lessons Learned
I learned the importance of the four pillars of object oriented programming (OOP). It allows for our files to be much cleaner and easier to navigate instead of everything being in the main class. I also learned that it's important to take each and every task one at a time. I found myself jumping between tasks and found that nothing was getting done. Once I started tackling each task by itself, the programming itself went much smoother. 

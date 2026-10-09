# Student Grade Tracker

## Overview

Student Grade Tracker is a Java-based console application developed to manage student grades efficiently. It calculates average, highest, and lowest scores and generates student performance reports.

## Features

* Add student details (ID and name)
* Enter marks for multiple subjects
* Calculate average, highest, and lowest grades
* Classify student performance
* Search students by ID
* View summary reports for all students
* Validate user input and prevent duplicate IDs

## Technologies Used

* Java
* Object-Oriented Programming (OOP)
* ArrayList
* Scanner
* Exception Handling

## Project Structure

```text
Student-Grade-Tracker/
├── src/
│   ├── Student.java
│   └── StudentGradeTracker.java
└── README.md
```

## Performance Criteria

| Average Marks | Performance |
| ------------- | ----------- |
| 90–100        | Excellent   |
| 75–89         | Very Good   |
| 60–74         | Good        |
| 40–59         | Pass        |
| Below 40      | Fail        |

## How to Run

1. Install the Java JDK.
2. Open the project folder in VS Code.
3. Install the Extension Pack for Java.
4. Open the terminal and navigate to the `src` folder.
5. Compile the program:

```bash
javac Student.java StudentGradeTracker.java
```

6. Run the program:

```bash
java StudentGradeTracker
```

## Sample Input

* Student ID: ST101
* Student Name: Gargi
* Number of Subjects: 4
* Grades: 85, 92, 78, 88

## Sample Output

* Average: 85.75
* Highest Grade: 92
* Lowest Grade: 78
* Performance: Very Good

## Learning Outcomes

This project demonstrates Java programming, classes and objects, encapsulation, ArrayList, methods, loops, and input validation.

## Future Enhancements

* Add a graphical user interface
* Store student data in a database
* Add edit and delete options
* Export student reports

## Author

Developed as part of Internship Task 1.

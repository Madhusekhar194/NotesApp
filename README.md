 Notes Manager – Java File I/O Project
 -------------------------------------

A simple yet powerful Notes Manager built using Java File I/O.
This project demonstrates how to write, read, and persist text data in files, while also covering exception handling in Java.

 Features
 ---------
 Add Notes – Save your thoughts, reminders, or todos.

 View Notes – Read all saved notes from the file.

Persistent Storage – Notes are stored in a text file (notes.txt) on your system.

 Safe File Handling – Uses try-with-resources for automatic resource management.

 Error Handling – Gracefully handles missing files, I/O errors, and invalid input.

 Tech Stack
--------------

Java 8+

FileWriter / BufferedWriter (for writing notes)

FileReader / BufferedReader (for reading notes)

Exception Handling (checked & unchecked exceptions)

VS Code / IntelliJ / Eclipse – IDEs you can use to run the project

 How to Run the Project
------------------------------

1. Clone the repository:  git clone https://github.com/your-username/NotesApp.git
=====>>>      cd NotesApp
2. Compile the code:  javac NotesApp.java
3. Run the program:  java NotesApp

Sample Output => 
-------------
Welcome to Notes Manager!

Choose an option:
1. Add a Note
2. View Notes
3. Exit

Enter choice: 1

Enter your note: Finish Java File I/O project ✅

Note saved successfully.



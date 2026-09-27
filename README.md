# SC-Assignment-1-OOP

Software Construction & Development — Assignment 01
University of Engineering and Technology, Abbottabad Campus

## How to open in NetBeans
1. NetBeans -> File -> Open Project -> select this folder (SC-Assignment-1-OOP).
   NetBeans recognizes it automatically as a Java Application project (Ant-based).
2. All classes are in the `assignment1` package under `src/`.
3. Each task has its own runnable class with a `main` method:
   - Task 1: `assignment1.DigitalWallet`
   - Task 2: `assignment1.EmployeeMain` (uses Employee, Developer, SalesManager)
   - Task 3: `assignment1.DeviceMain` (uses SmartDevice, SmartBulb, SmartThermostat)
   - Task 4: `assignment1.LibraryMain` (uses the corrected Book, Member classes)
4. Right-click any of the four classes above -> "Run File" to see its console output.
   Take your own NetBeans screenshots of these runs for the PDF report.

## Before pushing to GitHub
- Create a **public** repository named exactly `SC-Assignment-1-OOP`.
- Push this whole folder (or at least the `src/` folder) to it.
- Paste the real repo URL into the "Repository Link" section of the report.

## Files
```
src/assignment1/
  DigitalWallet.java          Task 1 - Encapsulation
  Employee.java                Task 2 - base class
  Developer.java                Task 2 - subclass
  SalesManager.java             Task 2 - subclass
  EmployeeMain.java              Task 2 - polymorphism demo
  SmartDevice.java              Task 3 - interface
  SmartBulb.java                 Task 3 - implementation
  SmartThermostat.java           Task 3 - implementation
  DeviceMain.java                Task 3 - demo
  Book.java                     Task 4 - corrected class
  Member.java                    Task 4 - corrected class
  LibraryMain.java                Task 4 - demo
```

Note: the AI's original (flawed) Library System code used for the Task 4 critique
is included as text in the report (Assignment_01_Report.docx), not as a runnable
file here, since it is only there to be compared against the fix.

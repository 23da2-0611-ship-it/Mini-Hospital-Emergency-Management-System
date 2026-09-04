# Mini Hospital Emergency Management System

## Project Description

The Mini Hospital Emergency Management System is a Java-based application designed to manage patient records, emergency patients, treatment history, and patient visit history.

The system demonstrates the practical use of four important data structures:

* Binary Search Tree (BST)
* Queue
* Stack
* Singly Linked List

## Features

### 1. Patient Records - Binary Search Tree

The system uses a Binary Search Tree to store and manage patient records.

Functions:

* Insert patient records
* Search patient by Patient ID
* Delete patient records
* Display patient records using in-order traversal

Patient details include:

* Patient ID
* Patient Name
* Age
* Contact Number
* Medical Condition

### 2. Emergency Patient Queue - Queue

The emergency queue follows the FIFO (First In, First Out) principle.

Functions:

* Add patients to the emergency queue
* Serve the next patient
* Display waiting patients
* Handle an empty queue

### 3. Treatment History - Stack

The treatment history uses a Stack and follows the LIFO (Last In, First Out) principle.

Functions:

* Add treatment records
* Remove the latest treatment record
* Display treatment history
* Handle an empty stack

### 4. Patient Visit History - Singly Linked List

The patient visit history is implemented using a Singly Linked List.

Functions:

* Add patient visits
* Search visits by Visit ID
* Remove visits
* Display visit history

Visit details include:

* Visit ID
* Visit Date
* Doctor Name
* Diagnosis
* Treatment

## Technologies Used

* Java
* Java 21
* Visual Studio Code
* Git
* GitHub

## Project Structure

```text
Mini Hospital Emergency Management System
│
├── .gitignore
├── README.md
│
└── src
    ├── classes
    │   ├── Patient.java
    │   ├── PatientBST.java
    │   ├── PatientNode.java
    │   ├── PatientQueue.java
    │   ├── PatientVisitHistory.java
    │   ├── TreatmentStack.java
    │   ├── Visit.java
    │   └── VisitNode.java
    │
    └── main
        ├── HospitalManagementSystem.java
        ├── TestBST.java
        ├── TestQueue.java
        ├── TestStack.java
        └── TestVisitHistory.java
```

## How to Run

Open the project folder in Visual Studio Code.

Compile the Java source files:

```powershell
javac -d out src\classes\*.java src\main\*.java
```

Run the main program:

```powershell
java -cp "out" HospitalManagementSystem
```

## Data Structure Summary

| Data Structure     | Purpose               | Principle          |
| ------------------ | --------------------- | ------------------ |
| Binary Search Tree | Patient Records       | Ordered searching  |
| Queue              | Emergency Patients    | FIFO               |
| Stack              | Treatment History     | LIFO               |
| Singly Linked List | Patient Visit History | Sequential storage |

## Sample Patient Records

| Patient ID | Patient Name | Age | Medical Condition |
| ---------- | ------------ | --: | ----------------- |
| 1001       | Afqa         |  24 | Fever             |
| 1003       | Samrath      |  25 | Headache          |
| 1005       | Aswer        |  58 | Diabetes          |

## Author

Afqa Aswer

## Repository

GitHub Repository:

https://github.com/23da2-0611-ship-it/Mini-Hospital-Emergency-Management-System

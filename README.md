# Java RMI Scientific Calculator

Simple **Java RMI** based scientific calculator.  
Client sends math operations to remote server → server performs calculations.

## Files
- `SampleServer.java`       → Remote interface  
- `SampleServerimpl.java`   → Server implementation  
- `MyServer.java`           → Starts RMI server & binds object  
- `MyClient.java`           → Client application (menu + user input)  
- `StudentInfo ugr_35682_16.txt`  → Student information

## Features
- Basic: +  –  ×  ÷  
- Scientific: power, square root, sin, cos, tan (degrees)  
- Menu-driven client  
- Exception handling  
- Continues same operation or returns to menu

## Requirements
- JDK 8 or higher  
- Terminal / command prompt

## How to Run

1. Compile everything  
javac *.java

Start the server (in one terminal)

java MyServer
(You should see something like "Server is ready...")

Run the client (in another terminal)

java MyClient
Follow the menu prompts to perform calculations.
Notes

Server must be running before starting the client.
All calculations happen on the server side via RMI.
Trigonometric functions expect input in degrees.

Submitted by: yohannes desta
Student ID reference: ugr_35682_16

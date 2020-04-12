# Bridge Pattern

This repository contains a simple Java implementation of a bridge pattern.

It consists of a collection of shapes and a collection of colors.  Colors can be selected to assign to all existing shapes.

### The Problem:
Before applying the bridge pattern, each color instance would have to be assigned separately to each shape, making color dependent on shape.

![before-bridge](https://user-images.githubusercontent.com/35542660/79058158-d6f66300-7c2f-11ea-8056-a3f39b9640e3.JPG)

### The Solution:
Implementing the bridge pattern allows the implementation (Color) to be developed independently of the abstraction (Shape).

![after-bridge](https://user-images.githubusercontent.com/35542660/79058162-e07fcb00-7c2f-11ea-862f-bc8679e9aa7b.JPG)

### To Run:
1) Clone this repository to your local device.
2) Open the project in your IDE of choice.
3) Build the project and run it using the RunClient.java file.
4) Choose the color you would like to assign to every shape.

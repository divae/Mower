# MAP
Reading the test we understand that there is a map of 2 x 2 points
````
|-2, 2|-1, 2|0, 2|1, 2|2, 2|
|-2, 1|-1, 1|0, 1|1, 1|2, 1|
|-2,-0|-1,-0|0, 0|1, 0|2, 0|
|-2,-1|-1,-1|0,-1|1,-1|2,-1|
|-2,-2|-1,-2|0,-2|1,-2|2,-2|
````

## Input
The first line of input is the upper-right coordinates of the plateau, the bottom-left
coordinates are assumed to be 0, 0.
The rest of the input is information pertaining to the mowers that have been deployed.
Each mower has two lines of input. The first line gives the mower’s position, and the
second line is a series of instructions telling the mower how to explore the plateau. The
position is made up of two integers and a letter separated by spaces, corresponding to the
X and Y coordinates and the mower’s orientation.
Each mower will be finished sequentially, which means that the second mower won’t start
to move until the first one has finished moving.

## Output
The output for each mower should be its final coordinates and heading.

### Input Test Case #1:
````
5 5
1 2 N
LMLMLMLMM
3 3 E
````

### Output Test Case #2:
````
MMRMMRMRRM
1 3 N
5 1 E
````

# Overview
This approach focuses on the functionality of the robot on a planet.

#  Functionalities implemented:
- Move forward
- Turn 90 degrees to the right
- Turn 90 degrees to the left
- When the position reaches the position to ensure that it cuts the grass of the entire planet.

## Run App:
You will have to run the `Program.kt` file located in the following directory
- src
  - main
    - kotlin
      - consoleapp
        - Program.kt
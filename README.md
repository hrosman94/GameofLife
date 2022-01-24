lThe following an object-oriented program to implement the Game of Life,
as defined by John Conway. The rules are thus:

1. Any living cell with fewer than two live neighbors (simulates 
depopulation) 
2. Any living cell with two or three neighbors lives into the next 
generation
3. Any living cell with more than three live neighbors dies, due to
limitted resources between them
4. Any dead cell with exacrly three live neighbors becomes a live cell
(reproduction)


NOTE: 'X' indicates an inhabited square, and 'O' inidcates an empty 
square

The program accepts the input file (start.txt), which has a 20x20 grid
of all of the cells. It also indicates at the bottom how many 
generations to compute. When ran, the final configuration is in the same 
format as the input.

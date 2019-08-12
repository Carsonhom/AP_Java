// Before you write anything in this file, go to Clickables and see how clear()
// is written.
// In addition to these methods, you need to write two methods - updateAlive() and
// calcNeighbors() - in the Cell class.

void calcNeighborsForAllCells() {
  // Each cell determines how many neighbors it has
  //YOUR CODE HERE
  for(int i = 0; i < ROWS; i++){
    for(int j = 0; j < COLS; j++){
      cell[i][j].calcNeighbors();
    }
  }
  
}

void updateAliveForAllCells() {
  // Each cell updates its alive/dead status
  //YOUR CODE HERE
  for(int i = 0; i < ROWS; i++){
    for(int j = 0; j < COLS; j++){
      cell[i][j].updateAlive();
    }
  }
}

void displayCells() {
  // Have all of the cells draw themselves as alive/dead on the grid
  //YOUR CODE HERE
   for(int i = 0; i < ROWS; i++){
     for(int j = 0; j < COLS; j++){
       cell[i][j].display(TOP_OFFSET, LEFT_OFFSET, CELL_WIDTH, CELL_HEIGHT);
     }
   }
  
}

void initGrid() {
  // Initialize grid of cells
  //YOUR CODE HERE
  for(int i = 0; i < cell.length; i++){
    for(int j = 0; j < cell[0].length; j++){
      cell[i][j] = new Cell(i, j);
    }
  }
  
}
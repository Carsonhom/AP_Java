class Cell {
  public int col;
  public int row;
  
  private boolean amAlive = false;
  private int neighbors = 0;
  private final color ALIVE_COLOR = color(#FF6600);
  private final color DEAD_COLOR = color(#E8E8E8);
  
  public Cell(int row, int col) {
    this.col = col;
    this.row = row;
  }
  
  public void toggleAlive() { amAlive = !amAlive; }
  public void setAlive(boolean alive) { amAlive = alive; }
  public boolean isAlive() { return amAlive; }
  
  public void display(int xoffset, int yoffset, int w, int h) {
    //this displays cells on a screen
    //you do not need to modify this code
    xoffset += (w+1) * col;
    yoffset += (h+1) * row;
    color fillColor = amAlive ? ALIVE_COLOR : DEAD_COLOR;
    fill(fillColor);
    rect(xoffset, yoffset, w, h);
  }
    
  public void updateAlive() {
    //YOUR CODE HERE
    //decide if a cell is alive or dead next turn
    //this can be done in one line; you don't need to do it in one line
    if(amAlive == true){
      if(neighbors == 2 || neighbors == 3){
        amAlive = true;
      }else amAlive = false;
    }else if(amAlive == false){
      if(neighbors == 3){
        amAlive = true;
      }else amAlive = false;
    }else amAlive = false;
    
    
  }
  
  public int calcNeighbors() {
    neighbors = 0;
    //YOUR CODE HERE
    //calculate number of alive neighbors for this cell -- do not count yourself!
    for(int i = -1; i <= 1; i++){
      for(int j = -1; j <= 1; j++){
        if(cell[(row + i + ROWS) % ROWS][(col + j + COLS) % COLS].amAlive == true){
          neighbors++;
        }
          
          //(row - 1) % ROWS;
      }
    }
    
    //row((n + 1)%total rows
    //coloms((n + 1)%total colomns
    if(cell[row][col].amAlive == true){
    return neighbors--;
    }else return neighbors;
  }
}
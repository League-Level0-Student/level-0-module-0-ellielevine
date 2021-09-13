
void setup() {
 size(600,600); 
// 1. Set the size of the sketch. Make it 600 pixels square. 
  

}

void draw() {
  
// 2. Draw an ellipse
// Run the program to make sure it works before moving on.
ellipse(100,200, 150,150);

// 3. Change the color of the ellipse when the mouse is pressed.
//    Use the following code, but put your colors where indicated
//    Remember to use the   fill()  command to set colors.

if (mousePressed) {
 fill(#4F19E5);
   //  put one color here 
  
} else {
  fill(#6F952A);
   // put a different color here
  
}  
  
  
  
}

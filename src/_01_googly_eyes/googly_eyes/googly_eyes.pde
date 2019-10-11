
void setup() {
  PImage face = loadImage("face.jpg");
  size(800, 600);
  face.resize(width, height);
  background(face);
}

void draw() {
  if(mouseX < 240){
    fill(255);
    ellipse(265,200,50,40);
    fill(0);
    ellipse(240,mouseY,10,10);
  }
  if(mouseX > 290){
    fill(255);
    ellipse(265,200,50,40);
    fill(0);
    ellipse(290,mouseY,10,10);
  }
  if(mouseY < 180){
    fill(255);
    ellipse(265,200,50,40);
    fill(0);
    ellipse(mouseX,180,10,10);
  }
  if(mouseY > 220){
    fill(255);
    ellipse(265,200,50,40);
    fill(0);
    ellipse(mouseX,220,10,10);
  }
     
    
    
  
  }
  
  
  
  

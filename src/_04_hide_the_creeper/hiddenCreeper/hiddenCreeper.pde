PImage background;
PImage creeper;     //at the top of your program
float x = 0;
float y = 0;

void setup(){
  size(300,168);
  background = loadImage("minecraft.jpg");
  creeper=loadImage("creeper.png");     //in setup method
  creeper.resize(10,10);
  background(background);
}
void draw(){
  
  background(background);
  image(creeper, x, y);     //in draw method
  if(mousePressed == true){
  if(dist(mouseX,mouseY,0,0) < 30){
    fill(0,255,0);
  }else{
    fill(255,0,0);
  }
  ellipse(mouseX,mouseY, 5,5);
  if(dist(mouseX,mouseY,x,y) < 10){
   x = random(0,290);
    y = random(0,158);
  }
  }
}

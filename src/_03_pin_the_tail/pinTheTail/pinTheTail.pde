PImage donkey;
 PImage tail;
int x = 0;
int y = 0;
import ddf.minim.*;          //at the very top of your sketch
AudioSample woohooSound;          //at the top of your sketch
boolean playSound = true;          //at the top of your sketch

void setup(){
 donkey = loadImage("donkey.jpg");      //change the file name if you need to
tail = loadImage("tail.png");      //change the file name if you need to
size(550,406);
tail.resize(100,100);
Minim minim = new Minim(this);     //In the setup method
woohooSound = minim.loadSample("homer-woohoo.wav");     //In setup. Change the file name if you need to
}
void draw(){
  if( dist(0,0, mouseX, mouseY) < 30){
 background(donkey);
}else{
 background(0); 
}

if(x ==0 && y ==0){
image(tail, mouseX, mouseY);
}
noFill();
noStroke();
rect(0,0,30,30);
rect(454,65,40,40);
if(mousePressed == true){
 x = mouseX;
 y = mouseY;
}
image(tail, x, y);
if(dist(x, y, 454, 65) < 20){
 if (playSound) {
     woohooSound.trigger();
     playSound = false; 
}
}
}

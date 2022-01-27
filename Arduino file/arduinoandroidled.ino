 void setup() {  
  Serial.begin(9600);
  pinMode(4, OUTPUT);
  digitalWrite(4, LOW); 
 }  
 void loop() {
  String string = "";
  if(Serial.available()) {  
   char c = Serial.read();
   Serial.print(c == 'N');
   if (c == 'N') {
    digitalWrite(4, HIGH);
   } else if (c == 'F'){
    digitalWrite(4, LOW);
   }
  }   
 } 

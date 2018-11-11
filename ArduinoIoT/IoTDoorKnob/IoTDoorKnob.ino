/*
  Hello World.ino
  2013 Copyright (c) Seeed Technology Inc.  All right reserved.

  Author:Loovee
  2013-9-18

  Grove - Serial LCD RGB Backlight demo.

  This library is free software; you can redistribute it and/or
  modify it under the terms of the GNU Lesser General Public
  License as published by the Free Software Foundation; either
  version 2.1 of the License, or (at your option) any later version.

  This library is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
  Lesser General Public License for more details.

  You should have received a copy of the GNU Lesser General Public
  License along with this library; if not, write to the Free Software
  Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
*/
String generatePassword();

#include <Wire.h>
#include <Servo.h>
#include "rgb_lcd.h"

rgb_lcd lcd;


const int D = 50;
String pwrd;

int colorR = 255;
int colorG = 0;
int colorB = 0;

int alarmCount;

int pos = 0;

Servo servo;


void setup()
{
  alarmCount = 0;
  randomSeed(analogRead(0));
  servo.attach(9); //arduino
  //  servo.attach(4); //esp

  Serial.begin(9600);
  // Serial.write("Ready");

  pwrd = generatePassword();
  //writeString(pwrd);
  // set up the LCD's number of columns and rows:
  lcd.begin(16, 2);

  lcdLockedState();
  // Print a message to the LCD.

  delay(1000);
  Serial.end();
}

void loop()
{
  Serial.begin(9600);
  servo.write(pos);

  // set the cursor to column 0, line 1
  // (note: line 1 is the second row, since counting begins with 0):
  lcd.setCursor(0, 1);
  // print the number of seconds since reset:
  lcd.print(pwrd);

  while(Serial.available())
    delay(1);
  String input = receiveMessage();
  input.trim();
  if (input.equals(pwrd)) {
    lcdUnlockedState();
  }
  else if (input.equals("lock")) {
    lcdLockedState();
  }
  else {
    lcdAlarmState();
    alarmCount++;
    pwrd = generatePassword();
  }

  if (alarmCount > 3) {
    lockout();
  }

  delay(100);
  Serial.end();
}

void lcdAlarmState() {
  for (int i = 0; i < 6; i++) {
    lcd.setRGB(0, 0, 255);
    delay(80);
    lcd.setRGB(255, 0, 0);
    delay(80);
  }
//  sendMessage("refused");
}

void lcdUnlockedState() {
  pos = 180;
  lcd.setCursor(0, 0);
  lcd.print("unlocked!");
  lcd.setRGB(0, 255, 0);
//  sendMessage("accepted");
}

void lcdLockedState() {
  pos = 0;
  lcd.setCursor(0, 0);
  lcd.print("locked!");
  lcd.setRGB(255, 0, 0);
//  sendMessage("locked");
}

String generatePassword() {
  int length = random(4, 8);
  String pwrd = "";

  for (int i = 0; i < length; i++) {
    int ran = random(0, 61);

    if (ran < 10) {
      pwrd = pwrd + ran;
    }
    else if (ran < 36)
      pwrd = pwrd + (char) (ran + 55);
    else
      pwrd = pwrd + (char) (ran + 61);

  }

  return pwrd;
}

void writeString(String stringData) { // Used to serially push out a String with Serial.write()

  for (int i = 0; i < stringData.length(); i++)
  {
    Serial.write(stringData[i]);   // Push each char 1 by 1 on each loop pass
  }

}

void lockout() {
  lcd.setRGB(255, 0, 0);
  lcd.clear();
  lcd.setCursor(5, 0);
  lcd.print("LOCKOUT");
  delay(5000);
  lcd.clear();
  lcdLockedState();
  alarmCount = 0;
}

//void sendMessage(String msg) {
//  //  while (!Serial) delay(1);
//  //  delay(D);
//  String response = "";
//  int times = 0;
//  do {
//
//    Serial.println(msg);
//
//    int timeout = 0;
//    while (!Serial.available() && timeout < 1000) {
//      delay(1);
//      timeout++;
//    }
//
//    if (timeout >= 1000) {
//      times++;
//      continue;
//    }
//    response = Serial.readString();
//    response.trim();
//
//
//    if (response.indexOf("ok") != -1)
//      break;
//
//  } while (!response.equals("ok") && times < 5);
//}

String receiveMessage() {

  while (!Serial.available()) {
    delay(1);
  }

  String response = Serial.readString();
  delay(D);
  response.trim();


  while (!Serial) {
    delay(1);
  }
  Serial.print("ok, received: "); Serial.println(response);

  return response;

}
/*********************************************************************************************************
  END FILE
*********************************************************************************************************/

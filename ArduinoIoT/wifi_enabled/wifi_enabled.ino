#include <ESP8266WiFi.h>

const int D = 50;
const char* ssid = "BostonHacks";
const char* password = "Hackaway18";

int ledPin = 13; // GPIO13
WiFiServer server(80);

void setup() {
  Serial.begin(9600);
  delay(10);

  pinMode(ledPin, OUTPUT);
  digitalWrite(ledPin, LOW);

  // Connect to WiFi network
  Serial.println();
  Serial.println();
  Serial.print("Connecting to ");
  Serial.println(ssid);

  WiFi.begin(ssid, password);

  while (WiFi.status() != WL_CONNECTED) {
    delay(500);
    Serial.print(".");
  }
  Serial.println("");
  Serial.println("WiFi connected");

  // Start the server
  server.begin();
  Serial.println("Server started");

  // Print the IP address
  Serial.print("Use this URL to connect: ");
  Serial.print("http://");
  Serial.print(WiFi.localIP());
  Serial.println("/");
}

void loop() {

  WiFiClient client;
  String cut1;

  // Check if a client has connected
  client = server.available();
  if (!client) {
    return;
  }

  // Wait until the client sends some data
  //Serial.println("new client");
  while (!client.available()) {
    delay(1);
  }

  // Read the first line of the request
  String request = client.readStringUntil('\r');
  //Serial.println(request);
  client.flush();

  // Match the request

  if (request.indexOf("/PWD") != -1) {
    String cut = request.substring(9);
    cut1 = cut.substring(0, cut.indexOf(" "));
    sendMessage(cut1);
  }

//  String response;
//
//  response = receiveMessage();
  
  // Return the response
  client.println("HTTP/1.1 200 OK");
  client.println("Content-Type: text/html");
  client.println(""); //  do not forget this one
  client.println("<!DOCTYPE HTML>");
  client.println("<html>");
//  client.print();
  client.println("<br><br>");
  client.println("<a href=\"/PWD=ON\"\"><button>Turn On </button></a>");
  //  client.println("<a href=\"/PWD=OFF\"\"><button>Turn Off </button></a><br />");
  client.println("</html>");

  delay(1);
  //Serial.println("Client disonnected");
}
void sendMessage(String msg) {
  //  while (!Serial) delay(1);
  //  delay(D);
//  String response = "";
//  int times = 0;
//  do {

    Serial.println(msg);

//    int timeout = 0;
//    while (!Serial.available() && timeout < 1000) {
//      delay(10);
//      timeout++;
//    }
//
//    if (timeout >= 1000) {
//      times++;
//      continue;
//    }
//    response = Serial.readString();
////    Serial.println(response);
//    if(response.indexOf("ok") != -1)
//      break;
//
//  } while (!response.equals("ok") && times < 5);
}

//String receiveMessage() {
//
//  while (!Serial.available()) {
//    delay(1);
//  }
//
//  String response = Serial.readString();
//  delay(D);
//  response.trim();
//
//
////  while (!Serial) {
////    delay(1);
////  }
//
//  delay(1000);
//  Serial.println("ok");
//
//  return response;
//
//}


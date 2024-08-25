/* Aravind H Alwar */
/* August 10,2024 */
//PATRON.C

#ifndef PATRON_C_ //Define PATRON_C_
#define PATRON_C_

void set_User(char *Customer){
  char *Patron=*Customer; //Using pointers to efficently create the username;
  char* userName=Patron[sizeof(Patron)/sizeof(Patron[1])]; //Use a pointer variable,userName to hold the value of name(up to 50 chars accepted);Setting the user's name
}
//Set the user's birthday;
void set_Birthday(int m,int d,int yr,double age){
}

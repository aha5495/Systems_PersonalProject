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
void set_Birthday(struct date set,int m,int d,int yr,double age){
  setdate(&set,&set.m,&set.d,&set.yr); //Setting the person's DOB with struct date;
  this.age=age; //Using objects skills to set the age;
}
//Gives the best theater options suiting user's needs;
void theater_Pref(double radius,string* Cinemas[],char* chosen){ 
}

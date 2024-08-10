/* Aravind H Alwar */
/* August 10,2024 */
//PATRON.C

#ifndef PATRON_C_ //Define PATRON_C_
#define PATRON_C_

void set_User(char *F_Name,char *M_Name,char *L_Name){
  char name=*F_Name+" "+*M_Name+" "+*L_Name; //Using pointers to efficently create the username;
  char* userName=name[50]; //Use a pointer variable,userName to hold the value of name(up to 50 chars accepted);Setting the user's name
}

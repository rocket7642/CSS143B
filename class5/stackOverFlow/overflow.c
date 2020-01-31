#include <stdio.h>
#include <stdlib.h>

void bad_code()
{
    printf("now inside bad_code() ↶（｀∇´）!\n");
}


void good_code()
{
  int i;
  void * buffer[1];
  printf("now inside good_code()!\n");

  for (i=0; i<10; i++)
     buffer[i] = (void*)bad_code;

  printf("now leaving good_code() towards main()!\n");
}

int main (int argc, char *argv[])
{
    good_code();
    return 0;
}



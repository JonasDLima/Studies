#include <stdio.h>
#include <stdlib.h>

int main() {
  int *p, i;

  p = malloc(10*sizeof(int));
  if(p == NULL) {
    printf("Espaco Insuficiente");
    exit(1);
  }else {
    printf("Primeiros 10 números.\n");
    for (i=0; i<10; i++) {
      p[i] = i+10;
      printf(" %d-%d\n", i, p[i]);
    }
  }
  p = realloc(p, 20*sizeof(int));
  printf("Realocado para mais 10 números.\n");
  for(i=0; i<20; i++) {
    p[i] = i+20;
    printf(" %d-%d\n", i, p[i]);
  }
  printf("Todos os 20 números alocados.\n");
  for(i=0; i<20; i++) {
    printf(" %d-%d\n", i, p[i]);
  }
  free(p);
  system("read -p 'Press Enter to continue ...' var");
  return(0);
}

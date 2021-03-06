
#include <stdio.h>
void sort_numeric(double arr[], int n, char sortType)
{
  if (sortType == 'a' || sortType == 'A')
  {
    //sorting the array in ascending order
    for (int i = 0; i < n - 1; i++)
    {
      for (int j = 0; j < n - 1; j++)
      {
        if (*(arr + j) > *(arr + j + 1))
        {
          int temp = *(arr + j);
          *(arr + j) = *(arr + j + 1);
          *(arr + j + 1) = temp;
        }
      }
    }
  }
  else
  {
    // sorting the array in descending order
    for (int i = 0; i < n - 1; i++)
    {
      for (int j = 0; j < n - 1; j++)
      {
        if (*(arr + j) < *(arr + j + 1))
        {
          int temp = *(arr + j);
          *(arr + j) = *(arr + j + 1);
          *(arr + j + 1) = temp;
        }
      }
    }
  }
}

int main()
{
  // decalring int variable to store the size of the array
  int n;
  // taking input from the user
  printf("Enter the size of the array: ");
  scanf("%d", &n);

  double arr[n];
  double val;
  char ch;
  printf("\nEnter the elements of the array: ");
  for (int i = 0; i < n; i++)
  {
    scanf("%lf", &val);
    *(arr + i) = val;
  }
  printf("\nEnter the sort type(a or A or d or D:");
  scanf("%c", &ch);
  scanf("%c", &ch);
  sort_numeric(arr, n, ch);
  printf("\nYour array after sorting:\n");
  for (int i = 0; i < n; i++)
    printf("%.1lf\t", *(arr + i));
  printf("\n");
  return 0;
}
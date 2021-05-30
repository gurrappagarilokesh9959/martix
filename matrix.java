public class MatrixAddandMul{

public static void main(String args[]){

int a[][]={{1,3,4},{2,4,3},{3,4,5}}; //creating two matrices
int b[][]={{1,3,4},{2,4,3},{1,2,4}};

int c[][]=new int[3][3]; //creating another matrix to store the sum of two matrices 3 rows and 3 columns
System.out.println("Matrix Addition"); for(int i=0;i<3;i++){ //adding and printing addition of 2 matrices

 for(int j=0;j<3;j++){    
     
         c[i][j]=a[i][j]+b[i][j];    //adding
         
 System.out.print(c[i][j]+" ");    
}
System.out.println(); //new line }

int d[][]=new int[3][3]; //3 rows and 3 columns

//multiplying and printing multiplication of 2 matrices
System.out.println("Matrix Multiplication"); for(int i=0;i<3;i++){

for(int j=0;j<3;j++){
d[i][j]=0;
for(int k=0;k<3;k++)
{
d[i][j]+=a[i][k]*b[k][j];
}//end of k loop
System.out.print(d[i][j]+" "); //printing matrix element
}//end of j loop
System.out.println();//new line
}
}
}

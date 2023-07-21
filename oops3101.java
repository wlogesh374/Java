import java.util.*;



class add
{
public static void main(String args[])
{
int n,m;
int i;
int j;
int count=0;
int count1=0;
System.out.print("no of rows of arr");

Scanner s=new Scanner(System.in);
n=s.nextInt();
System.out.print("no of col array ");
m=s.nextInt();

int a[][]=new int[n][m];
int b[][]=new int[n][m];
int c[][]=new int[n][m];


System.out.println("enter the elements of array1 are");


for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
a[i][j]=s.nextInt();
}
}

System.out.println("enter the elements of array 2are");

for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
b[i][j]=s.nextInt();
}
}
System.out.println("the elements array1 are");


for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
System.out.print(a[i][j]+" ");

}
System.out.println(" ");

}


System.out.println("the elements array2  are");


for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
System.out.print(a[i][j]+" ");

}
System.out.println(" ");

}




for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{

c[i][j]=a[i][j]+b[i][j];
}

}





System.out.println("the elements of sum of 2 arrays  are");

for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
System.out.print(c[i][j]+" ");

}
System.out.println(" ");

}



}}








class sub
{
public static void main(String args[])
{
int n,m;
int i;
int j;
int count=0;
int count1=0;
System.out.print("no of rows of arr");

Scanner s=new Scanner(System.in);
n=s.nextInt();
System.out.print("no of col array ");
m=s.nextInt();

int a[][]=new int[n][m];
int b[][]=new int[n][m];
int c[][]=new int[n][m];


System.out.println("enter the elements of array1 are");


for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
a[i][j]=s.nextInt();
}
}

System.out.println("enter the elements of array 2are");

for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
b[i][j]=s.nextInt();
}
}
System.out.println("the elements array1 are");


for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
System.out.print(a[i][j]+" ");

}
System.out.println(" ");

}


System.out.println("the elements array2  are");


for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
System.out.print(a[i][j]+" ");

}
System.out.println(" ");

}




for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{

c[i][j]=a[i][j]-b[i][j];
}

}





System.out.println("the elements of sub of 2 arrays  are");

for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
System.out.print(c[i][j]+" ");

}
System.out.println(" ");

}



}}









class dia
{
public static void main(String args[])
{
int n,m;
int i;
int j;
int flag=0;
System.out.println("no of rows of arr");

Scanner s=new Scanner(System.in);
n=s.nextInt();
System.out.println("no of col array ");
m=s.nextInt();

int a[][]=new int[n][m];
int b[][]=new int[n][m];


System.out.println("enter the elements of array1 are");


for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
a[i][j]=s.nextInt();
}
}

System.out.println(" the elements of array 1are");

for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println(" ");

}



System.out.println("the diagonal elements are");

for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
if(i==j)
System.out.println(a[i][j]+" ");

}
System.out.println(" ");

}



}}







class eql
{
public static void main(String args[])
{
int n,m;
int i;
int j;
int flag=0;
System.out.print("no of rows of arr");

Scanner s=new Scanner(System.in);
n=s.nextInt();
System.out.print("no of col array ");
m=s.nextInt();

int a[][]=new int[n][m];
int b[][]=new int[n][m];
int c[][]=new int[n][m];


System.out.println("enter the elements of array1 are");


for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
a[i][j]=s.nextInt();
}
}

System.out.println("enter the elements of array 2are");

for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
b[i][j]=s.nextInt();
}
}
System.out.println("the elements array1 are");


for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
System.out.print(a[i][j]+" ");

}
System.out.println(" ");

}


System.out.println("the elements array2  are");


for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
System.out.print(a[i][j]+" ");

}
System.out.println(" ");

}




for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{

if(a[i][j]==b[i][j])
flag=0;
else
flag=1;
break;

}

}



if(flag==0)
System.out.println("Matrix is equal");

else
System.out.println("Matrix is not equal");

}}
















class transpose
{
public static void main(String args[])
{
int n,m;
int i;
int j;
int flag=0;
System.out.println("no of rows of arr");

Scanner s=new Scanner(System.in);
n=s.nextInt();
System.out.println("no of col array ");
m=s.nextInt();

int a[][]=new int[n][m];
int b[][]=new int[n][m];


System.out.println("enter the elements of array1 are");


for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
a[i][j]=s.nextInt();
}
}

System.out.println(" the elements of array 1are");

for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println(" ");

}



System.out.println("the transpose matrix is");

for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
System.out.print(a[j][i]+" ");

}
System.out.println(" ");

}



}}






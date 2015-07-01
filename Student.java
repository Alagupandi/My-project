
public class Student {
	int i,j;
	Student(int i)
	{
		j=i;
		System.out.println(i);
	}
Student(Student s)
{
	j=s.j;
}
public static void main(String[] args){
 Student s1=new Student(1);
 Student S2=new Student(s1);
 System.out.println(S2.j);
}
}


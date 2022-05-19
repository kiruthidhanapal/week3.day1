package org.college;

public class Students {
public void getStudentInfo(int id) {
	
	System.out.println("student id is" + id);
	
}
public void getStudentInfo(int id,String name)
{
System.out.println("student id is" + id);
System.out.println("student name is" + name);
}
public void getStudentInfo(String email,long phone)
{
System.out.println("student email id is " +email);	
System.out.println("student phone number is" + phone);
}

public static void main(String[] args) {
Students info=new Students();
info.getStudentInfo(11042);
info.getStudentInfo(11042, "kiruthi");
info.getStudentInfo("kiruthidhanapal@gmail.com",9239768);

}
}


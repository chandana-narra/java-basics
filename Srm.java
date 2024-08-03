class Srm{
public static void main(String[] args){
System.out.println("hello world");

String name = "chandana";
System.out.println("my name is " +name);

String[] names = {"kushi1","aditya",name};
System.out.println(names[1]+" "+names[0]+" "+names[2]);

System.out.println(names[0]+" teaches "+names[1]+" and " +names[2]);

int[] rollno = {1,2,3};
// kushi1 rollno is 1,aditya rollno is 3
System.out.println(names[0]+" rollno is " +rollno[0] + "," +names[1]+" rollno is "+rollno[1]);
}
}
package daythree;

public class Thisclass {
        int rollno;
        String name;
        float fee;
        
        Thisclass(int rollno,String name , float fee){
        	this.rollno = rollno;
        	this.name = name;
        	this.fee = fee;
        }
        void display()
        {
        	System.out.println(rollno+" "+name+" "+fee);
        }  

        
}

enum Status{
    Running, Error, Waiting, Success;
}
public class enumClass {
    public static void main(String[] args){
    //   Status[] ss= Status.values();

    //   for(Status s:ss){
    //     System.out.println(s +" : "+ s.ordinal());
    //   } //to print the whole enum class

    Status s = Status.Error;

 switch(s){
case Running:
System.out.println("Running");
break;
case Error:
System.out.println("Error while compiling");
break;
case Waiting:
System.out.println("Please wait");
break;
 default:
System.out.println("Success");
break;

 } //using switch case in enum

    // if(s == Status.Running){
    //     System.out.println("Running ");
    // }else if(s == Status.Error){
    //     System.out.println("Error while compiling");
    // }else if(s == Status.Waiting){
    //     System.out.println("Please wait");
    // }else if(s == Status.Success){
    //     System.out.println("Success");
    // } 
    //using if else in enum
    }
}

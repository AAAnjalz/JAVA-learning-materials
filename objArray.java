class Students{
    String name;
    int rollNo;
    int marks;
}

public class objArray {



    public static void main(String[] args){
        Students s1 = new Students();
        s1.name = "Anjal";
        s1.rollNo= 1;
        s1.marks= 100;

        Students s2= new Students();
        s2.name="Anzuu";
        s2.rollNo = 2;
        s2.marks = 90;

        Students student[] = new Students[2];
        student[0] = s1;
        student[1] =s2;
      

        for(Students stud : student ){
            System.out.println(stud.name + ":" + stud.marks);
        }

    //    for(int i=0;i<student.length;i++){
    //     System.out.println(s1.name + s1.marks);
    //    }
       
        


        
   

    }
}

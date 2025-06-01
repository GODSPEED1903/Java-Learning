class Student{
    int rollno;
    String name;
    int marks;
}


class nine{
    public static void main(String arag[]){
        //int have fixd size so we can put more numbers in it
        //that why array
        int nums[] = {3,2,3};
        int num[] = new int[4];
        //all values are zero
        System.out.println(num.length);
        for(int i=0; i<num.length; i++){
            System.out.println(num[i]);
        }

        int nums2[][] = new int[3][4]; //3 rows and 4 column
        for(int n[] : nums2){
            for(int m : n){
                System.out.println(m);
            }
        }


        //jagged array -> when in 2d array, we have different size internal arrays
        int nums3[][] = new int[3][];
        nums3[0] = new int[3];
        nums3[1] = new int[5];
        nums3[2] = new int[1];
        for(int i=0; i<nums3.length; i++){
            for(int j=0; j<nums3[i].length; j++){
                System.out.println(nums3[i][j]);
            }
        }



        //array in java is an object
        //memory location it takes in contineous
        //you can not increase the size of array
        //for searching it consume time because we do linearly


        //exceptions are runtime errors
        Student s1 = new Student();
        s1.rollno = 33;
        s1.name = "Aryan";
        s1.marks = 681;

        Student s2 = new Student();
        s2.rollno = 33;
        s2.name = "Aryan";
        s2.marks = 681;

        Student s3 = new Student();
        s3.rollno = 33;
        s3.name = "Aryan";
        s3.marks = 681;


        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        System.out.println(s1); //this will print the address
        
    }
}
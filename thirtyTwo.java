
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
//collection API -> concept
// collection -> interface
// collections ->  class

//

public class thirtyTwo{
    public static void main(String a[]){

        //collection is an interface so we can not directly do new Collection()
        Collection num = new ArrayList();
        num.add(6);
        num.add(2);
        num.add(8); 
        num.add(5); //these are object type, no number type
        //do define type we can do
        Collection<Integer> nums = new ArrayList<Integer>();

        //when work with collection always mention the type there

        //in colection you do not need to loop to print it
        System.out.println(num);
        //we do not have index for collection


        //ArrayList is a class which implements a list
        //if we want to work with index also -> use List
        List<Integer> nums2 = new ArrayList<Integer>();
        nums2.add(2);
        nums2.add(5);
        nums2.add(7);
        nums2.add(9);
        nums2.add(4);
        System.out.println(nums2.indexOf(7));
        System.out.println(nums2.get(0));

        //list support dublicate values
        //set support unique values

        Set<Integer>set = new HashSet<Integer>();
        //in set-> we can not have repeated values, not in sorted/sequence
        //set also do not have index value

        //TreeSet -> for sorted values
        //this TreeSet extends AbstractSet -> this is sorted set


        //map -> collection of key value pair
        Map<String,Integer> students = new HashMap<>();
        students.put("aryan", 250305);
        System.out.println(students);
        //key are unqiue, means we can say key are set

        System.out.println(students.keySet()); //it gives all the keys
        
    }
}
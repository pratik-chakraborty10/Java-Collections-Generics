import java.util.*;

public class Main {

    public static void main(String[] args) {
       List<Integer>list=new ArrayList<>();
       list.add(31);
       list.add(72);
       list.add(32);
       list.add(41);



       //traversing the list
        Iterator<Integer>itr=list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        //sort the list
        //using comparartor
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer A, Integer B) {
                return A-B;//ascending order sort,descending order B-A
            }
        });
        System.out.println("sorted list is : "+ list);

        List<Student>list1=new ArrayList<>();
        list1.add(new Student(29,"Pratik"));
        list1.add(new Student(27,"Subhankar"));
        list1.add(new Student(58,"Rhitam"));
        list1.add(new Student(58,"Akash"));

        list1.sort(new Comparator<Student>() {
            @Override
            public int compare(Student X, Student Y) {

                int result=X.rollNo-Y.rollNo;
                if(result==0){//if same roll number
                  return   X.name.compareTo(Y.name);
                }

                return result;
            }
        });
        System.out.println("student data is : "+list1);

        Queue<Integer>queue=new PriorityQueue<>();//min heap
        Queue<Integer>queue1=new PriorityQueue<>(Comparator.reverseOrder());//max heap
        //or
        Queue<Integer>queue2=new PriorityQueue<>(Collections.reverseOrder());
        queue.offer(2);
        queue.offer(4);
        queue.offer(7);

        queue1.offer(2);
        queue1.offer(4);
        queue1.offer(7);

        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue1);
    }


}

class Student{
    int rollNo;
    String name;

    public Student(int rollNo,String name){
        this.rollNo=rollNo;
        this.name=name;
    }
    public String toString(){
        return  name;
    }
}
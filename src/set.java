import java.util.*;

class set{
    public static void main(String[] args) {
        Set<Integer>myset=new HashSet<>();
        myset.add(1);
        myset.add(1);
        myset.add(2);
        myset.add(3);
        myset.add(3);
        myset.add(4);
        myset.add(5);

        System.out.println(myset);//unique
        System.out.println(myset.contains(1));
        myset.remove(1);//delete
        System.out.println(myset);

        //iterating
        Iterator<Integer>itr=myset.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        TreeSet<Integer>treeSet=new TreeSet<>();
        treeSet.add(34);
        treeSet.add(23);
        treeSet.add(13);

        System.out.println(treeSet);//sorted in ascending

        TreeSet<Integer>treeSet1=new TreeSet<>(Collections.reverseOrder());//reverse order sorting
        treeSet1.add(34);
        treeSet1.add(53);
        treeSet1.add(32);

        System.out.println(treeSet1);
    }
}
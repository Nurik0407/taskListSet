import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(2);
//        arrayList.add(5);
//        arrayList.add(7);
//
//        String str = "reader";
//        LinkedList<Character> list = new LinkedList<>();
//        int index = -1;
//        for (char c : str.toLowerCase().toCharArray()) {
//            list.add(c);
//            index++;
//        }
//        System.out.println(list.get(0).equals(list.get(index)));
//
//
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        /**  1. LinkedList тизменин биринчи элементин алуу үчүн Java программасын жазыңыз.**/

//        System.out.println(linkedList.getFirst());

        /**  2. LinkedList тизменин акыркы элементин алуу үчүн Java программасын жазыңыз.**/

//        System.out.println(linkedList.getLast());

        /**  3. LinkedList тизмеде белгилүү бир элемент бар же жок экенин текшерүү үчүн Java программасын жаз.**/

//        System.out.println(linkedList.contains(4));

        /**  4. LinkedList тизмени массивдердин тизмесине которуу үчүн Java программасын жазыңыз.**/

//        System.out.println(Arrays.toString(linkedList.toArray()));

        /**  5. Эки LinkedList тизмесин салыштыруу үчүн Java программасын жазыңыз.**/
//
//        LinkedList<Integer> list1 = new LinkedList<>();
//        list1.add(1);
//        list1.add(2);
//        list1.add(3);
//        System.out.println(linkedList.equals(list1));

        /**  6. LinkedList тизме бош же жок экенин текшерүү үчүн Java программасын жазыңыз.**/

//        System.out.println(linkedList.isEmpty());


        /**   7. LinkedList тизмедеги элементти алмаштыруу үчүн Java программасын жазыңыз. **/

//        linkedList.set(0, 5);
//

/**        Java Collection: HashSet Exercises [12 көнүгүү]**/

        HashSet<BankAccount> set = new HashSet<>(Arrays.asList(
                new BankAccount("OPTIMA", "41692222", "7000"),
                new BankAccount("KYRGYZSTAN", "41691111", "5000"),
                new BankAccount("DEMIR", "41693333", "9000"),
                new BankAccount("RSK", "41694444", "100000")));

/** 1. Көрсөтүлгөн элементти HashSet топтомунун аягына кошуу үчүн Java программасын жазыңыз. **/


//        set.add(new BankAccount("Aiyl", "4973278", "40000"));

        /**2. HashSet тизмедеги бардык элементтерди кайталоо үчүн Java программасын жазыңыз. **/

//       set.forEach(System.out::println);

        /** 3. HashSet топтомундагы элементтердин санын алуу үчүн Java программасын жазыңыз. **/

//        System.out.println(set.size());

        /** 4. HashSet топтомун бошотуу үчүн Java программасын жазыңыз.**/

//        set.clear();


        /**  5. HashSet топтомунун бош же жок экенин текшерүү үчүн Java программасын жазыңыз.**/

//        System.out.println(set.isEmpty());


        /**   6. HashSet топтомун башка хэш топтомуна клондоо үчүн Java программасын жазыңыз.**/

//        HashSet<BankAccount> hashSet = new HashSet<>();
//        hashSet.addAll(set);
//        System.out.println(hashSet);

        /**7. HashSet топтомун массивге айландыруу үчүн Java программасын жазыңыз.**/
//        BankAccount[] bankAccounts = new BankAccount[set.size()];
//        int i = 0;
//        for (BankAccount bankAccount : set) {
//            bankAccounts[i++] = bankAccount;
//        }
//        System.out.println(Arrays.toString(bankAccounts));

        /**  8. HashSet топтомун трисет топтомуна айландыруу үчүн Java программасын жазыңыз.**/


        /**  9. HshSet топтомун List/ ArrayListке айландыруу үчүн Java программасын жазыңыз.**/

//        ArrayList<BankAccount> bankAccounts = new ArrayList<>();
//        bankAccounts.addAll(set);
//        System.out.println(bankAccounts);

        /**  10. Эки HashSet топтомун салыштыруу үчүн Java программасын жазыңыз.**/
        HashSet<BankAccount> set3 = new HashSet<>(Arrays.asList(
                new BankAccount("OPTIMA", "41692222", "7000"),
                new BankAccount("KYRGYZSTAN", "41691111", "5000"),
                new BankAccount("DEMIR", "41693333", "9000"),
                new BankAccount("RSK", "41694444", "100000")
        ));
//
//        System.out.println(set.equals(set3));

        /** 11. Эки топтомду салыштыруу жана эки топтомдо бирдей элементтерди сактоо үчүн Java программасын жазыңыз.**/

        set.clear();
        set3.clear();

//        set.add(new BankAccount("Bank","29832","10000"));
//        set3.add(new BankAccount("Bank","29832","10000"));
//        System.out.println(set.equals(set3));
//        System.out.println(set3);

        /**    12. HashSet топтомунан бардык элементтерди алып салуу үчүн Java программасын жазыңыз.  **/

//        System.out.println(set.removeAll(set));
//        System.out.println(set);


        /**


         Java Collection: TreeSet Exercises [16 көнүгүүлөр]

         1. Жаңы TreeSet топтомун түзүү үчүн Java программасын жазыңыз, бир нече түстөрдү  кошуп, TreeSet топтомун басып чыгарыңыз. **/

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Black");
        treeSet.add("White");
        treeSet.add("Green");
//        System.out.println(treeSet);


        /**  2. TreeSet топтомундагы бардык элементтерди кайталоо үчүн Java программасын жазыңыз.**/

//treeSet.forEach(System.out::println);

        /**   3. Белгиленген TreeSet топтомунун бардык элементтерин башка TreeSet топтомуна кошуу үчүн Java программасын жазыңыз.**/
        TreeSet<String> strings = new TreeSet<>();
        strings.add("Blue");
        strings.addAll(treeSet);
//        System.out.println(strings);


        /** 4. Берилген TreeSet топтомундагы элементтердин тескери иреттүү көрүнүшүн түзүү үчүн Java программасын жазыңыз.**/

//        System.out.println(strings.descendingSet());

        /**  5. TreeSet топтомундагы биринчи жана акыркы элементтерди алуу үчүн Java программасын жазыңыз.**/
//        System.out.println(treeSet.first());
//        System.out.println(treeSet.last());

        /**  6. TreeSet тизмегин башка TreeSet топтомуна клондоо(clone) үчүн Java программасын жазыңыз.**/
        TreeSet<String> set1 = new TreeSet<>();
        set1.addAll(treeSet);
//        System.out.println(set1);

        /**  7. TreeSet топтомундагы элементтердин санын алуу үчүн Java программасын жазыңыз.**/

//        System.out.println(set1.size());


        /**   8. Эки TreeSet топтомун салыштыруу үчүн Java программасын жаз.**/

//        System.out.println(treeSet.equals(set1));

        /**   9. Tree топтомундагы 7ден аз сандарды табуу үчүн Java программасын жаз.**/
        TreeSet<Integer> integers = new TreeSet<>(Arrays.asList(1,2, 3,4, 5,6, 7,8, 9,10));
//        System.out.println(integers.headSet(7));

        /** 10. Берилген элементтен чоң же ага барабар болгон TreeSet жыйындысынын элементин алуу үчүн Java программасын жазыңыз.**/

        Boolean b = true;

//        System.out.println(integers.tailSet(7,b));

        /**  11. Берилген элементтен кичине же ага барабар болгон TreeSet топтомундагы элементти алуу үчүн Java программасын жазыңыз.**/

//        System.out.println(integers.headSet(7,b));

        /** 12. TreeSet топтомунун биринчи элементин алуу жана алып салуу үчүн Java программасын жазыңыз.**/

      integers.remove(integers.first());
        System.out.println(integers);

        /** 13. TreeSet топтомунун акыркы элементин алуу жана алып салуу үчүн Java программасын жазыңыз.**/

       integers.remove(integers.last());
        System.out.println(integers);

        /**  14. Берилген элементти TreeSet жыйындысынан алып салуу үчүн Java программасын жазыңыз. **/

        integers.remove(6);
//        System.out.println(integers);
    }
}

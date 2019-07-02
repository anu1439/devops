import java.util.*;
class JavaExample
{
public static void main(String args[])
{
ArrayList<String> alist=new ArrayList<String>();
alist.add("Anucutie");
alist.add("Keerthypattu");
alist.add("Amul");
alist.add("Aditi");
alist.add("Rithu");
alist.add("Sahana");

//displaying elements
System.out.println(alist);

//Adding"Anucutie" at the fourth position
alist.add(3,"Anucutie");

//displaying elements
System.out.println(alist);
}
}

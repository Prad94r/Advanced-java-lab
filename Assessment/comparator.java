import java.util.* ;

class accComparator implements Comparator<acc>
{
    public int compare(acc o1, acc o2)
    {
       if (o1.bal < o2.bal)  {
           return -1 ;
       } else if (o1.bal > o2.bal)  {
           return 1 ;
       }

       return 0 ;
   }
}


class acc  {
    public String name ;
    public Integer bal ;

    acc(String name , Integer bal) {
        this.name = name ;
        this.bal  = bal ;
    }

    public String toString() {
            return  ("Name "+name+" Balance "+bal) ;
    }

}

class comparator {
    public static void main(String []s) {
        

        ArrayList<acc> al = new ArrayList<acc>( ) ;

        al.add( new acc("ram" , 100) ) ;
        al.add( new acc("hareram" , 10) ) ;
        al.add( new acc("sitaram" , 500) ) ;
        al.add( new acc("shyam" , 1000) ) ;                        

        Collections.sort (al ,Collections.reverseOrder(new accComparator()) ) ;

        for(acc a : al) {
            System.out.println(a) ;
        }
    }
}
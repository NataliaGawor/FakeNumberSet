import java.util.Random;

public class NumberSet {
    public static int MAX_SIZE = 30;
    private int [] nSet= new int [MAX_SIZE];
    private int size;

    private void ILikeToMoveItMoveIt(int s) {
        assert (s>=0) : "KANT MÓW NUMBER FROM INDEKS OUT OW RANGE";
        for (int i=s;i<size-1;i++)
        {
            nSet[i]=nSet[i+1];
        }
    }

    public void add (int i) throws Exception{
        assert(size<MAX_SIZE) : "STACK OVERFLOW!!! (In fact not stack but NumberSet ;) ) ";
        nSet[size]=i;
        size++;
    }

    public void remove (int i ) throws Exception{
        assert(size>0) : "NumberSet EMPTY!";

        for (int k=0;k<size;k++)
        {
            if (nSet[k] == i)
            {
                ILikeToMoveItMoveIt(k);

                size--;
                if (k>0)
                    k--;
            }
        }

    }

    public int getRandomValue() throws Exception{

        assert(size>0) : "NumberSet EMPTY!";

        Random generator = new Random();

        int random= generator.nextInt(size);

        int number=nSet[random];

        remove(number);

        return number;

    }

    public int getSumOfElements() throws Exception{
        int sum=0;

        for (int i=0;i<size;i++)
        {
            sum+=nSet[i];
        }
            return sum;
    }

    public void divideAllElementsBy (int d) throws Exception{

        assert( d!=0 ) : "NIE DZIEL CHOLERO PRZEZ ZERO!!!";

        for (int i=0;i<size;i++)
        {
            System.out.print(nSet[i]/d+",");
        }
    }
    public boolean contains (int i){
        for (int k=0;k<size;k++)
        {
            if (nSet[k]==i) {
                return true;
            }
        }
        return false;

    }

    public int getSize(){
        return this.size;
    }

    public void print()
    {

        if (size<=0)
        {
            System.out.println("SET EMPTY!");
        }

        for (int k=0;k<size;k++)
        {
            System.out.print(nSet[k]+",");
        }
        System.out.print("\n");
    }

}

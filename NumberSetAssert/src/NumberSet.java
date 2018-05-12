import java.util.Random;

public class NumberSet {
    public static int MAX_SIZE = 30;
    private int [] nSet= new int [MAX_SIZE];
    private int size;

    NumberSet(){
        size=0;
    }
    private void ILikeToMoveItMoveIt(int s) {
        assert (s>=0) : "INDEX OUT OFD RANGE";
        for (int i=s;i<size-1;i++)
        {
            nSet[i]=nSet[i+1];
        }
    }

    public void add (int i) throws Exception{
        assert(size<MAX_SIZE) : "NumberSet OVERFLOW!!!";
        int temp=size;
        nSet[size]=i;
        size++;
        assert (size>temp) : "ADD ELEMENT FAILED";
    }

    public void remove (int i ) throws Exception{
        assert(size!=0) : "NumberSet EMPTY!";
        assert(contains(i)!=false) : "THERE IS NO SUCH ELEMENT IN SET";
        int temp=size;
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
        assert (size!=temp) : "REMOVE ELEMENT FAILED";
    }

    public int getRandomValue() throws Exception{

        assert(size!=0) : "NumberSet IS EMPTY!";

        Random generator = new Random();

        int random= generator.nextInt(size);

        int number=nSet[random];

        remove(number);

        return number;

    }

    public int getSumOfElements() throws Exception{
        assert (size!=0);

        int sum=0;

        for (int i=0;i<size;i++)
        {
            sum+=nSet[i];
        }
            return sum;
    }

    public void divideAllElementsBy (int d) throws Exception{

        assert( d!=0 ) : "DON'T DIVIDE BY ZERO!!!";
        assert (size!=0) : "NumberSet IS EMPTY";

        for (int i=0;i<size;i++)
        {
            System.out.print(nSet[i]/d+",");
        }
    }
    public boolean contains (int i){
        assert (size!=0) : "NumberSet IS EMPTY";
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

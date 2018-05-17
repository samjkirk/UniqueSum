public class UniqueSum extends uniqueSumMain {

    public int calc(int x, int y, int z) {
        int i;

        if ((x==y)&&(y==z)) {
            x=0; y=0; z=0;
        } else if (x==y) {
            x=0; y=0;
        } else if (x==z) {
            x=0; z=0;
        } else if (y==z) {
            y=0; z=0;
        }

        i = x + y + z;

        return i;
    }
}

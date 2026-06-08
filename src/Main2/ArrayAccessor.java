package Main2;

public class ArrayAccessor {
    
    private int[] array;

    public ArrayAccessor(int[] array) {
        this.array = array;
    }

    public int getElement(int index) throws OutRange {
        if(index < 0 || index >= array.length) {
            throw new OutRange("エラー：指定された位置は範囲外です");
        }
        return array[index];
    }
}

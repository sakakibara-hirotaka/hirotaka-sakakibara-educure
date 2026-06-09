package Main2;

public class Main2 {
    public static void main(String[] args) {
        
        int index1 = 1;
        int index2 = 5;
        int position;
        ArrayAccessor arrayAccessor = new ArrayAccessor(new int[]{10,20,30});

        try {
            position = arrayAccessor.getElement(index1);
            //position = arrayAccessor.getElement(5);
            System.out.println("位置" +index1 + "の要素\n" + position);
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("位置" +index1 + "の要素\n" + e.getMessage());
        }

        try {
            position = arrayAccessor.getElement(index2);
            //position = arrayAccessor.getElement(5);
            System.out.println("\n位置" +index2 + "の要素\n" + position);
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("\n位置" +index2 + "の要素\n" + e.getMessage());
        }
    }
}

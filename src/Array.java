public class Array {

    private int[] data;
    private int size;

    /**
     * 构造函数，传入数组容量capacity构造Array
     * @param capacity 数组容量
     */
    public Array(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    /**
     *  默认容量为10
     */
    public Array() {
        this(10);
    }

    /**
     * @return 获取数组种元素个数
     */
    public int getSize() {
        return size;
    }

    /**
     * @return 获取数组容量
     */
    public int getCapacity() {
        return data.length;
    }

    /**
     * @return 判断数组元素是否为0
     */
    public boolean isEmpty() {
        return size == 0;
    }
}

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

    /**
     * 向数组末尾添加元素
     * @param e
     */
    public void addLast(int e) {

       add(size, e);
    }

    /**
     * 向数组开始添加元素
     * @param e
     */
    public void addFirst(int e) {
        add(0, e);
    }

    /**
     * 在index位置插入元素e
     * @param index 位置
     * @param e 元素
     */
    public void add(int index, int e) {

        if (size == data.length) {
            throw new IllegalArgumentException("add failed. Array is full");
        }

        if (index < 0 || index > size) {
            throw new IllegalArgumentException("add failed. Require index >= 0 and index <= size.");
        }

        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = e;
    }
}

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
        size++;
    }

    /**
     * 获取索引位置元素
     * @param index
     * @return
     */
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Get failed. Index is illegal.");
        }
        return data[index];
    }

    /**
     * 修改索引位置元素
     * @param index
     * @return
     */
    public void set(int index, int e) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Set failed. Index is illegal.");
        }
        data[index] = e;
    }

    /**
     * 查找数组中是否存在元素e
     * @param e
     * @return
     */
    public boolean contains(int e) {
        for (int i = 0; i < size; i++) {
            if (data[i] == e) {
                return true;
            }
        }
        return false;
    }

    /**
     * 返回元素下标，找不到返回-1
     * @param e
     * @return
     */
    public int find(int e) {
        for (int i = 0; i < size; i++) {
            if (data[i] == e) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 删除index位置元素
     * @param index
     * @return 删除的元素
     */
    public int remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Remove failed. Index is illegal.");
        }

        int ret = data[index];

        for (int i = index; i <= size; i++) {
            data[i] = data[i + 1];
        }
        size--;
        return ret;
    }

    /**
     * 删除首元素
     * @return 删除的元素
     */
    public int removeFirst() {
        return remove(0);
    }

    /**
     * 删除末元素
     * @return 删除的元素
     */
    public int removeLast() {
        return remove(size - 1);
    }

    /**
     * 删除特定元素
     * @param e
     * @return
     */
    public boolean removeElement(int e) {
        for (int i = 0; i <= size; i++) {
            if (data[i] == e) {
                remove(i);
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString() {

        StringBuilder res = new StringBuilder();
        res.append(String.format("Array: size = %d, capacity = %d\n", size, data.length));
        res.append('[');
        for (int i = 0; i < size; i++) {
            res.append(data[i]);
            if (i != size - 1) {
                res.append(", ");
            }
        }
        res.append(']');
        return res.toString();
    }
}

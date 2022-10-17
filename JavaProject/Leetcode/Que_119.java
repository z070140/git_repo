import java.util.ArrayList;
import java.util.List;

public class Que_119 {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int rowIndex = 3;
	System.out.println(getRow(rowIndex));
    }

    public static List<Integer> getRow(int rowIndex) {
	List<Integer> list = new ArrayList<>();
	while (rowIndex-- >= 0) { // 判断index位置是否大于等于0
	    list.add(1); // 单行构造
	    for (int i = list.size() - 2; i > 0; i--) // 修改i，保证list里有三个即以上的数，第0个和最后一个不能动。
		list.set(i, list.get(i) + list.get(i - 1)); // 如果长度大于3，则将i第i个位置修改为他和他左边位置的和。
	}

	return list;

    }
}

//1
//1 1
//1 2 1
//1 3 3 1

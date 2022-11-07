import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Date: 2022-11-07 19:22
 * Author: Paul
 */
public class TestCode {

    @Test
    public void TestSpilt() {
        String listStr = "1,2,3,4,5,6,7,8,9,10,11";
        List<String> testList = new ArrayList<>(Arrays.asList(listStr.split(",")));
        int totalSize = testList.size();
        int addSize = totalSize / 5;
        for (int i = 0; i < addSize; i++) {
            int startIdx = i * 5;
            //int endIdx = totalSize % 5 == 0 ? 5 * (i + 1) : (i == addSize - 1) ? (i + 1) * 5 + totalSize % 5 : 5 * (i + 1);
            int endIdx2 = (i == addSize - 1) ? totalSize % 5 == 0 ? 5 * (i + 1) : (i + 1) * 5 + totalSize % 5 : 5 * (i + 1);
            System.out.println(testList.subList(startIdx, endIdx2));
        }
    }

}

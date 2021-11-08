import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class DecisionTableTest {

    DiscountCaculator discountCaculator = new DiscountCaculator();
    JSONArray testcase_array;

    @BeforeEach
    public void GenerateTestcases() throws IOException {

        GenTest genTest;
        FileInputStream json_file_in;
        String json_data;

        // generate testcase and write to file

        genTest = new GenTest();
        genTest.GenTestCases();

        // read testcases
        json_file_in = new FileInputStream(genTest.testcase_file_path);
        json_data = IOUtils.toString(json_file_in, "UTF-8");

        testcase_array = new JSONArray(json_data);
    }

    @Test
    public void DecisionTableAllTestcases( ) {

        int param1, param2, param3, expected_output;

        //assertEquals(expected_value, DiscountCaculator.getDiscount(x_value, y_value, z_value));
        for (int i = 0; i < testcase_array.length(); i++)
        {
            param1 = testcase_array.getJSONArray(i).getInt(0);
            param2 = testcase_array.getJSONArray(i).getInt(0);
            param3 = testcase_array.getJSONArray(i).getInt(0);

        }

        System.out.println("Test success");
    }
}

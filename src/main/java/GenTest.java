import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class GenTest {

    public static final String data_file_path = System.getProperty("user.dir") + "\\src\\main\\resources\\data_to_gen.json";
    public static final String testcase_file_path = System.getProperty("user.dir") + "\\src\\main\\resources\\testcase.json";

    public static void main(String[] args) throws IOException {
        System.out.println("Nguyen Thanh Huyen 18020666");
        GenTestCases();

    }

    public static int GetRandomData(int min, int max)
    {
        int upperbound = max - min + 1;
        Random rand = new Random();

        // nextInt(upperbound):
        // generates random numbers in the range 0 to upperbound-1.
        return min + rand.nextInt(upperbound);

    }
    public static JSONObject GetJsonData(String json_file_path) throws IOException {
        FileInputStream json_file_in;

        json_file_in = new FileInputStream(json_file_path);
        String json_data = IOUtils.toString(json_file_in, "UTF-8");

        return new JSONObject(json_data);

    }

    public static void GenTestCases() throws IOException {
        JSONObject data_object;
        JSONArray condition_array, action_array, rule_array, rule_set, testcase, result;
        int n_conditions, n_actions, n_tests;
        int min, max, expected_value;

        //preparation
        data_object     = GetJsonData(data_file_path);
        condition_array = data_object.getJSONArray("condition");
        action_array    = data_object.getJSONArray("action");
        rule_array      = data_object.getJSONArray("rule");
        n_conditions    = condition_array.length();
        n_actions       = action_array.length();
        n_tests         = rule_array.length();

        // testcase is array of 4 value [param1, param2, param3, expected_output]
        testcase = new JSONArray();

        // array to store all testcases
        result = new JSONArray();

        //loop for all set of value in rule_array
        for (int i_test = 0; i_test < n_tests; i_test++)
        {
            System.out.println(rule_array.getJSONArray(i_test).toString());
            rule_set = rule_array.getJSONArray(i_test);

            expected_value = 0;
            testcase.clear();

            for ( int i = 0; i < rule_set.length(); i++)
            {

                if (i < n_conditions)
                {
                    // get random 3 param

                    if (rule_set.getString(i).equals("T"))
                    {
                        min = condition_array.getJSONObject(i).getInt("min");
                        max = condition_array.getJSONObject(i).getInt("max");
                        System.out.println("Min: "+ min +" Max: "+max);
                        testcase.put(GetRandomData(min, max));
                    }

                }
                else
                {
                    // get expected output

                    if (rule_set.getString(i).equals("x"))
                    {
                        expected_value += action_array.getInt(i - n_conditions);
                        System.out.println("Expected = " + expected_value);
                    }
                }

            }

            // print and write testcase to a file
            testcase.put(expected_value);
            System.out.println("Testcase: " + testcase.toString());

            result.put(testcase);

        }
        WriteTestcaseToFile(result);

    }

    public static void WriteTestcaseToFile(JSONArray testcases) throws IOException {

        FileWriter fileWriter = new FileWriter(testcase_file_path);

        fileWriter.write(testcases.toString());
        fileWriter.close();

    }
}

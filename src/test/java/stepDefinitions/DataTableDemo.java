package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;

import java.util.List;

public class DataTableDemo {
    @Given("^user following data credentials$")
    public void user_following_data_credentials(DataTable dataTable)  {
        List<List<String>> list = dataTable.raw();
        System.out.println(list.get(0).get(0));
        System.out.println(list.get(2).get(3));
        System.out.println(list);
    }
}

package com.localhost.swaggerinfo;

import com.localhost.testbase.TestBase;
import com.localhost.utils.TestUtils;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.hasKey;
import static org.hamcrest.Matchers.hasValue;

@RunWith(SerenityRunner.class)
public class UtilitiesCURDTestWithSteps extends TestBase {
    static double version;
    static Object products;
    static double uptime;
    static Boolean readonly;

    @Steps
    UtilitiesSteps utilitiesSteps;

    @Title("This will give healthcheck information")
    @Test
    public void test001() {
        HashMap<?, ?> healthMap = utilitiesSteps.getHealthCheck();
        Assert.assertThat(healthMap, hasKey("uptime"));

    }

    @Title("This will give vesrion information")
    @Test
    public void test002() {
        HashMap<?, ?> versionMap = utilitiesSteps.getVersion();
        Assert.assertThat(versionMap, hasValue("1.1.0"));
        System.out.println(versionMap);
    }

}

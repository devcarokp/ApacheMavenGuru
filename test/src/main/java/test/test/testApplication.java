package test.test;

import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;

public class testApplication extends Application<testConfiguration> {

    public static void main(final String[] args) throws Exception {
        new testApplication().run(args);
    }

    @Override
    public String getName() {
        return "test";
    }

    @Override
    public void initialize(final Bootstrap<testConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final testConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}

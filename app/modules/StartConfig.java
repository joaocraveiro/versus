package modules;

import models.Profile;
import play.Logger;
import play.inject.ApplicationLifecycle;
import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.concurrent.CompletableFuture;


@Singleton
public class StartConfig {

    @Inject
    public StartConfig(ApplicationLifecycle lifecycle, play.api.Configuration configuration) {

        Logger.info("Starting module...");

        new Profile("admin");

        Logger.info("Profiles: " + Profile.find.all().size());

        lifecycle.addStopHook(() -> {
            return CompletableFuture.completedFuture(null);
        });       
    }

}
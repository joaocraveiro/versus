package modules;

import models.Profile;
import play.inject.ApplicationLifecycle;
import io.ebean.*;
import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.concurrent.CompletableFuture;


@Singleton
public class StartConfig {

    @Inject
    public StartConfig(ApplicationLifecycle lifecycle, play.api.Configuration configuration) {

        System.out.println("Starting module...");
        System.out.println("Profiles: " + Profile.find.all().size());

        lifecycle.addStopHook(() -> {
            return CompletableFuture.completedFuture(null);
        });       
    }

}
package modules;

import play.inject.ApplicationLifecycle;
import io.ebean.*;
import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.concurrent.CompletableFuture;


@Singleton
public class StartConfig {

    @Inject
    public StartConfig(ApplicationLifecycle lifecycle, play.api.Configuration configuration) {

            String queryString = "ALTER SEQUENCE profile_id_seq INCREMENT by 1";
            Ebean.createSqlUpdate(queryString).execute();


        lifecycle.addStopHook(() -> {
            return CompletableFuture.completedFuture(null);
        });       
    }

}
package modules;

import com.google.inject.AbstractModule;

public class StartModule extends AbstractModule {

    @Override
    public void configure() {
        bind(StartConfig.class).asEagerSingleton();
    }   

}